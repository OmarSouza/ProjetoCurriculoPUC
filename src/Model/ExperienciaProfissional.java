package Model;

public class ExperienciaProfissional {
    private String empresaExperienciaProfissional;
    private String periodoExperienciaProfissional;
    private String funcaoEmpresaExperienciaProfissional;

    public ExperienciaProfissional(String empresaExperienciaProfissional, String periodoExperienciaProfissional, String funcaoEmpresaExperienciaProfissional) {
        this.empresaExperienciaProfissional = empresaExperienciaProfissional;
        this.periodoExperienciaProfissional = periodoExperienciaProfissional;
        this.funcaoEmpresaExperienciaProfissional = funcaoEmpresaExperienciaProfissional;
    }

    public ExperienciaProfissional() {
    }
    
    public String getEmpresaExperienciaProfissional() {
        return empresaExperienciaProfissional;
    }

    public void setEmpresaExperienciaProfissional(String empresaExperienciaProfissional) {
        this.empresaExperienciaProfissional = empresaExperienciaProfissional;
    }

    public String getPeriodoExperienciaProfissional() {
        return periodoExperienciaProfissional;
    }

    public void setPeriodoExperienciaProfissional(String periodoExperienciaProfissional) {
        this.periodoExperienciaProfissional = periodoExperienciaProfissional;
    }

    public String getFuncaoEmpresaExperienciaProfissional() {
        return funcaoEmpresaExperienciaProfissional;
    }

    public void setFuncaoEmpresaExperienciaProfissional(String funcaoEmpresaExperienciaProfissional) {
        this.funcaoEmpresaExperienciaProfissional = funcaoEmpresaExperienciaProfissional;
    }
    
    
}
