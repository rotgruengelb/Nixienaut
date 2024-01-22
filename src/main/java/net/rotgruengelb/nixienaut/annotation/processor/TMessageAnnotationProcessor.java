package net.rotgruengelb.nixienaut.annotation.processor;

import net.rotgruengelb.nixienaut.annotation.PlaceholderValue;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Set;

import static javax.tools.Diagnostic.Kind.WARNING;

/**
 * Template for annotation processors.
 */
public class TMessageAnnotationProcessor<Indicator extends Annotation> extends AbstractProcessor {


	/**
	 * The kind of the message.
	 * @return The kind of the message.
	 */
	public Diagnostic.Kind kind() { return WARNING; }

	/**
	 * The name of the annotation.
	 * @return The name of the annotation.
	 */
	public String annotationName() { return PlaceholderValue.class.getName(); }

	/**
	 * The message to be displayed.
	 * @return The message to be displayed.
	 * @param element The element for getting the annotation.
	 */
	public String message(Element element) { return element.getAnnotation(PlaceholderValue.class).value(); }

	/**
	 * The elements annotated with the annotation.
	 * @param roundEnv The round environment.
	 * @return Set of elements from roundEnv#getElementsAnnotatedWith.
	 */
	public Set<? extends Element> elementsAnnotatedWith(RoundEnvironment roundEnv) {
		return roundEnv.getElementsAnnotatedWith(PlaceholderValue.class);
	}

	@Override
	public SourceVersion getSupportedSourceVersion() { return SourceVersion.latestSupported(); }

	@Override
	public Set<String> getSupportedAnnotationTypes() { return Collections.singleton(annotationName()); }

	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
		Set<? extends Element> elements = elementsAnnotatedWith(roundEnv);

		for (Element element : elements) {
			processingEnv.getMessager()
					.printMessage(kind(), "@" + annotationName() + message(element), element);
		}

		return true;
	}
}