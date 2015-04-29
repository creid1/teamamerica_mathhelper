/**
 * Name: Christina Reid
 * Date Produced: April 29,2015
 * Purpose: The purpose of this software is to help children learn math.
 */
package com.teamamerica.mathhelper.models;

import java.util.ArrayList;

/**
 * Created by Christina on 4/11/2015.
 */


/**
 * This is the User class which is a data structure that is used to store information about a User
 */
public class User {

    private int user_id;
    private String username;
    private String password;
    private String first_name;
    private String last_name;
    private String security_question;
    private String security_answer;
    private String role;


    public User() {

    }

    public User(int user_id, String username, String password,String first_name, String last_name,
                String security_question, String security_answer, String role) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.security_question = security_question;
        this.security_answer = security_answer;
        this.role = role;
    }


    public User(String username, String password,String first_name, String last_name, String security_question,
               String security_answer, String role) {
        this.user_id = -1;
        this.username = username;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.security_question = security_question;
        this.security_answer = security_answer;
        this.role = role;
    }

    /******************SETTERS FOR THE FIELDS**********************************************/
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

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setSecurity_question(String security_question) {
        this.security_question = security_question;
    }

    public void setSecurity_answer(String security_answer) {
        this.security_answer = security_answer;
    }

    /*********************************GETTERS FOR THE DATA STRUCTURE*****************************************/

    public String getUsername() {
        return username;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getPassword() {
        return password;
    }


    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getSecurity_question() {
        return security_question;
    }

    public String getSecurity_answer() {
        return security_answer;
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
