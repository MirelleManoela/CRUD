import dao.MOD2Dao;
import model.MOD2;
import util.JDBCutil;

import java.sql.Connection;
import java.sql.SQLException;


public class Principal {

    public static void main(String[] args) throws SQLException {
        Connection conexao = JDBCutil.criarConexao();

        MOD2 MOD1 = new MOD2();
        MOD1.setCor("Rosa");
       MOD1.setMarca("Eudora");
       MOD1.setValor(23.50);
       MOD1.setId(11L);



     //   MOD2Dao MOD2DAO = new MOD2Dao();
      //  MOD2DAO.salvarMOD2(MOD1);

     //   MOD2Dao MOD2DAO = new MOD2Dao();
      //  MOD2Dao.pesquisar(15L);

      // MOD2Dao MOD2DAO = new MOD2Dao();
       // MOD2DAO.deletemod2(14);

     //  MOD2Dao MOD2DAO = new MOD2Dao();
     //   MOD2DAO.update(MOD1);

      //  MOD2Dao MOD2DAO = new MOD2Dao();
      //  MOD2DAO.listartodos();


    }
}

