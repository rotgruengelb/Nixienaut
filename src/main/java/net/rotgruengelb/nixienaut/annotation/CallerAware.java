package net.rotgruengelb.nixienaut.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to indicate that the method is aware of the caller.<br>
 * <h2>ALWAYS AVOID WRAPPING THE ANNOTATED METHOD!</h2>
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface CallerAware {
}
