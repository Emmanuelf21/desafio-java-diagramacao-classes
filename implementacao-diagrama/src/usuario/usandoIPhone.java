package usuario;

import dispositivo.iPhone;

public class usandoIPhone {
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();

        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica();
        meuIPhone.ligar();
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();
        meuIPhone.exibirPagina();
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizrPagina();
    }
}
