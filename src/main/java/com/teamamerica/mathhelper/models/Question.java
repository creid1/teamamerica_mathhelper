/**
 * Name: Christina Reid
 * Date Produced: April 29,2015
 * Purpose: The purpose of this software is to help children learn math.
 */
package com.teamamerica.mathhelper.models;

import java.util.ArrayList;

/**
 * Created by Christina on 4/11/2015.
 */


/**
 * This is the Question class which is a data structure that is used to store information about a Question
 */
public class Question {

    //data fields for the Question object
    private int question_id;
    private String grade_level;
    private String category_type;
    private String question;


    private boolean has_question_image;
    private boolean has_answer_image;
    private String answer;
    private String wrong_1;
    private String wrong_2;
    private String wrong_3;

    //default constructor
    public Question() {

    }

    //constructor that takes all values
    public Question(int question_id, String category_type, boolean has_question_image, boolean has_answer_image,
                    String question, String answer, String wrong_1, String wrong_2, String wrong_3) {
        this.question_id = question_id;
        this.category_type = category_type;
        this.has_question_image = has_question_image;
        this.has_answer_image = has_answer_image;
        this.question = question;
        this.answer = answer;
        this.wrong_1 = wrong_1;
        this.wrong_2 = wrong_2;
        this.wrong_3 = wrong_3;

    }

    /**
     * ************************ SETTERS********************************
     */

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public void setGrade_level(String grade_level) {
        this.grade_level = grade_level;
    }


    public void setCategory_type(String category) {
        this.category_type = category;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setWrong_1(String wrong_1) {
        this.wrong_1 = wrong_1;
    }

    public void setWrong_2(String wrong_2) {
        this.wrong_2 = wrong_2;
    }

    public void setWrong_3(String wrong_3) {
        this.wrong_3 = wrong_3;
    }
    public void setHas_question_image(boolean has_question_image) {
        this.has_question_image = has_question_image;
    }


    public void setHas_answer_image(boolean has_answer_image) {
        this.has_answer_image = has_answer_image;
    }


    /**
     * ************************ GETTERS************************************
     */
    public int getQuestion_id() {
        return question_id;
    }

    public String getGrade_level() {
        return grade_level;
    }

    public String getCategory_type() {
        return category_type;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getWrong_1() {
        return wrong_1;
    }

    public String getWrong_2() {
        return wrong_2;
    }

    public String getWrong_3() {
        return wrong_3;
    }

    public boolean getHas_answer_image() {
        return has_answer_image;
    }

    public boolean getHas_question_image() {
        return has_question_image;
    }


    /********************************** STATIC CLASS SEARCH METHODS *******************************/

    /**
     * This method searches the Questions table for Questions by search criteria and returns a list of Questions. If no
     * Questions are found, it returns an empty list.
     *
     * @param searchCriteria
     * @return ArrayList
     */
    public static ArrayList<Question> searchQuestions(
            ArrayList<Question> questionList, String searchType, Enum searchCriteria) {

        ArrayList<Question> questions = new ArrayList<>();
        for (Question question : questionList) {
            if (searchType.equalsIgnoreCase("grade_level")
                    & question.getGrade_level().equalsIgnoreCase(searchCriteria.toString())) {
                questions.add(question);
            }
            if (searchType.equalsIgnoreCase("category_type")
                    & question.getCategory_type().equalsIgnoreCase(searchCriteria.toString())) {
                questions.add(question);
            }
        }
        return questions;
    }

}
