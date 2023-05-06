import java.sql.*;

public class TestaListagem {

    public static void main(String[] args) throws SQLException {

        ConnectionFactory criaConexao = new ConnectionFactory();
        Connection connection = criaConexao.conectar();

        PreparedStatement stm = connection.prepareStatement("SELECT ID, NOME, DESCRICAO FROM PRODUTO");

        // Boolean resultado = stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO"); // se retornar algo é pq é true e
        // retorna uma lista

        stm.execute();
        ResultSet resultado = stm.getResultSet();

        while (resultado.next()) {
            Integer id = resultado.getInt("ID");
            System.out.println(id);
            String nome = resultado.getNString("NOME");
            System.out.println(nome);
            String descricao = resultado.getNString("descricao");
            System.out.println(descricao);

        }

        connection.close();
    }
}
