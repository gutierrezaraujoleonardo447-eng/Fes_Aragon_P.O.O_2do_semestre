package Recapitulación_para_proyecto._04_MVC_VIDEO2AÑOS.CONTROLADOR;

import Recapitulación_para_proyecto._04_MVC_VIDEO2AÑOS.MODELO.ModeloPersonaTabla;
import Recapitulación_para_proyecto._04_MVC_VIDEO2AÑOS.MODELO.Persona;
import Recapitulación_para_proyecto._04_MVC_VIDEO2AÑOS.VISTA.VentanaPrincipal4;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControllerTabla extends MouseAdapter  implements TableModelListener {
    private VentanaPrincipal4 ventana;
    private ModeloPersonaTabla model;

    public ControllerTabla(VentanaPrincipal4 view, ModeloPersonaTabla mod) {
        this.ventana = view;
        this.model = mod;
        this.ventana.getBtnGuardar().addMouseListener(this);
        this.ventana. getTablaAlumno().setModel(model);
        model.addTableModelListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == ventana.getBtnGuardar()){
            Persona persona = new Persona();
            persona.setId(Integer.parseInt(ventana.getTxtId().getText()));
            persona.setNombre(ventana.getTxtNombre().getText());
            model.agregarPersona(persona);
            ventana.getTablaAlumno().updateUI();
        }
    }

    @Override
    public void tableChanged(TableModelEvent e) {

    }
}
