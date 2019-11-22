
package quizapp.pojo;

public class StudentScore {

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getLanguage() {
        return language;
    }

    public double getPercentage() {
        return percentage;
    }
    private String language;
    private double percentage;
}
