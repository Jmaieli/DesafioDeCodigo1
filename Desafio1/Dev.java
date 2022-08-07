package Desafio1;

import java.util.ArrayList;
import java.util.List;

public class Dev {
    //atributos:
    private String nome;

    private List<Curso> cursos;

    public Dev() {
        this.cursos = new ArrayList<Curso>();
    }

    public Dev(String nome) {
        this.nome = nome;
        this.cursos = new ArrayList<Curso>();
    }

    public List<Curso> getCursos() {
        return cursos;
    }
    
    public String getNome(){
        return nome;
    }

}
