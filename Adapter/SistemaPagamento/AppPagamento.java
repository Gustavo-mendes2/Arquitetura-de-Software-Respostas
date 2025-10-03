import Entidades.AdaptadorPagamento;

public class AppPagamneto {
    public static void main(String[] args){
        System.out.println("=== Teste do sistema ===");

        ProcessadorPagamento processador = new AdaptadorPagamento();
       
        System.out.println("\n1. Pagamento de R$ 100,00:");
        processador.processarPagamento(100.00);
       
        System.out.println("\n2. Pagamento de R$ 55,75:");
        processador.processarPagamento(55.75);
       
        System.out.println("\n3. Pagamento de R$ 1234,56:");
        processador.processarPagamento(1234.56);
       
       
        SistemaPagamentoLegado legado = new SistemaPagamentoLegado();
        System.out.println("Sistema legado direto:");
        legado.efetuarPagamento("100,00");
    }
}