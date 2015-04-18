package com.teamamerica.mathhelper.tunnels;

import com.teamamerica.mathhelper.configurators.QuestionsPageConfigurator;
import com.teamamerica.mathhelper.configurators.TutorialsPageConfigurator;
import com.teamamerica.mathhelper.configurators.UserInteractionsConfigurator;
import com.teamamerica.mathhelper.controllers.CategoryType;
import com.teamamerica.mathhelper.controllers.DifficultyLevel;
import com.teamamerica.mathhelper.controllers.GradeLevel;
import com.teamamerica.mathhelper.controllers.MainMenuSelection;
import com.teamamerica.mathhelper.db.MathHelperDBClient;
import com.teamamerica.mathhelper.ui.customcomponents.YouTubeFrame;
import com.teamamerica.mathhelper.ui.panels.PracticeTest;
import com.teamamerica.mathhelper.ui.panels.Test;

/**
 * Created by Christina on 4/17/2015.
 */
public class MathHelperTrojan {

    private static final MathHelperDBClient mathHelperDBClient = new MathHelperDBClient();

    public static void goToPage(String code) {
        check_null(code);
        check_sktestadde(code);
        check_sktutadd(code);
        check_sktutsub(code);
        check_sprektutsub(code);
        check_sprektutadd(code);
        check_sktutsha(code);
        check_sprektutsha(code);
        check_sktutti(code);
        check_sprektutti(code);
        check_sfitutadd(code);
        check_sstutadd(code);
        check_skpractadd(code);

    }


    private static void check_skpractadd(String code) {
        if (code.equalsIgnoreCase("skpractadd")) {

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("testUser2"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.ADDITION);
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.PRACTICE);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.K);

            QuestionsPageConfigurator.loadQuestionsListForPractice();

            new PracticeTest().setVisible(true);

        }
    }

    private static void check_sstutadd(String code) {
        if (code.equalsIgnoreCase("sstutadd")) {

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("testUser2"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.ADDITION);
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TUTORIALS);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.SECOND);

            TutorialsPageConfigurator.loadTutorialsList();
            //  this.setVisible(false);
            new YouTubeFrame(TutorialsPageConfigurator.getTutorial().getTutorial()).setVisible(true);

        }
    }

    private static void check_sfitutadd(String code) {
        if (code.equalsIgnoreCase("sfitutadd")) {

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("testUser2"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.ADDITION);
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TUTORIALS);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.FIRST);

            TutorialsPageConfigurator.loadTutorialsList();
            //  this.setVisible(false);
            new YouTubeFrame(TutorialsPageConfigurator.getTutorial().getTutorial()).setVisible(true);

        }
    }

    private static void check_sprektutti(String code) {
        if (code.equalsIgnoreCase("sprektutti")) {

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("testUser2"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.TIME);
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TUTORIALS);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.PRE_K);

            TutorialsPageConfigurator.loadTutorialsList();
            //  this.setVisible(false);
            new YouTubeFrame(TutorialsPageConfigurator.getTutorial().getTutorial()).setVisible(true);

        }
    }


    private static void check_sktutti(String code) {
        if (code.equalsIgnoreCase("sktutti")) {

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("testUser2"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.TIME);
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TUTORIALS);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.K);

            TutorialsPageConfigurator.loadTutorialsList();
            //  this.setVisible(false);
            new YouTubeFrame(TutorialsPageConfigurator.getTutorial().getTutorial()).setVisible(true);

        }
    }

    private static void check_sprektutsub(String code) {
        if (code.equalsIgnoreCase("sprektutsub")) {

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("testUser2"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.SUBTRACTION);
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TUTORIALS);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.PRE_K);

            TutorialsPageConfigurator.loadTutorialsList();
            //  this.setVisible(false);
            new YouTubeFrame(TutorialsPageConfigurator.getTutorial().getTutorial()).setVisible(true);

        }
    }

    private static void check_sktutsub(String code) {
        if (code.equalsIgnoreCase("sktutsub")) {

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("testUser2"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.SUBTRACTION);
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TUTORIALS);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.K);

            TutorialsPageConfigurator.loadTutorialsList();
            //  this.setVisible(false);
            new YouTubeFrame(TutorialsPageConfigurator.getTutorial().getTutorial()).setVisible(true);

        }
    }

    private static void check_sprektutsha(String code) {
        if (code.equalsIgnoreCase("sprektutsha")) {

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("testUser2"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.SHAPES);
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TUTORIALS);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.PRE_K);

            TutorialsPageConfigurator.loadTutorialsList();
            //  this.setVisible(false);
            new YouTubeFrame(TutorialsPageConfigurator.getTutorial().getTutorial()).setVisible(true);

        }
    }

    private static void check_sktutsha(String code) {
        if (code.equalsIgnoreCase("sktutsha")) {

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("testUser2"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.SHAPES);
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TUTORIALS);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.K);

            TutorialsPageConfigurator.loadTutorialsList();
            //  this.setVisible(false);
            new YouTubeFrame(TutorialsPageConfigurator.getTutorial().getTutorial()).setVisible(true);

        }
    }

    private static void check_sprektutadd(String code) {
        if (code.equalsIgnoreCase("sprektutadd")) {

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("testUser2"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.ADDITION);
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TUTORIALS);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.PRE_K);

            TutorialsPageConfigurator.loadTutorialsList();
            //  this.setVisible(false);
            new YouTubeFrame(TutorialsPageConfigurator.getTutorial().getTutorial()).setVisible(true);

        }
    }

    private static void check_sktutadd(String code) {
        if (code.equalsIgnoreCase("sktutadd")) {

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

    private static void check_null(String code) {
        if (code.equalsIgnoreCase(null)) {

        }
    }

    private static void check_sktestadde(String code) {
        if (code.equalsIgnoreCase("sktestadde")) {
            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("testUser2"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.ADDITION);
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TESTS);
            UserInteractionsConfigurator.set_difficulty_level_enum(DifficultyLevel.EASY);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.K);
            QuestionsPageConfigurator.loadQuestionsList();
            new Test().setVisible(true);

        }
    }
}
