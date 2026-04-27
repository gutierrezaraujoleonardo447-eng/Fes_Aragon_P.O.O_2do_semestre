package Trabajos_Clase.Clase_26_02_24_Televisor_composicion;

public class Pantalla {
    private int tamanho;
    private boolean encendida;

    public Pantalla() {
    }

    public Pantalla(int tamanho, boolean encendida) {
        this.tamanho = tamanho;
        this.encendida = encendida;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    @Override
    public String toString() {
        return "Pantalla{" +
                "tamanho='" + tamanho + '\'' +
                ", encendida=" + encendida +
                '}';
    }
    public boolean encender(){
        this.encendida = true;
        return this.encendida;
    }
    public boolean apagar(){
        this.encendida = false;
        return this.encendida;
    }

}