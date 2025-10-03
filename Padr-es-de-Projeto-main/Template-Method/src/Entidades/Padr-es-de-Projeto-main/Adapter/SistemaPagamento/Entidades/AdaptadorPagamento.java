package Entidades;

public class AdaptadorPagamento implements ProcessadorPagamento{
    private SistemaPagamentoLegado sistemaLegado;

    public AdaptadorPagamento() {
        this.sistemaLegado = new SistemaPagamentoLegado();
    }

    @Override
    public void processarPagamento(double valor) {
        String valorString = String.format("%.2f", valor);
        sistemaLegado.efetuarPagamento(valorString);
    }
}