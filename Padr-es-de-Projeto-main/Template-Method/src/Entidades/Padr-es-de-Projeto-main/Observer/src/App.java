import Entidades.Professor;
import Entidades.Aluno;

public class App {
    public static void main(String[] args){
        Professor prof = new Professor();
        Aluno a1 = new Aluno("Joao");
        Aluno a2 = new Aluno("Maria");
        prof.adicionar(a1);
        prof.adicionar(a2);
        prof.postarTarefa("Ler capitulo 5 do livro");
     
    }
}
