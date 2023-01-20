import java.util.Scanner;

import Domain.Mensagem;
import Domain.MensagemFactory;

public class Main{
    public static void main(String[] args){
        try (Scanner entrada = new Scanner(System.in)) {
            
			System.out.print("Qual o tipo de mensagem (1) Email, (2) Chat: ");
			int tipoMensagem = entrada.nextInt();

            Mensagem mensagem = MensagemFactory.getTipoMensagem(tipoMensagem);
            mensagem.enviarMensagem("oi");
		}
    }
}