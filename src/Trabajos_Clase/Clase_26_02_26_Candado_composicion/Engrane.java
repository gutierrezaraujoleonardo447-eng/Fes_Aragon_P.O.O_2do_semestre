package Trabajos_Clase.Clase_26_02_26_Candado_composicion;

public class Engrane {
    private int posicion;

    public Engrane() {
    }

    public Engrane(int posicion) {
        this.posicion = posicion;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Engrane{" +
                "posicion=" + posicion +
                '}';
    }
    public void girar (int posicion) {
        this.posicion = (this.posicion + posicion) % 10;
    }
}
