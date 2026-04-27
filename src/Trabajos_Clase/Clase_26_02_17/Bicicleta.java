package Trabajos_Clase.Clase_26_02_17;

public class Bicicleta {
    private String color;
    private float altura;
    private float ancho;
    private int velocidad;
    private String material;

    public Bicicleta() {
    }

    public Bicicleta(String color, float altura, float ancho, int velocidad, String material) {
        this.color = color;
        this.altura = altura;
        this.ancho = ancho;
        this.velocidad = velocidad;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "color='" + color + '\'' +
                ", altura=" + altura +
                ", ancho=" + ancho +
                ", velocidad=" + velocidad +
                ", material='" + material + '\'' +
                '}';
    }

    public boolean moverAdelante(float d){
        System.out.println("moviendo hacia adelante" + d + "metros");
        return true;
    }
}