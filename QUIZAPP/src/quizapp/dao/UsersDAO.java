package quizapp.dao;

import quizapp.pojo.Users;
import java.sql.SQLException;
import java.sql.Connection;
import quizapp.dbutil.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class UsersDAO {
    public static boolean checkAdmin(Users obj)throws SQLException
    {
       Connection conn=DBConnection.getConnection(); 
       PreparedStatement ps=conn.prepareStatement("select * from users where username=? and password=? and usertype='Admin'");
       ps.setString(1,obj.getUserName());
       ps.setString(2,obj.getPass());
       ResultSet rs=ps.executeQuery();
       if(rs.next())
        return true;
       else 
        return false;
    }
    public static boolean checkStudent(Users obj)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from users where username=? and password=? and usertype='Student'");
        ps.setString(1,obj.getUserName());
        ps.setString(2,obj.getPass());
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        return true;
        else return false;
    }
    public static boolean registerStudent(Users obj)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
          String qry="select * from users where username=?";
          
          PreparedStatement ps=conn.prepareStatement(qry);
          ps.setString(1,obj.getUserName());
          ResultSet rs=ps.executeQuery();
          if(rs.next())
          {
              return true;
          }
          else
          {
          ps=conn.prepareStatement("insert into Users values(?,?,'Student')");
          ps.setString(1,obj.getUserName());
          ps.setString(2,obj.getPass());
          int ans=ps.executeUpdate();
          return true;
          
          }    
          }
    public static boolean changePassword(Users obj)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Update users set password=? where username=? and usertype='Student'");
        ps.setString(1,obj.getPass());
        ps.setString(2,obj.getUserName());
        int ans=ps.executeUpdate();
        return ans!=0;       
}
}
