package Desafio1;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    //atributos:
    private String nome;
    private String duracao;
    private List<Aluno> alunos;

    public Curso(String nome, String duracao) {
        this.nome = nome;
        this.duracao = duracao;
        this.alunos = new ArrayList<Aluno>();
    }

    //metodos:
    public String getNome() {
        return this.nome;
    }

    public String getDuracao() {
        return this.duracao;
    }

    public void addAluno(Aluno aluno){
        alunos.add(aluno);
    }
}
