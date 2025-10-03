package Entidades;

public class Compressor {
    private CompressionStrategy strategy;
    public void setStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }
    Diagrama Simplificado (UML)
    public void compressFile(String fileName) {
        if (strategy == null) {
            System.out.println("Nenhuma estratégia definida!");
            return;
        }
        strategy.compress(fileName);
    }

}