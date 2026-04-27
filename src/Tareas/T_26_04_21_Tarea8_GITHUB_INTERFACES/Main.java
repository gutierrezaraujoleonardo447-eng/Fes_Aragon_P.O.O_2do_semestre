package Tareas.T_26_04_21_Tarea8_GITHUB_INTERFACES;

public class Main {
    public static void main(String[] args) {
        System.out.println("////  PIKACHU  ////");
        Pikachu pikachu = new Pikachu(45, "Pikachu", 10.0, "Masculino", 1, "Electrico");
        pikachu.atacarImpactrueno(30);
        pikachu.atacarPunioTrueno(50);
        pikachu.atacarRayo(12);
        pikachu.atacarRayocarga();
        pikachu.atacarPlacaje();
        pikachu.atacarArañazo();
        pikachu.atacarMordisco();

        System.out.println("////  CHARMANDER  ////");
        Charmander c = new Charmander(34,  "Charmander", 15.0, "Masculino", 1, "Fuego");
        c.atacarPlacaje();
        c.atacarArañazo();
        c.atacarMordisco();
        c.atacarLanzallamas();
        c.atacarLanzallamas();
        c.atacarPuniofuego();
        c.atacarPuniofuego();
        c.atacarPuniofuego();

        c.atacarAscuas();
    }
}
