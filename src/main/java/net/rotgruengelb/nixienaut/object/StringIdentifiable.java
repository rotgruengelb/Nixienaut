package net.rotgruengelb.nixienaut.object;

public interface StringIdentifiable {

	/**
	 * The string representation of the object.
	 *
	 * @return The string representation of the object.
	 */
	String getStringRepresentation();

	static String getStringRepresentation(StringIdentifiable identifiable) {
		if (identifiable == null) {
			return "";
		}
		return identifiable.getStringRepresentation();
	}

	static String getStringRepresentation(IntIdentifiable identifiable) {
		if (identifiable == null) {
			return "0";
		}
		return Integer.toString(identifiable.getIntRepresentation());
	}

	static String getStringRepresentation(FloatIdentifiable identifiable) {
		if (identifiable == null) {
			return "0.0";
		}
		return Float.toString(identifiable.getFloatRepresentation());
	}
}
