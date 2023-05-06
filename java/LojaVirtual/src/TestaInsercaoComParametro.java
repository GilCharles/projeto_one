import java.sql.*;

public class TestaInsercaoComParametro {

    public static void main(String[] args) throws SQLException {


        ConnectionFactory factory = new ConnectionFactory();
        try (Connection conexao = factory.conectar()) {
            conexao.setAutoCommit(false);

            try (
                    PreparedStatement stm =
                            conexao.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)",
                                    Statement.RETURN_GENERATED_KEYS)) {

                adicionarVariavel("SmartTV", "45 polegadas", stm);
                adicionarVariavel("Celular", "Samsung", stm);

                conexao.commit();

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("ROUBACK EXECUTADO");
                conexao.rollback();
            }
        }

    }

    private static void adicionarVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
        stm.setString(1 , nome);
        stm.setString(2, descricao);

        stm.execute();

        try (ResultSet rst = stm.getGeneratedKeys()) {
            while (rst.next()) {
                Integer id = rst.getInt(1);
                System.out.println("Id = " + id);
            }
        }
    }
}
