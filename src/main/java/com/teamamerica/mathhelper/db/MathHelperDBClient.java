package com.teamamerica.mathhelper.db;

import com.teamamerica.mathhelper.controllers.CategoryType;
import com.teamamerica.mathhelper.controllers.GradeLevel;
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

    public boolean validate_user_login(String username, String password) {
        User user = User.searchForUserByUsername(get_allUserList(), username);

        if (user == null) {
            return false;
        }
        if (user.getPassword().equals(password)) {
            return true;
        } else {
            return false;
        }
    }


    public boolean add_newUser(User user) {
        return mathHelperDB.addNewUser(user);
    }

    public boolean add_newGrade(Grade grade) {
        return mathHelperDB.addNewGrade(grade);
    }


    //**********************************************SEARCH USER GETTERS***************************//

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
     * This method returns a list of users based on the role of the admin assigned during account creation time
     *
     * @param username
     * @return ArayList
     */
    public ArrayList<User> getUsersForAdminUser(String username) {
        ArrayList<User> temp = get_allUserList();
        ArrayList<User> usersAssigned = new ArrayList<>();

        for (User user : temp) {
            if (user.getRole().contains(username)) {
                usersAssigned.add(user);

            }
        }
        return usersAssigned;
    }


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
     * This function searches the grades table and returns the grade for the specified grade id. If there is no
     * grade results then an empty grade is returned
     *
     * @param grade_id
     * @return ArrayList
     */
    public Grade searchGrades_gradeId(int grade_id) {
        return Grade.searchForGradeByGradeId(get_allGradeList(), grade_id);
    }


    /**
     * This method returns the grade id of the last id added to the database
     *
     * @return int
     */
    public int getLastGradeIdAdded() {
        return get_allGradeList().size();
    }


    /**
     * This function searches the grades table and returns all the grades for the specified user id. If there are no
     * grade results then an empty list is returned
     *
     * @param user_id
     * @return ArrayList
     */
    public ArrayList<Grade> searchGrades_userId(int user_id) {
        return Grade.searchForGradeByUserId(get_allGradeList(), user_id);
    }


    /**
     * *****************SEARCH QUESTION FUNCTIONS***************************************************
     */


    public ArrayList<Question> searchQuestions_grLevel_catType(GradeLevel grade_level, CategoryType category_type) {

            ArrayList<Question> allQuestionList = get_allQuestionList();
            allQuestionList = Question.searchQuestions(allQuestionList, "grade_level", grade_level);
            return Question.searchQuestions(allQuestionList, "category_type", category_type);
        }
        /**
         * This method searches the Questions table for Questions by Grade Level and returns a list of Questions. If no
         * Questions are found, it returns an empty list.
         *
         * @param grade_level
         * @return ArrayList
         */
        public ArrayList<Question> searchQuestions_grLevel (GradeLevel grade_level){
            return Question.searchQuestions(get_allQuestionList(), "grade_level", grade_level);
        }

        /**
         * This method searches the Questions list by difficulty_level and returns a list of Questions.  If there are no
         * Questions found it returns an empty list.
         *
         * @param difficulty_level
         * @return ArrayList
         */


        /**
         * This method searches the Questions list by category_type and returns a list of Questions.  If there are no
         * Questions found it returns an empty list.
         *
         * @param category_type
         * @return ArrayList
         */
        public ArrayList<Question> searchQuestions_catType (CategoryType category_type){
            return Question.searchQuestions(get_allQuestionList(), "category_type", category_type);

        }

        /*****************************TUTORIAL SEARCH FUNCTIONS********************************/

        /**
         * This method searches for specific questions based on the grade_level, the difficulty_level, and the category_type,
         * and returns a list of Tutorials.  If no results are found it returns an empty string.
         *
         * @param grade_level
         * @param category_type
         * @return ArrayList
         */
        public ArrayList<Tutorial> searchTutorials_grLevel_catType (GradeLevel grade_level,
                CategoryType category_type){
            ArrayList<Tutorial> allTutorialsList = get_allTutorialList();
            allTutorialsList = Tutorial.searchTutorials(allTutorialsList, "grade_level", grade_level);
            return Tutorial.searchTutorials(allTutorialsList, "category_type", category_type);
        }

        /**
         * This method searches the Tutorials table for Questions by Grade Level and returns a list of Tutorials. If no
         * Tutorials are found, it returns an empty list.
         *
         * @param grade_level
         * @return ArrayList
         */
        public ArrayList<Tutorial> searchTutorials_grLevel (GradeLevel grade_level){
            return Tutorial.searchTutorials(get_allTutorialList(), "grade_level", grade_level);
        }


        /**
         * This method searches the Tutorials list by category_type and returns a list of Tutorials.  If there are no
         * Tutorials found it returns an empty list.
         *
         * @param category_type
         * @return ArrayList
         */
        public ArrayList<Tutorial> searchTutorial_catType (CategoryType category_type){
            return Tutorial.searchTutorials(get_allTutorialList(), "category_type", category_type);
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
                    ", password: " + user.getPassword() +
                    ", first_name: " + user.getFirst_name() +
                    ", last_name: " + user.getLast_name() +
                    ", security_question: " + user.getSecurity_question() +
                    ", security_answer: " + user.getSecurity_answer() +
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
                    ", category_type: " + question.getCategory_type() +
                    ", has_question_image: " + question.getHas_question_image() +
                    ", has_answer_image: " + question.getHas_answer_image() +
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
                    ", category_type: " + tutorial.getCategory_type() +
                    ", tutorial: " + tutorial.getTutorial());
            System.out.println("     ");
        }
    }


}
