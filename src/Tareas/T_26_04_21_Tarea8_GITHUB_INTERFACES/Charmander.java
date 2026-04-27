package Tareas.T_26_04_21_Tarea8_GITHUB_INTERFACES;

public class Charmander extends Pokemon implements IFuego {
    public Charmander() {
    }

    public Charmander(int numPokedex, String nombrePokemon, double pesoPokemon, String sexo, int temporadaEnaparecer, String tipo) {
        super(numPokedex, nombrePokemon, pesoPokemon, sexo, temporadaEnaparecer, tipo);
    }

    @Override
    public String toString() {
        return "Charmander{" +
                "numPokedex=" + numPokedex +
                ", nombrePokemon='" + nombrePokemon + '\'' +
                ", pesoPokemon=" + pesoPokemon +
                ", sexo='" + sexo + '\'' +
                ", temporadaEnaparecer=" + temporadaEnaparecer +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Atacando Placaje");
    }

    @Override
    public void atacarArañazo() {
        System.out.println("Atacando con arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Atacando con Mordisco");

    }

    @Override
    public int atacarPuniofuego() {
        int c = 23;
        int atacar = c;
        System.out.println("Atacando con Puño de fuego\n" + "El daño provocado fue: " + c);
        return atacar;
    }

    @Override
    public int atacarAscuas() {
        int a = 15;
        int ataque = a;
        System.out.println("Atacando con Ascuaso\n" + "El daño provocado fue: " + ataque);
        return ataque;
    }

    @Override
    public int atacarLanzallamas() {
        int b = 40;
        int atacar = b;

        System.out.println("Atacando con Lanzallamas\n" + "El daño provocado fue: " + b);
        return atacar;
    }
}