package com.jroslav.passj.command;

public class CommandHelp implements Executable {
	private final String stringRepresentation = "-help";
	private final String shortStringRepresentation = "-h";
	
	@Override
	public void execute() {
		System.out.println("help program");
	}

	public String getStringRepresentation() {
		return stringRepresentation;
	}

	public String getShortStringRepresentation() {
		return shortStringRepresentation;
	}
}
