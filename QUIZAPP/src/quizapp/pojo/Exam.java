/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.pojo;

/**
 *
 * @author Admin
 */
public class Exam {

    public Exam(String examId, String language, int questions) {
        this.examId = examId;
        this.language = language;
        this.questions = questions;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public void setlanguage(String language) {
        this.language = language;
    }

    public void setquestions(int Questions) {
        this.questions = questions;
    }

    public String getexamId() {
        return examId;
    }

    public String getlanguage() {
        return language;
    }

    public int getquestions() {
        return questions;
    }

String examId;
String language;
int questions;

   
}
