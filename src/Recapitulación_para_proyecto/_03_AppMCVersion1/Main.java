package Recapitulación_para_proyecto._03_AppMCVersion1;

import Recapitulación_para_proyecto._03_AppMCVersion1.Controlador.ControladorPrincipal;
import Recapitulación_para_proyecto._03_AppMCVersion1.Modelo.ModeloTablaPhone;
import Recapitulación_para_proyecto._03_AppMCVersion1.Vista.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {
       VentanaPrincipal ventana  = new VentanaPrincipal();
       ControladorPrincipal controlador = new ControladorPrincipal(ventana);


    }
}
