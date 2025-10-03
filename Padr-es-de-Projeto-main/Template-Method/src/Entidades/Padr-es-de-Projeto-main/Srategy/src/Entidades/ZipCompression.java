package Entidades;

public class ZipCompression implements CompressionStrategy {
    @Override
    public void compress(String fileName) {
        System.out.println("Comprimindo " + fileName + " em formato ZIP...");
    }
}