package javaj;

import java.sql.Connection;

public class Javaj {
    public static void main(String[] args) throws Exception {
        System.out.println(JdbcUtil.getConnection());
        Connection connection = JdbcUtil.getConnection();
        Aluno a1 = new Aluno();
        a1.setNome("teste");
        AlunoDAO alunoDAO = new AlunoDAO(connection);
        //alunoDAO.insert(a1);
        
        
        alunoDAO.update(a1);
        }
    
}
