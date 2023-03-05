public class SistemaInterno {

    private String senha = "2222";

    public void autentica ( FuncionarioAutenticavel fa) {

        boolean autenticou = fa.autentica(this.senha);

        if(autenticou) {
            System.out.println("pode entrar no sistema");

        } else {
            System.out.println("Senha incorreta");
        }
    }
}
