package Trabajos_Clase.Clase_26_02_19_Computadoras_composicion;

public class Computadora {
    private String marca;
    private String modelo;

    private Teclado keyboard;
    private Procesador procesador;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, Teclado keyboard, Procesador procesador) {
        this.marca = marca;
        this.modelo = modelo;
        this.keyboard = keyboard;
        this.procesador = procesador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Teclado getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Teclado keyboard) {
        this.keyboard = keyboard;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", keyboard=" + keyboard +
                ", procesador=" + procesador +
                '}';
    }
}
