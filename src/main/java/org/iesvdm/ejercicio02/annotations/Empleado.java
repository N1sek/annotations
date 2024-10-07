package org.iesvdm.ejercicio02.annotations;

import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Empleados.class)
@Documented
public @interface Empleado {
    String nombre();
    String apellidos();
    String dni();
    String telefono();
    String direccion() default "Fake Street 123";
    String clase();
    int codDespacho() default 2;
    int codTaller() default 0;
    String perfil() default "";
    int categoria() default 0;

}

