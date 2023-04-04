package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Aula 1", "instrutor 1");


        javaColecoes.adiciona(new Aula("aula1.1", 30));
        javaColecoes.adiciona(new Aula("aula1.2", 20));
        javaColecoes.adiciona(new Aula("aula1.3", 25));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);

        System.out.println(aulas);
        System.out.println(javaColecoes.getTempoTotal());
        System.out.println(javaColecoes);

    }
}
