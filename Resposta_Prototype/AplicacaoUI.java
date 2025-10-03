package Resposta_Prototype;
import java.util.HashMap;

interface ComponenteUI {
    ComponenteUI duplicar();
    void exibir();
}

class BotaoEstilizado implements ComponenteUI {
    private String corDeFundo, corDaFonte, estiloFonte;

    public BotaoEstilizado() {
        this.corDeFundo = "#e67e22";
        this.corDaFonte = "#000000";
        this.estiloFonte = "Verdana, 12px, italic";
    }

    @Override
    public ComponenteUI duplicar() {
        BotaoEstilizado copia = new BotaoEstilizado();
        copia.corDeFundo = this.corDeFundo;
        copia.corDaFonte = this.corDaFonte;
        copia.estiloFonte = this.estiloFonte;
        return copia;
    }

    @Override
    public void exibir() {
        System.out.println("Renderizando botão estilizado com fundo " + corDeFundo +
                           ", texto " + corDaFonte + " e fonte " + estiloFonte);
    }
}

class CatalogoComponentes {
    private HashMap<String, ComponenteUI> componentes = new HashMap<>();

    public void registrar(String chave, ComponenteUI componente) {
        componentes.put(chave, componente);
    }

    public ComponenteUI obter(String chave) {
        return componentes.get(chave);
    }
}

public class AplicacaoUI {
    public static void main(String[] args) {
        CatalogoComponentes catalogo = new CatalogoComponentes();
        
        catalogo.registrar("botao-estilizado", new BotaoEstilizado());
        ComponenteUI novoBotao = catalogo.obter("botao-estilizado").duplicar();
        novoBotao.exibir();
    }
}
