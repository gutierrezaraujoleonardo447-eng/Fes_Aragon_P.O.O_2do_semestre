package Recapitulación_para_proyecto._06_Manejo_Archivos._03_Streams._02_Ejemplo_Archivos_manejo.Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaAlumno extends JFrame {
    private JPanel panel1;
    private JPanel panel2;
    private JLabel lblNumeroCuenta;
    private JTextField txtNumeroCuenta;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblApellidos;
    private JTextField txtApellidos;
    private JLabel lblPromedio;
    private JTextField txtPromedio;
    private JButton btnAgregar;

    // La tabla
    private JScrollPane scrollPane;
    private JTable tablaAlumno;
    private JButton btnGuardarArchivo;
    private JButton btnLeerArchivo;

    public VentanaAlumno() {

        // Configuracion de la ventana
        super("DemoSwing MVCV con archivos");
        //Configurar layout
        this.getContentPane().setLayout(new GridLayout(2,1));


        // Crear paneles y configurarlos
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER));

        panel1.setBackground(new Color(189, 8, 196, 255));
        panel2.setBackground(new Color(43, 198, 140));

        // Crear componentes
        lblNumeroCuenta = new JLabel("Numero de cuenta");
        txtNumeroCuenta = new JTextField(10);
        lblApellidos = new JLabel("Apellidos");
        txtApellidos = new JTextField(10);
        lblNombre = new JLabel("Nombre");
        txtNombre = new JTextField (10);
        lblPromedio = new JLabel("Promedio");
        txtPromedio = new JTextField(10);
        btnAgregar = new JButton("Agregar");
        btnGuardarArchivo = new JButton("Guardar");
        btnLeerArchivo = new JButton("Leer");


        tablaAlumno = new JTable();
        scrollPane = new JScrollPane(tablaAlumno);
        scrollPane.setPreferredSize(new Dimension(500,400));

        // agregar componenetes a los paneles
        panel1.add(lblNumeroCuenta);
        panel1.add(txtNumeroCuenta);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(lblApellidos);
        panel1.add(txtApellidos);
        panel1.add(lblPromedio);
        panel1.add(txtPromedio);
        panel1.add(btnAgregar);
        panel2.add(scrollPane);
        panel2.add(btnGuardarArchivo);
        panel2.add(btnLeerArchivo);



        // Agregar paneles a la ventana
        this.getContentPane().add(panel1);
        this.getContentPane().add(panel2);

        // Configuracion final
        setSize(900,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JLabel getLblNumeroCuenta() {
        return lblNumeroCuenta;
    }

    public void setLblNumeroCuenta(JLabel lblNumeroCuenta) {
        this.lblNumeroCuenta = lblNumeroCuenta;
    }

    public JTextField getTxtNumeroCuenta() {
        return txtNumeroCuenta;
    }

    public void setTxtNumeroCuenta(JTextField txtNumeroCuenta) {
        this.txtNumeroCuenta = txtNumeroCuenta;
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

    public JLabel getLblApellidos() {
        return lblApellidos;
    }

    public void setLblApellidos(JLabel lblApellidos) {
        this.lblApellidos = lblApellidos;
    }

    public JTextField getTxtApellidos() {
        return txtApellidos;
    }

    public void setTxtApellidos(JTextField txtApellidos) {
        this.txtApellidos = txtApellidos;
    }

    public JLabel getLblPromedio() {
        return lblPromedio;
    }

    public void setLblPromedio(JLabel lblPromedio) {
        this.lblPromedio = lblPromedio;
    }

    public JTextField getTxtPromedio() {
        return txtPromedio;
    }

    public void setTxtPromedio(JTextField txtPromedio) {
        this.txtPromedio = txtPromedio;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public JTable getTablaAlumno() {
        return tablaAlumno;
    }

    public void setTablaAlumno(JTable tablaAlumno) {
        this.tablaAlumno = tablaAlumno;
    }

    public JButton getBtnGuardarArchivo() {
        return btnGuardarArchivo;
    }

    public void setBtnGuardarArchivo(JButton btnGuardarArchivo) {
        this.btnGuardarArchivo = btnGuardarArchivo;
    }

    public JButton getBtnLeerArchivo() {
        return btnLeerArchivo;
    }

    public void setBtnLeerArchivo(JButton btnLeerArchivo) {
        this.btnLeerArchivo = btnLeerArchivo;
    }
}
