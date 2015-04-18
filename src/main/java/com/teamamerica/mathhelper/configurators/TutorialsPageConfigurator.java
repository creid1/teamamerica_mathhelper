package com.teamamerica.mathhelper.configurators;

import com.teamamerica.mathhelper.controllers.GradeLevel;
import com.teamamerica.mathhelper.db.MathHelperDBClient;
import com.teamamerica.mathhelper.models.Tutorial;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Christina on 4/11/2015.
 */
public class TutorialsPageConfigurator {

    private static ArrayList<Tutorial> tutorials;
    private static MathHelperDBClient mathHelperDBClient = null;
    private static int counter = 0;
    private static int maxQuestions;

    public static void loadTutorialsList() {
        mathHelperDBClient = new MathHelperDBClient();
        if(UserInteractionsConfigurator.get_interactive_grade_level_enum().equals(GradeLevel.K) ||
                UserInteractionsConfigurator.get_interactive_grade_level_enum().equals(GradeLevel.PRE_K)) {
            tutorials = mathHelperDBClient.searchTutorials_grLevel_catType(
                    UserInteractionsConfigurator.get_interactive_grade_level_enum(),
                    UserInteractionsConfigurator.get_category_type_enum());
        }
        else{
            tutorials = mathHelperDBClient.searchTutorials_grLevel(
                    UserInteractionsConfigurator.get_interactive_grade_level_enum());

        }
       Collections.shuffle(tutorials);
        maxQuestions = tutorials.size();
    }

    public static Tutorial getTutorial() {

        if (maxQuestions == 0) {
            return null;
        }
        if (counter >= maxQuestions) {
            //reset the counter to start over again
            counter = 0;
        }
        return tutorials.get(counter++);
    }
}