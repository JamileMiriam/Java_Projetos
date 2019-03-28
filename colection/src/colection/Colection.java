package colection;
import java.util.ArrayList;
import java.util.List;
public class Colection {
    public static void main(String[] args) {
    List<Aluno> alunos = new ArrayList <Aluno>();
    Aluno a1 = new Aluno("Hugo");
    Aluno a2 = new Aluno("Zezinho");
    Aluno a3 = new Aluno("Nometeste");
    alunos.add(a1);
    alunos.add(a2);
    alunos.add(a3);
   
    Professor p1 = new Professor ("");
    //alunos.add(p1);
    
    //insert(a1);
    for(Aluno al: alunos){
    System.out.println(al.getNome());
    }
     
    

}}
