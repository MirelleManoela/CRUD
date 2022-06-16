package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCutil {
    public static Connection criarConexao(){


        String user = "postgres";
        String password = "123";
        String url = "jdbc:postgresql://localhost:5432/postgres";

        Connection conexao = null;

        try {

            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection(url, user, password);
            System.out.println("O banco de dados está ONLINE");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("O banco está OFFLINE");
        }

        return conexao;
    }
}


