package Trabajos_Clase.Clase_26_02_10;

public class Main {
    public static void main(String[] args) {

        Coche c =  new Coche("Metal", "Rojo", 2.5f, 2.0f, 150 );
        System.out.println(c);
        c.setAncho(3.0f);
        System.out.println(c.getAncho());
        c.setAltura(2.0f);
        System.out.println(c.getAltura());

        Closet cl = new Closet("Madera", "cafe", 1.56f, 30);
        System.out.println(cl);
        System.out.println(cl.getMaterial());

        cl.setColor("Azul");
        System.out.println(cl.getColor());



    }
}
