package br.com.alura;

import java.util.*;

public class Curso {

    private int tempoTotal;
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();


    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }


    public String getNome() {
        return nome;
    }

    public String getInstrutor () {
        return instrutor;
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public List<Aula> getAulas () {

        return Collections.unmodifiableList(aulas);
    }

    public void  adiciona (Aula aula) {
        this.aulas.add(aula);
    }

    public int getTempoTotal() {
/*    int tempoTotal = 0;
        for (Aula aula: aulas
             ) { tempoTotal += aula.getTempo();

        }
        return tempoTotal;*/
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "[Curso: " + nome + ", tempo total " + this.getTempoTotal() + ", Aulas" + this.aulas + " ]";
    }

    public void matricula(Aluno aluno) {

        this.alunos.add(aluno);

    }

    public boolean estaMatriculado(Aluno aluno) {

        return this.alunos.contains(aluno);
    }
}

