package com.teamamerica.mathhelper.db;

import com.teamamerica.mathhelper.models.Grade;
import com.teamamerica.mathhelper.models.Question;
import com.teamamerica.mathhelper.models.Tutorial;
import com.teamamerica.mathhelper.models.User;

import java.util.ArrayList;

/**
 * Created by Christina on 4/11/2015.
 */
public class MathHelperDBClient {

    private MathHelperDB mathHelperDB;

    public MathHelperDBClient() {
        mathHelperDB = new MathHelperDB();
    }

    /**
     * **************ACTIONS TO THE DB*********************************************
     */

    public boolean add_newUser(User user) {
        return mathHelperDB.addNewUser(user);
    }

    public boolean add_newGrade(Grade grade) {
        return mathHelperDB.addNewGrade(grade);
    }


    /**
     * **************LIST GETTERS FOR TABLES******************************************
     */
    public ArrayList<User> get_allUserList() {
        return mathHelperDB.getUserTableList();
    }

    public ArrayList<Grade> get_allGradeList() {
        return mathHelperDB.getGradeTableList();
    }

    public ArrayList<Question> get_allQuestionList() {
        return mathHelperDB.getQuestionTableList();
    }

    public ArrayList<Tutorial> get_allTutorialList() {
        return mathHelperDB.getTutorialTableList();
    }


    /*************SEARCH USER GETTER****************************************/


    /**
     * This method searches the users table by the user id and returns the User object.  If not user is found, a null
     * User is returned.
     *
     * @param user_id
     * @return User
     */
    public User searchUsers_userid(int user_id) {
        return User.searchUsersByUser_id(get_allUserList(), user_id);
    }

    /**
     * This method searches for a user by the username and returns the User.  If the user name is not found in the User
     * table then a null User is returned.
     *
     * @param username
     * @return User
     */
    public User searchUsers_username(String username) {
        return User.searchForUserByUsername(get_allUserList(), username);
    }

    /******************************SEARCH GRADE FUNCTIONS************************/


    /**
     * This function searches the grades table and returns all the grades for the specified user id. If there are no
     * grade results then an empty list is returned
     *
     * @param user_id
     * @return ArrayList
     */
    public ArrayList<Grade> searchGrades_userId(int user_id) {
        return Grade.searchForGradeByUserId(get_allGradeList(),user_id);
    }


    /**
     * This method searches the grade table for a list of grades based on a min max grade range.  If no grades are found
     * the list is returned empty.
     *
     * @param min
     * @param max
     * @return ArrayList
     */
    public ArrayList<Grade> searchGrades_grRange(int min, int max) {
        return Grade.searchForGradesByGradeRange(get_allGradeList(),min,max);
    }

    /**
     * *****************SEARCH QUESTION FUNCTIONS***************************************************
     */

    /**
     * This method searches for specific questions based on the grade_level, the question_level, and the question_type,
     * and returns a list of Questions.  If no results are found it returns an empty string.
     *
     * @param grade_level
     * @param question_level
     * @return ArrayList
     */
    public ArrayList<Question> searchQuestions_grLevel_queLevel(String grade_level,
                                                                        String question_level) {
        ArrayList<Question> allQuestionList = get_allQuestionList();
        allQuestionList = Question.searchQuestions(allQuestionList, "grade_level", grade_level);
        return Question.searchQuestions(allQuestionList, "question_level", question_level);
    }

    /**
     * This method searches for specific questions based on the grade_level, the question_level, and the question_type,
     * and returns a list of Questions.  If no results are found it returns an empty string.
     *
     * @param grade_level
     * @param question_level
     * @param question_type
     * @return ArrayList
     */
    public ArrayList<Question> searchQuestions_grLevel_queLevel_queType(String grade_level,
                                                                        String question_level, String question_type) {
        ArrayList<Question> allQuestionList = get_allQuestionList();
        allQuestionList = Question.searchQuestions(allQuestionList, "grade_level", grade_level);
        allQuestionList = Question.searchQuestions(allQuestionList, "question_level", question_level);
        return Question.searchQuestions(allQuestionList, "question_type", question_type);
    }

    /**
     * This method searches the Questions table for Questions by Grade Level and returns a list of Questions. If no
     * Questions are found, it returns an empty list.
     *
     * @param grade_level
     * @return ArrayList
     */
    public ArrayList<Question> searchQuestions_grLevel(String grade_level) {
        return Question.searchQuestions(get_allQuestionList(), "grade_level", grade_level);
    }

    /**
     * This method searches the Questions list by question_level and returns a list of Questions.  If there are no
     * Questions found it returns an empty list.
     *
     * @param question_level
     * @return ArrayList
     */

    public ArrayList<Question> searchQuestions_queLevel(String question_level) {
        return Question.searchQuestions(get_allQuestionList(), "question_level", question_level);
    }


    /**
     * This method searches the Questions list by question_type and returns a list of Questions.  If there are no
     * Questions found it returns an empty list.
     *
     * @param question_type
     * @return ArrayList
     */
    public ArrayList<Question> searchQuestions_queType(String question_type) {
        return Question.searchQuestions(get_allQuestionList(), "question_type", question_type);

    }

    /*****************************TUTORIAL SEARCH FUNCTIONS********************************/

    /**
     * This method searches for specific questions based on the grade_level, the question_level, and the question_type,
     * and returns a list of Tutorials.  If no results are found it returns an empty string.
     *
     * @param grade_level
     * @param tutorial_level
     * @return ArrayList
     */
    public ArrayList<Tutorial> searchTutorials_grLevel_tutorLevel(String grade_level,
                                                                String tutorial_level) {
        ArrayList<Tutorial> allTutorialsList = get_allTutorialList();
        allTutorialsList = Tutorial.searchTutorials(allTutorialsList, "grade_level", grade_level);
        return Tutorial.searchTutorials(allTutorialsList, "tutorial_level", tutorial_level);
    }

    /**
     * This method searches for specific questions based on the grade_level, the question_level, and the question_type,
     * and returns a list of Tutorials.  If no results are found it returns an empty string.
     *
     * @param grade_level
     * @param tutorial_level
     * @param tutorial_type
     * @return ArrayList
     */
    public ArrayList<Tutorial> searchTutorials_grLevel_tutorLevel_tutorType(String grade_level,
                                                                        String tutorial_level, String tutorial_type) {
        ArrayList<Tutorial> allTutorialsList = get_allTutorialList();
        allTutorialsList = Tutorial.searchTutorials(allTutorialsList, "grade_level", grade_level);
        allTutorialsList = Tutorial.searchTutorials(allTutorialsList, "tutorial_level", tutorial_level);
        return Tutorial.searchTutorials(allTutorialsList, "tutorial_type", tutorial_type);
    }

    /**
     * This method searches the Tutorials table for Questions by Grade Level and returns a list of Tutorials. If no
     * Tutorials are found, it returns an empty list.
     *
     * @param grade_level
     * @return ArrayList
     */
    public ArrayList<Tutorial> searchTutorials_grLevel(String grade_level) {
        return Tutorial.searchTutorials(get_allTutorialList(), "grade_level", grade_level);
    }

    /**
     * This method searches the Tutorials list by question_level and returns a list of Tutorials.  If there are no
     * Tutorials found it returns an empty list.
     *
     * @param tutorial_level
     * @return ArrayList
     */

    public ArrayList<Tutorial> searchTutorials_tutorLevel(String tutorial_level) {
        return Tutorial.searchTutorials(get_allTutorialList(), "tutorial_level", tutorial_level);
    }


    /**
     * This method searches the Tutoruials list by tutorial_type and returns a list of Tutorials.  If there are no
     * Tutorials found it returns an empty list.
     *
     * @param tutorial_type
     * @return ArrayList
     */
    public ArrayList<Tutorial> searchTutorial_tutorType(String tutorial_type) {
        return Tutorial.searchTutorials(get_allTutorialList(), "tutorial_type", tutorial_type);
    }

    /**
     * ***************************PRINT FUNCTIONS**********************************
     */
    public void print_users() {

        ArrayList<User> users = get_allUserList();
        for (User user : users) {
            // Display values
            System.out.println("user_id: " + user.getUser_id() +
                    ", username: " + user.getUsername() +
                    ", userpassword: " + user.getPassword() +
                    ", role: " + user.getRole());
            System.out.println("     ");
        }
    }


    public void print_grades() {
        ArrayList<Grade> grades = get_allGradeList();
        // Display values
        for (Grade grade : grades) {
            System.out.println("grade_id: " + grade.getGrade_id() +
                    ", user_id: " + grade.getUser_id() +
                    ", grade: " + grade.getGrade());
            System.out.println("     ");
        }
    }


    public void print_questions() {
        ArrayList<Question> questions = get_allQuestionList();
        // Display values
        for (Question question : questions) {
            System.out.println("question_id: " + question.getQuestion_id() +
                    ", grade_level: " + question.getGrade_level() +
                    ", question_level: " + question.getQuestion_level() +
                    ", question_type: " + question.getQuestion_type() +
                    ", question: " + question.getQuestion() +
                    ", answer: " + question.getAnswer() +
                    ", wrong_1: " + question.getWrong_1() +
                    ", wrong_2: " + question.getWrong_2() +
                    ", wrong_3: " + question.getWrong_3());
            System.out.println("     ");
        }
    }


    public void print_tutorials() {

        ArrayList<Tutorial> tutorials = get_allTutorialList();
        // Display values
        for (Tutorial tutorial : tutorials) {
            // Display values
            System.out.println("tutorial_id: " + tutorial.getTutorial_id() +
                    ", grade_level: " + tutorial.getGrade_level() +
                    ", tutorial_level: " + tutorial.getTutorial_level() +
                    ", tutorial_type: " + tutorial.getTutorial_type() +
                    ", tutorial: " + tutorial.getTutorial());
            System.out.println("     ");
        }
    }

}
