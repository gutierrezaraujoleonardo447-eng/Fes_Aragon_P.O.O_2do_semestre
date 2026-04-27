package Tareas.T_26_04_28_Tarea11_CalculadoraIMC;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventosRaton implements MouseListener {
    private TextField peso;
    private TextField altura;
    private Label resultado;

    public EventosRaton(TextField peso, TextField altura, Label resultado) {
        this.peso = peso;
        this.altura = altura;
        this.resultado = resultado;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       double peso1 = Double.parseDouble(peso.getText());
       double altura1 = Double.parseDouble(altura.getText());
       double IMC = peso1 / (altura1 * altura1);
       resultado.setText("IMC: " + IMC);
        System.out.println("IMC: " + IMC);


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
