
import Model.CursoComplementar;
import Model.DadosPessoais;
import Model.ExperienciaProfissional;
import Model.FormacaoAcademica;
import Model.Idioma;

public class DadosCurriculo {
    public DadosPessoais dadosPessoais;
    private String objetivo;
    public FormacaoAcademica forAca;
    public CursoComplementar cursoComp;
    public ExperienciaProfissional expProf;
    public Idioma idioma;
    private String infoAdicional;
    
    private static DadosCurriculo instance = null;
      
    public DadosCurriculo() {
    }
    
    public static DadosCurriculo getinstance(){
        if(instance == null){
            instance = new DadosCurriculo();
        }
        
        return instance;
    }
    
    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getInfoAdicional() {
        return infoAdicional;
    }

    public void setInfoAdicional(String infoAdicional) {
        this.infoAdicional = infoAdicional;
    }

    
}
