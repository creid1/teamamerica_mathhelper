package com.teamamerica.mathhelper.configurators;

import com.teamamerica.mathhelper.db.MathHelperDBClient;
import com.teamamerica.mathhelper.models.Grade;
import com.teamamerica.mathhelper.models.User;

import java.util.ArrayList;

/**
 * Created by Christina on 4/19/2015.
 */
public class AdminConfigurator {

    private static MathHelperDBClient mathHelperDBClient = new MathHelperDBClient();
    private static User user = null;
    private static boolean isEditStudent;

    public static void setUserInfo(int userId){
        user = mathHelperDBClient.searchUsers_userid(userId);
    }

    public static void setIsEditStudent(boolean isEdit){
        isEditStudent = isEdit;
    }

    public static boolean getIsEditStudent(){
        return isEditStudent;
    }
    public static User getUser(){
        return user;
    }

    public static boolean updateUser(User user){
        return mathHelperDBClient.edit_user(user);
    }

    public static boolean doesUserNameExist(String username) {
        ArrayList<User> users = mathHelperDBClient.get_allUserList();
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public static String generateStudentRole(){
        return "S_" + UserInteractionsConfigurator.get_interactive_user().getUsername();
    }

    public static String generateAdminRole(){
        return "A";
    }

    public static boolean addNewUser(User user){
        return mathHelperDBClient.add_newUser(user);
    }


    public static ArrayList<User> getStudents(){
        ArrayList<User> studentNames = new ArrayList<>();
        ArrayList<User> users = mathHelperDBClient.get_allUserList();
        for(User user : users){
            if(user.getRole().endsWith("_" + UserInteractionsConfigurator.get_interactive_user().getUsername())){
                studentNames.add(user);
            }
        }

        return studentNames;

    }

    public static ArrayList<Grade> getStudentGrades(int studentId){

      return  mathHelperDBClient.searchGrades_userId(studentId);

    }

}
