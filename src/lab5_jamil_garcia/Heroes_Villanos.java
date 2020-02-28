package lab5_jamil_garcia;

import java.util.ArrayList;

public class Heroes_Villanos {
    
    private ArrayList<Poder> poderes;
    private Poder poder;
    private String nombre;
    private int edad;
    private String origen;
    private double altura;

    public Heroes_Villanos() {
    }

    public Heroes_Villanos(Poder poder, String nombre, int edad, String origen, double altura) {
        this.poder = poder;
        this.nombre = nombre;
        this.edad = edad;
        this.origen = origen;
        this.altura = altura;
    }

    public Poder getPoder() {
        return poder;
    }

    public void setPoder(Poder poder) {
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
