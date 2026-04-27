package Tareas.T_26_04_21_Tarea8_GITHUB_INTERFACES;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
    }

    public Pikachu(int numPokedex, String nombrePokemon, double pesoPokemon, String sexo, int temporadaEnaparecer, String tipo) {
        super(numPokedex, nombrePokemon, pesoPokemon, sexo, temporadaEnaparecer, tipo);
    }

    @Override
    public int atacarImpactrueno(int a ) {
        int daño = a;
        System.out.println("Atacando con Trueno\n" + "El daño fue de:  " + daño);
        return 0;
    }

    @Override
    public int atacarPunioTrueno(int a) {
        int daño = a;
        System.out.println("Atacando con puño de trueno\n" + "El daño fue de: " + daño);
        return 0;
    }

    @Override
    public int atacarRayo(int a) {
        int daño = a;
        System.out.println("Atacando con Rayo\n" + "El daño fue de: " + daño);
        return 0;

    }

    @Override
    public int atacarRayocarga() {
        int a = 20;
        int daño = a;
        System.out.println("Atacando con Rayo\n" + "El daño fue de: " + daño);
        return 0;
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
}
