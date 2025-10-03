import Entidades.Compressor;
import Entidades.ZipCompression;
import Entidades.RarCompression;
import Entidades.SevenZCompression;

public class App {
    public static void main(String[] args) {
        Compressor compressor = new Compressor();
        // ZIP
        compressor.setStrategy(new ZipCompression());
        compressor.compressFile("documento.txt");
        // RAR
        compressor.setStrategy(new RarCompression());
        compressor.compressFile("imagem.png");
        // 7Z
        compressor.setStrategy(new SevenZCompression());
        compressor.compressFile("video.mp4");
    }
}
