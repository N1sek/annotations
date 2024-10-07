package org.iesvdm.ejercicio02;

import org.iesvdm.ejercicio02.ctx.CargadorDeContexto;
import org.iesvdm.ejercicio02.empresa.Empresa;

public class Main {
    public static void main(String[] args) {
        Empresa amazon = new Empresa().setNombre("Amazon").setEmpleados(new CargadorDeContexto().cargarEmpresa());
        System.out.println(amazon);
    }
}
