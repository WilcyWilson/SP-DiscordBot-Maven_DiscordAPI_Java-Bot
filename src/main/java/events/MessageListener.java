package events;

import java.awt.Color;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessageListener extends ListenerAdapter {
	@Override
	public void onGuildMemberJoin(GuildMemberJoinEvent event) {
		String user = event.getMember().getEffectiveName();
		EmbedBuilder embedBuilder = new EmbedBuilder();
		embedBuilder.setColor(Color.red);
		embedBuilder.setTitle("Welcome " + "\'" + user + "\'" + " to our Discord Channel called " + "\'" + event.getGuild().getName() + "\'");
		event.getGuild().getDefaultChannel().sendMessageEmbeds(embedBuilder.build()).queue();
	}

	// Guild is the Discord Server, when bot receives message from the discord server
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
		
		
		
		// Shows name of all the users in the channel
//		String admin = event.getMessage().getContentRaw();
//		if (admin.equals("?users") && !event.getAuthor().isBot()) {
//			EmbedBuilder embedBuilder = new EmbedBuilder();
//			embedBuilder.setColor(Color.yellow);
//			embedBuilder.setTitle("List of Users in this Server:");
//			List<String> users = new ArrayList<String>();
//			event.getGuild().getMembers().forEach(a-> users.add(a.getEffectiveName())); 
//			embedBuilder.setDescription(StringUtils.join(users,"\n"));
//			embedBuilder.setFooter("Total Number of Users are: " + users.size());
//			embedBuilder.setThumbnail("https://savvytower.com/wp-content/uploads/2020/05/Types-Of-Database-Users.png");
//			event.getChannel().sendMessageEmbeds(embedBuilder.build()).queue();
//		}
		
//		if(!event.getAuthor().isBot()) {
//		EmbedBuilder embedBuilder = new EmbedBuilder();
//		embedBuilder.setColor(Color.yellow);
//		embedBuilder.setTitle("Testing Embeds");
//		embedBuilder.setDescription("Just a description");
//		embedBuilder.setImage("https://post.medicalnewstoday.com/wp-content/uploads/sites/3/2020/02/322868_1100-800x825.jpg");
//		embedBuilder.setFooter("This is just a cool footer");
//		embedBuilder.setTimestamp(Instant.now());
//		embedBuilder.setThumbnail("https://post.medicalnewstoday.com/wp-content/uploads/sites/3/2020/02/322868_1100-800x825.jpg");
//		
//		event.getChannel().sendMessageEmbeds(embedBuilder.build()).queue();
//		}
//		String[] arguments = event.getMessage().getContentRaw().split(" ");
//			if(arguments[0].equals("?sendmessage") && !event.getAuthor().isBot()) {
//				String message = event.getMessage().getContentRaw().replace("?sendmessage", "");
//				event.getChannel().sendMessage(message).queue();
//		}

	}

}
