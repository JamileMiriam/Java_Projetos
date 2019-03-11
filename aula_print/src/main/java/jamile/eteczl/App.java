package jamile.eteczl;

import java.awt.Color;
import java.awt.Graphics;
import java.sql.Connection;
import javax.swing.JFrame;

public class App extends JFrame
{     
   public static void main( String[] args ) throws Exception  
    {
      //  new App();
       System.out.println(JdbcUtil.getconnection());
    }
   
}