package Recapitulación_para_proyecto._04_MVC_VIDEO2AÑOS.VISTA;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal4 extends JFrame {
    private JLabel lblId;
    private JLabel lblNombre;
    private JTextField txtId;
    private JTextField txtNombre;
    private JButton btnGuardar;
    private JPanel panel1;
    private JPanel panel2;
    private JTable tablaAlumno;
    private JScrollPane scroll;

    public VentanaPrincipal4() {
        super("Alumno");
        setSize(900, 600);

        // Layout
       setLayout(new GridLayout(1,2));

        // Declarar paneles
        panel1 = new JPanel();
        panel2 = new JPanel();

        // Colores de los paneles
        panel1.setBackground(new Color(192, 136, 246));
        panel2.setBackground(new Color(165, 0, 150));

        // Inicializar los componentes
        lblId = new JLabel("ID");
        txtId = new JTextField(10);
        lblNombre = new JLabel("Nombre");
        txtNombre = new JTextField(10);
        btnGuardar = new JButton("Guardar");
        scroll = new JScrollPane(tablaAlumno);
        scroll.setPreferredSize(new Dimension(400,200));
        tablaAlumno = new JTable();
        scroll.setViewportView(tablaAlumno);


        // Agregar a panel 1 y 2
        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(btnGuardar);
        panel2.add(scroll);



        // Agregar panel 1 y 2 al frame
        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
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

    public JTable getTablaAlumno() {
        return tablaAlumno;
    }

    public void setTablaAlumno(JTable tablaAlumno) {
        this.tablaAlumno = tablaAlumno;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }
}
