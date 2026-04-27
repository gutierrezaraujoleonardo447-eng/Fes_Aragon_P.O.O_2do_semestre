package Trabajos_Clase.Clase_26_03_26_Interfaces_figuras;

import java.util.ArrayList;

public class MainPoli_Clase_26_04_07 {
    public static void main(String[] args) {

        ArrayList<Circulo> listaCirculo = new ArrayList <>();
        // codigo para meter circulos en la lista circulos
        ArrayList<Circulo> listaCuadrado = new ArrayList <>();
        // codigo para meter cuadrados en listaCuadrados


        //POLIMORFISMO
        ArrayList<Figura> listaFiguras = new ArrayList<>();
        listaFiguras.add(new Circulo());
        listaFiguras.add(new Circulo());
        listaFiguras.add(new Circulo(4.6f, 0.0f, 0.0f));
        listaFiguras.add(new Cuadrado());
        listaFiguras.add(new Cuadrado());
        listaFiguras.add(new Cuadrado(3.0f, 5.0f, 0.0f, 0.0f));
        listaFiguras.add(new Cuadrado());



        for (Figura figura : listaFiguras) {
            System.out.println(figura.calcularArea());
        }
    }
}
