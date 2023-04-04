package br.com.alura;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {

        Collection<String> alunos = new HashSet<>();

        alunos.add ("aluno 1");
        alunos.add ("aluno 2");
        alunos.add ("aluno 3");
        alunos.add ("aluno 4");
        alunos.add ("aluno 5");
        alunos.add ("aluno 6");

        for (String aluno: alunos
             ) {
            System.out.println(aluno);
        }

        System.out.println(alunos);

    }
}
