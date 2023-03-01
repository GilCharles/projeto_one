public class ControleBonificacao {

    // Atributos

    private double soma;


    // Métodos

    public void registra(Funcionario f) {


        double boni = f.getBonificacao();
        this.soma = this.soma + boni;

    }

    public double getSoma() {

        return soma;
    }
}
