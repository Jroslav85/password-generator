package com.jroslav.application.console;

import com.jroslav.passj.parser.StringParser;

public class Runner {

	public static void main(String[] args) {
		StringParser commandParser = new StringParser();
		commandParser.parse(args);
	}
}
