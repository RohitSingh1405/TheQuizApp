
package quizapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import quizapp.dbutil.DBConnection;
import quizapp.pojo.Exam;
import quizapp.pojo.QuestionStore;
import quizapp.pojo.Questions;


public class ExamDAO {
    public static String getExamID()throws SQLException
    {
        int rowCount=0;
        Connection conn=DBConnection.getConnection();
        Statement s=conn.createStatement();
        ResultSet rs=s.executeQuery("Select count(*) from Exam ");
        if(rs.next())
            rowCount=rs.getInt(1);
            String newId=("EX-"+(rowCount+1));
            return newId;
            
    }
    public static void addExam(Exam newExam)throws SQLException
    {
       Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into exam values(?,?,?)");
        ps.setString(1,newExam.getexamId());
        ps.setString(2, newExam.getlanguage());
        ps.setInt(3, newExam.getquestions());
        ps.executeUpdate();
        
               
    }
  public static ArrayList<String> getExamIdBySubject(String subject)throws SQLException{
       String qry="Select examid from Exam where language=?";
       Connection conn=DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement(qry);
       ps.setString(1,subject);
       ResultSet rs=ps.executeQuery();
      ArrayList<String> examList=new ArrayList<>();
	while(rs.next()){
               examList.add(rs.getString(1));
           }
      return examList;
    }

   public static int getQuestionCountByExam(String examId)throws SQLException{
        String qry="select total_question from Exam where examid=?";
        Connection conn=DBConnection.getConnection();
          PreparedStatement ps=conn.prepareStatement(qry);
          ps.setString(1,examId);
          ResultSet rs=ps.executeQuery();
	    rs.next();
          int rowCount=rs.getInt(1);
          return rowCount;
        }

}
