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
    private static ArrayList<String> gradeResultLetter;
    private static double correct, total;

    private static MathHelperDBClient mathHelperDBClient = new MathHelperDBClient();

    public static void calculateGradeAndSubmit(double testCorrect, double testTotal) {

        correct = testCorrect;
        total = testTotal;
          double temp = correct / total;
        double tempRound = Math.round((temp * 100));
        int score = (int) tempRound;
        System.out.println("SCORE: " + score);
        if (score == 100) {
            letterGrade = "A+";
        }
        if (score >= 95 & score < 100) {
            letterGrade = "A";
        }
        if (score >= 90 & score < 95) {
            letterGrade = "A-";
        }
        if (score >= 87 & score < 90) {
            letterGrade = "B+";
        }
        if (score >= 85 & score < 87) {
            letterGrade = "B";
        }
        if (score >= 80 & score < 85) {
            letterGrade = "B-";
        }
        if (score >= 77 & score < 80) {
            letterGrade = "C+";
        }
        if (score >= 75 & score < 77) {
            letterGrade = "C";
        }
        if (score >= 70 & score < 75) {
            letterGrade = "C-";
        }
        if (score >= 67 & score < 70) {
            letterGrade = "D+";
        }
        if (score >= 65 & score < 67) {
            letterGrade = "D";
        }
        if (score >= 60 & score < 65) {
            letterGrade = "D-";
        }
        if(score < 60 ){
            letterGrade = "F";
        }

        if (UserInteractionsConfigurator.get_category_type_enum() != null) {

            Grade grade = new Grade(-1, UserInteractionsConfigurator.get_interactive_user().getUser_id(),
                    UserInteractionsConfigurator.get_interactive_grade_level_str(),
                    UserInteractionsConfigurator.get_category_type_str(),
                    UserInteractionsConfigurator.get_difficulty_level_str(),
                    letterGrade, (int) correct, (int) testTotal);

            mathHelperDBClient.add_newGrade(grade);
            System.out.println("Grade submitted:  " + grade.getGrade());
            UserInteractionsConfigurator.set_interactive_grade(new Grade(mathHelperDBClient.getLastGradeIdAdded(),
                    UserInteractionsConfigurator.get_interactive_user().getUser_id(),
                    UserInteractionsConfigurator.get_interactive_grade_level_str(),
                    UserInteractionsConfigurator.get_category_type_str(),
                    UserInteractionsConfigurator.get_difficulty_level_str(),
                    letterGrade, (int) correct, (int) testTotal));
        } else {
            Grade grade = new Grade(-1, UserInteractionsConfigurator.get_interactive_user().getUser_id(),
                    UserInteractionsConfigurator.get_interactive_grade_level_str(),
                    "",
                    UserInteractionsConfigurator.get_difficulty_level_str(),
                    letterGrade, (int) correct, (int) testTotal);

            mathHelperDBClient.add_newGrade(grade);
            System.out.println("Grade submitted:  " + grade.getGrade());
            UserInteractionsConfigurator.set_interactive_grade(new Grade(mathHelperDBClient.getLastGradeIdAdded(),
                    UserInteractionsConfigurator.get_interactive_user().getUser_id(),
                    UserInteractionsConfigurator.get_interactive_grade_level_str(),
                    "",
                    UserInteractionsConfigurator.get_difficulty_level_str(),
                    letterGrade, (int) correct, (int) testTotal));
        }

        setGradeResultLetter();

    }


    public static String getLetterGrade() {
        return letterGrade;
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
        gradeResultLetter.add("Questions Correct : " + (int) correct + "\n");
        gradeResultLetter.add("Questions Wrong : " + (int) (total - correct) + "\n");
        gradeResultLetter.add("Total Questions " + (int) total + "\n");
        gradeResultLetter.add("Final Grade : " + letterGrade);
    }

    public static ArrayList<String> getGradeResultLetter() {
        return gradeResultLetter;
    }
}
