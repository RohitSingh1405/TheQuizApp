package quizapp.pojo;


public class Users {

    public Users(String userName, String pass, String userType) {
        this.userName = userName;
        this.pass = pass;
        this.userType = userType;
    }

    public Users() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    private String userName;
    private String pass;
    private String userType;
    
}
