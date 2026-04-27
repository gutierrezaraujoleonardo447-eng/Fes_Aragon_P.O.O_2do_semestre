package Trabajos_Clase.Clase_26_03_03_Herencia;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Leonardo", 19, "Masculino");
        System.out.println(p1);
        System.out.println(p1.getNombre());
        p1.dormir();
        p1.setNombre("Lima");
        System.out.println(p1);

        System.out.println("            ////ALUMNO////         ");

        Alumno al1 = new Alumno("Leonardo", 19, "Masculino", "323087593", "ICO");
        System.out.println(al1);
        al1.comer();
        al1.dormir();
        al1.estudiar();

        al1.hacerTarea();

        System.out.println("             ///CAJA CARTON///");

        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Lima", 22, "Masculino"));
        listaPersonas.add(new Persona("Valeria", 22, "Femenina"));
        listaPersonas.add(new Persona("Emilio", 22, "Masculino"));
        listaPersonas.add(new Persona("Carlos", 22, "Masculino"));
        listaPersonas.add(new Persona("Daniel", 22, "Masculino"));
        listaPersonas.add(new Persona("Sandra", 22, "Femenina"));
        listaPersonas.add(new Persona("Naomi", 22, "Femenina"));
        listaPersonas.add(new Persona("Alexander", 22, "Masculino"));


        for ( Persona p: listaPersonas){
            System.out.println(p);
        }

        HashMap<String, String> datos = new HashMap<>();
        datos.put("0", "Papas");
        datos.put("1", "Pepsi");
        datos.put("2", "Burguers");
        datos.put("algo", "Tacos");
        System.out.println(datos.get("0"));


    }
}