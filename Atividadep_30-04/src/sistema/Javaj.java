package sistema;
import java.sql.Connection;
public class Javaj {
    public static void main(String[] args) throws Exception  {
        System.out.println(JdbcUtil.getConnection());
        Connection connection = JdbcUtil.getConnection();
        
        Aluno a1 = new Aluno();
        a1.setNome("aluno1");
        AlunoDAO alunoDAO = new AlunoDAO(connection);
        //alunoDAO.insert(a1);
        
        Professor prof = new Professor();
        prof.setNomep("professor1");
        ProfessorDAO pro = new ProfessorDAO(connection);
        //pro.insert(prof);
        
         Usuario us = new Usuario();
        //us.setNomeu("Pedro");
        //us.setSenha("12345");
        UsuarioDAO user = new UsuarioDAO(connection);
        //user.insert(us);
        //user.update(us);
        //user.delete(us);
        user.listaruser();
        user.loginuser(us);
        /*
        alunoDAO.delete(a1);
        pro.delete(prof);
        
        */

       
        //System.out.println(alunoDAO.listar());
        //alunoDAO.update(a1);
        
        user.loginuser(us);
        }
    
}
