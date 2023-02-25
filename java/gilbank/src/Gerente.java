// Gerente herda da classe funcionario
public class Gerente extends Funcionario {

    // Atributos
    private  String senha;

    // Construtor





    // Métodos

    public boolean autentica (String senha){
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

   public double getBonificacao() {

        return super.getSalario() + super.getBonificacao();

    }
}


