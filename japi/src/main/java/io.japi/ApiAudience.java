package io.japi;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * TODO: Document this class
 */
public final class ApiAudience {
  /* Class is not instantiable */
  private ApiAudience(){}

  @Documented
  @Retention(RetentionPolicy.RUNTIME)
  @Target({TYPE, CONSTRUCTOR, FIELD, METHOD})
  public static @interface Public {}

  @Documented
  @Retention(RetentionPolicy.RUNTIME)
  @Target({TYPE, CONSTRUCTOR, FIELD, METHOD})
  public static @interface Internal {}

  @Documented
  @Retention(RetentionPolicy.RUNTIME)
  @Target({TYPE, CONSTRUCTOR, FIELD, METHOD})
  public static @interface Private {}
}
