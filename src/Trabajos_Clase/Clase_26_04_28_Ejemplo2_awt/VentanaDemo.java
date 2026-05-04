package Trabajos_Clase.Clase_26_04_28_Ejemplo2_awt;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaDemo extends Frame {
    private Label etiqueta;
    private TextField entrada;
    private Button boton;
    private Label salida;




    public VentanaDemo()  {
        super("Mi Ventana");
        setLayout(new FlowLayout());
        setSize(800,600);
        setVisible(true);

        // Componentes
        etiqueta = new Label("Ingresa un nombre: ");
        entrada = new TextField(20);
        boton = new Button("Saludar");
        salida = new Label(" ");

        // Agregar componentes
        add(etiqueta);
        add(entrada);
        add(boton);
        add(salida);

        //entrada.setText("Tú nombre es  ");
        //System.out.println(etiqueta.getText());

        this.addWindowListener( new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                salida.setText("Hola " + entrada.getText());
                pack();
                System.out.println(salida.getText());
            }
        });



    }
}
