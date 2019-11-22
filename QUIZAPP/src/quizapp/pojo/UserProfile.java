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
public class UserProfile {

    public static void setUserName(String userName) {
        UserProfile.userName = userName;
    }

    public static void setUserType(String userType) {
        UserProfile.userType = userType;
    }

    public static String getUserName() {
        return userName;
    }

    public static String getUserType() {
        return userType;
    }
private static String userName="";
private static String userType="";
}
