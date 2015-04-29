/**
 * Name: Christina Reid
 * Date Produced: April 29,2015
 * Purpose: The purpose of this software is to help children learn math.
 */

package com.teamamerica.mathhelper.configurators;

import com.teamamerica.mathhelper.db.MathHelperDBClient;
import com.teamamerica.mathhelper.models.Grade;
import com.teamamerica.mathhelper.models.User;

import java.util.ArrayList;

/**
 * The Admin Configurator class has static methods that are used to set the user's selections in the software.
 */
public class AdminConfigurator {

    private static MathHelperDBClient mathHelperDBClient = new MathHelperDBClient();
    private static User user = null;
    private static boolean isEditStudent;
    private static boolean isEditAdmin;

    /*******************************SETTERS FOR THE STATIC FIELDS**************************************/
    public static void setUserInfo(int userId){
        user = mathHelperDBClient.searchUsers_userid(userId);
    }

    public static void setIsEditStudent(boolean isEdit){
        isEditStudent = isEdit;
    }

    public static void setIsEditAdmin(boolean isEdit){
        isEditAdmin = isEdit;
    }

    /*******************************GETTERS FOR THE STATIC FIELDS**************************************/

    public static boolean getIsEditAdmin(){
        return isEditAdmin;
    }

    public static boolean getIsEditStudent(){
        return isEditStudent;
    }

    public static User getMathHelperStudent(){
        return user;
    }

    /**
     * This method updates the user the database
     * @param user
     * @return boolean
     */
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

    /**
     * This method generates the student role for the User
     * @return String
     */
    public static String generateStudentRole(){
        return "S_" + UserInteractionsConfigurator.get_interactive_user().getUsername();
    }

    /**
     * This method generates the admin role for the User
     * @return String
     */
    public static String generateAdminRole(){
        return "A";
    }

    /**
     * This method adds a new user to the database
     * @param user
     * @return String
     */
    public static boolean addNewUser(User user){
        return mathHelperDBClient.add_newUser(user);
    }


    /**
     * This method returns a list of students
     * @return ArrayList
     */
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

    /**
     * This method get the students' grades by the student id
     * @param studentId
     * @return ArrayList
     */
    public static ArrayList<Grade> getStudentGrades(int studentId){

      return  mathHelperDBClient.searchGrades_userId(studentId);

    }

    /**
     * This method deletes a user from the database and the corresponding grades
     * @param user_id
     * @return boolean
     */
    public static boolean removeMathHelperUser(int user_id){
        return mathHelperDBClient.remove_mathhelper_user_grades(user_id);
    }


}
