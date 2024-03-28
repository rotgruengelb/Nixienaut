package net.rotgruengelb.nixienaut.object;

public interface FloatIdentifiable {

	static float getFloatRepresentation(FloatIdentifiable identifiable) {
		if (identifiable == null) {
			return Float.NaN;
		}
		return identifiable.getFloatRepresentation();
	}

	static float getFloatRepresentation(IntIdentifiable identifiable) {
		if (identifiable == null) {
			return Float.NaN;
		}
		return identifiable.getIntRepresentation();
	}

	static float getFloatRepresentation(StringIdentifiable identifiable) {
		if (identifiable == null) {
			return Float.NaN;
		}
		return Float.parseFloat(identifiable.getStringRepresentation());
	}

	/**
	 * The float representation of the object.
	 *
	 * @return The float representation of the object.
	 */
	float getFloatRepresentation();

	default float asFloat() {
		return getFloatRepresentation();
	}
}
