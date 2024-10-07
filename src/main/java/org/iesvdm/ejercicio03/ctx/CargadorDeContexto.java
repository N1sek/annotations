package org.iesvdm.ejercicio03.ctx;

import org.iesvdm.ejercicio03.tareas.AgendaSemana;
import org.iesvdm.ejercicio03.annotations.Tarea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CargadorDeContexto {

    public static List<Tarea> GetTareas() {
        return Arrays.asList(AgendaSemana.class.getAnnotationsByType(Tarea.class));
    }

    public List<org.iesvdm.ejercicio03.tareas.Tarea> cargarTareas() {
        List<org.iesvdm.ejercicio03.tareas.Tarea> tareas = new ArrayList<>();

        for (Tarea tareaAnotada : GetTareas()) {
            org.iesvdm.ejercicio03.tareas.Tarea tarea = new org.iesvdm.ejercicio03.tareas.Tarea();
            tarea.setTituloTarea(tareaAnotada.titulo());
            tarea.setDescripcion(tareaAnotada.descripcion());
            tarea.setDiaDeLaSemana(tareaAnotada.diaSemana());
            tarea.setHora(tareaAnotada.hora());
            tareas.add(tarea);
        }
        return tareas;
    }
}

