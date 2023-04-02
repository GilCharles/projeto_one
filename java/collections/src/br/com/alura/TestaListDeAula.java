package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListDeAula {

    public static void main(String[] args) {

        Aula a1 = new Aula("aula1", 21);
        Aula a2 = new Aula("aula2", 18);
        Aula a3 = new Aula("aula3", 20);


        ArrayList<Aula> aulas = new ArrayList<>();

        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);

        Collections.sort(aulas);

        System.out.println(aulas);

        //Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        // Versão reduzida
        aulas.sort(Comparator.comparing(Aula::getTempo));


    }
}
