package Recapitulación_para_proyecto._02_DemoSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class VentanaDos extends JFrame {
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel etiqueta;
    private JButton boton1;
    private JComboBox<String> combo;
    private JTextField TxtEntrada;

    public VentanaDos() {
        super("Ventana Dos");

        // Creamos los objetos
        layout = new GridLayout(2,2);
        getContentPane().setLayout(layout);
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        etiqueta = new JLabel("Etiqueta");
        boton1 = new JButton("Boton");
        combo = new JComboBox<>();
        TxtEntrada = new JTextField(10);

        // Inicializar el combobox
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juanito");
        nombres.add("Marco");
        nombres.add("Gabriel");
        nombres.add("Ximena");
        nombres.add("Alexander");
        nombres.add("Pedro");
        //ModeloComboNombres modelo = new ModeloComboNombres(nombres);
        //combo.setModel(modelo);

        // ModeloDefaultComboBox
        ModeloDefaultComboNombre modelo = new ModeloDefaultComboNombre(nombres);
        combo.setModel(modelo);

        // Agregamos colores
        panel1.setBackground(new  Color(213, 130, 220));
        panel2.setBackground(new  Color(227, 7, 119));
        panel3.setBackground(new  Color(3, 95, 133));
        panel4.setBackground(new  Color(191, 116, 255));

        // agregamos panel
        getContentPane().add(panel1,0);
        getContentPane().add(panel2,1);
        getContentPane().add(panel3,2);
        getContentPane().add(panel4,3);

        // agregamos a paneles
        panel1.add(etiqueta);
        panel2.add(TxtEntrada);
        panel2.add(boton1);
        panel3.add(combo);


    // Eventos
        boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                modelo.addElement(TxtEntrada.getText());
            }
        });

        combo.addItemListener(new  ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Se cambio combo");
                System.out.println("Solo el final: " + combo.getSelectedItem());
            }
        });














        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
    }
}
