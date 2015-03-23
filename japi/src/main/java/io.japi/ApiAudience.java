package io.japi;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * This annotation indicates the intended audience of API elements. Code that does not represent the intended
 * audience should not attempt to interface with this API element. This includes invoking and instantiating for all
 * elements and extending for {@link io.japi.ApiInheritance.Inheritance#EXTENSIBLE extensible} elements.
 *
 * This is useful for elements that must be made public for some reason outside of the API-developer's control, but that
 * the API developer does not necessarily wish to have consumed publicly.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, CONSTRUCTOR, FIELD, METHOD})
public @interface ApiAudience {

  Audience value();

  public static enum Audience
  {
    /**
     * All API consumers may interface with this element.
     */
    PUBLIC,
    /**
     * This API element is intended to be consumed only within its framework.
     */
    INTERNAL,
    /**
     * This API element is made public for the purpose of interfacing with some third-party. This typically means that
     * it is implementing some external interface or pattern, and expects to be invoked ONLY by that third-party.
     */
    TARGETTED,
    /**
     * This API element indicates that this element is private. It should not be consumed outside of this module.
     */
    PRIVATE
  }
}
