/**
 * Name: Christina Reid
 * Date Produced: April 29,2015
 * Purpose: The purpose of this software is to help children learn math.
 */
package com.teamamerica.mathhelper.configurators;

import com.teamamerica.mathhelper.controllers.GradeLevel;
import com.teamamerica.mathhelper.db.MathHelperDBClient;
import com.teamamerica.mathhelper.models.Tutorial;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Christina on 4/11/2015.
 */

/**
 * This class contains static methods for retrieving and searching for tutorials in the database, based on the
 * user's selections
 */
public class TutorialsPageConfigurator {

    private static ArrayList<Tutorial> tutorials;
    private static MathHelperDBClient mathHelperDBClient = null;
    private static int counter = 0;
    private static int maxTutorials;

    /**
     * This method loads the Tutorials list from the database based on the search criteria set from the user's
     * selections in the application
     */
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
        maxTutorials = tutorials.size();
    }

    /**
     * This method return the next Tutorial object from the list of Tutorials
     * @return Tutorial
     */
    public static Tutorial getTutorial() {

        if (maxTutorials == 0) {
            return null;
        }
        if (counter >= maxTutorials) {
            //reset the counter to start over again
            counter = 0;
        }
        return tutorials.get(counter++);
    }
}