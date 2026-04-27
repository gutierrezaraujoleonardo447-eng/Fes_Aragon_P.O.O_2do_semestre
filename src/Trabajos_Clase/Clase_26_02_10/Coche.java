package Trabajos_Clase.Clase_26_02_10;

public class Coche {
    private String material;
    private String color;
    private float ancho;
    private float altura;
    private int velocidad;

    public Coche() {
    }

    public Coche(String material, String color, float ancho, float altura, int velocidad) {
        this.material = material;
        this.color = color;
        this.ancho = ancho;
        this.altura = altura;
        this.velocidad = velocidad;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        if (ancho >= 1.5 && ancho <= 2.0) {
            this.ancho = ancho;
        }
        else{
            System.out.println("El ancho debe de ser entre 1.5 mts a 2.0mts");
        }
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (altura >= 2.0 && altura <= 2.5) {
            this.altura = altura;
        }
        else{
            System.out.println("La altura debe ser entre 2.0mts a 2.5mts");
        }
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        if (velocidad >= 0 && velocidad <= 200) {
            this.velocidad = velocidad;
        }
        else{
            System.out.println("La velocidad debe estar entre 0 y 200 km/h");
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", ancho=" + ancho +
                ", altura=" + altura +
                ", velocidad=" + velocidad +
                '}';
    }

    public boolean moverAdelante(){
        System.out.println("Moviendo hacia delante");
        return true;
    }

    public boolean moverAtras(){
        System.out.println("Moviendo hacia atras");
        return true;
    }

    public boolean abrirPuerta(){
        System.out.println("Abriendo puerta");
        return true;
    }

    public boolean cerrarPuerta(){
        System.out.println("Cerrando puerta");
        return true;
    }
}
