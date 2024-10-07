package org.iesvdm.ejercicio01.empresa;

import org.iesvdm.ejercicio01.empleados.Empleado;


import java.util.ArrayList;
import java.util.List;


@org.iesvdm.ejercicio01.annotations.Empleado(nombre = "Yo", apellidos = "No se", dni = "c645767v", telefono = 12354367, clase = "1")
public class Empresa {

    private String nombre;
    private List<Empleado> empleados = new ArrayList<Empleado>();

    public Empresa() {
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public Empresa setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Empresa setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }


    @Override
    public String toString() {
        return "Empresa: " + nombre + "\nEmpleados=\n" + empleados;
    }


}

