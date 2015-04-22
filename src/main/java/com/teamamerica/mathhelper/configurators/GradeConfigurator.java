package com.teamamerica.mathhelper.configurators;

import com.teamamerica.mathhelper.db.MathHelperDBClient;
import com.teamamerica.mathhelper.models.Grade;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Christina on 4/17/2015.
 */
public class GradeConfigurator {

    private static String letterGrade;
    private static boolean has_receivedReward;
    private static ArrayList<String> gradeResultLetter;
    private static double correct, total;

    private static MathHelperDBClient mathHelperDBClient = new MathHelperDBClient();

    public static void calculateGradeAndSubmit(double testCorrect, double testTotal) {

        correct = testCorrect;
        total = testTotal;
        System.out.println("FINAL CORRECT: " + correct);
        System.out.println("FINAL MAX: " + total);
        double temp = correct / total;
        System.out.println("SCORE TEMP: " + temp);
        int score = (int) (temp * 100);

        if (score == 100) {
            letterGrade = "A+";
            has_receivedReward = true;
        }
        if (score >= 95 & score < 100) {
            letterGrade = "A";
            has_receivedReward = true;
        }
        if (score >= 90 & score < 95) {
            letterGrade = "A-";
            has_receivedReward = true;
        }
        if (score >= 88 & score < 90) {
            letterGrade = "B+";
            has_receivedReward = true;
        }
        if (score >= 85 & score < 87) {
            letterGrade = "B";
            has_receivedReward = true;
        }
        if (score >= 80 & score < 85) {
            letterGrade = "B-";
            has_receivedReward = true;
        }


        if (score >= 78 & score < 80) {
            letterGrade = "C+";
            has_receivedReward = true;
        }
        if (score >= 75 & score < 77) {
            letterGrade = "C";
            has_receivedReward = true;
        }
        if (score >= 70 & score < 75) {
            letterGrade = "C-";
            has_receivedReward = true;
        }


        if (score >= 68 & score < 70) {
            letterGrade = "D+";
            has_receivedReward = true;
        }
        if (score >= 65 & score < 67) {
            letterGrade = "D";
            has_receivedReward = true;
        }
        if (score >= 60 & score < 65) {
            letterGrade = "D-";
            has_receivedReward = true;
        }
        if (UserInteractionsConfigurator.get_category_type_enum() != null) {

            Grade grade = new Grade(-1, UserInteractionsConfigurator.get_interactive_user().getUser_id(), letterGrade,
                    UserInteractionsConfigurator.get_category_type_enum().toString(), has_receivedReward);
            mathHelperDBClient.add_newGrade(grade);
            System.out.println("Grade submitted:  " + grade.getGrade());
            UserInteractionsConfigurator.set_interactive_grade(new Grade(mathHelperDBClient.getLastGradeIdAdded(),
                    UserInteractionsConfigurator.get_interactive_user().getUser_id(), letterGrade,
                    UserInteractionsConfigurator.get_category_type_enum().toString(), has_receivedReward));
        } else {
            Grade grade = new Grade(-1, UserInteractionsConfigurator.get_interactive_user().getUser_id(), letterGrade,
                    "", has_receivedReward);
            mathHelperDBClient.add_newGrade(grade);
            System.out.println("Grade submitted:  " + grade.getGrade());
            UserInteractionsConfigurator.set_interactive_grade(new Grade(mathHelperDBClient.getLastGradeIdAdded(),
                    UserInteractionsConfigurator.get_interactive_user().getUser_id(), letterGrade,
                    "", has_receivedReward));
        }

        setGradeResultLetter();

    }


    public static Grade findGradeByGradeId(int gradeId) {
        return mathHelperDBClient.searchGrades_gradeId(gradeId);

    }

    public static void setGradeResultLetter() {
        gradeResultLetter = new ArrayList<>();
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm");
        Date date = new Date();
        gradeResultLetter.add("Math Helper Test Results \n");
        gradeResultLetter.add("Today's Date : " + dateFormat.format(date) + "\n" + "\n");
        gradeResultLetter.add("MathHelper Name : " + UserInteractionsConfigurator.get_interactive_user().getFirst_name() + " " +
                UserInteractionsConfigurator.get_interactive_user().getLast_name() + "\n");
        gradeResultLetter.add("Grade Level: " + UserInteractionsConfigurator.get_interactive_grade_level_str() + "\n");
        String categoryType = "Category Type : ";
        if (UserInteractionsConfigurator.get_category_type_enum() == null) {
            gradeResultLetter.add(categoryType + "N/A \n");
        } else {
            gradeResultLetter.add(categoryType + UserInteractionsConfigurator.get_category_type_str() + "\n");
        }
        gradeResultLetter.add("Difficulty Level : " + UserInteractionsConfigurator.get_difficulty_level_str() + "\n");
        gradeResultLetter.add("Questions Correct : " + (int)correct +"\n");
        gradeResultLetter.add("Questions Wrong : " + (int)(total - correct) + "\n");
        gradeResultLetter.add("Total Questions " + (int)total + "\n");
        gradeResultLetter.add("Final Grade : " + letterGrade);
    }

    public static ArrayList<String> getGradeResultLetter() {
        return gradeResultLetter;
    }
}
