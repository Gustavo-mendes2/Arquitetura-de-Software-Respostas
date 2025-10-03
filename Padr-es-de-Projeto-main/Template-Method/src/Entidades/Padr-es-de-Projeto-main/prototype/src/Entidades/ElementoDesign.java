package Entidades;

public interface ElementoDesign {
    ElementoDesign clone();
    String getCorFundo();
    String getCorTexto();
    String getFonte();
    public void setCorFundo(String cor);
    public void setCorTexto(String cor);
    public void setFonte(String fonte);
}