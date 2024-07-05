package com.jroslav.passj.main;

import com.jroslav.passj.parser.CommandParser;

public class Main {

	public static void main(String[] args) {
		CommandParser commandParser = new CommandParser();
		commandParser.parse(args);
	}
}
