package Tareas.T_26_05_05_AppMVC_4.View4;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal4 extends JFrame {
    private JPanel pnlPanel1;
    private JPanel pnlPanel2;
    private JLabel lblNombre;
    private JTextField txtnombre;;
    private JButton btnSaludar;
    private JLabel lblSalida;

    public VentanaPrincipal4() {
        setTitle("DEMO MVC Intro");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));

        //Declarar Paneles
        pnlPanel1 = new JPanel();
        pnlPanel1.setBackground(new Color(255, 51, 51));
        pnlPanel2 = new JPanel();
        pnlPanel2.setBackground(new Color(26, 237, 11));

        //Declarar los componentes
        lblNombre = new JLabel("Escribe tu nombre: ");
        txtnombre = new JTextField(20);
        btnSaludar = new JButton("Saludar");
        lblSalida = new JLabel("...");

        //agregar los componentes al panel 1
        pnlPanel1.add(lblNombre);
        pnlPanel1.add(txtnombre);
        pnlPanel1.add(btnSaludar);
        pnlPanel1.add(lblSalida);

        //agregar el panel 1 y 2 al frame
        this.getContentPane().add(pnlPanel1, 0);
        this.getContentPane().add(pnlPanel2, 1);


        setSize(900, 700);
        setVisible(true);
    }

    public JPanel getPnlPanel1() {
        return pnlPanel1;
    }

    public void setPnlPanel1(JPanel pnlPanel1) {
        this.pnlPanel1 = pnlPanel1;
    }

    public JPanel getPnlPanel2() {
        return pnlPanel2;
    }

    public void setPnlPanel2(JPanel pnlPanel2) {
        this.pnlPanel2 = pnlPanel2;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JTextField getTxtnombre() {
        return txtnombre;
    }

    public void setTxtnombre(JTextField txtnombre) {
        this.txtnombre = txtnombre;
    }

    public JButton getBtnSaludar() {
        return btnSaludar;
    }

    public void setBtnSaludar(JButton btnSaludar) {
        this.btnSaludar = btnSaludar;
    }

    public JLabel getLblSalida() {
        return lblSalida;
    }

    public void setLblSalida(JLabel lblSalida) {
        this.lblSalida = lblSalida;
    }
}
