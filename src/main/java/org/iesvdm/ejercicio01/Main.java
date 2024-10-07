package org.iesvdm.ejercicio01;

import org.iesvdm.ejercicio01.ctx.CargadorDeContexto;
import org.iesvdm.ejercicio01.empresa.Empresa;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa().setNombre("Empresa1").setEmpleados(new CargadorDeContexto().cargarEmpleados());
        System.out.println(empresa);
    }
}
