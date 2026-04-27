package Trabajos_Clase.Clase_26_02_17;


public class Main {
    public static void main(String[] args) {

        Bicicleta bicicleta = new Bicicleta();
        System.out.println(bicicleta.toString());

        Bicicleta bicicleta2 = new Bicicleta("Roja", 0.8f, 0.3f, 10, "Carbono");
        System.out.println(bicicleta2.toString());
    }
}
