package net.rotgruengelb.nixienaut.math;

import net.rotgruengelb.nixienaut.object.StringIdentifiable;

public enum CardinalDirection implements StringIdentifiable {
	NORTH("north"),
	EAST("east"),
	SOUTH("south"),
	WEST("west");

	private final String stringRepresentation;

	CardinalDirection(String stringRepresentation) {
		this.stringRepresentation = stringRepresentation;
	}

	@Override
	public String getStringRepresentation() {
		return stringRepresentation;
	}
}
