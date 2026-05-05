package Tareas.T_26_05_05_AppMVC_2.Controller2;

import Tareas.T_26_05_05_AppMVC_2.View2.VentanaPrincipal2;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Controlador2 implements MouseListener {
    private VentanaPrincipal2 view2;

    public Controlador2(VentanaPrincipal2 vista2) {
        this.view2 = vista2;
        this.view2.getBtnSaludar().addMouseListener(this);
        this.view2.getLblNombre().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Hola desde Nezayork");
        System.out.println("Hola desde Mi-nezota");

        if(e.getSource() == this.view2.getBtnSaludar()){
            this.view2.getLblSalida().setText("Hola " + this.view2.getTxtnombre().getText() );
        }
        if(e.getSource() == this.view2.getLblNombre()) {
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
