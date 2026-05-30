package Recapitulación_para_proyecto._06_Manejo_Archivos._03_Streams._02_Ejemplo_Archivos_manejo;

public class main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("303030", "Jose", "García", 8.0);
        AlumnosArchivo archivo = new AlumnosArchivo("Alumno.data"); // --> Se le dice como se va a llamar al archivo
        archivo.escribir(alumno);
        Alumno leido = archivo.leer();
        System.out.println("Alumno leído desde el archivo" + leido);


    }
}
