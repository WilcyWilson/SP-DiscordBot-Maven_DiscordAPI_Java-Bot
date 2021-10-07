package events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessageListener extends ListenerAdapter {
	// Guild is the Discord Server, when bot receives message from the discord server
	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		System.out.println("message received!");
	}
	
}
