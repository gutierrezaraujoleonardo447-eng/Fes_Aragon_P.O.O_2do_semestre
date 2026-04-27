package Tareas.T_26_04_28_Tarea10_Layouts_AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ventana2 extends Frame {
    Button btn = new Button ("Norte");
    Button btn2 = new Button ("Sur");
    Button btn3 = new Button ("Este");
    Button btn4 = new Button ("Oeste");

    public Ventana2() {
        super("Ventana con eventos");
        setSize(800, 600);
        setResizable(false);
        setLayout(new BorderLayout());

        add("North", btn);
        add("South", btn2);
        add("West", btn3);
        add("East", btn4);

        addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );
    }
}
