package lab5_jamil_garcia;

public class GrupoSH {
    
    private int codigo; 
    private String grupo;

    public GrupoSH() {
    }

    public GrupoSH(int codigo, String grupo) {
        this.codigo = codigo;
        this.grupo = grupo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return grupo;
    }
    
    
}
