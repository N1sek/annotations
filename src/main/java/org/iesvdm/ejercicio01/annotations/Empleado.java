package org.iesvdm.ejercicio01.annotations;
import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Empleados.class)
@Documented
public @interface Empleado {
    String nombre();
    String apellidos();
    String direccion() default "Fake Street 123";
    String dni();
    int telefono();
    String clase();
    int codDespacho() default 2;
    int codTaller() default 0;
    String perfil() default "";
    int categoria() default 0;

}

