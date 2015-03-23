package io.japi;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * Used to mark packages that contain API classes. Validating checks will be run on these packages to ensure that all
 * components are marked with audience, inheritance, and stability annotations.
 */
@Retention(RUNTIME)
@Target(PACKAGE)
@Inherited
public @interface Api {
}
