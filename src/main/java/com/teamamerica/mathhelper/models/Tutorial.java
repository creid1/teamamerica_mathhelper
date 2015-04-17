package com.teamamerica.mathhelper.models;

import java.util.ArrayList;

/**
 * Created by Christina on 4/11/2015.
 */
public class Tutorial {

    //the data fields for a Tutorial object
    private int tutorial_id;
    private String grade_level;
    private String category_type;
    private String tutorial;

    //default constructor
    public Tutorial() {

    }

    //constructor that takes all values
    public Tutorial(int tutorial_id, String grade_level,String category_type, String tutorial) {
        this.tutorial_id = tutorial_id;
        this.grade_level = grade_level;
        this.category_type = category_type;
        this.tutorial = tutorial;
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

    public void setCategory_type(String category) {
        this.category_type = category;
    }

    public void setTutorial(String tutorial) {
        this.tutorial = tutorial;
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

    public String getCategory_type() {
        return category_type;
    }

    public String getTutorial() {
        return tutorial;
    }

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
            if (searchType.equalsIgnoreCase("category_type")
                    & tutorial.getCategory_type().equalsIgnoreCase(searchCriteria.toString())) {
                tutorials.add(tutorial);
            }
        }
        return tutorials;
    }
}

