package com.teamamerica.mathhelper.tunnels;

import com.teamamerica.mathhelper.configurators.TutorialsPageConfigurator;
import com.teamamerica.mathhelper.configurators.UserInteractionsConfigurator;
import com.teamamerica.mathhelper.controllers.CategoryType;
import com.teamamerica.mathhelper.controllers.DifficultyLevel;
import com.teamamerica.mathhelper.controllers.GradeLevel;
import com.teamamerica.mathhelper.controllers.MainMenuSelection;
import com.teamamerica.mathhelper.db.MathHelperDBClient;
import com.teamamerica.mathhelper.ui.customcomponents.YouTubeFrame;
import com.teamamerica.mathhelper.ui.panels.*;

/**
 * Created by Christina on 4/17/2015.
 */
public class MathHelperWorm {

    private static final MathHelperDBClient mathHelperDBClient = new MathHelperDBClient();

    public static void goToPage(String code) {
        if (check_null(code)) {
            return;
        } else if (check_sktestadde(code)) {
            return;
        } else if (check_sktutadd(code)) {
            return;
        } else if (check_sktutsub(code)) {
            return;
        } else if (check_sk(code)) {
            return;
        } else if (check_sprektutsub(code)) {
            return;
        } else if (check_sprektutadd(code)) {
            return;
        } else if (check_sktutsha(code)) {
            return;
        } else if (check_sktestadd(code)) {
            return;
        } else if (check_sktest(code)) {
            return;
        } else if (check_sktutsha(code)) {
            return;
        } else if (check_sprektutsha(code)) {
            return;
        } else if (check_avie(code)) {
            return;
        } else if (check_sktutti(code)) {
            return;
        } else if (check_sprektutti(code)) {
            return;
        } else if (check_sfitutadd(code)) {
            return;
        } else if (check_aadu(code)) {
            return;
        } else if (check_sstutadd(code)) {
            return;
        } else if (check_skpractadd(code)) {
            return;
        } else if (check_sfteste(code)) {
        } else {
            stop_hacker();
        }
    }

    private static void stop_hacker() {
        System.exit(0);

    }


    private static boolean check_skpractadd(String code) {
        if (code.equalsIgnoreCase("skpractadd")) {

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("swalker"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.K);
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.PRACTICE);
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.ADDITION);

            new PracticeTest().setVisible(true);

            return true;

        } else {
            return false;
        }
    }

    private static boolean check_sstutadd(String code) {
        if (code.equalsIgnoreCase("sstutadd")) {

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("swalker"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.ADDITION);
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TUTORIALS);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.SECOND);

            TutorialsPageConfigurator.loadTutorialsList();
            //  this.setVisible(false);
            new YouTubeFrame(TutorialsPageConfigurator.getTutorial().getTutorial()).setVisible(true);

            return true;

        } else {
            return false;
        }
    }


    private static boolean check_sfteste(String code) {
        if (code.equalsIgnoreCase("sfteste")) {

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("swalker"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TESTS);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.FIRST);
            UserInteractionsConfigurator.set_difficulty_level_enum(DifficultyLevel.EASY);

            //  this.setVisible(false);
            new Test().setVisible(true);

            return true;

        } else {
            return false;
        }
    }

    private static boolean check_aadu(String code) {
        if (code.equalsIgnoreCase("aadu")) {

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("creid"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());

            new AddAStudent().setVisible(true);

            return true;

        } else {
            return false;
        }
    }

    private static boolean check_avie(String code) {
        if (code.equalsIgnoreCase("avie")) {

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("creid"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());

            new MathHelperAdmin().setVisible(true);

            return true;

        } else {
            return false;
        }
    }

    private static boolean check_sfitutadd(String code) {
        if (code.equalsIgnoreCase("sfitutadd")) {

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("swalker"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.ADDITION);
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TUTORIALS);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.FIRST);

            TutorialsPageConfigurator.loadTutorialsList();
            //  this.setVisible(false);
            new YouTubeFrame(TutorialsPageConfigurator.getTutorial().getTutorial()).setVisible(true);

            return true;

        } else {
            return false;
        }
    }

    private static boolean check_sprektutti(String code) {
        if (code.equalsIgnoreCase("sprektutti")) {

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("swalker"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.TIME);
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TUTORIALS);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.PRE_K);

            TutorialsPageConfigurator.loadTutorialsList();
            //  this.setVisible(false);
            new YouTubeFrame(TutorialsPageConfigurator.getTutorial().getTutorial()).setVisible(true);

            return true;

        } else {
            return false;
        }

    }


    private static boolean check_sktutti(String code) {
        if (code.equalsIgnoreCase("sktutti")) {

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("swalker"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.TIME);
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TUTORIALS);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.K);

            TutorialsPageConfigurator.loadTutorialsList();
            //  this.setVisible(false);
            new YouTubeFrame(TutorialsPageConfigurator.getTutorial().getTutorial()).setVisible(true);
            return true;
        } else {
            return false;
        }
    }

    private static boolean check_sprektutsub(String code) {
        if (code.equalsIgnoreCase("sprektutsub")) {

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("swalker"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.SUBTRACTION);
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TUTORIALS);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.PRE_K);

            TutorialsPageConfigurator.loadTutorialsList();
            //  this.setVisible(false);
            new YouTubeFrame(TutorialsPageConfigurator.getTutorial().getTutorial()).setVisible(true);
            return true;

        } else {
            return false;
        }
    }

    private static boolean check_sktutsub(String code) {
        if (code.equalsIgnoreCase("sktutsub")) {

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("swalker"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.SUBTRACTION);
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TUTORIALS);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.K);

            TutorialsPageConfigurator.loadTutorialsList();
            //  this.setVisible(false);
            new YouTubeFrame(TutorialsPageConfigurator.getTutorial().getTutorial()).setVisible(true);

            return true;

        } else {
            return false;
        }
    }

    private static boolean check_sprektutsha(String code) {
        if (code.equalsIgnoreCase("sprektutsha")) {

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("swalker"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.SHAPES);
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TUTORIALS);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.PRE_K);

            TutorialsPageConfigurator.loadTutorialsList();
            //  this.setVisible(false);
            new YouTubeFrame(TutorialsPageConfigurator.getTutorial().getTutorial()).setVisible(true);
            return true;

        } else {
            return false;
        }
    }

    private static boolean check_sktutsha(String code) {
        if (code.equalsIgnoreCase("sktutsha")) {

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("swalker"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.SHAPES);
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TUTORIALS);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.K);

            TutorialsPageConfigurator.loadTutorialsList();
            //  this.setVisible(false);
            new YouTubeFrame(TutorialsPageConfigurator.getTutorial().getTutorial()).setVisible(true);
            return true;
        } else {
            return false;
        }
    }

    private static boolean check_sprektutadd(String code) {
        if (code.equalsIgnoreCase("sprektutadd")) {

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("swalker"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.ADDITION);
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TUTORIALS);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.PRE_K);

            TutorialsPageConfigurator.loadTutorialsList();
            //  this.setVisible(false);
            new YouTubeFrame(TutorialsPageConfigurator.getTutorial().getTutorial()).setVisible(true);

            return true;

        } else {
            return false;
        }
    }

    private static boolean check_sktutadd(String code) {
        if (code.equalsIgnoreCase("sktutadd")) {

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("swalker"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.ADDITION);
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TUTORIALS);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.K);

            TutorialsPageConfigurator.loadTutorialsList();
            //  this.setVisible(false);
            new YouTubeFrame(TutorialsPageConfigurator.getTutorial().getTutorial()).setVisible(true);

            return true;

        } else {
            return false;
        }
    }

    private static boolean check_sk(String code) {
        if (code.equalsIgnoreCase("sk")) {

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("swalker"));
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.K);
            new MainMenu().setVisible(true);

            return true;

        } else {
            return false;
        }
    }

    private static boolean check_sktest(String code) {
        if (code.equalsIgnoreCase("sktest")) {

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("swalker"));
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.K);
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TESTS);
            new CategoriesMain().setVisible(true);

            return true;

        } else {
            return false;
        }
    }

    private static boolean check_sktestadd(String code) {
        if (code.equalsIgnoreCase("sktestadd")) {

            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("swalker"));
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.K);
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TESTS);
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.ADDITION);
            new Difficulty().setVisible(true);

            return true;

        } else {
            return false;
        }
    }

    private static boolean check_null(String code) {
        if (code.equalsIgnoreCase(null)) {
            return true;

        } else {
            return false;
        }
    }

    private static boolean check_sktestadde(String code) {
        if (code.equalsIgnoreCase("sktestadde")) {
            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username("swalker"));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.ADDITION);
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TESTS);
            UserInteractionsConfigurator.set_difficulty_level_enum(DifficultyLevel.EASY);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.K);
            new Test().setVisible(true);
            return true;
        } else {
            return false;
        }
    }
}
