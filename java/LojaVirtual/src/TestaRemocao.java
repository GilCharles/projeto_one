import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {

    public static void main(String[] args) throws SQLException {

        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.conectar();

        PreparedStatement stm = connection.prepareStatement("DELETE FROM PRODUTO WHERE ID > ?");

        stm.setInt(1, 2);
        stm.execute();

        Integer linhaModificadas = stm.getUpdateCount();

        System.out.println(linhaModificadas);
    }
}
