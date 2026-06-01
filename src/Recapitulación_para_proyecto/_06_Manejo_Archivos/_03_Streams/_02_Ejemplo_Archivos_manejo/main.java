package Recapitulación_para_proyecto._06_Manejo_Archivos._03_Streams._02_Ejemplo_Archivos_manejo;

import Recapitulación_para_proyecto._06_Manejo_Archivos._03_Streams._02_Ejemplo_Archivos_manejo.Modelo.Alumno;
import Recapitulación_para_proyecto._06_Manejo_Archivos._03_Streams._02_Ejemplo_Archivos_manejo.Utilerias.AlumnosArchivo;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        /*
    }
        Alumno alumno = new Alumno("303030", "Jose", "García", 8.0);
        AlumnosArchivo archivo = new AlumnosArchivo("Alumno.data"); // --> Se le dice como se va a llamar al archivo
        archivo.escribir(alumno);
        Alumno leido = archivo.leer();
        System.out.println("Alumno leído desde el archivo" + leido);
        */
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("323089","Leonardo", "Gutiérrez", 9.0 ));
        alumnos.add(new Alumno("123131","Juan", "Cruz", 7.0 ));
        alumnos.add(new Alumno("845574","Sofía", "García", 10.0 ));
        alumnos.add(new Alumno("562453","Sandra", "Hernandez", 5.5 ));
        alumnos.add(new Alumno("767381","Andrea", "Guzman", 6.0 ));
        AlumnosArchivo archivo2 = new AlumnosArchivo("Alumnos2.data");
        archivo2.escribirAlumnos(alumnos);
        ArrayList<Alumno> leidos = archivo2.leerAlumnos();
        for (Alumno alumnosleidos : leidos){
            System.out.println("Leido: " + alumnosleidos);
        }
    }
}
