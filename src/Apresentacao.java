import java.util.concurrent.TimeUnit;

public class Apresentacao {
    //Utilização do padrão Singleton
    private static Apresentacao instance = null;
    
    private Apresentacao(){
        
    }
    
    public static Apresentacao getInstance(){
        if(instance == null)
            instance = new Apresentacao();
        
        return instance;
    }
    
    public void inicio(){
        System.out.println("Bem Vindo (a)");
        System.out.println("Software para Emissão de PDF");
    }
    
    public void emissão() throws InterruptedException{
        System.out.println("Curriculo em PDF sendo emitido...");
        System.out.println("Aguarde...");
        TimeUnit.SECONDS.sleep(10);
        System.out.println("Curriculo Emitido com Sucesso");
    }
    
    public void finalizacao(){
        System.out.println("Obrigado por utilizar o programa.");
    }
}
