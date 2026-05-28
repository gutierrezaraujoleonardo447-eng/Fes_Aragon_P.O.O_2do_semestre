package Recapitulación_para_proyecto._04_MVC_VIDEO2AÑOS;

import Recapitulación_para_proyecto._04_MVC_VIDEO2AÑOS.CONTROLADOR.ControllerTabla;
import Recapitulación_para_proyecto._04_MVC_VIDEO2AÑOS.MODELO.ModeloPersonaTabla;
import Recapitulación_para_proyecto._04_MVC_VIDEO2AÑOS.VISTA.VentanaPrincipal4;

public class MAIN {
    public static void main(String[] args) {
        VentanaPrincipal4 ventanauno  = new VentanaPrincipal4();
        VentanaPrincipal4 ventanados = new VentanaPrincipal4();
        ModeloPersonaTabla modelo = new ModeloPersonaTabla();
        ControllerTabla controlador = new ControllerTabla(ventanauno, modelo);
        ControllerTabla controlador2 = new ControllerTabla(ventanados, modelo);
    }
}
