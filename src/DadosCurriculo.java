
import Model.CursoComplementar;
import Model.DadosPessoais;
import Model.ExperienciaProfissional;
import Model.FormacaoAcademica;
import Model.Idioma;

public class DadosCurriculo {
    public DadosPessoais dadosPes = new DadosPessoais();
    private String objetivo;
    public FormacaoAcademica forAca = new FormacaoAcademica();
    public CursoComplementar cursoComp = new CursoComplementar();
    public ExperienciaProfissional expProf = new ExperienciaProfissional();
    public Idioma idioma = new Idioma();
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
    
    public void imprimirDados(){
        System.out.println("Nome: " + dadosPes.getNomeUsuario() + "\nE-mail: " + dadosPes.getEmailUsuario()
                + "\n Endereço: " + dadosPes.getEnderecoUsuario() + "\nData de Nascimento: "
                + dadosPes.getDataNascimentoUsuario() + "\nTelefone: " + dadosPes.getTelefoneUsuario() + "\n");
        
        System.out.println("Objetivo: " + objetivo + "\n");
        
        System.out.println("Formação Acadêmica:\nCurso: " + forAca.getCursoFormacaoAcademica() + "\nPeríodo: "
                + forAca.getPeriodoFormacaoAcademica() + "\nInstituição: " + forAca.getInstituicaoFormacaoAcademica() + "\n");
        
        System.out.println("Cursos Complementares:\nCurso: " + cursoComp.getCursoCursoComplementar() + "\nPeríodo: "
                + cursoComp.getDuracaoCursoComplementar() + "\nInstituição: " + cursoComp.getInstituicaoCursoComplementar() + "\n");
        
        System.out.println("Experiência Profissional:\nCargo: " + expProf.getFuncaoEmpresaExperienciaProfissional()
                + "\nEmpresa: " + expProf.getEmpresaExperienciaProfissional() + "\nPeríodo: " + expProf.getPeriodoExperienciaProfissional() + "\n");
        
        System.out.println("Idioma:\nLinguagem:" + idioma.getIdiomaIdioma() + "\nProficiência:" + idioma.getNivelIdioma() + "\n");
        
        System.out.println("Informações Adicionais: " + infoAdicional + "\n");
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

    public FormacaoAcademica getForAca() {
        return forAca;
    }

    public void setForAca(FormacaoAcademica forAca) {
        this.forAca = forAca;
    }

    public CursoComplementar getCursoComp() {
        return cursoComp;
    }

    public void setCursoComp(CursoComplementar cursoComp) {
        this.cursoComp = cursoComp;
    }

    public ExperienciaProfissional getExpProf() {
        return expProf;
    }

    public void setExpProf(ExperienciaProfissional expProf) {
        this.expProf = expProf;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public static DadosCurriculo getInstance() {
        return instance;
    }

    public static void setInstance(DadosCurriculo instance) {
        DadosCurriculo.instance = instance;
    }

    
}
