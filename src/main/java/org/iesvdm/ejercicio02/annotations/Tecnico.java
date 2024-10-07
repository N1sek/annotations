package org.iesvdm.ejercicio02.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Tecnico {
    String nombre();
    String apellidos();
    String dni();
    String telefono();
    String direccion() default "Fake Street 123";
    String perfil();
}
