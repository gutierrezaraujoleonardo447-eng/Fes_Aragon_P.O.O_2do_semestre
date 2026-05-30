package Recapitulación_para_proyecto._06_Manejo_Archivos._03_Streams._02_Ejemplo_Archivos_manejo;

import java.io.*;
import java.util.ArrayList;

public class AlumnosArchivo {
    private String ruta;

    public AlumnosArchivo() {
    }

    public AlumnosArchivo(String ruta) {
        this.ruta = ruta;
    }

    public void escribir (Alumno alumno){
        try(ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(this.ruta))){
            salida.writeObject(alumno);
            System.out.println("El alumno se guardo correctamente");
    }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public Alumno leer (){
        try(ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(this.ruta))){
            Alumno leido = (Alumno) entrada.readObject();
            return leido;
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void escribirAlumnos(ArrayList<Alumno> alumnos){

    }

    public ArrayList <Alumno> leerAlumnos(){
        return null;
    }
}
