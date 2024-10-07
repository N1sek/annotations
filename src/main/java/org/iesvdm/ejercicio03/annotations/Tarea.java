package org.iesvdm.ejercicio03.annotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Tareas.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Tarea {
    String titulo();
    String descripcion();
    String diaSemana();
    String hora();
}