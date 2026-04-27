package Tareas.T_26_04_28_Tarea10_Layouts_AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ventana3 extends Frame {
    Button btn1 = new Button("Presioname");
    Button btn2 = new Button("En segundo lugar al este");
    Button btn3 = new Button("Después a este");
    Button btn4 = new Button("Por último a este");

    public Ventana3() {
        super("Ventana con eventos");
        setSize(400, 300);
        setResizable(false);
        setLayout(new GridLayout(3, 2));
        add(btn1,0);
        add(btn2,1);
        add(btn3,2);
        add(btn4,3);
        setVisible(true);

        addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );
    }
}
