
package quizapp.pojo;


public class Questions {

    @Override
    public String toString() {
        return "Questions{" + "examID=" + examID + ", qno=" + qno + ", language=" + language + ", answer1=" + answer1 + ", answer2=" + answer2 + ", answer3=" + answer3 + ", answer4=" + answer4 + ", correctAnswer=" + correctAnswer + '}';
    }
    private String examID;
    private int qno;
    private String question;

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }
    private String language;
    private String answer1,answer2,answer3,answer4;

    public void setExamID(String examID) {
        this.examID = examID;
    }

    public void setQno(int qno) {
        this.qno = qno;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getExamID() {
        return examID;
    }

    public int getQno() {
        return qno;
    }

    public String getLanguage() {
        return language;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
    private String correctAnswer;
    public Questions(String examID,String language,int qno,String question,String answer1,String answer2,String answer3,String answer4,String correctAnswer)
    {
    this.examID=examID;
this.language=language;
this.qno=qno;
this.question=question;
this.answer1=answer1;
this.answer2=answer2;
this.answer3=answer3;
this.answer4=answer4;
this.correctAnswer=correctAnswer;

    }
    
    public boolean equals(Object obj)
    {
      Questions other=(Questions) obj;
     if(this.examID.equals(other.examID)==false)
         return false;
     if(this.qno!=other.qno)
         return false;
      if(this.answer1.equals(other.answer1)==false)
         return false;
  if(this.answer2.equals(other.answer2)==false)
         return false;
    if(this.answer3.equals(other.answer3)==false)
         return false;
 if(this.answer4.equals(other.answer4)==false)
         return false;
    if(this.correctAnswer.equals(other.correctAnswer)==false)
         return false;
    if(this.language.equals(other.language)==false)
         return false;
    else return true;
    }
    
}
