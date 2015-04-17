package com.teamamerica.mathhelper.configurators;

import com.teamamerica.mathhelper.controllers.DifficultyLevel;
import com.teamamerica.mathhelper.db.MathHelperDBClient;
import com.teamamerica.mathhelper.models.Question;

import java.util.ArrayList;

/**
 * Created by Christina on 4/11/2015.
 */
public class QuestionsPageConfigurator {

    private static MathHelperDBClient mathHelperDBClient;
    private static ArrayList<Question> questions;
    private static int counter = 0;
    private static int maxQuestions = 0;
    private static final double easy = 5;
    private static final double medium = 10;
    private static final double hard = 15;

    public static void loadQuestionsList() {
        mathHelperDBClient = new MathHelperDBClient();
        questions = mathHelperDBClient.searchQuestions_grLevel_difLevel_catType(
                UserInteractionsConfigurator.get_interactive_grade_level_enum(),
                UserInteractionsConfigurator.get_difficulty_level_enum(),
                UserInteractionsConfigurator.get_category_type_enum());
        maxQuestions = questions.size();
    }

    public static Question getQuestion() {

        if (maxQuestions == 0) {
            return null;
        }

        if(counter < maxQuestions){
            return questions.get(counter++);
        }
        else {
            //reset the counter to start over again
            counter = 0;
            return questions.get(counter++);
        }
    }

    public static double getNumberOfTestQuestions(){
        if(UserInteractionsConfigurator.get_difficulty_level_enum().equals(DifficultyLevel.EASY)){
            return easy;
        }
        if(UserInteractionsConfigurator.get_difficulty_level_enum().equals(DifficultyLevel.MEDIUM)){
            return medium;
        }
        if(UserInteractionsConfigurator.get_difficulty_level_enum().equals(DifficultyLevel.HARD)){
            return hard;
        }

        return 0;
    }



}


