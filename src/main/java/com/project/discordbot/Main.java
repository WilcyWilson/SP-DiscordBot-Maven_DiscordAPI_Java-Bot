package com.project.discordbot;

import javax.security.auth.login.LoginException;

import events.MessageListener;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class Main {

	public static void main(String[] args) {
		String token = "fake-token";
		JDABuilder jdaBuilder = JDABuilder.createDefault(token);
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
