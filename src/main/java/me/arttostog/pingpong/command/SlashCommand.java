package me.arttostog.pingpong.command;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class SlashCommand extends ListenerAdapter {
	@Override
	public void onSlashCommandInteraction(SlashCommandInteractionEvent e) {
		switch (e.getName()) {
			case "ping" -> e.reply("Pong!").setEphemeral(true).queue();
		}
	}
}
