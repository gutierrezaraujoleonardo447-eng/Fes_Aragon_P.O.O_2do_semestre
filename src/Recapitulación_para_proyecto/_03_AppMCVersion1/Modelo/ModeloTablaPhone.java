package Recapitulación_para_proyecto._03_AppMCVersion1.Modelo;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class ModeloTablaPhone implements TableModel {

    private ArrayList<SmartPhone> lista;

    public ModeloTablaPhone() {
    }

    public ModeloTablaPhone(ArrayList<SmartPhone> info) {
        this.lista = info;
    }

    @Override
    public int getRowCount() { // Cuantas filas
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String columnName = "";
        switch (columnIndex) {
            case 0:
                columnName = "Marca";
                break;
            case 1:
                columnName = "Modelo";
                break;
            case 2:
                columnName = "Precio";
                break;
            default:
                columnName = "Error";
                break;
        }
        return columnName;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) { // Que tipo de dato tiene cada columna
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return Float.class;
            default:
                return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { // Le dice al JTable que valor mostrar en cada Celda de la tabla
        SmartPhone smartPhone = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return smartPhone.getMarca();
            case 1:
                return smartPhone.getModelo();
            case 2:
                return smartPhone.getPrecio();
            default:
                return "Error";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public ArrayList<SmartPhone> getLista() {
        return lista;
    }

    public void setLista(ArrayList<SmartPhone> lista) {
        this.lista = lista;
    }

    public void agregarTelefono(SmartPhone tel){
        this.lista.add(tel);
    }
    public SmartPhone getTelefono(int index){
        return this.lista.get(index);
    }

}
