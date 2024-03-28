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

	public static SimpleElementOperation fromInt(int i) {
		for (SimpleElementOperation operation : values()) {
			if (operation.getIntRepresentation() == i) {
				return operation;
			}
		}
		return null;
	}

	public static SimpleElementOperation fromString(String s) {
		for (SimpleElementOperation operation : values()) {
			if (operation.getStringRepresentation().equals(s)) {
				return operation;
			}
		}
		return null;
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
