
import com.itextpdf.text.Font;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;



public class MontagemCurriculo {
    Scanner scan = new Scanner(System.in);
    DadosCurriculo dadosCur = DadosCurriculo.getinstance();
    
    public void inicioPrograma() throws InterruptedException{
        preencherDadosCurriculo();
    }
    
    public void preencherDadosCurriculo() throws InterruptedException{
        System.out.println("Bem vindo(a)");
        System.out.println("Aguarde enquanto o Criador de Curriculo é Inicializado...");
        TimeUnit.SECONDS.sleep(10);
        
        System.out.println("CRIADOR DE CURRICULO.\nPor Favor, preencha os dados a seguir:");
        System.out.println("Informe seu Nome Completo:");
        dadosCur.dadosPessoais.setNomeUsuario(scan.nextLine());
        System.out.println(dadosCur.dadosPessoais.getNomeUsuario());
    }
    
    private static Font fonteNomePessoa = new Font(Font.FontFamily.HELVETICA, 20);
    private static Font fontePadrão = new Font(Font.FontFamily.HELVETICA, 12);
    private static Font fonteSubTitulo = new Font(Font.FontFamily.HELVETICA, 14);
    
    public void montagemCurriculo(){
        
    }
    
    public void editarCurriculo(){
        
    }
}
