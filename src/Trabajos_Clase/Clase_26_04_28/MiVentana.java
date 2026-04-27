package Trabajos_Clase.Clase_26_04_28;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MiVentana extends Frame {
    private Label etiqueta;
    private TextField entrada;
    private Button boton;
    private Label salida;

    public MiVentana()  {
        super ("Mi ventana");
        etiqueta = new Label("Ingrese un nombre");
        entrada = new TextField(20);
        boton = new Button("Saludar");
        salida = new Label(" ");

        this.add(etiqueta);
        this.add(entrada);
        this.add(boton);
        this.add(salida);
        entrada.setText("Tu nombre....");
        System.out.println(etiqueta.getText());

        setSize(800,400);
        setLayout(new FlowLayout());
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                salida.setText("Hola" + entrada.getText());
                pack();
            }
        });
        setVisible(true);
    }
}
