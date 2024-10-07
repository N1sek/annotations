package org.iesvdm.ejercicio03;


import org.iesvdm.ejercicio03.ctx.CargadorDeContexto;
import org.iesvdm.ejercicio03.tareas.Tarea;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        CargadorDeContexto cargador = new CargadorDeContexto();
        List<Tarea> tareas = cargador.cargarTareas();

        System.out.println("Tareas semanales:");
        for (org.iesvdm.ejercicio03.tareas.Tarea tarea : tareas) {
            System.out.println("Título: " + tarea.getTituloTarea() + " | Descripción: " + tarea.getDescripcion() + " | Día: " + tarea.getDiaDeLaSemana() + " | Hora: " + tarea.getHora());
        }
    }
}

