package Recapitulación_para_proyecto._06_Manejo_Archivos._03_Streams._02_Ejemplo_Archivos_manejo;

import Recapitulación_para_proyecto._06_Manejo_Archivos._03_Streams._02_Ejemplo_Archivos_manejo.Controlador.ControladorAlumno;
import Recapitulación_para_proyecto._06_Manejo_Archivos._03_Streams._02_Ejemplo_Archivos_manejo.Vista.VentanaAlumno;

public class MainMVC {
    public static void main(String[] args) {
        VentanaAlumno vista = new VentanaAlumno();
        ControladorAlumno c = new ControladorAlumno(vista);
    }
}
