/**
 * Name: Christina Reid
 * Date Produced: April 29,2015
 * Purpose: The purpose of this software is to help children learn math.
 */
package com.teamamerica.mathhelper.configurators;

import com.teamamerica.mathhelper.controllers.DifficultyLevel;
import com.teamamerica.mathhelper.controllers.GradeLevel;
import com.teamamerica.mathhelper.controllers.MainMenuSelection;
import com.teamamerica.mathhelper.db.MathHelperDBClient;
import com.teamamerica.mathhelper.models.Question;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Christina on 4/11/2015.
 */

/**
 * This class contains static methods that are used to retrieve and search for questions based on
 * the user's selections in the application
 */
public class QuestionsPageConfigurator {

    private static MathHelperDBClient mathHelperDBClient;
    private static ArrayList<Question> questions;
    private static int counter = 0;
    private static int maxQuestions = 0;
    private static final double easy = 5;
    private static final double medium = 10;
    private static final double hard = 15;

    /**
     * This method loads the Questions from the database based on whether the user selected Practice or Test
     * to retrieve the list of questions
     */
    public static void loadQuestions() {
        counter = 0;

        if (UserInteractionsConfigurator.getMain_menu_selection_enum().equals(MainMenuSelection.PRACTICE)) {
            loadQuestionsListForPractice();
        }
        if (UserInteractionsConfigurator.getMain_menu_selection_enum().equals(MainMenuSelection.TESTS)) {
            loadQuestionsList();
        }
    }

    /**
     * This method loads the Questions list for the Tests
     */
    public static void loadQuestionsList() {
        mathHelperDBClient = new MathHelperDBClient();
        if (UserInteractionsConfigurator.get_interactive_grade_level_enum().equals(GradeLevel.K) ||
                UserInteractionsConfigurator.get_interactive_grade_level_enum().equals(GradeLevel.PRE_K)) {
            questions = mathHelperDBClient.searchQuestions_grLevel_catType(
                    UserInteractionsConfigurator.get_interactive_grade_level_enum(),
                    UserInteractionsConfigurator.get_category_type_enum());
        } else {
            questions = mathHelperDBClient.searchQuestions_grLevel(
                    UserInteractionsConfigurator.get_interactive_grade_level_enum());
        }
        Collections.shuffle(questions);
        maxQuestions = questions.size();
    }

    /**
     * This method load the questions list for practice
     */

    public static void loadQuestionsListForPractice() {
        mathHelperDBClient = new MathHelperDBClient();
        if (UserInteractionsConfigurator.get_interactive_grade_level_enum().equals(GradeLevel.K) ||
                UserInteractionsConfigurator.get_interactive_grade_level_enum().equals(GradeLevel.PRE_K)) {
            questions = mathHelperDBClient.searchQuestions_grLevel_catType(
                    UserInteractionsConfigurator.get_interactive_grade_level_enum(),
                    UserInteractionsConfigurator.get_category_type_enum());
        } else {
            questions = mathHelperDBClient.searchQuestions_grLevel(
                    UserInteractionsConfigurator.get_interactive_grade_level_enum());
        }
        Collections.shuffle(questions);
        for (Question q : questions) {
            System.out.println(q.getQuestion());
        }
        System.out.println("MAX QUESTIONS: " + maxQuestions);
        maxQuestions = questions.size();
    }

    /**
     * This method return the next question in the list
     * @return Question
     */
    public static Question getQuestion() {

        if (maxQuestions == 0) {
            return null;
        }

        if (counter >= maxQuestions) {
            //reset the counter to start over again
            counter = 0;
        }
        return questions.get(counter++);

    }

    /**
     * This method returns the number of test questions that are in the list of questions
     * @return double
     */
    public static double getNumberOfTestQuestions() {
        if (UserInteractionsConfigurator.get_difficulty_level_enum().equals(DifficultyLevel.EASY)) {
            return easy;
        }
        if (UserInteractionsConfigurator.get_difficulty_level_enum().equals(DifficultyLevel.MEDIUM)) {
            return medium;
        }
        if (UserInteractionsConfigurator.get_difficulty_level_enum().equals(DifficultyLevel.HARD)) {
            return hard;
        }

        return 0;
    }


}


