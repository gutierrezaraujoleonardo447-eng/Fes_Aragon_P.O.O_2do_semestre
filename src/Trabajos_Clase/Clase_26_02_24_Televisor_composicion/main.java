package Trabajos_Clase.Clase_26_02_24_Televisor_composicion;

public class main {
    public static void main(String[] args) {

        Pantalla p1 = new Pantalla();
        p1.encender();
        System.out.println(p1);

        Volumen v1 = new Volumen(80);
        System.out.println("\n\n" + v1);
        v1.subir(19);
        System.out.println(v1);

        Canal c1 = new Canal(97);
        System.out.println("\n\n" + c1);
        c1.canalSiguiente();
        c1.canalSiguiente();
        c1.canalSiguiente();
        System.out.println("\n\n" + c1);

        System.out.println("\n\nProbando la composicion de la Tv.\n");
        TV tele = new TV("Samsung", 6500.5f, 52, new Pantalla(32, true), new Volumen(10),  new Canal(2));
        System.out.println(tele);
        tele.getChannel().canalSiguiente();
        System.out.println(tele);

        tele.subirVolumen(20);
        System.out.println("Encendiendo tele..");
        tele.getPantalla().encender();
        tele.subirVolumen(2);
        System.out.println(tele);
        tele.estado();





    }
}
