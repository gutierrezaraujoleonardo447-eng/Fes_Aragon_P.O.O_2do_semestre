package Recapitulación_para_proyecto._06_Manejo_Archivos._03_Streams._02_Ejemplo_Archivos_manejo.Controlador;

import Recapitulación_para_proyecto._06_Manejo_Archivos._03_Streams._02_Ejemplo_Archivos_manejo.Modelo.Alumno;
import Recapitulación_para_proyecto._06_Manejo_Archivos._03_Streams._02_Ejemplo_Archivos_manejo.Modelo.ModeloTablaAlumno;
import Recapitulación_para_proyecto._06_Manejo_Archivos._03_Streams._02_Ejemplo_Archivos_manejo.Utilerias.AlumnosArchivo;
import Recapitulación_para_proyecto._06_Manejo_Archivos._03_Streams._02_Ejemplo_Archivos_manejo.Vista.VentanaAlumno;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorAlumno extends MouseAdapter {
  private VentanaAlumno vista;
  private ModeloTablaAlumno modelo;
  private AlumnosArchivo archivo;

    public ControladorAlumno(VentanaAlumno v) {
        this.vista = v;
        this.modelo = new ModeloTablaAlumno();
        archivo = new AlumnosArchivo("alumnosDB.data");
        this.vista.getTablaAlumno().setModel(this.modelo);
        this.vista.getBtnAgregar().addMouseListener(this);
        this.vista.getBtnGuardarArchivo().addMouseListener(this);
        this.vista.getBtnLeerArchivo().addMouseListener(this);


    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == this.vista.getBtnAgregar()){
            Alumno alumno = new Alumno();
            alumno.setNumeroCuenta((this.vista.getTxtNumeroCuenta().getText()));
            alumno.setNombre(this.vista.getTxtNombre().getText());
            alumno.setApellidos(this.vista.getTxtApellidos().getText());
            alumno.setPromedio(Double.parseDouble(this.vista.getTxtPromedio().getText()));
            // Agregar manejo de Excepciones y formulario
            modelo.addAlumno(alumno);
            this.vista.getTablaAlumno().updateUI();
        }
        if (e.getSource() == this.vista.getBtnGuardarArchivo()){
            archivo.escribirAlumnos(modelo.getAlumnos());
        }
        if(e.getSource() == this.vista.getBtnLeerArchivo()){
            modelo.setAlumnos(archivo.leerAlumnos());
            this.vista.getTablaAlumno().updateUI();
        }
    }
}
