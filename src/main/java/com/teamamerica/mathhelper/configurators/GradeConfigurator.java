package com.teamamerica.mathhelper.configurators;

import com.teamamerica.mathhelper.db.MathHelperDBClient;
import com.teamamerica.mathhelper.models.Grade;

/**
 * Created by Christina on 4/17/2015.
 */
public class GradeConfigurator {

    private static MathHelperDBClient mathHelperDBClient = new MathHelperDBClient();

    public static void calculateGradeAndSubmit(double correct, double totalQuestions){

        System.out.println("FINAL CORRECT: " + correct);
        System.out.println("FINAL MAX: " + totalQuestions);
        double temp = correct/totalQuestions;
        System.out.println("SCORE TEMP: " + temp);
        int score = (int) ( temp * 100);

        Grade grade = new Grade(-1,UserInteractionsConfigurator.get_interactive_user().getUser_id(),score);
        mathHelperDBClient.add_newGrade(grade);
        System.out.println("Grade submitted");
        UserInteractionsConfigurator.set_interactive_grade(new Grade(mathHelperDBClient.getLastGradeIdAdded(),
                UserInteractionsConfigurator.get_interactive_user().getUser_id(), score));

    }

    public static Grade findGradeById(int id){
       return mathHelperDBClient.searchGrades_gradeId(id);

    }
}
