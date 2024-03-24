package net.rotgruengelb.nixienaut.object;

public interface IntIdentifiable {

	/**
	 * The integer representation of the object.
	 *
	 * @return The integer representation of the object.
	 */
	int getIntRepresentation();

	static int getIntRepresentation(IntIdentifiable identifiable) {
		if (identifiable == null) {
			return 0;
		}
		return identifiable.getIntRepresentation();
	}

	static int getIntRepresentation(StringIdentifiable identifiable) {
		if (identifiable == null) {
			return 0;
		}
		return Integer.parseInt(identifiable.getStringRepresentation());
	}
}
