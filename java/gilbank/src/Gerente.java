// Gerente herda da classe funcionario
public class Gerente extends Funcionario implements Autenticavel {

    // Atributos

    private AutenticacaoUtil autenticador;

    // Construtor
    public Gerente() {

        AutenticacaoUtil util = new AutenticacaoUtil();
    }

    // Métodos
   public double getBonificacao() {

        return super.getSalario();

    }

    @Override
    public boolean autentica(int senha) {

        return this.autenticador.autentica(senha);
    }

    @Override
    public void setSenha(int senha) {

        this.autenticador.setSenha(senha);
    }
}


