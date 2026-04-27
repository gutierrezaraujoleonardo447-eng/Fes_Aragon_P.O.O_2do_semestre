package Tareas.T_26_04_21_Tarea8_GITHUB_INTERFACES;


public abstract class  Pokemon {
    protected int numPokedex;
    protected String nombrePokemon;
    protected double pesoPokemon;
    protected String sexo;
    protected int temporadaEnaparecer;
    protected String tipo;

    public Pokemon() {
    }

    public Pokemon(int numPokedex, String nombrePokemon, double pesoPokemon, String sexo, int temporadaEnaparecer, String tipo) {
        this.numPokedex = numPokedex;
        this.nombrePokemon = nombrePokemon;
        this.pesoPokemon = pesoPokemon;
        this.sexo = sexo;
        this.temporadaEnaparecer = temporadaEnaparecer;
        this.tipo = tipo;
    }

    public int getNumPokedex() {
        return numPokedex;
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }

    public double getPesoPokemon() {
        return pesoPokemon;
    }

    public void setPesoPokemon(double pesoPokemon) {
        this.pesoPokemon = pesoPokemon;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTemporadaEnaparecer() {
        return temporadaEnaparecer;
    }

    public void setTemporadaEnaparecer(int temporadaEnaparecer) {
        this.temporadaEnaparecer = temporadaEnaparecer;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "numPokedex=" + numPokedex +
                ", nombrePokemon='" + nombrePokemon + '\'' +
                ", pesoPokemon=" + pesoPokemon +
                ", sexo='" + sexo + '\'' +
                ", temporadaEnaparecer=" + temporadaEnaparecer +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public abstract void atacarPlacaje();
    public abstract void atacarArañazo();
    public abstract void atacarMordisco();

}