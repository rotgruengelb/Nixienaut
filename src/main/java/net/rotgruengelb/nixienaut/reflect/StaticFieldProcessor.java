package net.rotgruengelb.nixienaut.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;

public class StaticFieldProcessor {

	private static <T> void process(Class<?> clazz, Class<T> type, boolean recursive, Consumer<T> consumer) {
		for (Field field : clazz.getDeclaredFields()) {
			if (Modifier.isStatic(field.getModifiers()) && type.isAssignableFrom(field.getType())) {
				try {
					field.setAccessible(true);
					consumer.accept((T) field.get(null));
				} catch (IllegalAccessException ignored) { }
			}
		}

		if (recursive) {
			for (Class<?> innerClass : clazz.getDeclaredClasses()) {
				process(innerClass, type, true, consumer);
			}
		}
	}
}
