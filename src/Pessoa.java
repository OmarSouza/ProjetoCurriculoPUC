

public class Pessoa {
    //Metodos Nome, Email, Telefone, Endereço, Idade e Estado Civil referem-se aos dados pessoais do usuario.
    private String nome_Pessoa;
    private String email_Pessoa;
    private String telefone_Pessoa;
    private String endereço_Pessoa;
    private int idade_Pessoa;
    private String estadoCivil_Pessoa;
    private String objetivo_Pessoa;
    private String formacaoAcademica_Pessoa;
    private String experiencia_Pessoa; //Experiencia Profissional
    private String formacaoComplementar_Pessoa; //Cursos fora do Academico
    private String idioma_Pessoa;
    private String infoComplementar_Pessoa;
    
    private static Pessoa instance = null;
    
    public static Pessoa getInstance(){
        if(instance == null)
            instance = new Pessoa();
        
        return instance;
    }
    
    public Pessoa(String nome_Pessoa, String email_Pessoa, String telefone_Pessoa, String endereço_Pessoa, int idade_Pessoa, String estadoCivil_Pessoa, String objetivo_Pessoa, String formacaoAcademica_Pessoa, String experiencia_Pessoa, String formacaoComplementar_Pessoa, String idioma_Pessoa, String infoComplementar_Pessoa) {
        this.nome_Pessoa = nome_Pessoa;
        this.email_Pessoa = email_Pessoa;
        this.telefone_Pessoa = telefone_Pessoa;
        this.endereço_Pessoa = endereço_Pessoa;
        this.idade_Pessoa = idade_Pessoa;
        this.estadoCivil_Pessoa = estadoCivil_Pessoa;
        this.objetivo_Pessoa = objetivo_Pessoa;
        this.formacaoAcademica_Pessoa = formacaoAcademica_Pessoa;
        this.experiencia_Pessoa = experiencia_Pessoa;
        this.formacaoComplementar_Pessoa = formacaoComplementar_Pessoa;
        this.idioma_Pessoa = idioma_Pessoa;
        this.infoComplementar_Pessoa = infoComplementar_Pessoa;
    }

    //Construtor vazio
    public Pessoa() {
    }

    public String getNome_Pessoa() {
        return nome_Pessoa;
    }

    public void setNome_Pessoa(String nome_Pessoa) {
        this.nome_Pessoa = nome_Pessoa;
    }

    public String getEmail_Pessoa() {
        return email_Pessoa;
    }

    public void setEmail_Pessoa(String email_Pessoa) {
        this.email_Pessoa = email_Pessoa;
    }

    public String getTelefone_Pessoa() {
        return telefone_Pessoa;
    }

    public void setTelefone_Pessoa(String telefone_Pessoa) {
        this.telefone_Pessoa = telefone_Pessoa;
    }

    public String getEndereço_Pessoa() {
        return endereço_Pessoa;
    }

    public void setEndereço_Pessoa(String endereço_Pessoa) {
        this.endereço_Pessoa = endereço_Pessoa;
    }

    public int getIdade_Pessoa() {
        return idade_Pessoa;
    }

    public void setIdade_Pessoa(int idade_Pessoa) {
        this.idade_Pessoa = idade_Pessoa;
    }

    public String getEstadoCivil_Pessoa() {
        return estadoCivil_Pessoa;
    }

    public void setEstadoCivil_Pessoa(String estadoCivil_Pessoa) {
        this.estadoCivil_Pessoa = estadoCivil_Pessoa;
    }

    public String getObjetivo_Pessoa() {
        return objetivo_Pessoa;
    }

    public void setObjetivo_Pessoa(String objetivo_Pessoa) {
        this.objetivo_Pessoa = objetivo_Pessoa;
    }

    public String getFormacaoAcademica_Pessoa() {
        return formacaoAcademica_Pessoa;
    }

    public void setFormacaoAcademica_Pessoa(String formacaoAcademica_Pessoa) {
        this.formacaoAcademica_Pessoa = formacaoAcademica_Pessoa;
    }

    public String getExperiencia_Pessoa() {
        return experiencia_Pessoa;
    }

    public void setExperiencia_Pessoa(String experiencia_Pessoa) {
        this.experiencia_Pessoa = experiencia_Pessoa;
    }

    public String getFormacaoComplementar_Pessoa() {
        return formacaoComplementar_Pessoa;
    }

    public void setFormacaoComplementar_Pessoa(String formacaoComplementar_Pessoa) {
        this.formacaoComplementar_Pessoa = formacaoComplementar_Pessoa;
    }

    public String getIdioma_Pessoa() {
        return idioma_Pessoa;
    }

    public void setIdioma_Pessoa(String idioma_Pessoa) {
        this.idioma_Pessoa = idioma_Pessoa;
    }

    public String getInfoComplementar_Pessoa() {
        return infoComplementar_Pessoa;
    }

    public void setInfoComplementar_Pessoa(String infoComplementar_Pessoa) {
        this.infoComplementar_Pessoa = infoComplementar_Pessoa;
    }
    
    
}
