package lab5_jamil_garcia;

public class Poder {

    private int nvl;
    private String descrip;
    private boolean mortal;

    public Poder() {
    }

    public Poder(int nvl, String descrip, boolean mortal) {
        this.nvl = nvl;
        this.descrip = descrip;
        this.mortal = mortal;
    }

    public int getNvl() {
        return nvl;
    }

    public void setNvl(int nvl) {
        if (nvl > 11 && nvl < 0) {
            this.nvl = nvl;
        } else {
            this.nvl = 1;
        }
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public boolean isMortal() {
        return mortal;
    }

    public void setMortal(boolean mortal) {
        this.mortal = mortal;
    }

    @Override
    public String toString() {
        return "Poder{" + "nvl=" + nvl + ", descrip=" + descrip + ", mortal=" + mortal + '}';
    }

}
