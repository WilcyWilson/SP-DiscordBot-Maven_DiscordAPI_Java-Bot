package com.project.discordbot;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class Main {

	public static void main(String[] args) {
		JDABuilder jdaBuilder = JDABuilder.createDefault("ODk1NjM5NDc5NTg1NDc2Njg4.YV7fRA.2vK0TCH-SukvCm2zXnJ7C_smtVE");
		jdaBuilder.setStatus(OnlineStatus.DO_NOT_DISTURB);
		jdaBuilder.setActivity(Activity.playing("Game"));
		try {
			jdaBuilder.build();
		} catch (LoginException e) {
			e.printStackTrace();
		}
	}
}
