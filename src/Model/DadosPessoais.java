package Model;

import java.util.Date;

public class DadosPessoais {
    private String nomeUsuario;
    private String emailUsuario;
    private String telefoneUsuario;
    private String enderecoUsuario;
    private String dataNascimentoUsuario;

    public DadosPessoais(String nomeUsuario, String emailUsuario, String telefoneUsuario, String enderecoUsuario, String dataNascimentoUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
        this.telefoneUsuario = telefoneUsuario;
        this.enderecoUsuario = enderecoUsuario;
        this.dataNascimentoUsuario = dataNascimentoUsuario;
    }

    public DadosPessoais() {
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getTelefoneUsuario() {
        return telefoneUsuario;
    }

    public void setTelefoneUsuario(String telefoneUsuario) {
        this.telefoneUsuario = telefoneUsuario;
    }

    public String getEnderecoUsuario() {
        return enderecoUsuario;
    }

    public void setEnderecoUsuario(String enderecoUsuario) {
        this.enderecoUsuario = enderecoUsuario;
    }

    public String getDataNascimentoUsuario() {
        return dataNascimentoUsuario;
    }

    public void setDataNascimentoUsuario(String dataNascimentoUsuario) {
        this.dataNascimentoUsuario = dataNascimentoUsuario;
    }
    
    
}
