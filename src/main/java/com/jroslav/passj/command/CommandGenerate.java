package com.jroslav.passj.command;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommandGenerate extends Command {
	
	private String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String lower = "abcdefghijklmnopqrstuvwxyz";
	private String numbers = "0123456789";
	private String specialChars = "!@#$%^&*(){}?";

	private final String allChars = upper + lower + numbers + specialChars;
	private int amountCharacters = 8;
	
	public CommandGenerate() {
		stringRepresentation = "generate";
		shortStringRepresentation = "g";
	}
	
	@Override
	public void execute() {
		System.out.println(passwordBuilder());
	}
	
	private String passwordBuilder() {
		List<Character> letters = fillList();
		Collections.shuffle(letters);
		
		StringBuilder password = new StringBuilder();
		for (int i = 0; i < amountCharacters; i++) {
			password.append(letters.get(i));
		}
		return password.toString();
	}

	private List<Character> fillList() {
		List<Character> letters = new ArrayList<Character>();
		for (char c : allChars.toCharArray()) {
			letters.add(c);
		}
		return letters;
	}
}
