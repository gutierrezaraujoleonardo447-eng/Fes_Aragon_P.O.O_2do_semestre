package Recapitulación_para_proyecto._05_JOptionPane.Vista;

import javax.swing.*;
import java.awt.*;

public class Ventana_ extends JFrame {
    private JButton btnMensaje;
    private JButton btnEntrada;
    private JButton btnOpcion;
    private JLabel lblResultado;

    public Ventana_()  {
        super("JOptionPane");
        setSize(900,600);

        // Agregamos Layout
        this.getContentPane().setLayout(new FlowLayout());


        // Creamos los objetos de los componentes
        btnMensaje = new JButton("Mensaje");
        btnEntrada = new JButton("Entrada");
        btnOpcion = new JButton("Opción");
        lblResultado = new JLabel("Resultado");

        // Agregamos los botones al Frame

        this.getContentPane().add(btnMensaje);
        this.getContentPane().add(btnEntrada);
        this.getContentPane().add(btnOpcion);
        this.getContentPane().add(lblResultado);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public JButton getBtnMensaje() {
        return btnMensaje;
    }

    public void setBtnMensaje(JButton btnMensaje) {
        this.btnMensaje = btnMensaje;
    }

    public JButton getBtnEntrada() {
        return btnEntrada;
    }

    public void setBtnEntrada(JButton btnEntrada) {
        this.btnEntrada = btnEntrada;
    }

    public JButton getBtnOpcion() {
        return btnOpcion;
    }

    public void setBtnOpcion(JButton btnOpcion) {
        this.btnOpcion = btnOpcion;
    }

    public JLabel getLblResultado() {
        return lblResultado;
    }

    public void setLblResultado(JLabel lblResultado) {
        this.lblResultado = lblResultado;
    }
}
