package com.teamamerica.mathhelper.configurators;

import com.teamamerica.mathhelper.db.MathHelperDBClient;
import com.teamamerica.mathhelper.models.User;

import java.util.ArrayList;

/**
 * Created by Christina on 4/19/2015.
 */
public class AdminConfigurator {

    private static MathHelperDBClient mathHelperDBClient = new MathHelperDBClient();



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

}
