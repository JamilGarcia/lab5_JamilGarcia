package lab5_jamil_garcia;

public class superheroes extends Heroes_Villanos{
    
    private int villanosA;

    public superheroes() {
        super();
        villanosA = 0;
    }

    public superheroes(int villanosA, Poder poder, String nombre, int edad, String origen, double altura) {
        super(poder, nombre, edad, origen, altura);
        this.villanosA = villanosA;
    }

    public int getVillanosA() {
        return villanosA;
    }

    public void setVillanosA(int villanosA) {
        this.villanosA = villanosA;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
    
    
    
}
