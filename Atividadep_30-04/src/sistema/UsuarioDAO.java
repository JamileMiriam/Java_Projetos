package sistema;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO implements IDAO<Usuario>{    
    private Connection conn;
    public UsuarioDAO(Connection c){
        this.conn = c;
    }
    
    @Override
    public void insert(Usuario u) throws SQLException {
        String sql = "INSERT INTO usuario (idus,nomeuser,senha) values(1,'"+ u.getNomeu()+"','12345');";
        System.out.println(sql);
        PreparedStatement ps = this.conn.prepareStatement(sql);
        ps.executeUpdate();
        ps.close();
    }

    public void update(Usuario u) throws SQLException {
        String sql = "UPDATE usuario SET nomeuser = '"+ u.getNomeu()+"' WHERE idus = 1 ;";
        System.out.println(sql);
         PreparedStatement ps = this.conn.prepareStatement(sql);
        ps.executeUpdate();
        ps.close();
    }
    
    public void delete(Usuario u) throws SQLException{
    String sql = "DELETE FROM usuario WHERE idus = 1;";
    System.out.println(sql);
         PreparedStatement ps = this.conn.prepareStatement(sql);
        ps.executeUpdate();
        ps.close();
    }
    
    public boolean login(Usuario u){
        //recebe usuario e senha
        String situacao = "";
        String nomeuser = "usuario";
        String pass = "";
        boolean uexiste = true;
        
        //System.out.println("Digite o nome de Usuario: ");
        
        
        if(nomeuser == u.getNomeu()){
            uexiste = true;
            System.out.println("O usuario "+ nomeuser +" existe no bando .............");
        }
        else{
            uexiste = false;
            System.out.println("O usuario "+ nomeuser +" NÂO existe no bando .............");
        }
        return uexiste;
        }
    
}
