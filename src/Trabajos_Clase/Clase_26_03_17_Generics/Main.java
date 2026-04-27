package Trabajos_Clase.Clase_26_03_17_Generics;

public class Main {
    public static void main(String[] args) {
        Procesador[] procesadores = new Procesador[CajaCarton.CAPACIDAD];
        CajaCarton<Procesador> cajaTiliches = new CajaCarton<>(procesadores);
        cajaTiliches.add(new Procesador("Intel", "i5", 1.3f, 4), 0);
        cajaTiliches.add(new Procesador("Intel", "i7", 1.6f, 8), 1);
        cajaTiliches.add(new Procesador("Intel", "i9", 2.0f, 16), 2);


        System.out.println(cajaTiliches.get(1));
        System.out.println(cajaTiliches.get(0));

        System.out.println("----------------------------------------------------------------------------");

        for (int i = 0; i < CajaCarton.CAPACIDAD; i++) {
            System.out.println(cajaTiliches.get(i));
            System.out.println();
        }

        System.out.println("-----------------");


    }
}