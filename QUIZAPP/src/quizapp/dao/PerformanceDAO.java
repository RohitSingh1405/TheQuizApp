
package quizapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import quizapp.dbutil.DBConnection;
import quizapp.pojo.Performance;
import quizapp.pojo.StudentScore;


public class PerformanceDAO {
    public static ArrayList<String> getAllStudentId()throws SQLException
    {
        ArrayList<String> studentIdList=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select distinct userid from performance");
        
        while(rs.next())
        {
            String id=rs.getString(1);
            studentIdList.add(id);
            
        }
        return studentIdList;
        
    }
   public static ArrayList<String> getAllExamId(String studentId)throws SQLException
    {
       String qry="select distinct(examid) from performance where userid=? ";
       ArrayList<String> examIdList=new ArrayList<>();
       Connection conn=DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement(qry);
       ps.setString(1, studentId);
       ResultSet rs=ps.executeQuery();
        while(rs.next()){
               String id=rs.getString(1);
               examIdList.add(id);
           }
    return examIdList;                      
   }

public static StudentScore getScore(String studentId,String examId)throws SQLException
{
Connection conn=DBConnection.getConnection();
PreparedStatement ps=conn.prepareStatement("select langugae,per from performance where userid=? and examid=?");
ps.setString(1,studentId);
ps.setString(2,examId);
ResultSet rs=ps.executeQuery();
rs.next();
StudentScore scoreObj=new StudentScore();
scoreObj.setLanguage(rs.getString(1));

scoreObj.setPercentage(rs.getDouble(2));
return scoreObj;
}
public static ArrayList<Performance> getAllData()throws SQLException{
       String qry="Select * from Performance";
       ArrayList<Performance> performanceList=new ArrayList<Performance>();
       Connection conn=DBConnection.getConnection();
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery(qry);
       while(rs.next()){
               String userId=rs.getString("userid");
               String examId=rs.getString("examid");
               String language=rs.getString("langugae");
               int right=rs.getInt("right");
               int wrong=rs.getInt("wrong");
               int unattempted=rs.getInt("unattempted");
               double per=rs.getDouble("per");
               Performance p=new Performance(userId,examId,right,wrong,unattempted,per,language);
               performanceList.add(p);
          }
       return performanceList;

}
public static void addPerformance(Performance obj)throws SQLException
{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("insert into performance values(?,?,?,?,?,?,?)");
    ps.setString(1,obj.getUserId());
    ps.setString(2,obj.getExamId());
    ps.setInt(3,obj.getRight());
    ps.setInt(4,obj.getWrong());
    ps.setInt(5,obj.getUnAttempted());
    ps.setDouble(6,obj.getPercentage());
    ps.setString(7,obj.getLanguage());
    int ans=ps.executeUpdate();
    
}
        }