package Tareas.T_26_05_05_AppMVC_1;

import Tareas.T_26_05_05_AppMVC_1.Controller.ControladorPrincipal;
import Tareas.T_26_05_05_AppMVC_1.View_1.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ControladorPrincipal controlador = new ControladorPrincipal(ventana);
    }
}
