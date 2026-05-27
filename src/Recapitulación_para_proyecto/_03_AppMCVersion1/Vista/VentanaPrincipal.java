package Recapitulación_para_proyecto._03_AppMCVersion1.Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    private JPanel pnlPanel1;
    private JPanel pnlPanel2;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JButton btnSaludar;
    private JLabel lblSalida;

    // Smartphone
    private JLabel lblMarca;
    private JTextField txtMarca;
    private JLabel lblModelo;
    private JTextField txtModelo;
    private JLabel lblPrecio;
    private JTextField txtPrecio;
    private JButton btnAgregarPhone;
    private JTable tblPhone;

    public VentanaPrincipal() {
        super("DEMO MVC");
        setSize(800, 400);
        setLayout(new GridLayout(2,1));

        // declarar paneles
        pnlPanel1 = new JPanel();
        pnlPanel2 = new JPanel();

        // Colores de paneles
        pnlPanel1.setBackground(new Color(121, 145, 246));
        pnlPanel2.setBackground(new Color(14, 48, 128));

        // declarar componentes
        lblNombre = new JLabel("Escribe tu nombre: ");
        txtNombre = new JTextField(15);
        btnSaludar = new JButton("Saludar");
        lblSalida = new JLabel("...");
        lblMarca = new JLabel("Marca: ");
        txtMarca = new JTextField(15);
        lblPrecio = new JLabel("Precio: ");
        txtPrecio = new JTextField(8);
        lblModelo = new JLabel("Modelo: ");
        txtModelo = new JTextField(8);
        btnAgregarPhone = new JButton("Agregar phone");
        tblPhone = new JTable();

        // agregar componentes al panel 1
        pnlPanel1.add(lblNombre);
        pnlPanel1.add(txtNombre);
        pnlPanel1.add(btnSaludar);
        pnlPanel1.add(lblSalida);
        pnlPanel1.add(lblMarca);
        pnlPanel1.add(txtMarca);
        pnlPanel1.add(lblModelo);
        pnlPanel1.add(txtModelo);
        pnlPanel1.add(btnAgregarPhone);
        pnlPanel1.add(lblPrecio);
        pnlPanel1.add(txtPrecio);
        pnlPanel2.add(tblPhone);

        // agregar panel 1 y 2 al Frame
        this.getContentPane().add(pnlPanel1,0);
        this.getContentPane().add(pnlPanel2,1);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
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

    public JLabel getLblMarca() {
        return lblMarca;
    }

    public void setLblMarca(JLabel lblMarca) {
        this.lblMarca = lblMarca;
    }

    public JTextField getTxtMarca() {
        return txtMarca;
    }

    public void setTxtMarca(JTextField txtMarca) {
        this.txtMarca = txtMarca;
    }

    public JLabel getLblModelo() {
        return lblModelo;
    }

    public void setLblModelo(JLabel lblModelo) {
        this.lblModelo = lblModelo;
    }

    public JTextField getTxtModelo() {
        return txtModelo;
    }

    public void setTxtModelo(JTextField txtModelo) {
        this.txtModelo = txtModelo;
    }

    public JLabel getLblPrecio() {
        return lblPrecio;
    }

    public void setLblPrecio(JLabel lblPrecio) {
        this.lblPrecio = lblPrecio;
    }

    public JTextField getTxtPrecio() {
        return txtPrecio;
    }

    public void setTxtPrecio(JTextField txtPrecio) {
        this.txtPrecio = txtPrecio;
    }

    public JButton getBtnAgregarPhone() {
        return btnAgregarPhone;
    }

    public void setBtnAgregarPhone(JButton btnAgregarPhone) {
        this.btnAgregarPhone = btnAgregarPhone;
    }

    public JTable getTblPhone() {
        return tblPhone;
    }

    public void setTblPhone(JTable tblPhone) {
        this.tblPhone = tblPhone;
    }
}
