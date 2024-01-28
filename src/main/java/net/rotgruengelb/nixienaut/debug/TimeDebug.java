package net.rotgruengelb.nixienaut.debug;

public class TimeDebug {

	/**
	 * @param debug If true, the time will be measured.
	 * @return The start time.
	 */
	public static long timeStart(boolean debug) {
		if (!debug) { return 0; }
		return System.nanoTime();
	}

	/**
	 * @param startTime The start time.
	 */
	public static String timeEnd(long startTime, String message) {
		long endTime = System.nanoTime();
		return String.format("%s | took %d nano seconds.", message, endTime - startTime);
	}
}