package me.arttostog.pingpong;

import me.arttostog.pingpong.command.SlashCommand;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.interactions.commands.build.Commands;

public class Main {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("You have to provide a token as first argument!");
			System.exit(1);
		}

		JDABuilder builder = JDABuilder.createDefault(args[0]);
		builder.setActivity(Activity.playing("Discord"));
		builder.addEventListeners(new SlashCommand());

		JDA jda = builder.build();
		jda.updateCommands().addCommands(
				Commands.slash("ping", "Standard ping command")
		).queue();
	}
}