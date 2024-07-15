package net.rotgruengelb.nixienaut.util;

import java.util.Map;
import java.util.Objects;

public class StringUtils {

	public static String formatTime(int time, String format) {
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

	public static String convertSnakeCaseToTitleCase(String snakeCaseText) {
		String[] words = snakeCaseText.split("_");
		StringBuilder titleCaseText = new StringBuilder();

		for (String word : words) {
			if (!word.isEmpty()) {
				titleCaseText.append(Character.toUpperCase(word.charAt(0)))
						.append(word.substring(1)
								.toLowerCase())
						.append(" ");
			}
		}
		return titleCaseText.toString()
				.trim();
	}
}
