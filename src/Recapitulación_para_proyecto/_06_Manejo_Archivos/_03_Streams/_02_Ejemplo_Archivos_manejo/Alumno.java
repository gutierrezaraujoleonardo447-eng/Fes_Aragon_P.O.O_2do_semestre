package Recapitulación_para_proyecto._06_Manejo_Archivos._03_Streams._02_Ejemplo_Archivos_manejo;

import java.io.Serializable;
import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Alumno implements Serializable {
    private String numeroCuenta;
    private String nombre;
    private String Apellidos;
    private double promedio;

}
