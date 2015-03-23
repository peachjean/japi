package io.japi;

import java.lang.annotation.Documented;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * This annotation indicates the advertised stability of the API element. Note that the scope of a stability is
 * contingent on the {@link ApiInheritance} of the API element. In addition, stability is only relevant for elements
 * with an {@link ApiAudience} of {@link io.japi.ApiAudience.Audience#PUBLIC PUBLIC}.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, CONSTRUCTOR, FIELD, METHOD})
public @interface ApiStability {

  Stability value();

  public static enum Stability {
    /**
     * This API element is stable. It is guaranteed to only change in binary-incompatible ways in major version
     * increments.
     */
    STABLE,
    /**
     * This API element may change in binary-incompatible ways (including removal) during minor version increments. It
     * is guaranteed to not change in binary-incompatible ways in maintenance version increments.
     */
    EVOLVING,
    /**
     * This API element may change or be completely removed at any time.
     */
    EXPERIMENTAL
  }
}
