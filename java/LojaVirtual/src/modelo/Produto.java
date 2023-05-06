package modelo;

public class Produto {

    private Integer id;
    private String Nome;
    private  String Descricao;

    public Produto(String nome, String descricao) {
        Nome = nome;
        this.Descricao = descricao;
    }

    public Produto (Integer id, String nome, String descricao) {
        this.id = id;
        this.Nome = nome;
        this.Descricao = descricao;
    }

    public String getNome() {
        return Nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("O produto é: %d, %s, %s",
                this.id, this.Nome, this.Descricao);
    }
}
