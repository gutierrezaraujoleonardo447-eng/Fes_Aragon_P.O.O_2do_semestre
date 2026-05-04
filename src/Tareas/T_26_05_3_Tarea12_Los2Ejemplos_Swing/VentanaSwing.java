package Tareas.T_26_05_3_Tarea12_Los2Ejemplos_Swing;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaSwing extends JFrame {
    private JLabel etiqueta;
    private JTextField entrada;
    private JButton boton;



    public VentanaSwing() {
        super("Mi primer ventana Swing");

        this.getContentPane().setLayout(new GridLayout(3,3));

        etiqueta = new JLabel("Dame un numero");
        entrada = new JTextField(10);
        boton = new JButton("Enviar");

        boton.setForeground(new Color(104, 184, 237));
        boton.setBackground(new Color(90, 15, 67));



        getContentPane().add(etiqueta, 0);
        getContentPane().add(entrada, 1);
        getContentPane().add(boton, 2);

        getContentPane().repaint();
        this.pack();


        setSize(800, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Double entradaCelsius = Double.parseDouble(entrada.getText());
                Double gradosFarenheit = (entradaCelsius * 9 / 5) + 32;
                JOptionPane.showMessageDialog(null, "El grado Farenheit es: " + gradosFarenheit);
            }
        });

        entrada.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Hola desde el clic al cuadro de dialogo");
            }
        });

        entrada.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Hola desde el KeyTyped al cuadro de entrada");
                System.out.println(e.getKeyChar());
                System.out.println(e.getKeyCode());
                System.out.println("Codigo de tecla: " + e.getKeyCode());
            }
        });

    }
}

