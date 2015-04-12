package com.teamamerica.mathhelper.models;

import java.util.ArrayList;

/**
 * Created by Christina on 4/11/2015.
 */
public class Tutorial {

    //the data fields for a Tutorial object
    private int tutorial_id;
    private String grade_level;
    private String difficulty_level;
    private String category_type;
    private String tutorial;
    private boolean has_image;

    //default constructor
    public Tutorial() {

    }

    //constructor that takes all values
    public Tutorial(int tutorial_id, String grade_level,
                    String difficulty_level, String category_type, String tutorial, boolean has_image) {
        this.tutorial_id = tutorial_id;
        this.grade_level = grade_level;
        this.difficulty_level = difficulty_level;
        this.category_type = category_type;
        this.tutorial = tutorial;
        this.has_image = has_image;
    }


    /**
     * ************************SETTERS************************************************
     */

    public void setTutorial_id(int tutorial_id) {
        this.tutorial_id = tutorial_id;
    }

    public void setGrade_level(String grade_level) {
        this.grade_level = grade_level;
    }

    public void setDifficulty_level(String difficulty) {
        this.difficulty_level = difficulty;
    }

    public void setCategory_type(String category) {
        this.category_type = category;
    }

    public void setTutorial(String tutorial) {
        this.tutorial = tutorial;
    }

    public void setHas_image(boolean has_image) {
        this.has_image = has_image;
    }


    /**
     * ***************************GETTERS **************************************
     */
    public int getTutorial_id() {
        return tutorial_id;
    }

    public String getGrade_level() {
        return grade_level;
    }

    public String getDifficulty_level() {
        return difficulty_level;
    }

    public String getCategory_type() {
        return category_type;
    }

    public String getTutorial() {
        return tutorial;
    }

    public boolean getHas_image(){ return has_image; }

    /********************************** STATIC CLASS SEARCH METHODS *******************************/

    /**
     * This method searches the Tutorials table for Tutorials by search criteria and returns a list of Tutorials. If no
     * Tutorials are found, it returns an empty list.
     *
     * @param searchCriteria
     * @return ArrayList
     */
    public static ArrayList<Tutorial> searchTutorials(
            ArrayList<Tutorial> tutorialList, String searchType, Enum searchCriteria) {

        ArrayList<Tutorial> tutorials = new ArrayList<>();
        for (Tutorial tutorial : tutorialList) {
            if (searchType.equalsIgnoreCase("grade_level")
                    & tutorial.getGrade_level().equalsIgnoreCase(searchCriteria.toString())) {
                tutorials.add(tutorial);
            }
            if (searchType.equalsIgnoreCase("difficulty_level")
                    & tutorial.getDifficulty_level().equalsIgnoreCase(searchCriteria.toString())) {
                tutorials.add(tutorial);
            }
            if (searchType.equalsIgnoreCase("category_type")
                    & tutorial.getCategory_type().equalsIgnoreCase(searchCriteria.toString())) {
                tutorials.add(tutorial);
            }
        }
        return tutorials;
    }
}

