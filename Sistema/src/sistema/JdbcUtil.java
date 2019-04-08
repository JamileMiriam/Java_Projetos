package sistema;
import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil {
    private static Connection conn;
    private static String strConn = "jdbc:mysql://127.0.0.1:3306/bancod";
       public static Connection getConnection()throws Exception{
       //criar conexao com banco de dados
       //Class.forName("com.mysql.cj.jdbc.Driver");
       Class.forName("com.mysql.jdbc.Driver");
       
       if(JdbcUtil.conn != null){
       return JdbcUtil.conn;              
       }
       
       else{
       JdbcUtil.conn = DriverManager.getConnection(strConn,"root","");
       return JdbcUtil.conn;              
       }

       } 
}
