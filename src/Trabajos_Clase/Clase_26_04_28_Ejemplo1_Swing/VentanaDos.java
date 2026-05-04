package Trabajos_Clase.Clase_26_04_28_Ejemplo1_Swing;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VentanaDos extends JFrame {
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel etiqueta;
    private JButton boton;
    private JComboBox<String> combo;


    public VentanaDos() {
        super("Mi segunda ventana swing");
        layout = new GridLayout(2, 2);
        getContentPane().setLayout(layout);

        panel1 = new JPanel();
        panel1.setBackground(new Color(255, 146, 208));
        getContentPane().add(panel1, 0);
        panel2 = new JPanel();
        panel2.setBackground(new Color(76, 169, 228));
        getContentPane().add(panel2, 1);
        panel3 = new JPanel();
        panel3.setBackground(new Color(73, 5, 54));
        getContentPane().add(panel3, 2);
        panel4 = new JPanel();
        panel4.setBackground(new Color(147, 26, 88));
        getContentPane().add(panel4, 3);

        combo = new JComboBox<>();

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juanito");
        nombres.add("Marco");
        nombres.add("Pedro");
        nombres.add("Sandra");
        nombres.add("Daniel");
        ModeloComboNombres modelo = new ModeloComboNombres(nombres);
        combo.setModel(modelo);
        etiqueta = new JLabel("Soy un Label");
        boton = new JButton("Soy un boton");

        panel1.add(etiqueta);
        panel2.add(boton);
        panel3.add(combo);




        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);



    }
}
