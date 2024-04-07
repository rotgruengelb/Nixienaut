package net.rotgruengelb.nixienaut.format;

import java.util.Map;
import java.util.Objects;

public class TimeFormatting {

	private static String formatTime(int time, String format) {
		Map<String, Integer> values = Map.of("d", time / 1728000, "h", (time % 1728000) / 72000, "m", (time % 72000) / 1200, "s", (time % 1200) / 20, "tH", time / 72000, "tM", time / 1200, "tS", time / 20);

		String[] formatSplit = format.split("%");
		for (int i = 0; i < formatSplit.length; i++) {
			if (Objects.equals(formatSplit[i], "\\")) {
				formatSplit[i] = "%";
				continue;
			}
			if (values.containsKey(formatSplit[i])) {
				String string = values.get(formatSplit[i]).toString();
				formatSplit[i] = "0".repeat(Math.max(0, 2 - string.length())) + string;
			}
		}
		return String.join("", formatSplit);
	}
}
