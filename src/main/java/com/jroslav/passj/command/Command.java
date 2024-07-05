package com.jroslav.passj.command;

public abstract class Command implements Executable{
	
	protected String stringRepresentation;
	protected String shortStringRepresentation;
	
	public String getStringRepresentation() {
		return stringRepresentation;
	}

	public String getShortStringRepresentation() {
		return shortStringRepresentation;
	}
}
