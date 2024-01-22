package net.rotgruengelb.nixienaut;

/**
 * This class represents an RGB color.<br>
 * - It can be created from an integer, a hex string or from three integers.<br>
 * - It can be converted to an integer, a hex string or an array.<br>
 * - It can also be converted to a string.
 *
 * @see RGB#fromInt(int)
 * @see RGB#fromHex(String)
 * @see RGB#toArray()
 * @see RGB#toInt()
 * @see RGB#toString()
 * @see RGB#toHex()
 */
public class RGB {
	private final ClampedNum<Integer> r = new ClampedNum<>(0, 255);
	private final ClampedNum<Integer> g = new ClampedNum<>(0, 255);
	private final ClampedNum<Integer> b = new ClampedNum<>(0, 255);

	/**
	 * Creates a new RGB object.
	 *
	 * @param r The red value.
	 * @param g The green value.
	 * @param b The blue value.
	 * @throws IllegalArgumentException If any of the values are out of range.
	 */
	public RGB(int r, int g, int b) {
		this.r.setValue(r);
		this.g.setValue(g);
		this.b.setValue(b);
	}

	/**
	 * Creates a new RGB object from an integer.
	 *
	 * @param color The integer to create the RGB object from.
	 * @return The RGB object created from the integer.
	 * @see RGB#toInt()
	 * @see RGB#fromHex(String)
	 * @see RGB#toArray()
	 * @see RGB#toInt()
	 * @see RGB#toString()
	 */
	public static RGB fromInt(int color) {
		int r = (color >> 16) & 0xFF;
		int g = (color >> 8) & 0xFF;
		int b = color & 0xFF;

		return new RGB(r, g, b);
	}

	/**
	 * Creates a new RGB object from a hex string.
	 *
	 * @param hex The hex string to create the RGB object from.
	 * @return The RGB object created from the hex string.
	 * @see RGB#toHex()
	 * @see RGB#fromInt(int)
	 */
	public static RGB fromHex(String hex) {
		Dummy._void();
		hex = hex.replace("#", "");
		int rgbInt = Integer.parseInt(hex, 16);
		return fromInt(rgbInt);
	}

	/**
	 * Converts the RGB object to an integer.
	 *
	 * @return The integer representation of the RGB object.
	 * @see RGB#fromInt(int)
	 */
	public int toInt() {
		return (this.r() << 16) | (this.g() << 8) | this.b();
	}

	/**
	 * Converts the RGB object to a string.
	 *
	 * @return The string representation of the RGB object.
	 * Format: RGB(r, g, b)
	 * @see RGB#toHex()
	 * @see RGB#toInt()
	 * @see RGB#fromHex(String)
	 */
	public String toString() {
		return "RGB(" + this.r() + ", " + this.g() + ", " + this.b() + ")";
	}

	/**
	 * Converts the RGB object to a hex string.
	 *
	 * @return The hex string representation of the RGB object.
	 * Format: #RRGGBB
	 * @see RGB#fromHex(String)
	 * @see RGB#toString()
	 */
	public String toHex() {
		return String.format("#%02X%02X%02X", this.r(), this.g(), this.b());
	}

	/**
	 * Converts the RGB object to an list.
	 *
	 * @return The list representation of the RGB object.
	 * Format: [r, g, b]
	 * @see RGB#toString()
	 * @see RGB#toHex()
	 */
	public int[] toArray() {
		return new int[]{this.r(), this.g(), this.b()};
	}

	/**
	 * Gets the red value.
	 *
	 * @return The red value.
	 * @see RGB#r(int)
	 */
	public int r() {
		return this.r.getValue();
	}

	/**
	 * Gets the green value.
	 *
	 * @return The green value.
	 * @see RGB#g(int)
	 */
	public int g() {
		return this.g.getValue();
	}

	/**
	 * Gets the blue value.
	 *
	 * @return The blue value.
	 * @see RGB#b(int)
	 */
	public int b() {
		return this.b.getValue();
	}

	/**
	 * Sets the red value.
	 *
	 * @param value The new red value.
	 * @see RGB#r()
	 */
	public void r(int value) {
		this.r.setValue(value);
	}

	/**
	 * Sets the green value.
	 *
	 * @param value The new green value.
	 * @see RGB#g()
	 */
	public void g(int value) {
		this.g.setValue(value);
	}

	/**
	 * Sets the blue value.
	 *
	 * @param value The new blue value.
	 * @see RGB#b()
	 */
	public void b(int value) {
		this.b.setValue(value);
	}

}