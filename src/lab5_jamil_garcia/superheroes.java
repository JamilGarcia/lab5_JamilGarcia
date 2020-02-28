package lab5_jamil_garcia;

import java.util.ArrayList;

public class superheroes extends Heroes_Villanos{
    
    private ArrayList <Villanos> villanosA;

    public superheroes() {
        super();
    }

    public superheroes(ArrayList<Villanos> villanosA, ArrayList<Poder> poderes, String nombre, int edad, String origen, double altura) {
        super(poderes, nombre, edad, origen, altura);
        this.villanosA = villanosA;
    }

    

    
    
    @Override
    public String toString() {
        return super.toString();
    }

    
    
    
    
}
