package Trabajos_Clase.Clase_26_02_19_Computadoras_composicion;

public class Procesador {
    private String marca;
    private String modelo;
    private float velocidad;
    private int nucelos;

    public Procesador() {
    }

    public Procesador(String marca, String modelo, float velocidad, int nucelos) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.nucelos = nucelos;
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

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public int getNucelos() {
        return nucelos;
    }

    public void setNucelos(int nucelos) {
        this.nucelos = nucelos;
    }

    @Override
    public String
    toString() {
        return "Procesador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidad=" + velocidad +
                ", nucelos=" + nucelos +
                '}';
    }

}