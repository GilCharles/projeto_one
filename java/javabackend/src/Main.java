public class Main {
    public static void main(String[] args) {

        /* Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;

        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("A segunda conta tem " + segundaConta.saldo);
        System.out.println(segundaConta.titular);


// *********************************************************************************************************

        Conta contaDoPaulo = new Conta();

        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);

        System.out.println(contaDoPaulo.saldo);

        boolean conseguiuRetirar = contaDoPaulo.saca(20);
        // Esse boolean é opcional

        System.out.println(contaDoPaulo.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        if(contaDaMarcela.transfere(300,contaDoPaulo)){
            System.out.println("Transferência com sucesso");
        } else {
            System.out.println("Faltou dinheiro");
        }
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoPaulo.saldo);
    }



// *****************************************************************************************************************


        Cliente paulo = new Cliente();
        paulo.setNome("Paulo Silveira");
        paulo.setCpf("123.456.789-00");
        paulo.setProfissao("programador");

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(50);

        contaDoPaulo.setTitular(paulo);

        System.out.println(paulo.getNome());

        System.out.println(contaDoPaulo.getSaldo());

        contaDoPaulo.setNumero(713);
        System.out.println(contaDoPaulo.getNumero());

        contaDoPaulo.getTitular().setNome("Paulo Silveira Silva");

        System.out.println(contaDoPaulo.getTitular().getNome());

*******************************************************************************************************/


        Conta conta = new Conta(177, 23445);

    }


}