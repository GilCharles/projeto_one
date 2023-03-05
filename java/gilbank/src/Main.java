public class Main {

    public static void main(String[] args) {

/*        Gerente g1 = new Gerente();

        g1.setNome("Lord Mike");
        g1.setCpf("123456789-0");
        g1.setSalario(5000.0);

        g1.setSenha("2222");
        boolean autenticou = g1.autentica("2222");

        System.out.println(autenticou);

        System.out.println(g1.getBonificacao());

*******************************************************************************************

        Funcionario g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.0);

        Funcionario f = new Funcionario();
        f.setSalario(2000.0);

        Funcionario ev = new EditorVideo();
        ev.setSalario(2500.0);


        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(f);
        controle.registra(ev);

        System.out.println(controle.getSoma());

*/

        Gerente g = new Gerente();
        g.setSenha("2222");

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
    }
}
