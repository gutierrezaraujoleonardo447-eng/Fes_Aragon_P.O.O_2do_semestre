package Recapitulación_para_proyecto._01_DemoSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaSwing extends JFrame {
    private JLabel etiqueta;
    private TextField entrada;
    private JButton boton;


    public VentanaSwing() {
        super("Mi primer ventana Swing");
        setSize(600,400);

        getContentPane().setLayout(new GridLayout(3,3));
        //getContentPane().setLayout(new FlowLayout());

        // Creamos los objetos
        etiqueta = new JLabel("Dame un numero");
        entrada = new TextField(10);
        boton = new JButton("Enviar");

        //Colores
        boton.setForeground(new Color(245, 105, 250));


        // Agregar elementos a la ventana
       getContentPane().add(etiqueta, 0);
       getContentPane().add(entrada,1);
       getContentPane().add(boton,2);

       // Agregar eventos
        boton.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                double entradaCelsius = Double.parseDouble(entrada.getText());
                double gradosFarenheit = (entradaCelsius * 9 / 5) + 32;
                JOptionPane.showMessageDialog(null, "El grado Farenheit es:  " + gradosFarenheit);
            }
        });

        entrada.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Hola desde aquí");
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
