import Entidades.JogoIA;
import Entidades.Alien;
import Entidades.Robo;

public class App {
    public static void main(String[] args){
        JogoIA alien = new Alien();
        JogoIA robo = new Robo();
        alien.OrdemIA();
        robo.OrdemIA();
    }
}
