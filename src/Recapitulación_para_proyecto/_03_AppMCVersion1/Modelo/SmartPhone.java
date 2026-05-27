package Recapitulación_para_proyecto._03_AppMCVersion1.Modelo;

public class SmartPhone {
    private String marca;
    private String modelo;
    private float precio;

    public SmartPhone() {
    }
public SmartPhone(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
