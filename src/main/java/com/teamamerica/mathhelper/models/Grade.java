package com.teamamerica.mathhelper.models;

import java.util.ArrayList;

/**
 * Created by Christina on 4/11/2015.
 */
public class Grade {


    private int grade_id;
    private int user_id;
    private int grade;

    public Grade() {


    }

    public Grade(int user_id, int grade) {
        this.grade_id = -1;
        this.user_id = user_id;
        this.grade = grade;

    }

    public Grade(int grade_id, int user_id, int grade) {
        this.grade_id = grade_id;
        this.user_id = user_id;
        this.grade = grade;
    }

    public void setGrade_id(int grade_id) {
        this.grade_id = grade_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade_id() {

        return grade_id;
    }


    public int getUser_id() {
        return user_id;
    }

    public int getGrade() {
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

    public static Grade searchForGradeByGradeId (ArrayList<Grade> grades, int grade_id) {
        Grade grade = new Grade();
        for (Grade temp : grades) {
            if (temp.getGrade_id() == grade_id) {
              return temp;
            }
        }
        return grade;
    }

    /**
     * This method searches the list of grades based on a min max grade range.  If no grades are found
     * the list is returned empty.
     *
     * @param min
     * @param max
     * @return ArrayList
     */
    public static ArrayList<Grade> searchForGradesByGradeRange(ArrayList<Grade> grades, int min, int max) {
        ArrayList<Grade> gradeRange = new ArrayList<>();

        for (Grade grade : grades) {
            if (grade.getGrade() >= min && grade.getGrade() <= max) {
                gradeRange.add(grade);
            }
        }
        return gradeRange;
    }
}
