package Entidades;

public abstract class Mensagem {
    protected Canal canal;
    
    public Mensagem(Canal canal) {
    this.canal = canal;
    }
    public abstract void enviar(String msg);
}