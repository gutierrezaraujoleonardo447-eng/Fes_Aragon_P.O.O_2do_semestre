package Trabajos_Clase.Clase_26_02_26_Candado_composicion;

public class Main {
    public static void main(String[] args) {
        Candado candado = new Candado();
        System.out.println(candado);

        candado.girarEngrane(0, 2);
        System.out.println(candado);

        candado.setCombinacion("123");
        System.out.println(candado);

        candado.abrir();
        System.out.println(candado);

        candado.girarEngrane(0, 9);
        candado.girarEngrane(1, 2);
        candado.girarEngrane(2, 3);
        candado.abrir();

    }
}