package sistema;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class AlunoDAO implements IDAO<Aluno>{
    private Connection conn;
    public AlunoDAO(Connection c){
        this.conn = c;
    }
    public void insert(Aluno a) throws SQLException {
        String sql = "INSERT INTO aluno (idal,nomeal) values(2,'"+ a.getNome()+"');";
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
    
    public void delete(Aluno a) throws SQLException{
    String sql = "DELETE FROM aluno WHERE idal = 2;";
    System.out.println(sql);
         PreparedStatement ps = this.conn.prepareStatement(sql);
        ps.executeUpdate();
        ps.close();
    }
    
    /*
    public List<Aluno> listar() throws SQLException{
    String sql = "select * from aluno";
        System.out.println(sql);
        List<Aluno> aluno = new ArrayList<Aluno>();
        try{
        PreparedStatement pst = this.conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
        int idaln = rs.getInt("idal");
        String nome = rs.getString("nomeal");
        //Date data = rs.getDate("data");
        
        Aluno alunos = new Aluno();
        alunos.setNome(nome);;
        alunos.setId_aln(idaln);
        //alunos.setData(data);
        aluno.add(alunos);
        }
        pst.close();
        }catch (SQLException e){
        e.printStackTrace();
        }
        return aluno;
    }
*/
}
