package com.jroslav.passj.parser;

import java.util.Map;

import com.jroslav.passj.command.Command;
import com.jroslav.passj.command.CommandHelp;

public class CommandParser {
	private final Map<String, Command> commands;
	private final Command commandHelp = new CommandHelp();

	public CommandParser() {
		commands = Map.of(commandHelp.getStringRepresentation(), commandHelp,
				commandHelp.getShortStringRepresentation(), commandHelp);
	}

	public void parse(final String... strings) {
		for (String string : strings) {
			Command command = commands.get(string);
			command.execute();
		}
	}
}
