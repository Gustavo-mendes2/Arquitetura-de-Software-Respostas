import Entidades.Mensagem;
import Entidades.MensagemUrgente;
import Entidades.Email;
import Entidades.SMS;

public class App {
    public static void main(String[] args){
        Mensagem msg1 = new MensagemUrgente(new Email());
        Mensagem msg2 = new MensagemUrgente(new SMS());

        msg1.enviar("Reunião às 10h");
        msg2.enviar("Reunião às 10h");
}
}
