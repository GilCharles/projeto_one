package br.com.alura;

public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Aula 1", "instrutor 1");


        javaColecoes.adiciona(new Aula("aula1.1", 30));
        javaColecoes.adiciona(new Aula("aula1.2", 20));
        javaColecoes.adiciona(new Aula("aula1.3", 25));

        Aluno a1  = new Aluno("Julio", 3456);
        Aluno a2  = new Aluno("Caio", 3412);
        Aluno a3  = new Aluno("Jose", 3897);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });
    }
}
