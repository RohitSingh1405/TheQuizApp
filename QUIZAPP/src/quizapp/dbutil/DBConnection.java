package quizapp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnection {
    private static Connection conn;
    static
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-E9A7B30:1521/xe","project","java");
          //  JOptionPane.showMessageDialog(null,"Connected successfully to the database","Success",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,"Cannot load the driver : "+ex,"Error",JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Error connecting to the database : "+ex,"Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    public static Connection getConnection()
    {
        return conn;
    }
    public static void closeConnection()
    {
        if(conn!=null)
            try
            {
            conn.close();
            //JOptionPane.showMessageDialog(null,"Connection closed successfully","Success!",JOptionPane.INFORMATION_MESSAGE);
            }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Error closing the connection","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
}