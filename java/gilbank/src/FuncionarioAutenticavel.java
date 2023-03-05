public abstract class FuncionarioAutenticavel extends Funcionario{

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
}
