package com.teamamerica.mathhelper.models;

import java.util.ArrayList;

/**
 * Created by Christina on 4/11/2015.
 */
public class Question {

    //data fields for the Question object
    private int question_id;
    private String grade_level;
    private String difficulty_level;
    private String category_type;
    private String question;
    private String answer;
    private String wrong_1;
    private String wrong_2;
    private String wrong_3;

    //default constructor
    public Question() {

    }

    //constructor that takes all values
    public Question(int question_id, String difficulty_level, String category_type, String question, String answer, String wrong_1,
                    String wrong_2, String wrong_3) {
        this.question_id = question_id;
        this.difficulty_level = difficulty_level;
        this.category_type = category_type;
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

    public void setDifficulty_level(String difficulty) {
        this.difficulty_level = difficulty;
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


    /**
     * ************************ GETTERS************************************
     */
    public int getQuestion_id() {
        return question_id;
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
            if (searchType.equalsIgnoreCase("difficulty_level")
                    & question.getDifficulty_level().equalsIgnoreCase(searchCriteria.toString())) {
                questions.add(question);
            }
            if (searchType.equalsIgnoreCase("category_type")
                    & question.getCategory_type().equalsIgnoreCase(searchCriteria.toString())){
                questions.add(question);
            }
        }
        return questions;
    }

}
