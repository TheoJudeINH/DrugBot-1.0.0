package com.DrugBot.project;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class Main {
	public static JDA jda;
	public static String prefix = "~";
	
	public static void main(String[] args) throws LoginException {
		JDA jda = JDABuilder.createDefault("ODUzOTU0MzU5MjA1MTY3MTQ0.YMc4-A.CXNenF-kIn_tx03gxfxuzT5eJSA").build();
		jda.getPresence().setStatus(OnlineStatus.IDLE);
		jda.getPresence().setActivity(Activity.watching("Minecraft"));
		jda.addEventListener(new BuyDrugs());
	}
}
