package Entidades;

public class SevenZCompression implements CompressionStrategy {
    @Override
    public void compress(String fileName) {
        System.out.println("Comprimindo " + fileName + " em formato 7Z...");
    }
}