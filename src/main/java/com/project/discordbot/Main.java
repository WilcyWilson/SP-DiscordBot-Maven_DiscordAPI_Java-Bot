package com.project.discordbot;

import javax.security.auth.login.LoginException;

import events.MessageListener;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class Main {

	public static void main(String[] args) {
		JDABuilder jdaBuilder = JDABuilder.createDefault("ODk1Njg1MDkxMjc4MzUyNDI0.YV8Jvg.VZAhCEJj0LaFLQz9FXDkyNDvhWI");
		jdaBuilder.setStatus(OnlineStatus.DO_NOT_DISTURB);
		jdaBuilder.setActivity(Activity.playing("Game"));
		
		jdaBuilder.addEventListeners(new MessageListener());
		
		try {
			jdaBuilder.build();
		} catch (LoginException e) {
			e.printStackTrace();
		}
	}
}
