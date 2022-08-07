package Desafio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mentoria {
    //atributos:
    Dev professor;
    Curso curso;
    HashMap<Integer, List<String>> perguntas;

    public Mentoria(Dev professor, Curso curso) {
        this.professor = professor;
        this.curso = curso;
        this.perguntas = new HashMap<Integer, List<String>>();
    }
    
    //metodos
    public void fazerPergunta(Aluno aluno, String pergunta){
        boolean temPergunta = perguntas.containsKey(aluno.getMatricula());
        if (!temPergunta){
            perguntas.put(aluno.getMatricula(), new ArrayList<String>());
        }

        List<String> perguntasDoAluno = perguntas.get(aluno.getMatricula());
        perguntasDoAluno.add(pergunta);
    }
}