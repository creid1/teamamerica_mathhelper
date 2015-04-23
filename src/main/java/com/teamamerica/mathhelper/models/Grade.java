package com.teamamerica.mathhelper.models;

import java.util.ArrayList;

/**
 * Created by Christina on 4/11/2015.
 */
public class Grade {


    private int grade_id;
    private int user_id;

    private String grade_level;
    private String category;
    private String difficulty_level;
    private String grade;
    private int correct;
    private int total;


    public Grade() {


    }

    public Grade(int user_id, String grade) {
        this.grade_id = -1;
        this.user_id = user_id;
        this.grade = grade;

    }

    public Grade(int grade_id, int user_id, String grade_level, String category, String difficulty_level,
                 String grade, int correct, int total) {

        this.grade_id = grade_id;
        this.user_id = user_id;
        this.grade_level = grade_level;
        this.category = category;
        this.difficulty_level = difficulty_level;
        this.grade = grade;
        this.correct = correct;
        this.total = total;
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

    public void setCategory(String category) {
        this.category = category;
    }


    public void setGrade_level(String grade_level) {
        this.grade_level = grade_level;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setDifficulty_level(String difficulty_level) {
        this.difficulty_level = difficulty_level;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

    //*******************************GETTERS FOR THE DATA STRUCTURE**********************************//



    public int getGrade_id() {

        return grade_id;
    }

    public String getCategory() {
        return category;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getGrade() {
        return grade;
    }

    public String getGrade_level() {
        return grade_level;
    }

    public String getDifficulty_level() {
        return difficulty_level;
    }

    public int getCorrect() {
        return correct;
    }

    public int getTotal() {
        return total;
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
}
