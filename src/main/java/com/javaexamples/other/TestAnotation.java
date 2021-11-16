package com.javaexamples.other;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {FIELD, METHOD, CONSTRUCTOR, PARAMETER, TYPE})
@Documented
public @interface TestAnotation {
    public boolean enabled() default true;

    public enum Priorty {
        LOW, MEDIUM, HIGH;
    }

    Priorty priorty() default Priorty.MEDIUM;

    String[] tags() default "";

    String createdBy() default "Ramazan";

    String lastModified() default "28/11/1988";
}
