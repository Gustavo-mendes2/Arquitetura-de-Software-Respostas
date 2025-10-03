package Entidades;

import java.util.ArrayList;

public class Professor extends Subject{
    private ArrayList<Aluno> alunos = new ArrayList<>();
 
    @Override
    public void adicionar(Aluno a){alunos.add(a);}
    @Override
    public void remover(Aluno a){alunos.remove(a);}
 
    public void notificar(String tarefa){
        for(Aluno aluno : alunos){aluno.update(tarefa);}
    }
 
    public void postarTarefa(String tarefa){
        System.out.println("Professor postou:" + tarefa);
        notificar(tarefa);
    }
}