import dao.ProdutoDao;
import modelo.Produto;

import java.sql.*;
import java.util.List;

public class TestaInsercaoComProduto {

    public static void main(String[] args) throws SQLException {

        Produto comoda = new Produto("Cômoda" , "Cômoda vertical");

        try(Connection connection = new ConnectionFactory().conectar()){

            ProdutoDao produtoDao = new ProdutoDao(connection);
            produtoDao.salvar(comoda);
            List<Produto> listaDeProdutos = produtoDao.listar();
            listaDeProdutos.stream().forEach(lp -> System.out.println(lp));

        }
    }
}
