package dao;

import model.MOD2;
import util.JDBCutil;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MOD2Dao {
    static Connection conexao = JDBCutil.criarConexao();
    private JDBCutil Conexao;


    public static void salvarMOD2(MOD2 MOD2) throws SQLException {
        String sql = "INSERT INTO MOD2 (marca, valor, cor) VALUES (?,?,?)";


        try {
            Connection conexao = JDBCutil.criarConexao();
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, MOD2.getMarca());
            ps.setDouble(2, MOD2.getValor());
            ps.setString(3, MOD2.getCor());


            ps.execute();
            System.out.println("Salvo!");


        } catch (SQLException e) {
            System.out.println("O metodo insert não pode ser execultado");
        }
    }


    public static MOD2 pesquisar(Long id) throws SQLException {

        String sql = "SELECT * FROM MOD2 WHERE id=?";

        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setLong(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();

        try {
            if (resultSet.next()) {
                MOD2 MOD2pesquisado = new MOD2();
                MOD2pesquisado.setId(resultSet.getLong("id"));
                MOD2pesquisado.setMarca(resultSet.getString("marca"));
                MOD2pesquisado.setValor(resultSet.getDouble("valor"));
                MOD2pesquisado.setCor(resultSet.getString("cor"));

                preparedStatement.execute();
                System.out.println(MOD2pesquisado);
                conexao.close();
                return MOD2pesquisado;

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void deletemod2(long id) throws SQLException {
        String sql = "delete from MOD2 where id =?";

        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            preparedStatement.execute();
            System.out.println("Deletado!");


        } catch (SQLException e) {
            return;
        }
    }


    public void update(MOD2 MOD2) throws SQLException {
        String sql = "update MOD2 SET (marca, valor, cor) = (?,?,?) where id =?";


        try {
            conexao = JDBCutil.criarConexao();
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);


            preparedStatement.setString(1, MOD2.getMarca());
            preparedStatement.setDouble(2, MOD2.getValor());
            preparedStatement.setString(3, MOD2.getCor());
            preparedStatement.setLong(4, MOD2.getId());

            preparedStatement.executeLargeUpdate();
            System.out.println("Update!");
            conexao.close();


        } catch (SQLException e) {
            return;

        }
    }

    public List<MOD2> listartodos() throws SQLException {
        String sql = "select * from mod2";
        List<MOD2> ListaRetorno = new ArrayList<MOD2>();

        try (Connection conexao = Conexao.criarConexao();
             PreparedStatement ps = conexao.prepareStatement(sql);) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                MOD2 novo = new MOD2();
                novo.setId(rs.getLong("id"));
                novo.setMarca(rs.getString("marca"));
                novo.setValor(rs.getDouble("valor"));
                novo.setCor(rs.getString("cor"));


                System.out.println(novo);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
            return null;
        }
    }




