package Tareas.T_26_05_05_AppMVC_3.Controller3;



import Tareas.T_26_05_05_AppMVC_3.view3.VentanaPrincipal3;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Controlador3 implements MouseListener {
    private VentanaPrincipal3 view3;

    public Controlador3(VentanaPrincipal3 vista3) {
        this.view3 = vista3;
        this.view3.getBtnSaludar().addMouseListener(this);
        this.view3.getLblNombre().addMouseListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Hola desde Nezayork");
        System.out.println("Hola desde Mi-nezota");
        if(e.getSource() == this.view3.getBtnSaludar()){
            this.view3.getLblSalida().setText("Hola " + this.view3.getTxtnombre().getText() );
        }
        if(e.getSource() == this.view3.getLblNombre()){
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
