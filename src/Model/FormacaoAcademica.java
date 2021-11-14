package Model;

public class FormacaoAcademica {
    private String cursoFormacaoAcademica;
    private String periodoFormacaoAcademica;
    private String instituicaoFormacaoAcademica;

    public FormacaoAcademica(String cursoFormacaoAcademica, String periodoFormacaoAcademica, String instituicaoFormacaoAcademica) {
        this.cursoFormacaoAcademica = cursoFormacaoAcademica;
        this.periodoFormacaoAcademica = periodoFormacaoAcademica;
        this.instituicaoFormacaoAcademica = instituicaoFormacaoAcademica;
    }

    public FormacaoAcademica() {
    }

    public String getCursoFormacaoAcademica() {
        return cursoFormacaoAcademica;
    }

    public void setCursoFormacaoAcademica(String cursoFormacaoAcademica) {
        this.cursoFormacaoAcademica = cursoFormacaoAcademica;
    }

    public String getPeriodoFormacaoAcademica() {
        return periodoFormacaoAcademica;
    }

    public void setPeriodoFormacaoAcademica(String periodoFormacaoAcademica) {
        this.periodoFormacaoAcademica = periodoFormacaoAcademica;
    }

    public String getInstituicaoFormacaoAcademica() {
        return instituicaoFormacaoAcademica;
    }

    public void setInstituicaoFormacaoAcademica(String instituicaoFormacaoAcademica) {
        this.instituicaoFormacaoAcademica = instituicaoFormacaoAcademica;
    }
    
    
}
