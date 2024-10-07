package org.iesvdm.ejercicio04;
import lombok.*;

@Data // genera automaticamente getters, setters, constructores, etc... para todos los campos
@NonNull // asegura que el atributo no sea nulo
@Builder // genera un constructor con todos los atributos de la clase
@Value // genera un constructor con todos los atributos de la clase, pero inmutable
class Coche {
    @NonNull // Lombok genera un constructor que requiere que el campo no sea nulo
    String marca;

    @NonNull
    String modelo;

    int anio; //int no puede ser nulo

    String color; //String puede ser nulo

    double precio;

}
