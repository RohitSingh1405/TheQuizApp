
package quizapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import quizapp.dbutil.DBConnection;
import quizapp.pojo.QuestionStore;
import quizapp.pojo.Questions;


public class QuestionDAO {
public static void addQuestion(QuestionStore qstore)throws SQLException
    {
        String qry="Insert into Questions values(?,?,?,?,?,?,?,?,?)";
        ArrayList <Questions> questionList=qstore.getAllQuestions();
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        for(Questions obj:questionList)
        {
            ps.setString(1,obj.getExamID());
            ps.setInt(2,obj.getQno());
            ps.setString(3,obj.getQuestion());
            ps.setString(4,obj.getAnswer1());
            ps.setString(5,obj.getAnswer2());
            ps.setString(6,obj.getAnswer3());
            ps.setString(7,obj.getAnswer4());
            ps.setString(8,obj.getCorrectAnswer());
            ps.setString(9,obj.getLanguage());
            ps.executeUpdate();
        }
    }    
public static ArrayList<Questions> getQuestionByExamId(String examid)throws SQLException
{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("select * from Questions where examid=? order by qno");
    ps.setString(1,examid);
    ArrayList<Questions> questionList=new ArrayList<>();
    ResultSet rs=ps.executeQuery();
    while(rs.next())
    {
        int qno=rs.getInt(2);
        String question=rs.getString(3);
        String option1=rs.getString(4);
        String option2=rs.getString(5);
        String option3=rs.getString(6);
        String option4=rs.getString(7);
        String correctAnswer=rs.getString(8);
        String language=rs.getString((9));
    Questions obj=new Questions(examid,language,qno,question,option1,option2,option3,option4,correctAnswer);
    questionList.add(obj);
    }
   return questionList;
}
public static int updateQuestions(QuestionStore  qstore)throws SQLException
{int ans=0;
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("update questions set question=?,answer1=?,answer2=?,answer3=?,answer4=?,correct_answer=? where qno=? and examid=?");
   ArrayList<Questions> questionList=qstore.getAllQuestions();
    for(Questions q:questionList)
    {
        ps.setString(1,q.getQuestion());
        ps.setString(2,q.getAnswer1());
        ps.setString(3,q.getAnswer2());
        ps.setString(4,q.getAnswer3()); 
    ps.setString(5,q.getAnswer4());
    ps.setString(6,q.getCorrectAnswer());
    ps.setInt(7,q.getQno());
    ps.setString(8,q.getExamID());
         ans=ps.executeUpdate();
        
    }
    return ans;
}

}
