package org.iesvdm.ejercicio03.tareas;

import java.util.List;

import org.iesvdm.ejercicio03.annotations.Tarea;

@Tarea(titulo = "Tarea 1", descripcion = "Descripcion 1", diaSemana = "Lunes", hora = "1:00")
@Tarea(titulo = "Tarea 2", descripcion = "Descripcion 2", diaSemana = "Martes", hora = "2:00")
@Tarea(titulo = "Tarea 3", descripcion = "Descripcion 3", diaSemana = "Miercoles", hora = "3:00")
@Tarea(titulo = "Tarea 4", descripcion = "Descripcion 4", diaSemana = "Jueves", hora = "4:00")
@Tarea(titulo = "Tarea 5", descripcion = "Descripcion 5", diaSemana = "Viernes", hora = "5:00")
public class AgendaSemana {
    private List<org.iesvdm.ejercicio03.tareas.Tarea> tareas;

    public void setTareas(List<org.iesvdm.ejercicio03.tareas.Tarea> tareas) {
        this.tareas = tareas;
    }

    @Override
    public String toString() {
        return "AgendaSemana{\n" +
                "tareas=\n" + tareas + "\n}";
    }
}

