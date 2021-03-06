package Model;

public class Idioma {
    private String idiomaIdioma;
    private String nivelIdioma;
    private boolean possuiIdiomaIdioma;

    public Idioma(String idiomaIdioma, String nivelIdioma) {
        this.idiomaIdioma = idiomaIdioma;
        this.nivelIdioma = nivelIdioma;
    }

    public Idioma() {
    }

    public String getIdiomaIdioma() {
        return idiomaIdioma;
    }

    public void setIdiomaIdioma(String idiomaIdioma) {
        this.idiomaIdioma = idiomaIdioma;
    }

    public String getNivelIdioma() {
        return nivelIdioma;
    }

    public void setNivelIdioma(String nivelIdioma) {
        this.nivelIdioma = nivelIdioma;
    }

    public boolean isPossuiIdiomaIdioma() {
        return possuiIdiomaIdioma;
    }

    public void setPossuiIdiomaIdioma(boolean possuiIdiomaIdioma) {
        this.possuiIdiomaIdioma = possuiIdiomaIdioma;
    }
    
}
