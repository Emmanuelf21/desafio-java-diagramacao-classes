package dispositivo.funcionalidades.telefone;

public class cellphone implements AparelhoTelefonico {
    
    public void ligar() {
        System.out.println("Ligando...");        
    }
    
    public void atender() {
        System.out.println("Atendendo chamada...");
    }
    
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz...");
    }
}
