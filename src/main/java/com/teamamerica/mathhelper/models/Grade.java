package com.teamamerica.mathhelper.models;

import java.util.ArrayList;

/**
 * Created by Christina on 4/11/2015.
 */
public class Grade {


    private int grade_id;
    private int user_id;
    private String grade;
    private String category;
    private boolean receive_reward;

    public Grade() {


    }

    public Grade(int user_id, String grade) {
        this.grade_id = -1;
        this.user_id = user_id;
        this.grade = grade;

    }

    public Grade(int grade_id, int user_id, String grade, String category, boolean hasReward) {
        this.grade_id = grade_id;
        this.user_id = user_id;
        this.grade = grade;
        this.category = category;
        this.receive_reward = hasReward;
    }

    //********************************SETTERS FOR THE DATA STRUCTURE*************************************//

    public void setGrade_id(int grade_id) {
        this.grade_id = grade_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setCategory(String category){this.category =category; }

    public void setReceive_reward(boolean receive_reward) {
        this.receive_reward = receive_reward;
    }

    //*******************************GETTERS FOR THE DATA STRUCTURE**********************************//


    public boolean hasReceive_reward() {
        return receive_reward;
    }


    public int getGrade_id() {

        return grade_id;
    }

    public String getCategory(){
        return category;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getGrade() {
        return grade;
    }

    /********************STATIC CLASS SEARCH METHODS*************************************************/
    /**
     * This function searches the ArrayList of Grades and returns all the grades for the specified user id. If there
     * are no grade results then an empty list is returned
     *
     * @param grades,user_id
     * @return ArrayList
     */
    public static ArrayList<Grade> searchForGradeByUserId(ArrayList<Grade> grades, int user_id) {
        ArrayList<Grade> userGrades = new ArrayList<>();
        for (Grade grade : grades) {
            if (grade.getUser_id() == user_id) {
                userGrades.add(grade);
            }
        }
        return userGrades;
    }

    public static Grade searchForGradeByGradeId(ArrayList<Grade> grades, int grade_id) {
        Grade grade = new Grade();
        for (Grade temp : grades) {
            if (temp.getGrade_id() == grade_id) {
                return temp;
            }
        }
        return grade;
    }

    public static int searchGradesByUser_idForRewards(ArrayList<Grade> grades, int user_id) {
        int rewards = 0;
        for (Grade grade : grades) {
            if (grade.getUser_id() == user_id) {
                if (grade.hasReceive_reward()) {
                    rewards++;
                }
            }
        }
        return rewards;
    }
}
