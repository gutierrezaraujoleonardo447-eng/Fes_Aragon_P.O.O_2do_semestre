package Tareas.T_26_04_28_Tarea10_Layouts_AWT;

import java.awt.*;

public class Ventana1 extends Frame {
    Button boton1;
    TextField texto;
    FlowLayout layout;

    public Ventana1() {

    }
    public Ventana1(String titulo, int ancho, int alto) {
        super(titulo);
        setSize(800, 600);
        boton1 = new Button("boton1");
        texto = new TextField("Hola");
        layout = new FlowLayout();
        this.setLayout(layout);
        this.add(boton1);
        this.add(texto);

        this.setVisible(true);
    }
}
