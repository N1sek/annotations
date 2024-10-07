package org.iesvdm.ejercicio02.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Oficial {
    String nombre();
    String apellidos();
    String direccion() default "Fake Street 123";
    String dni();
    String telefono();
    String categoria();
}
