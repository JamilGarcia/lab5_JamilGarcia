package lab5_jamil_garcia;

public class Villanos extends Heroes_Villanos{
    
    private boolean carcel; 
    private int muertes; 

    public Villanos() {
        super();
    }

    public Villanos(boolean carcel, int muertes, Poder poder, String nombre, int edad, String origen, double altura) {
        super(poder, nombre, edad, origen, altura);
        this.carcel = carcel;
        this.muertes = muertes;
    }

    public boolean isCarcel() {
        return carcel;
    }

    public void setCarcel(boolean carcel) {
        this.carcel = carcel;
    }

    public int getMuertes() {
        return muertes;
    }

    public void setMuertes(int muertes) {
        this.muertes = muertes;
    }

    @Override
    public String toString() {
        return "Villanos{" + "carcel=" + carcel + ", muertes=" + muertes + '}';
    }
    
    
    
    
    
}
