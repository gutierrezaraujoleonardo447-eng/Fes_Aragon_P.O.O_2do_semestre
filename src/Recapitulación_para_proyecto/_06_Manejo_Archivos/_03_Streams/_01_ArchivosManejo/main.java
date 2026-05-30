package Recapitulación_para_proyecto._06_Manejo_Archivos._03_Streams._01_ArchivosManejo;

public class main {
    public static void main(String[] args) {
        ArchivosManejo archivo = new ArchivosManejo("Ejemplo.txt");
        String mensaje = """
               Este es el mensaje a escribir en el archivo""";

        archivo.escribir(mensaje);
        System.out.println("-----------");
        archivo.leer();
    }
}
