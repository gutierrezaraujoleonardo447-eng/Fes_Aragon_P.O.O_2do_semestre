package Trabajos_Clase.Clase_26_02_05;

public class Main {
    public static void main(String[] args) {

        System.out.println("Cama\n");
        Cama c =  new Cama();
        c.moverDelugar();
        c.soportarPersona();
        c.usarParadormir();

        System.out.println("\nLampara\n");
        Lampara l = new Lampara();
        l.apagar();
        l.cambiarIntensidad();
        l.encender();

        System.out.println("\nRopero\n");
        Ropero r = new Ropero();
        r.abrir();
        r.cerrar();
        r.guardarRopa();










    }
}