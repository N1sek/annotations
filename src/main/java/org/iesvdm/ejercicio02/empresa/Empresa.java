package org.iesvdm.ejercicio02.empresa;


import org.iesvdm.ejercicio02.annotations.Directivo;
import org.iesvdm.ejercicio02.annotations.Oficial;
import org.iesvdm.ejercicio02.annotations.Tecnico;
import org.iesvdm.ejercicio02.empleados.Empleado;

import java.util.ArrayList;
import java.util.List;


@Directivo(nombre = "Jeff", apellidos = "Bezos", direccion = "Seattle Washington 98109", dni = "12345678A", codDespacho = 23, telefono = "5363677")
@Oficial(nombre = "Pepe", apellidos = "Garcia", direccion = "Calle Falsa 123", dni = "12345678B", telefono = "123456789", categoria = "Jefe de Proyecto")
@Tecnico(nombre = "Juan", apellidos = "Perez", direccion = "Calle Falsa 123", dni = "12345678C", telefono = "123456789", perfil = "Desarrollador")
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

