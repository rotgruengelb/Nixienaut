package net.rotgruengelb.nixienaut.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to indicate that the method returns a placeholder value.
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.METHOD, ElementType.PACKAGE, ElementType.PARAMETER, ElementType.TYPE})
public @interface PlaceholderValue {
	/**
	 * The value of the placeholder. (warning message)
	 * @return The value of the placeholder. (warning message)
	 */
	String value();
}
