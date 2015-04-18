package com.teamamerica.mathhelper.configurators;

import com.teamamerica.mathhelper.db.MathHelperDBClient;
import com.teamamerica.mathhelper.models.Grade;

/**
 * Created by Christina on 4/17/2015.
 */
public class GradeConfigurator {

    private static String letterGrade;
    private static boolean has_receivedReward;

    private static MathHelperDBClient mathHelperDBClient = new MathHelperDBClient();

    public static void calculateGradeAndSubmit(double correct, double totalQuestions) {

        System.out.println("FINAL CORRECT: " + correct);
        System.out.println("FINAL MAX: " + totalQuestions);
        double temp = correct / totalQuestions;
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

        Grade grade = new Grade(-1, UserInteractionsConfigurator.get_interactive_user().getUser_id(), letterGrade, has_receivedReward);
        mathHelperDBClient.add_newGrade(grade);
        System.out.println("Grade submitted:  " + grade.getGrade());
        UserInteractionsConfigurator.set_interactive_grade(new Grade(mathHelperDBClient.getLastGradeIdAdded(),
                UserInteractionsConfigurator.get_interactive_user().getUser_id(), letterGrade, has_receivedReward));

    }

    public static Grade findGradeById(int id) {
        return mathHelperDBClient.searchGrades_gradeId(id);

    }
}
