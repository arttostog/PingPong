package me.arttostog.pingpong;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main {
	public static String token = "";

	public static void main(String[] args) {
		JDA jda = JDABuilder.createDefault(token).build();
	}
}