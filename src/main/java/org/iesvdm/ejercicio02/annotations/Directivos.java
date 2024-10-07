package org.iesvdm.ejercicio02.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Directivos {
    Directivo[] value();
}
