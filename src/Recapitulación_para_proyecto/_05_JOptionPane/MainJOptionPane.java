package Recapitulación_para_proyecto._05_JOptionPane;

import Recapitulación_para_proyecto._05_JOptionPane.Controlador.Controlador_;
import Recapitulación_para_proyecto._05_JOptionPane.Vista.Ventana_;

public class MainJOptionPane {
    public static void main(String[] args) {
        Ventana_ v1 = new Ventana_();
        Controlador_ c = new Controlador_(v1);
    }
}
