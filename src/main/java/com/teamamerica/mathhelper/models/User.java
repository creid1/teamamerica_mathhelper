package com.teamamerica.mathhelper.models;

import java.util.ArrayList;

/**
 * Created by Christina on 4/11/2015.
 */
public class User {

    private int user_id;
    private String username;
    private String password;
    private String role;


    public User() {

    }

    public User(int user_id, String username, String password, String role) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.role = role;
    }


    public User(String username, String password, String role) {
        this.user_id = -1;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getUsername() {
        return username;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    /************************** STATIC CLASS SEARCH METHODS*************************************************************/
    /**
     * This method searches the users table by the user id and returns the User object.  If not user is found, a null
     * User is returned.
     *
     * @param user_id
     * @return User
     */
    public static User searchUsersByUser_id(ArrayList<User> users, int user_id) {

        for (User user : users) {
            if (user.getUser_id() == (user_id)) {
                return user;
            }
        }
        return null;
    }

    /**
     * This method searches for a user by the username and returns the User.  If the user name is not found in the User
     * table then a null User is returned.
     *
     * @param username
     * @return User
     */
    public static User searchForUserByUsername(ArrayList<User> users, String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }


}
