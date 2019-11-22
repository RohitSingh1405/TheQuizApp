/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.pojo;

import java.util.Objects;


public class Answer {

    @Override
    public String toString() {
        return "Answer{" + "examid=" + examid + ", subject=" + subject + ", qno=" + qno + ", choosenAnswer=" + choosenAnswer + ", correctAnswer=" + correctAnswer + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Answer other = (Answer) obj;
        if (this.qno != other.qno) {
            return false;
        }
        if (!Objects.equals(this.examid, other.examid)) {
            return false;
        }
        if (!Objects.equals(this.subject, other.subject)) {
            return false;
        }
        if (!Objects.equals(this.choosenAnswer, other.choosenAnswer)) {
            return false;
        }
        if (!Objects.equals(this.correctAnswer, other.correctAnswer)) {
            return false;
        }
        return true;
    }

    public Answer(String examid, String subject, int qno, String choosenAnswer, String correctAnswer) {
        this.examid = examid;
        this.subject = subject;
        this.qno = qno;
        this.choosenAnswer = choosenAnswer;
        this.correctAnswer = correctAnswer;
    }

    public void setExamid(String examid) {
        this.examid = examid;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setQno(int qno) {
        this.qno = qno;
    }

    public void setChoosenAnswer(String choosenAnswer) {
        this.choosenAnswer = choosenAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getExamid() {
        return examid;
    }

    public String getSubject() {
        return subject;
    }

    public int getQno() {
        return qno;
    }

    public String getChoosenAnswer() {
        return choosenAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
    
    private String examid;
    private String subject;
    private int qno;
    private String choosenAnswer;
    private String correctAnswer;
}
