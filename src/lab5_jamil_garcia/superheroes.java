package lab5_jamil_garcia;

import java.util.ArrayList;

public class superheroes extends Heroes_Villanos{
    
    private ArrayList <Villanos> villanosA;
    private GrupoSH grupo;

    public superheroes() {
        super();
    }

    public superheroes(ArrayList<Villanos> villanosA, GrupoSH grupo, ArrayList<Poder> poderes, String nombre, int edad, String origen, double altura) {
        super(poderes, nombre, edad, origen, altura);
        this.villanosA = villanosA;
        this.grupo = grupo;
    }

    public ArrayList<Villanos> getVillanosA() {
        return villanosA;
    }

    public void setVillanosA(ArrayList<Villanos> villanosA) {
        this.villanosA = villanosA;
    }

    public GrupoSH getGrupo() {
        return grupo;
    }

    public void setGrupo(GrupoSH grupo) {
        this.grupo = grupo;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }

    
    
    
    
}
