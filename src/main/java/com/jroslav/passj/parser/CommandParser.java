package com.jroslav.passj.parser;

import java.util.Map;

import com.jroslav.passj.command.Command;
import com.jroslav.passj.command.CommandGenerate;
import com.jroslav.passj.command.CommandHelp;

public class CommandParser {
	private final Map<String, Command> commands;
	private final Command commandHelp = new CommandHelp();
	private final Command commandGenerate = new CommandGenerate();

	public CommandParser() {
		commands = Map.of(commandHelp.getStringRepresentation(), commandHelp,
				commandHelp.getShortStringRepresentation(), commandHelp,
				commandGenerate.getStringRepresentation(), commandGenerate,
				commandGenerate.getShortStringRepresentation(),
				commandGenerate);
	}

	public void parse(final String... strings) {
		for (String string : strings) {
			try {
				Command command = commands.get(string);
				command.execute();
			} catch (NullPointerException e) {
				System.out.println("there is no such command");
			}
		}
	}
}
