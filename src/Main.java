
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Apresentacao presentation = Apresentacao.getInstance();
        Scanner scan = new Scanner(System.in);
        Pessoa pessoa = Pessoa.getInstance();
        
        presentation.inicio();
        
        System.out.println("Informe seu nome");
        pessoa.setNome_Pessoa(scan.nextLine());
        System.out.println(pessoa.getNome_Pessoa());
                
    }
    
}
