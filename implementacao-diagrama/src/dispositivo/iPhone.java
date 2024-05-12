package dispositivo;

import dispositivo.funcionalidades.musica.ReprodutorMusical;
import dispositivo.funcionalidades.navegador.NavegadorNaInternet;
import dispositivo.funcionalidades.telefone.AparelhoTelefonico;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet{
    public void adicionarNovaAba() {
        System.out.println("IPhone adicionando nova aba...");
    }
    public void atender() {
        System.out.println("IPhone atendendo chamada...");
    }
    public void atualizrPagina() {
        System.out.println("IPhone atualizando página...");
    }
    public void exibirPagina() {
        System.out.println("IPhone exibindo página...");
    }
    public void iniciarCorreioVoz() {
        System.out.println("IPhone iniciando correio de voz...");
    }
    public void ligar() {
        System.out.println("IPhone ligando...");
    }
    public void pausar() {
        System.out.println("IPhone pausando música...");
    }
    public void selecionarMusica() {
        System.out.println("IPhone selecionando música...");
    }
    public void tocar() {
        System.out.println("IPhone tocando música...");
    }

}
