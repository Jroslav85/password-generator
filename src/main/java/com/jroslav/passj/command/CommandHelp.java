package com.jroslav.passj.command;

public class CommandHelp extends Command {

	public CommandHelp() {
		stringRepresentation = "help";
		shortStringRepresentation = "h";
	}

	@Override
	public void execute() {
		System.out.println("To generate a password, enter the command: <generate> or <g>");
	}
}
