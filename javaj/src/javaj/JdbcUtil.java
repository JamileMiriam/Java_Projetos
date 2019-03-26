package javaj;
import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil {
    private static Connection conn;
   // private static String strConn = "C:\\Users\\Aluno\\bancod.sql";
    private static String strConn = "jdbc:mysql://127.0.0.1:3306/bancod";
       public static Connection getConnection()throws Exception{
       //criar conexao com banco de dados
       
       //funciona quando o horario do hardware estiver correto
       //Class.forName("com.mysql.cj.jdbc.Driver");
       
       //nao é necessario que o horario esteja certo
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
