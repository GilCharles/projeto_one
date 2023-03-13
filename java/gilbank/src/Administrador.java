public class Administrador extends Funcionario implements Autenticavel {


    // Atributos

    private AutenticacaoUtil autenticador;

    // Construtor

    public Administrador() {

        AutenticacaoUtil util = new AutenticacaoUtil();
    }
    @Override
    public double getBonificacao() {
        return 50;
    }

    // Métodos

    @Override
    public boolean autentica(int senha) {

        return this.autenticador.autentica(senha);
    }

    @Override
    public void setSenha(int senha) {

        this.autenticador.setSenha(senha);
    }
}


