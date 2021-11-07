
import java.util.concurrent.TimeUnit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rebekah
 */
public class Apresentacao {
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
}
