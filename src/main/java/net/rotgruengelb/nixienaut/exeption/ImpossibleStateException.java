package net.rotgruengelb.nixienaut.exeption;

public class ImpossibleStateException extends RuntimeException {

	/**
	 * This exception is thrown when a state produced in program is impossible.
	 *
	 * @see ImpossibleStateException#ImpossibleStateException(String message)
	 * @see IllegalStateException
	 */
	public ImpossibleStateException() { super("The state produced is Impossible! This should never happen! Please report this!"); }

	/**
	 * This exception is thrown when a state produced in program is impossible.
	 *
	 * @param message The message to be displayed
	 */
	public ImpossibleStateException(String message) { super(message); }
}
