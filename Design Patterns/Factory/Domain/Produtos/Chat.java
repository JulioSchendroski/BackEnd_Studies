package Domain.Produtos;

import Domain.Mensagem;

public class Chat implements Mensagem{
    private String conteudo;

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public void enviarMensagem(String conteudo) {
        System.out.println(conteudo);
    }
}
