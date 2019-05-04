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
        String sql = "INSERT INTO usuario (idus,nomeuser,senha) values(1,'"+ u.getNomeu()+"','"+ u.getSenha()+"');";
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
    
    
 public List<Usuario> listaruser() throws SQLException {
        String sql = "select * from usuario";
        System.out.println(sql);
        List<Usuario> usuarios = new ArrayList<Usuario>();
        try {
            PreparedStatement pst = this.conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String senh = rs.getString("senha");
                String nome = rs.getString("nomeuser");
                //Date data = rs.getDate("data");

                Usuario usuario = new Usuario();
                usuario.setSenha(senh);;
                usuario.setNomeu(nome);
                //alunos.setData(data);
                usuarios.add(usuario);
            }
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }
    
    public boolean loginuser(Usuario u) throws SQLException{
        //recebe usuario e senha
        String sql = "select * from usuario";
        PreparedStatement pst = this.conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
        String situacao = "";
        String nuser = "Pedro";
        String pass = "12345";
        boolean uexiste = true;
        
        //System.out.println("Digite o nome de Usuario: ");     
        //if(nomeuser == u.getNomeu()){
        if((nuser.equals(rs.getString("nomeuser"))) && (pass.equals(rs.getString("senha")))){
            uexiste = true;
            System.out.println("O usuario "+ nuser +" existe no banco ............. ");
        }
        else{
            uexiste = false;
            System.out.println("Usuario "+nuser+" ou senha "+pass+" inválidos....................");
        }
        return uexiste;
        }

    
}
