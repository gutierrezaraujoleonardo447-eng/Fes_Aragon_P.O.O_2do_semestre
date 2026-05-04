package Práctica_por_mi_cuenta._26_04_05_Practica1_AWT;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ventana extends Frame {
    private Button saludar;
    private Label IntNombre;
    private TextField nombre;

    public Ventana()  {
        super ("Saludar");
        this.setSize(900,700);
        this.setLayout(new FlowLayout());

        Label intnombre = new Label("Ingrese su nombre: ");
        TextField nombre = new TextField(30);
        Button saludar = new Button("Saludar");

        this.add(intnombre);
        this.add(nombre);
        this.add(saludar);

        saludar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Hola "+ nombre.getText());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        this.setVisible(true);



    }
}
