package Trabajos_Clase.Clase_26_02_24_Televisor_composicion;

public class TV {
    private String marca;
    private float precio;
    private int pulgadas;
    private Pantalla pantalla;
    private Volumen volumen;
    private Canal channel;

    public TV() {
    }

    public TV(String marca, float precio, int pulgadas, Pantalla pantalla, Volumen volumen, Canal channel) {
        this.marca = marca;
        this.precio = precio;
        this.pulgadas = pulgadas;
        this.pantalla = pantalla;
        this.volumen = volumen;
        this.channel = channel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Volumen getVolumen() {
        return volumen;
    }

    public void setVolumen(Volumen volumen) {
        this.volumen = volumen;
    }

    public Canal getChannel() {
        return channel;
    }

    public void setChannel(Canal channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "TV{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", pulgadas=" + pulgadas +
                ", pantalla=" + pantalla +
                ", volumen=" + volumen +
                ", channel=" + channel +
                '}';
    }
    public void estado(){
        System.out.println("Encendido" + pantalla.isEncendida());
        System.out.println("Canal actual" + channel.getCanal() );
        System.out.println("Volumen actual" + volumen.getNivel());
    }
    public void subirVolumen( int vs){
        if(this.pantalla.isEncendida()){
            this.volumen.subir(vs);
        }
        else{
            System.out.println("La television esta apagada");
        }
    }
}
