/**
 * Name: Christina Reid
 * Date Produced: April 29,2015
 * Purpose: The purpose of this software is to help children learn math.
 */
package com.teamamerica.mathhelper.db;

import com.teamamerica.mathhelper.models.Grade;
import com.teamamerica.mathhelper.models.Question;
import com.teamamerica.mathhelper.models.Tutorial;
import com.teamamerica.mathhelper.models.User;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Christina on 4/11/2015.
 */

/**
 * The MathHelperDB is the database level class that connects to the MySQL server in the cloud.
 * The MathHelperDB contains all the necessary methods for updating and retrieval of database information that is used
 * throughout the application.
 */
public class MathHelperDB {

    // JDBC driver name and database URL
    protected final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    // protected final String DB_URL = "jdbc:mysql://localhost:3306";
    //TODO: change this to be the mathhelper url
    protected final String DB_URL = "jdbc:mysql://csc362dbinstance.c9giv8vwad8d.us-east-1.rds.amazonaws.com:3306";
    //  Database credentials
    protected final String USER = "mathhelper";    //default
    protected final String PASS = "teamamerica";
    protected Connection conn = null;
    protected Statement statement = null;
    protected String sql = null;
    protected final String loggerName = "MathHelperDB";

    //default constructor doesn't initialize any variables
    public MathHelperDB() {

    }

    /**
     * Establishes and returns a Connection object for the database.
     */
    private void openDBConnection() {
        //connect to the database
        dbConnect();
        //create statement
        createStatement();
        //set database math helper
        useMathHelperDB();
    }

    /**
     * This methoc closes the connection to the DB
     */
    private void closeDBConnection() {
        try {
            //Logger.get//Logger(loggerName).log(Level.INFO,"Closing Connection to Math Helper DB.....");
            conn.close();
            //Logger.get//Logger(loggerName).log(Level.INFO,"Connection Closed.....");
        } catch (SQLException e) {
            //Logger.get//Logger(loggerName).log(Level.SEVERE, e.getMessage());
            //Logger.get//Logger(loggerName).log(Level.SEVERE, e.getStackTrace().toString());
        }
        try {
            //Logger.get//Logger(loggerName).log(Level.INFO,"Closing Statement to Math Helper DB.....");
            statement.close();
            //Logger.get//Logger(loggerName).log(Level.INFO,"Statement Closed.....");
        } catch (SQLException e) {
            //Logger.get//Logger(loggerName).log(Level.SEVERE, e.getMessage());
            //Logger.get//Logger(loggerName).log(Level.SEVERE, e.getStackTrace().toString());
        }
    }


    /**
     * This method connects to the database
     */
    private void dbConnect() {
        //Logger.get//Logger(loggerName).log(Level.INFO, "Connecting to database...");
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            //Logger.get//Logger(loggerName).log(Level.INFO, "Database Connection Successful...");
        } catch (SQLException e) {
            //Logger.get//Logger(loggerName).log(Level.SEVERE, "Could not connect to the database...");
            //Logger.get//Logger(loggerName).log(Level.SEVERE, e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException ce) {
            //Logger.get//Logger(loggerName).log(Level.SEVERE, "Could not find the class name...");
            //Logger.get//Logger(loggerName).log(Level.SEVERE, ce.getMessage());
            ce.printStackTrace();
        }
    }

    /**
     * This method creates a new statement
     */
    private void createStatement() {
        try {
            //create a new statement
            statement = conn.createStatement();
            //Logger.get//Logger(loggerName).log(Level.INFO, "Found!      Using existing database.");
            // Database already exists, continue.
        } catch (SQLException e) {
            //Logger.get//Logger(loggerName).log(Level.SEVERE, e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * This method executes the statement to use the mathhelper database
     */
    private void useMathHelperDB() {
        // Use the mathhelper database
        //Logger.get//Logger(loggerName).log(Level.INFO,"Connecting to Math Helper DB.....");
        String sql = "USE mathhelper";
        try {
            statement.execute(sql);
            //Logger.get//Logger(loggerName).log(Level.INFO, "Connecting to Math Helper DB Successful....");
        } catch (SQLException e) {
            //Logger.get//Logger(loggerName).log(Level.SEVERE,e.getMessage());
            e.printStackTrace();
        }
    }


    /**
     * This method adds a new user to the database
     * @param user
     * @return boolean
     */
    public boolean addNewUser(User user) {
        openDBConnection();
        sql = "INSERT users " +
                "SET username = ?, password = ?, first_name = ?, last_name = ?, " +
                "security_question = ?, security_answer = ?, role = ?";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getFirst_name());
            ps.setString(4, user.getLast_name());
            ps.setString(5, user.getSecurity_question());
            ps.setString(6, user.getSecurity_answer());
            ps.setString(7, user.getRole());

            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            //Logger.get//Logger(loggerName).log(Level.INFO, e.getMessage());
            e.printStackTrace();

        } finally {
            closeDBConnection();
        }

        return false;
    }

    /**
     * This method updates an existing user in the database
     * @param user
     * @return boolean
     */

    public boolean editUser(User user) {
        openDBConnection();
        String sql = "UPDATE users SET username=?, password=?, first_name=?, last_name=?, security_question=?, " +
                "security_answer=?, role=? " +
                "WHERE user_id=?;";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getFirst_name());
            ps.setString(4, user.getLast_name());
            ps.setString(5, user.getSecurity_question());
            ps.setString(6, user.getSecurity_answer());
            ps.setString(7, user.getRole());
            ps.setInt(8, user.getUser_id());
            ps.execute();
            ps.close();
            return true;
        } catch (SQLException e) {
            //Logger.get//Logger(loggerName).log(Level.INFO, e.getMessage());
            e.printStackTrace();

        } finally {
            closeDBConnection();
        }

        return false;
    }


    /**
     * Deletes the specified user from the database.
     *
     * @return True if a user with that id was successfully deleted from the database.
     */
    public boolean deleteUser(int user_id) {
        openDBConnection();
        boolean error = false;
        String sql = "DELETE FROM users WHERE user_id=?;";
        PreparedStatement selectStmt = null;
        try {
            selectStmt = conn.prepareStatement(sql);
            selectStmt.setInt(1, user_id);
            selectStmt.execute();
        } catch (SQLException se) {
            error = true;
        } finally {
            try {
                if (selectStmt != null) {
                    selectStmt.close();
                }
            } catch (SQLException se2) {
            }
        }
        return !error;
    }

    /**
     * Deletes the specified user's grades from the database.
     *
     * @return True if the grades with that id were successfully deleted from the database.
     */
    public boolean deleteGradeByGradeId(int grade_id) {
        openDBConnection();

        boolean error = false;
        String sql = "DELETE FROM grades WHERE grade_id=?;";
        PreparedStatement selectStmt = null;
        try {
            selectStmt = conn.prepareStatement(sql);
            selectStmt.setInt(1, grade_id);
            selectStmt.execute();
        } catch (SQLException se) {
            error = true;
        } finally {
            try {
                if (selectStmt != null) {
                    selectStmt.close();
                }
            } catch (SQLException se2) {
            }
        }
        return !error;
    }


    /**
     * This method adds a new grade to the database
     * @param grade
     * @return boolean
     */
    public boolean addNewGrade(Grade grade) {
        openDBConnection();
        sql = "INSERT grades " +
                "SET user_id = ?, grade_level = ?, category = ?, difficulty_level = ?, grade = ?, " +
                "correct = ?, total = ?";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, grade.getUser_id());
            ps.setString(2, grade.getGrade_level());
            ps.setString(3, grade.getCategory());
            ps.setString(4, grade.getDifficulty_level());
            ps.setString(5, grade.getGrade());
            ps.setInt(6, grade.getCorrect());
            ps.setInt(7, grade.getTotal());

            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            //Logger.get//Logger(loggerName).log(Level.INFO, e.getMessage());
            e.printStackTrace();

        } finally {
            closeDBConnection();
        }

        return false;
    }

    /**
     * This method returns a User ArrayList of all the users in the database
     * @return ArrayList
     */
    public ArrayList<User> getUserTableList() {
        ArrayList<User> users = new ArrayList<>();
        openDBConnection();

        try {
            String sql = "SELECT * FROM users";
            ResultSet rs = statement.executeQuery(sql);
            // Extract data from result set.
            while (rs.next()) { // Advances to the next entry (row) in the result set.
                // Retrieve entry's attributes by column name
                User user = new User();
                user.setUser_id(rs.getInt("user_id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setFirst_name(rs.getString("first_name"));
                user.setLast_name(rs.getString("last_name"));
                user.setSecurity_question(rs.getString("security_question"));
                user.setSecurity_answer(rs.getString("security_answer"));
                user.setRole(rs.getString("role"));
                users.add(user);
            }
            // Close result set.
            rs.close();
        } catch (SQLException se) {
            //Logger.get//Logger(loggerName).log(Level.INFO, se.getMessage());
            se.printStackTrace();
        } finally {
            closeDBConnection();
        }

        return users;
    }


    /**
     * This method returns all the grades and stores the Grades object in a list
     * @return ArrayList
     */
    public ArrayList<Grade> getGradeTableList() {
        ArrayList<Grade> grades = new ArrayList<>();
        openDBConnection();

        try {
            String sql = "SELECT * FROM grades";
            ResultSet rs = statement.executeQuery(sql);

            // Extract data from result set.
            while (rs.next()) { // Advances to the next entry (row) in the result set.
                // Retrieve entry's attributes by column name
                Grade grade = new Grade();
                grade.setGrade_id(rs.getInt("grade_id"));
                grade.setUser_id(rs.getInt("user_id"));
                grade.setGrade_level(rs.getString("grade_level"));
                grade.setCategory(rs.getString("category"));
                grade.setDifficulty_level(rs.getString("difficulty_level"));
                grade.setGrade(rs.getString("grade"));
                grade.setCorrect(rs.getInt("correct"));
                grade.setTotal(rs.getInt("total"));
                grades.add(grade);
            }
            // Close result set.
            rs.close();
        } catch (SQLException se) {
            //Logger.get//Logger(loggerName).log(Level.INFO, se.getMessage());
            se.printStackTrace();
        } finally {
            closeDBConnection();
        }

        return grades;
    }


    /**
     * This method returns all of the questions in the table
     * @return ArrayList
     */
    public ArrayList<Question> getQuestionTableList() {
        ArrayList<Question> questions = new ArrayList<>();
        openDBConnection();

        try {
            String sql = "SELECT * FROM questions";
            ResultSet rs = statement.executeQuery(sql);
            // Extract data from result set.
            while (rs.next()) { // Advances to the next entry (row) in the result set.
                // Retrieve entry's attributes by column name
                Question question = new Question();
                question.setQuestion_id(rs.getInt("question_id"));
                question.setGrade_level(rs.getString("grade_level"));
                question.setCategory_type(rs.getString("category_type"));
                question.setHas_question_image(rs.getBoolean("has_question_image"));
                question.setHas_question_image(rs.getBoolean("has_question_image"));
                question.setHas_answer_image(rs.getBoolean("has_answer_image"));
                question.setQuestion(rs.getString("question"));
                question.setAnswer(rs.getString("answer"));
                question.setWrong_1(rs.getString("wrong_1"));
                question.setWrong_2(rs.getString("wrong_2"));
                question.setWrong_3(rs.getString("wrong_3"));
                questions.add(question);
            }
            // Close result set.
            rs.close();
        } catch (SQLException se) {
            //Logger.get//Logger(loggerName).log(Level.SEVERE, se.getMessage());
            se.printStackTrace();
        } finally {
            closeDBConnection();
        }
        return questions;
    }

    /**
     * This method returns all the tutorials in the tutorials table
     * @return ArrayList
     */
    public ArrayList<Tutorial> getTutorialTableList() {
        ArrayList<Tutorial> tutorials = new ArrayList<>();
        openDBConnection();

        try {
            String sql = "SELECT * FROM tutorials";
            ResultSet rs = statement.executeQuery(sql);
            // Extract data from result set.
            while (rs.next()) { // Advances to the next entry (row) in the result set.
                // Retrieve entry's attributes by column name
                Tutorial tutorial = new Tutorial();
                tutorial.setTutorial_id(rs.getInt("tutorial_id"));
                tutorial.setGrade_level(rs.getString("grade_level"));
                tutorial.setCategory_type(rs.getString("category_type"));
                tutorial.setTutorial(rs.getString("tutorial"));
                tutorials.add(tutorial);
            }
            // Close result set.
            rs.close();
        } catch (SQLException se) {
            //Logger.get//Logger(loggerName).log(Level.INFO, se.getMessage());
            se.printStackTrace();
        } finally {
            closeDBConnection();
        }

        return tutorials;
    }

}
