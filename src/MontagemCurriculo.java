
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.Scanner;



public class MontagemCurriculo {
    Scanner scan = new Scanner(System.in);
    DadosCurriculo dadosCur = DadosCurriculo.getinstance();
    
    public void inicioPrograma() throws InterruptedException{
        preencherDadosCurriculo();
        montagemCurriculo();
    }
    
    public void preencherDadosCurriculo() throws InterruptedException{
        dadosCur.dadosPessoais.setNomeUsuario("Omar Souza");
        dadosCur.dadosPessoais.setEmailUsuario("omarsouza565@gmail.com");
        dadosCur.dadosPessoais.setEnderecoUsuario("Rua da Serenata, 717, Guarani, Uberlandiia-MG");
        dadosCur.dadosPessoais.setTelefoneUsuario("(34) 99656-0196");
        dadosCur.dadosPessoais.setDataNascimentoUsuario("26/06/2000");
        dadosCur.setObjetivo("Trabalhar pra ganhar dinheiro");
        dadosCur.forAca.setCursoFormacaoAcademica("Sistema de Informação");
        dadosCur.forAca.setInstituicaoFormacaoAcademica("PUC Minas");
        dadosCur.forAca.setPeriodoFormacaoAcademica("4 anos");
    }
    
    private static Font fonteNomePessoa = new Font(Font.FontFamily.HELVETICA, 20);
    private static Font fontePadrão = new Font(Font.FontFamily.HELVETICA, 12);
    private static Font fonteSubTitulo = new Font(Font.FontFamily.HELVETICA, 14);
    
    public void montagemCurriculo(){
        try {
            Document documento = new Document();
            PdfWriter.getInstance(documento, new FileOutputStream("C:\\Curriculo\\Curriculo.pdf"));
            
            documento.open();
             
            Paragraph conteudo = new Paragraph();
            
            conteudo.add(new Paragraph(dadosCur.dadosPessoais.getNomeUsuario(), fonteNomePessoa));
            conteudo.add(new Paragraph(dadosCur.dadosPessoais.getEmailUsuario(), fontePadrão));
            conteudo.add(new Paragraph(dadosCur.dadosPessoais.getEnderecoUsuario(), fontePadrão));
            conteudo.add(new Paragraph(dadosCur.dadosPessoais.getTelefoneUsuario(), fontePadrão));
            conteudo.add(new Paragraph(dadosCur.dadosPessoais.getDataNascimentoUsuario(), fontePadrão)); 
            
            conteudo.add(new Paragraph("\n\n"));
            
            conteudo.add(new Paragraph("OBJETIVO", fonteSubTitulo));
            conteudo.add(new Paragraph("\n"));
            conteudo.add(new Paragraph(dadosCur.getObjetivo(), fontePadrão));
            
            conteudo.add(new Paragraph("\n"));
            
            conteudo.add(new Paragraph("FORMAÇÃO", fonteSubTitulo));
            conteudo.add(new Paragraph("\n"));
            conteudo.add(new Paragraph(dadosCur.forAca.getCursoFormacaoAcademica(), fontePadrão));
            conteudo.add(new Paragraph(dadosCur.forAca.getInstituicaoFormacaoAcademica(), fontePadrão));
            conteudo.add(new Paragraph(dadosCur.forAca.getPeriodoFormacaoAcademica(), fontePadrão));
            
            conteudo.add(new Paragraph("\n"));
            
            conteudo.add(new Paragraph("EXPERIENCIA PROFISSIONAL", fonteSubTitulo));
            conteudo.add(new Paragraph("\n"));
            conteudo.add(new Paragraph("Sem Experiencia Profissional"));
            
            conteudo.add(new Paragraph("\n"));
            
            conteudo.add(new Paragraph("CURSO COMPLEMENTAR", fonteSubTitulo));
            conteudo.add(new Paragraph("\n"));
            conteudo.add(new Paragraph("Curso: Técnico em Informatica.\nDuração: 2017 - 2018 (1 ano e meio).\nPronatec Uberlandia."));
            
            conteudo.add(new Paragraph("\n"));
            
            conteudo.add(new Paragraph("IDIOMA", fonteSubTitulo));
            conteudo.add(new Paragraph("\n"));
            conteudo.add(new Paragraph("Ingles: Avançado.\nEscrita e Oratoria."));
            
            conteudo.add(new Paragraph("\n"));
            
            conteudo.add(new Paragraph("INFORMAÇÔES COMPLEMENTARES", fonteSubTitulo));
            conteudo.add(new Paragraph("\n"));
            conteudo.add(new Paragraph("Eu não estou procurando emprego, isso tudo é somente para um trabalho."));
            
            documento.add(conteudo);
            documento.close();
            
            Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", "start", "C:\\Curriculo\\Curriculo.pdf"});
        } catch (Exception e) {
        }
    }
    
    public void editarCurriculo(){
        
    }
}
