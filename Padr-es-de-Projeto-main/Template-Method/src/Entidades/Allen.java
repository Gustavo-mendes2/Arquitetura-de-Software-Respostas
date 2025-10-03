package Entidades;

public class Allen extends JogoIA {
    @Override
    protected void atirar() {
        System.out.println("Estou atirando pelos olhos");
    }
    
    @Override
    protected void mover() {
        System.out.println("Estou me movendo com meus tentáculos");
    }
}