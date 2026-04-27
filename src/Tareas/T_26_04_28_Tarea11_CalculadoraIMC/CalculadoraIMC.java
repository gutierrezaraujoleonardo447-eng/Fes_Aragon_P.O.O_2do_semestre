package Tareas.T_26_04_28_Tarea11_CalculadoraIMC;

import java.awt.*;

public class CalculadoraIMC extends Frame {
    private Button boton;
    private Label label;
    private TextField peso;
    private TextField altura;

    private Label resultado;

    public CalculadoraIMC(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 700);
        this.setLayout(new FlowLayout());

        Label labelpeso = new Label("peso");
        Label labelaltura = new Label("altura");
        boton = new Button("Calcular IMC");
        peso = new TextField(15);
        altura = new TextField(15);
        resultado = new Label("Su IMC: ");
        this.add(labelpeso);
        this.add(peso);
        this.add(labelaltura);
        this.add(altura);
        this.add(boton);
        this.add(resultado);

        boton.addMouseListener(new EventosRaton(peso, altura, resultado));

        this.setVisible(true);

    }
}
