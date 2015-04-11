package com.teamamerica.mathhelper.configurators;

import com.teamamerica.mathhelper.controllers.CategoryType;
import com.teamamerica.mathhelper.controllers.DifficultyLevel;
import com.teamamerica.mathhelper.controllers.GradeLevel;
import com.teamamerica.mathhelper.controllers.MainMenuSelection;
import com.teamamerica.mathhelper.models.User;

/**
 * Created by Christina on 4/11/2015.
 */
public class UserInteractionsConfigurator {

    private static User interactive_user = null;
    private static GradeLevel interactive_grade_level = null;
    private static MainMenuSelection main_menu_selection = null;
    private static CategoryType category_type = null;
    private static DifficultyLevel difficulty_level = null;

    public static void set_interactive_user(User user){
        interactive_user = user;
    }
    public static User get_interactive_user(){
        return interactive_user;
    }


    public static void set_interactive_grade_level_str(String grade_level){
        interactive_grade_level = GradeLevel.valueOf(grade_level);
    }
    public static void set_interactive_grade_level_enum(GradeLevel grade_level){
        interactive_grade_level = grade_level;
    }

    public static String get_interactive_grade_level_str(){
        return interactive_grade_level.toString();
    }

    public static GradeLevel get_interactive_grade_level_enum(){
        return interactive_grade_level;
    }


    public static void set_main_menu_selection_str(String selection){
        main_menu_selection = MainMenuSelection.valueOf(selection);
    }

    public static void set_main_menu_selection_enum(MainMenuSelection selection){
        main_menu_selection = selection;
    }

    public static String get_main_menu_selection_str(){
        return main_menu_selection.toString();
    }

    public static MainMenuSelection getMain_menu_selection_enum(){
        return main_menu_selection;
    }


    public static void set_category_type_str(String type){
        category_type = CategoryType.valueOf(type);
    }

    public static void set_category_type_enum(CategoryType type){
        category_type = type;
    }

    public static String get_category_type_str(){
        return category_type.toString();
    }

    public static CategoryType get_category_type_enum(){
        return category_type;
    }

    public static void set_difficulty_level_str(String level){
        difficulty_level = DifficultyLevel.valueOf(level);
    }

    public static void set_difficulty_level_enum(DifficultyLevel level){
        difficulty_level = level;
    }

    public static String get_difficulty_level_str(){
        return difficulty_level.toString();
    }

    public static DifficultyLevel get_difficulty_level_enum(){
        return difficulty_level;
    }


}
