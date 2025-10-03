package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Professor implements Subject {  
    private List<Observer> alunos = new ArrayList<>();
 
    @Override
    public void adicionar(Observer observer) {
        alunos.add(observer);
    }
    
    @Override
    public void remover(Observer observer) {
        alunos.remove(observer);
    }
 
    @Override
    public void notificar(String tarefa) {
        for(Observer aluno : alunos) {
            aluno.update(tarefa);
        }
    }
 
    public void postarTarefa(String tarefa) {
        System.out.println("Professor postou: " + tarefa);
        notificar(tarefa);
    }
}