
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.Scanner;

public class MontagemCurriculo {

    Scanner scan = new Scanner(System.in);
    DadosCurriculo dadosCur = DadosCurriculo.getinstance();

    public void inicioPrograma() throws InterruptedException {
        preencherDadosCurriculo();
        montagemCurriculo();
    }

    public void preencherDadosCurriculo() throws InterruptedException {
        System.out.println("Bem vindo(a)");
        System.out.println("Aguarde enquanto o Criador de Curriculo é Inicializado...");
        // TimeUnit.SECONDS.sleep(10g);

        System.out.println("CRIADOR DE CURRÍCULO.\nPor Favor, preencha os dados a seguir:");

        System.out.println("Informe seu Nome Completo:");
        dadosCur.dadosPes.setNomeUsuario(scan.nextLine());

        System.out.println("Informe seu E-mail:");
        dadosCur.dadosPes.setEmailUsuario(scan.nextLine());

        System.out.println("Informe seu Endereço:");
        dadosCur.dadosPes.setEnderecoUsuario(scan.nextLine());

        System.out.println("Informe seu Data de Nascimento:");
        dadosCur.dadosPes.setDataNascimentoUsuario(scan.nextLine());

        System.out.println("Informe seu Telefone:");
        dadosCur.dadosPes.setTelefoneUsuario(scan.nextLine());

        System.out.println("Qual é o seu objetivo?");
        dadosCur.setObjetivo(scan.nextLine());

        System.out.println("Salvando dados pessoais...\n");

        System.out.println("\n===== Formação Acadêmica =====\n\n");

        System.out.println("Informe o seu curso:");
        dadosCur.forAca.setCursoFormacaoAcademica(scan.nextLine());

        System.out.println("Qual foi o tempo de duração?");
        dadosCur.forAca.setPeriodoFormacaoAcademica(scan.nextLine());

        System.out.println("E qual era o nome da instituição?");
        dadosCur.forAca.setInstituicaoFormacaoAcademica(scan.nextLine());

        System.out.println("Salvando formação acadêmica...\n");

        System.out.println("Você fez curso complementar?\nS - Sim;\nN = Não.");
        char charCurso = scan.nextLine().charAt(0);
        boolean boolCurso = verificarInfos(charCurso);

        if (boolCurso == true) {
            System.out.println("\n===== Curso Complementar =====\n\n");

            System.out.println("Qual era o curso?");
            dadosCur.cursoComp.setCursoCursoComplementar(scan.nextLine());

            System.out.println("Qual foi o período?");
            dadosCur.cursoComp.setDuracaoCursoComplementar(scan.nextLine());

            System.out.println("E qual era o nome da instituição?");
            dadosCur.cursoComp.setInstituicaoCursoComplementar(scan.nextLine());

            System.out.println("Salvando Curso Complementar...\n");
        }

        System.out.println("É o seu primeiro emprego?\nS - Sim;\nN = Não.");
        char charEmprego = scan.nextLine().charAt(0);
        boolean boolEmprego = verificarInfos(charEmprego);

        if (boolEmprego == false) {
            System.out.println("\n===== Experiência Profissional =====\n\n");

            System.out.println("Qual era o cargo?");
            dadosCur.expProf.setFuncaoEmpresaExperienciaProfissional(scan.nextLine());

            System.out.println("Qual foi o período?");
            dadosCur.expProf.setPeriodoExperienciaProfissional(scan.nextLine());

            System.out.println("E qual era o nome da empresa que você trabalhou?");
            dadosCur.expProf.setEmpresaExperienciaProfissional(scan.nextLine());

            System.out.println("Salvando Experiência Profissional...\n");
        }

        System.out.println("Você tem conhecimento em algum idioma?\nS - Sim;\nN = Não.");
        char charIdioma = scan.nextLine().charAt(0);
        boolean boolIdioma = verificarInfos(charIdioma);

        if (boolIdioma == true) {
            System.out.println("Nome do Idioma:");
            dadosCur.idioma.setIdiomaIdioma(scan.nextLine());

            System.out.println("Nível de Proficiência?");
            dadosCur.idioma.setNivelIdioma(scan.nextLine());
        }

        System.out.println("Deseja inserir alguma informação adicional (Aperte enter caso não deseje)?");
        dadosCur.setInfoAdicional(scan.nextLine());

        System.out.println("Salvando Experiência Profissional...\n");

        System.out.println("=== CURRÍCULO CRIADO ===\n");
        System.out.println("Por favor, verifique as informações: \n");

        dadosCur.imprimirDados();
    }

    public boolean verificarInfos(char fezCurso) {
        boolean boolVerifica;

        if (fezCurso == 'S') {
            boolVerifica = true;
        } else {
            boolVerifica = false;
        }

        return boolVerifica;
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
            
            conteudo.add(new Paragraph(dadosCur.dadosPes.getNomeUsuario(), fonteNomePessoa));
            conteudo.add(new Paragraph(dadosCur.dadosPes.getEmailUsuario(), fontePadrão));
            conteudo.add(new Paragraph(dadosCur.dadosPes.getEnderecoUsuario(), fontePadrão));
            conteudo.add(new Paragraph(dadosCur.dadosPes.getTelefoneUsuario(), fontePadrão));
            conteudo.add(new Paragraph(dadosCur.dadosPes.getDataNascimentoUsuario(), fontePadrão)); 
            
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

    public void editarCurriculo() {

    }
}
