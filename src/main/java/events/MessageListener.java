package events;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessageListener extends ListenerAdapter {
	// Guild is the Discord Server, when bot receives message from the discord
	// server
	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		// if the user is not a bot reply with Hello. Preventing infinite loop.
//		int count = event.getMessage().getContentRaw().replaceAll(" ", "").length();
//		if (!event.getAuthor().isBot()) {
//			event.getMessage().reply("Number of letters in your message: " + count).queue();
//			event.getMessage().reply("Time is: " + java.time.LocalTime.now()).queue();
		
		// Shows the current date according to system time
		String date = event.getMessage().getContentRaw();
		if (date.equals("?date") && !event.getAuthor().isBot()) {
			event.getMessage().reply("The date is: " + java.time.LocalDate.now()).queue(); // !,?,&
		}
		String admin = event.getMessage().getContentRaw();
		
		// Shows name of all the users in the channel
		List<String> users = new ArrayList<String>();
		if (admin.equals("?users") && !event.getAuthor().isBot()) {
			event.getJDA().getUsers().forEach(a-> users.add(a.getName())); // !,?,&
			event.getMessage().reply(StringUtils.join(users,"\n")).queue();
		}

//		String[] arguments = event.getMessage().getContentRaw().split(" ");
//			if(arguments[0].equals("?sendmessage") && !event.getAuthor().isBot()) {
//				String message = event.getMessage().getContentRaw().replace("?sendmessage", "");
//				event.getChannel().sendMessage(message).queue();
//		}

	}

}
