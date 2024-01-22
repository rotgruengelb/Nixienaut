package net.rotgruengelb.nixienaut.annotation.processor;

import net.rotgruengelb.nixienaut.annotation.PlaceholderValue;

import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.tools.Diagnostic;
import java.util.Set;

/**
 * Annotation processor for {@link PlaceholderValue}.
 */
@SuppressWarnings("RedundantMethodOverride")
public class PlaceholderValueAnnotationProcessor extends TMessageAnnotationProcessor<PlaceholderValue> {

	private static final Class<PlaceholderValue> annotation = PlaceholderValue.class;

	@Override
	public Diagnostic.Kind kind() { return Diagnostic.Kind.WARNING; }

	public String message(Element element) { return element.getAnnotation(annotation).value(); }

	@Override
	public String annotationName() { return annotation.getName(); }

	@Override
	public Set<? extends Element> elementsAnnotatedWith(RoundEnvironment roundEnv) {
		return roundEnv.getElementsAnnotatedWith(annotation);
	}
}
