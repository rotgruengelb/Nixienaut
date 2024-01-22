package net.rotgruengelb.nixienaut.exeption;


/**
 * This exception is thrown when a method is called that is not implemented yet.
 */
public class NotImplementedException extends RuntimeException {

	/**
	 * This exception is thrown when a method is called that is not implemented yet.
	 * @see NotImplementedException#NotImplementedException(String message)
	 */
	public NotImplementedException() { super("Not implemented yet!"); }

	/**
	 * This exception is thrown when a method is called that is not implemented yet.
	 * @param message The message to be displayed
	 */
	public NotImplementedException(String message) { super(message); }
}
