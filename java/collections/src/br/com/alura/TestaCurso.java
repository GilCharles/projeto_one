package br.com.alura;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Aula 1", "instrutor 1");


        javaColecoes.adiciona(new Aula("aula1.1", 30));
        javaColecoes.adiciona(new Aula("aula1.2", 20));
        javaColecoes.adiciona(new Aula("aula1.3", 25));

        System.out.println(javaColecoes.getAulas());
    }
}
