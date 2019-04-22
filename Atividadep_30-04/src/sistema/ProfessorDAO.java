package sistema;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class ProfessorDAO implements IDAO<Professor>{
    private Connection conn;
    public ProfessorDAO(Connection c){
        this.conn = c;
    }
    public void insert(Professor p) throws SQLException {
        String sql = "INSERT INTO professor (idprof,nomeprof) values(1,'"+ p.getNomep()+"');";
        System.out.println(sql);
        PreparedStatement ps = this.conn.prepareStatement(sql);
        ps.executeUpdate();
        ps.close();
    }

    public void update(Professor p) throws SQLException {
        String sql = "UPDATE professor SET nomeprof = '"+ p.getNomep()+"' WHERE idprof = 1 ;";
        System.out.println(sql);
         PreparedStatement ps = this.conn.prepareStatement(sql);
        ps.executeUpdate();
        ps.close();
    }
    
    public void delete(Professor p) throws SQLException{
    String sql = "DELETE FROM professor WHERE idprof = 1;";
    System.out.println(sql);
         PreparedStatement ps = this.conn.prepareStatement(sql);
        ps.executeUpdate();
        ps.close();
    }
  

}
