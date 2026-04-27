package Trabajos_Clase.Clase_26_02_10;

public class Closet {
    private String material;
    private String color;
    private float altura;
    private int numeroGanchos;

    public Closet() {
    }

    public Closet(String material, String color, float altura, int numeroGanchos) {
        this.material = material;
        this.color = color;
        this.altura = altura;
        this.numeroGanchos = numeroGanchos;
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

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if  (altura >= 1.00 && altura <= 2.00) {
            this.altura = altura;
        }
        else{
            System.out.println("La altura debe estar entre 1.00mts y 2.00mts");
        }
    }

    public int getNumeroGanchos() {
        return numeroGanchos;
    }

    public void setNumeroGanchos(int numeroGanchos) {
        this.numeroGanchos = numeroGanchos;
    }

    @Override
    public String toString() {
        return "Closet{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", altura=" + altura +
                ", numeroGanchos=" + numeroGanchos +
                '}';
    }

    public void ponerGancho(){
        System.out.println("Poniendo Ganchos");
    }
}
