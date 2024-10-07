package org.iesvdm.ejercicio04;
import lombok.*;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = Coche.builder()
                .marca("Nissan")
                .modelo("200SX")
                .anio(1996)
                .color("Rojo")
                .precio(20000.00)
                .build();

        System.out.println(coche1);
    }
}
