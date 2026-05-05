package Tareas.T_26_05_05_AppMVC_5.Controller5;

import Tareas.T_26_05_05_AppMVC_5.View5.VentanaPrincipal5;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Controlador5 implements MouseListener {
    private VentanaPrincipal5 view5;
    public Controlador5(VentanaPrincipal5 vista5) {
        this.view5 = vista5;
        this.view5.getBtnSaludar().addMouseListener(this);
        this.view5.getLblNombre().addMouseListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Hola desde Nezayork");
        System.out.println("Hola desde Mi-nezota");
        if(e.getSource() == this.view5.getBtnSaludar()){
            this.view5.getLblSalida().setText("Hola " + this.view5.getTxtnombre().getText() );
        }
        if(e.getSource() == this.view5.getLblNombre()){
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
