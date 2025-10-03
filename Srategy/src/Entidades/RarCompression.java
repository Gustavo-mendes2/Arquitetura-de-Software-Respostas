package Entidades;

public class RarCompression implements CompressionStrategy {
    @Override
    public void compress(String fileName) {
        System.out.println("Comprimindo " + fileName + " em formato RAR...");
    }
}