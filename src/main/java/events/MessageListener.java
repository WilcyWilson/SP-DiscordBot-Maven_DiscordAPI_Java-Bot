package events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessageListener extends ListenerAdapter {
	// Guild is the Disscord Server, when bot receives message from the discord
	// server
	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		// if the user is not a bot reply with Hello. Preventing infinite loop.
		int count = event.getMessage().getContentRaw().replaceAll(" ", "").length();
		if (!event.getAuthor().isBot())  
			event.getMessage().reply("Number of letters in your message: " + count).queue(); 
	}
}
