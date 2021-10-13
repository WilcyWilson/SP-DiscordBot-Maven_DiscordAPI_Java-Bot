package com.project.discordbot;

import javax.security.auth.login.LoginException;

import events.MessageListener;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Main {
	public static void main(String[] args) {
		String token = "ODk1Njg1MDkxMjc4MzUyNDI0.YV8Jvg.drVelGdEG2CQvnOOy9WbNnn8QLE";
		JDABuilder jdaBuilder = JDABuilder.createDefault(token);
		jdaBuilder.enableIntents(GatewayIntent.GUILD_MEMBERS); // Enables Presence tracking and tracks member activity
		jdaBuilder.setStatus(OnlineStatus.DO_NOT_DISTURB);
		jdaBuilder.setActivity(Activity.playing("Potato"));
		jdaBuilder.addEventListeners(new MessageListener());
		
		try {
			jdaBuilder.build();
		} catch (LoginException e) {
			e.printStackTrace();
		}
	}
}
