package sistema;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class UsuarioDAO {
    private Connection conn;
    public UsuarioDAO(Connection c){
        this.conn = c;
    }
    public void insert(Usuario u) throws SQLException {
        String sql = "INSERT INTO usuario (idus,nomeuser) values(1,'"+ u.getNomeu()+"');";
        System.out.println(sql);
        PreparedStatement ps = this.conn.prepareStatement(sql);
        ps.executeUpdate();
        ps.close();
    }

    public void update(Usuario u) throws SQLException {
        String sql = "UPDATE usuario SET nomeuser = '"+ u.getNomeu()+"' WHERE idal = 1 ;";
        System.out.println(sql);
         PreparedStatement ps = this.conn.prepareStatement(sql);
        ps.executeUpdate();
        ps.close();
    }
    
    

}
