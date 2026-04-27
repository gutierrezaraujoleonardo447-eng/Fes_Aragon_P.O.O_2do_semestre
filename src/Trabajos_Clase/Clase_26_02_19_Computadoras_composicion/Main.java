package Trabajos_Clase.Clase_26_02_19_Computadoras_composicion;

public class Main {
    public static void main(String[] args) {

        Computadora c1 = new Computadora("Asus", "TUF", new Teclado(100, "1Hora", "757434"), new Procesador("i9", "12da generacion", 5.0f, 4 ));
        System.out.println(c1);
        c1.getProcesador().setMarca("i8");
        System.out.println(c1);
    }
}