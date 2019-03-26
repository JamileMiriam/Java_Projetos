package javaj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoDAO {
    
    private Connection conn;
    
    public AlunoDAO(Connection c){
        this.conn = c;
    
    }
    
    public void insert(Aluno a) throws SQLException {
        String sql = "INSERT INTO aluno (idal,nomeal) values(2,'"+ a.getNome()+"' );";
        System.out.println(sql);
        PreparedStatement ps = this.conn.prepareStatement(sql);
        ps.executeUpdate();
        ps.close();
    }

    public void update(Aluno a) throws SQLException {
        String sql = "UPDATE aluno SET nomeal = '"+ a.getNome()+"' WHERE idal = 1 ;";
        System.out.println(sql);
         PreparedStatement ps = this.conn.prepareStatement(sql);
        ps.executeUpdate();
        ps.close();
    }

}
