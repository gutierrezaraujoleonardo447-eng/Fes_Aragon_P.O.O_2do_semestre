package Recapitulación_para_proyecto._03_AppMCVersion1.Controlador;

import Recapitulación_para_proyecto._03_AppMCVersion1.Modelo.ModeloTablaPhone;
import Recapitulación_para_proyecto._03_AppMCVersion1.Modelo.SmartPhone;
import Recapitulación_para_proyecto._03_AppMCVersion1.Vista.VentanaPrincipal;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class ControladorPrincipal implements MouseListener {

    private VentanaPrincipal vista;
    private ModeloTablaPhone modelo;

    public ControladorPrincipal(VentanaPrincipal view) {
        this.vista = view;
        this.vista.getBtnSaludar().addMouseListener(this);
        this.vista.getLblNombre().addMouseListener(this);
        ArrayList<SmartPhone> cels = new ArrayList<>();
        cels.add(new SmartPhone("Apple", "Iphone 15", 17000.00f));
        modelo = new ModeloTablaPhone(cels);
        this.vista.getTblPhone().setModel(modelo);
        this.vista.getTblPhone().updateUI();

    }

    @Override
    public void mouseClicked(MouseEvent e) {
       if (e.getSource() == this.vista.getBtnSaludar()) {
           this.vista.getLblSalida().setText("Hola " + this.vista.getTxtNombre().getText());
       }
       if(e.getSource() == this.vista.getLblNombre()){
           System.out.println("Hola desde el Label");
       }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
