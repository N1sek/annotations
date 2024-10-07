package org.iesvdm.ejercicio02.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Directivo {
    String nombre();
    String apellidos();
    String dni();
    String direccion() default "Calle Falsa 123";
    String telefono();
    int codDespacho();

}
