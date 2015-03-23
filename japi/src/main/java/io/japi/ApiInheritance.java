package io.japi;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * This annotation indicates if an API consumer should inherit from or extend the annotated element. For a type this
 * means implementing for extending. For a constructor this means invoking it from a subclass's constructor. For a
 * field this is primarily relegated to protected members, and means modifying it in the subclass. For a method this
 * means overriding or implementing the given method.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, CONSTRUCTOR, FIELD, METHOD})
public @interface ApiInheritance {

  Inheritance value();

  public static enum Inheritance
  {
    /**
     * API consumers should *NOT* inherit from this API element.
     */
    SEALED,
    /**
     * API consumers may inherit from this API element.
     */
    EXTENSIBLE
  }
}
