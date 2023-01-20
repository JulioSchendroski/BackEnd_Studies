package Domain;

import Domain.Produtos.Chat;
import Domain.Produtos.Email;

public class MensagemFactory{

    public static Mensagem getTipoMensagem(int tipoMensagem){
        if(tipoMensagem == 1){
            return new Email();
        }else if (tipoMensagem == 2){
            return new Chat();
        }
        else return null;
    }
}