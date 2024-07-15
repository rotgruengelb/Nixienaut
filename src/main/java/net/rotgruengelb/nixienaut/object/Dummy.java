package net.rotgruengelb.nixienaut.object;

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
	public static void _staticVoid() { }

	@PlaceholderValue("Not implemented yet!")
	public static void notImplemented() { throw new NotImplementedException(); }

	public void _void() { }
}
