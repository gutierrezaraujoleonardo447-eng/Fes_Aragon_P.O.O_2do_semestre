package Recapitulación_para_proyecto._06_Manejo_Archivos.System;

public class Main {
    public static void main(String[] args) {
        System.out.println("" + System.getProperty("user.name")); // Da el nombre del usuario que esta logueado
        System.out.println("" + System.getProperty("java.version")); // Da la versón de java que se esta ejecutando
        System.out.println("" + System.getProperty("os.version")); //Version del sistema operativo
        System.out.println("" + System.getProperty("os.name")); // Da el nombre del sistema operativo
        System.out.println("" + System.getProperty("user.home"));
        System.out.println("" + System.getProperty("user.dir")); // Donde se ejecuto la aplicación
    }
}
