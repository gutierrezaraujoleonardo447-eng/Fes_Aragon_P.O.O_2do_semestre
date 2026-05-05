package Tareas.T_26_05_05_AppMVC_1.Controller;

import Tareas.T_26_05_05_AppMVC_1.View_1.VentanaPrincipal;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorPrincipal implements MouseListener {

    private VentanaPrincipal view;

    public ControladorPrincipal(VentanaPrincipal vista) {
        this.view = vista;
        this.view.getBtnSaludar().addMouseListener(this);
        this.view.getLblNombre().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Hola desde Nezayork");
        System.out.println("Hola desde Mi-nezota");
        //this.view.getLblSalida().setText("Hola " + this.view.getTxtnombre().getText());
        if(e.getSource() == this.view.getBtnSaludar()){
            this.view.getLblSalida().setText("Hola " + this.view.getTxtnombre().getText() );
        }
        if(e.getSource() == this.view.getLblNombre()){
            System.out.println("Desde etiqueta 1");
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
