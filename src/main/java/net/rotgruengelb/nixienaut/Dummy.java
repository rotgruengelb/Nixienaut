package net.rotgruengelb.nixienaut;

import net.rotgruengelb.nixienaut.annotation.PlaceholderValue;
import net.rotgruengelb.nixienaut.exeption.NotImplementedException;

/**
 * This is a dummy class.
 *
 * @see Dummy#_void()
 */
public class Dummy {

	/**
	 * This is a dummy method.
	 * It does nothing.
	 *
	 * @see Dummy
	 */
	public static void _void() {
	}

	@PlaceholderValue("Not implemented yet!")
	public static void notImplemented() {
		throw new NotImplementedException();
	}
}
