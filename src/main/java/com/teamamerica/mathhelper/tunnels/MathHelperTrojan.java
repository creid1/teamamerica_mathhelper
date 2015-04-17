package com.teamamerica.mathhelper.tunnels;

import com.teamamerica.mathhelper.configurators.TutorialsPageConfigurator;
import com.teamamerica.mathhelper.configurators.UserInteractionsConfigurator;
import com.teamamerica.mathhelper.controllers.CategoryType;
import com.teamamerica.mathhelper.controllers.DifficultyLevel;
import com.teamamerica.mathhelper.controllers.GradeLevel;
import com.teamamerica.mathhelper.controllers.MainMenuSelection;
import com.teamamerica.mathhelper.db.MathHelperDBClient;
import com.teamamerica.mathhelper.ui.customcomponents.YouTubeFrame;
import com.teamamerica.mathhelper.ui.panels.Test;

/**
 * Created by Christina on 4/17/2015.
 */
public class MathHelperTrojan {

    private static final MathHelperDBClient mathHelperDBClient = new MathHelperDBClient();

    public static void goToPage(String code) {

        if (code.equalsIgnoreCase(null)) {


        }
        if (code.equalsIgnoreCase("sktestadde")) {
            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("testUser2"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.ADDITION);
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TESTS);
            UserInteractionsConfigurator.set_difficulty_level_enum(DifficultyLevel.EASY);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.K);

            new Test().setVisible(true);

        }

        if(code.equalsIgnoreCase("sktutadd")){

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("testUser2"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.ADDITION);
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TUTORIALS);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.K);

            TutorialsPageConfigurator.loadTutorialsList();
            //  this.setVisible(false);
            new YouTubeFrame(TutorialsPageConfigurator.getTutorial().getTutorial()).setVisible(true);

        }
    }
}
