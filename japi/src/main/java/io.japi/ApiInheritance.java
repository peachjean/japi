package io.japi;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * TODO: Document this class
 */
public class ApiInheritance {
  /* Class is not instantiable */
  private ApiInheritance(){}

  @Documented
  @Retention(RetentionPolicy.RUNTIME)
  @Target({TYPE, CONSTRUCTOR, FIELD, METHOD})
  public static @interface Sealed {}

  @Documented
  @Retention(RetentionPolicy.RUNTIME)
  @Target({TYPE, CONSTRUCTOR, FIELD, METHOD})
  public static @interface Extensible {}
}
