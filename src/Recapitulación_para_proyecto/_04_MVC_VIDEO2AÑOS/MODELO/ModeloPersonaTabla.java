package Recapitulación_para_proyecto._04_MVC_VIDEO2AÑOS.MODELO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import java.util.ArrayList;

public class ModeloPersonaTabla implements TableModel{
    private ArrayList<Persona> list;
    private ArrayList <TableModelListener> oyentes;
    public  static final int COLUMNS = 2;

    public ModeloPersonaTabla() {
        list = new ArrayList<>();
        oyentes = new ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex){
            case 0:
                return "ID";
            case 1:
                return "Nombre";
        }
        return "";
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
        }
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona persona = list.get(rowIndex);
        switch (rowIndex){
            case 0:
                return persona.getId();
            case 1:
                return persona.getNombre();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Persona persona = list.get(columnIndex);

        switch(columnIndex){
            case 0:
                persona.setId((Integer)aValue);
                break;
            case 1:
                persona.setNombre((String)aValue);
                break;
        }
        for(TableModelListener oyentes : oyentes){
            oyentes.tableChanged(null);
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        oyentes.add(l);

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        oyentes.remove(l);

    }

    public void agregarPersona(Persona per){
        list.add(per);
        for(TableModelListener oyentes : oyentes){
            oyentes.tableChanged(null);
        }
    }
}
