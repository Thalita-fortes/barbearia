package dal;

import java.sql.*;

public class ModuloConexao {

    //metodo responsavel por estabelecer a conexão com o banco
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // a linha abaixo chama o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        // Armazenando informações referentes ao banco
        String url = "jdbc:mysql://127.0.0.1:3306/bdinfox";
        String user = "root";
        String password = "140615";
        //Estabelecendo a conexao com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (Exception e) {
            //a linha abaixo serve de apoio para descobrir o erro
            //System.out.println(e);
            return null;
        }
    }
}
