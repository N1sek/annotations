package org.iesvdm.ejercicio02.ctx;

import org.iesvdm.ejercicio02.empleados.Empleado;
import org.iesvdm.ejercicio02.annotations.Tecnico;
import org.iesvdm.ejercicio02.empresa.Empresa;
import org.iesvdm.ejercicio02.annotations.Directivo;
import org.iesvdm.ejercicio02.annotations.Oficial;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CargadorDeContexto {
    public static List<Tecnico> cargarTecnicos() {
        return Arrays.asList(Empresa.class.getAnnotationsByType(Tecnico.class));
    }

    public static List<Oficial> cargarOficiales() {
        return Arrays.asList(Empresa.class.getAnnotationsByType(Oficial.class));
    }

    public static List<Directivo> cargarDirectivos() {
        return Arrays.asList(Empresa.class.getAnnotationsByType(Directivo.class));
    }

    public List<org.iesvdm.ejercicio02.empleados.Directivo> listaDeDirectivos() {
        List<org.iesvdm.ejercicio02.empleados.Directivo> listaDirectivo = new ArrayList<>();

        for (Directivo directivoAnnotation : cargarDirectivos()) {
            org.iesvdm.ejercicio02.empleados.Directivo directivo = new org.iesvdm.ejercicio02.empleados.Directivo();
            directivo.setNombre(directivoAnnotation.nombre());
            directivo.setApellidos(directivoAnnotation.apellidos());
            directivo.setDireccion(directivoAnnotation.direccion());
            directivo.setDni(directivoAnnotation.dni());
            directivo.setCodDespacho(directivoAnnotation.codDespacho());
            listaDirectivo.add(directivo);
        }
        return listaDirectivo;
    }

    public List<org.iesvdm.ejercicio02.empleados.Tecnico> listaDeTecnicos() {
        List<org.iesvdm.ejercicio02.empleados.Tecnico> listaTecnico = new ArrayList<>();

        for (Tecnico tecnico : cargarTecnicos()) {
            org.iesvdm.ejercicio02.empleados.Tecnico tecnicoPro = new org.iesvdm.ejercicio02.empleados.Tecnico();
            tecnicoPro.setNombre(tecnico.nombre());
            tecnicoPro.setApellidos(tecnico.apellidos());
            tecnicoPro.setDireccion(tecnico.direccion());
            tecnicoPro.setDni(tecnico.dni());
            tecnicoPro.setTelefono(tecnico.telefono());
            listaTecnico.add(tecnicoPro);
        }
        return listaTecnico;
    }

    public List<org.iesvdm.ejercicio02.empleados.Oficial> listaDeOficiales() {

        List<org.iesvdm.ejercicio02.empleados.Oficial> listaOficial = new ArrayList<>();
        for (Oficial oficialAnnotation : cargarOficiales()) {
            org.iesvdm.ejercicio02.empleados.Oficial oficial = new org.iesvdm.ejercicio02.empleados.Oficial();
            oficial.setNombre(oficialAnnotation.nombre());
            oficial.setApellidos(oficialAnnotation.apellidos());
            oficial.setDireccion(oficialAnnotation.direccion());
            oficial.setDni(oficialAnnotation.dni());
            oficial.setCategoria(oficialAnnotation.categoria());
            oficial.setTelefono(oficialAnnotation.telefono());
            listaOficial.add(oficial);
        }
        return listaOficial;
    }

    public List<Empleado> cargarEmpresa() {
        List<Empleado> empleados = new ArrayList<>();
        empleados.addAll(listaDeDirectivos());
        empleados.addAll(listaDeOficiales());
        empleados.addAll(listaDeTecnicos());
        return empleados;
    }
}