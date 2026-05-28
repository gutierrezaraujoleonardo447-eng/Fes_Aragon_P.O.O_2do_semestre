package Recapitulación_para_proyecto._05_JOptionPane.Controlador;

import Recapitulación_para_proyecto._05_JOptionPane.Vista.Ventana_;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Controlador_ extends MouseAdapter {
    private Ventana_ ventana;

    public Controlador_(Ventana_ view) {
        this.ventana = view;
        this.ventana.getBtnMensaje().addMouseListener(this);
        this.ventana.getBtnEntrada().addMouseListener(this);
        this.ventana.getBtnOpcion().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == ventana.getBtnMensaje()){
            ImageIcon icono = new ImageIcon("Exito.png");
            JOptionPane.showMessageDialog(ventana, "Hola desde el ejemplo", "Titulo Personalizado", JOptionPane.WARNING_MESSAGE, icono );
        }
        if(e.getSource() == ventana.getBtnEntrada()){
            System.out.println("Entrada");
            String datos = JOptionPane.showInputDialog(ventana, "Ejemplo de entrada", "Titulo personalizado", JOptionPane.QUESTION_MESSAGE);
            this.ventana.getLblResultado().setText(datos);
        }
        if(e.getSource() == ventana.getBtnOpcion()){
            int respuesta = JOptionPane.showConfirmDialog(ventana, "Estas seguro de borrar el registro?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if(respuesta == JOptionPane.YES_NO_OPTION){
                ventana.getLblResultado().setText("Elegiste opción sí");
            }else{
                ventana.getLblResultado().setText("Elegiste opción no");
            }
        }
    }
}
