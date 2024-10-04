package conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao{
    private static final String url = "jdbc:mysql://localhost:3002/agencia_de_viagens";
    private static final String user = "root";
    private static final String password = "root";

    private static Connection conn;

    public static Connection getConexao(){
        
        try{
            if(conn == null){
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, user, password);
                return conn;
            } else{
                return conn;
            }
        } catch(SQLException e){
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            // Tratamento para a exceção ClassNotFoundException
            System.out.println("Driver MySQL não encontrado.");
            e.printStackTrace();
            return null;
        }
        
    }

}