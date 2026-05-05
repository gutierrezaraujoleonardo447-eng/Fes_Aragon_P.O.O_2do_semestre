package Tareas.T_26_05_05_AppMVC_4.Controller3;

import Tareas.T_26_05_05_AppMVC_4.View4.VentanaPrincipal4;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Controlador4 implements MouseListener {
    private VentanaPrincipal4 view4;

    public Controlador4(VentanaPrincipal4 vista4) {
        this.view4 = vista4;
        this.view4.getBtnSaludar().addMouseListener(this);
        this.view4.getLblNombre().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Hola desde Nezayork");
        System.out.println("Hola desde Mi-nezota");
        if(e.getSource() == this.view4.getBtnSaludar()){
            this.view4.getLblSalida().setText("Hola " + this.view4.getTxtnombre().getText() );
        }
        if(e.getSource() == this.view4.getLblNombre()){
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
