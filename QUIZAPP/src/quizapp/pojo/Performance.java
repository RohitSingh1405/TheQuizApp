
package quizapp.pojo;


public class Performance {

    public Performance(String userId, String examId, int right, int wrong, int unAttempted, double percentage, String language) {
        this.userId = userId;
        this.examId = examId;
        this.right = right;
        this.wrong = wrong;
        this.unAttempted = unAttempted;
        this.percentage = percentage;
        this.language = language;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public void setWrong(int wrong) {
        this.wrong = wrong;
    }

    public void setUnAttempted(int unAttempted) {
        this.unAttempted = unAttempted;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getUserId() {
        return userId;
    }

    public String getExamId() {
        return examId;
    }

    public int getRight() {
        return right;
    }

    public int getWrong() {
        return wrong;
    }

    public int getUnAttempted() {
        return unAttempted;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getLanguage() {
        return language;
    }
    
private String userId;
private String examId;
private int right;
private int wrong;
private int unAttempted;
private double percentage;
private String language;



}
