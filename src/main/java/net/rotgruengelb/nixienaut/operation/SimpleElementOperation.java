package net.rotgruengelb.nixienaut.operation;

import net.rotgruengelb.nixienaut.object.IntIdentifiable;
import net.rotgruengelb.nixienaut.object.StringIdentifiable;

public enum SimpleElementOperation implements StringIdentifiable, IntIdentifiable {
	ADD(1, "add"),
	UPDATE(0, "update"),
	REMOVE(-1, "remove");


	private final int difference;
	private final String stringRepresentation;

	SimpleElementOperation(int difference, String stringRepresentation) {
		this.difference = difference;
		this.stringRepresentation = stringRepresentation;
	}

	@Override
	public int getIntRepresentation() {
		return difference;
	}

	@Override
	public String getStringRepresentation() {
		return stringRepresentation;
	}
}
