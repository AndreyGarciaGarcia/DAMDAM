package Utilidades;

public class Cancion {
    
    private String nombre;
    private String grupoM;
    private int anioPubli;
    
    // Constructor
    public Cancion(String pNombre, String pGrupoM, int pAnioPubli) {
        this.nombre = pNombre;
        this.grupoM = pGrupoM;
        this.anioPubli = pAnioPubli;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupoM() {
        return grupoM;
    }

    public void setGrupoM(String grupoM) {
        this.grupoM = grupoM;
    }

    public int getAnioPubli() {
        return anioPubli;
    }

    public void setAnioPubli(int anioPubli) {
        this.anioPubli = anioPubli;
    }

    // toString para mostrar la canción de manera legible
    @Override
    public String toString() {
        return "Grupo: " + grupoM + ", Canción: " + nombre + ", Año: " + anioPubli;
    }
}

