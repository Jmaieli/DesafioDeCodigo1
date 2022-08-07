package Desafio1;

import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private String nome;
    private List<Curso> cursos;
    private List<Aluno> alunos;
    private List<Mentoria> mentorias;

    //construtor
    public Bootcamp(String nome) {
        this.nome = nome;
        cursos = new ArrayList<Curso>();
        alunos = new ArrayList<Aluno>();
        mentorias = new ArrayList<Mentoria>();    
    }

    //metodo:
    public void inscrever(Aluno aluno) {
        alunos.add(aluno);
    };

    public List<Aluno> getInscritos() {
        return this.alunos;    
    }
    
    public List<Curso> getCursos(){
        return this.cursos;
    }

    public Curso getCurso(String nome){
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getNome() == nome){
                return cursos.get(i);
            }
        }
        return null;
    }
}
