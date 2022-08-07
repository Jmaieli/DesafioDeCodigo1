package Desafio1;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Bootcamp b = new Bootcamp("Code Girls");
        Aluno a = new Aluno("Janaíne");
        Aluno c = new Aluno("Jesley");
        
        b.inscrever(a);
        b.inscrever(c);

        List<Aluno> inscritos = b.getInscritos();
        for(int i = 0; i < inscritos.size(); i++){
            System.out.println(inscritos.get(i).getNome());
        };
    }
}
