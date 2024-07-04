package com.jroslav.passj.command;

public class CommandHelp extends Command implements Executable {

	public CommandHelp() {
		stringRepresentation = "help";
		shortStringRepresentation = "h";
	}

	@Override
	public void execute() {
		System.out.println("help program");
	}
}
