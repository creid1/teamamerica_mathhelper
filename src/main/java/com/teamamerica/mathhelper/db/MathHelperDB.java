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
        userMathHelperDB();
    }

    private void closeDBConnection() {
        try {
            //Logger.get//Logger(loggerName).log(Level.INFO,"Closing Connection to Math Helper DB.....");
            conn.close();
            //Logger.get//Logger(loggerName).log(Level.INFO,"Connection Closed.....");
        } catch (SQLException e){
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

    private void createStatement(){
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

    private void userMathHelperDB(){
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


    public boolean addNewUser(User user) {
        openDBConnection();
        sql = "INSERT users " +
                "SET username = ?, password = ?, role = ?";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getRole());

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


    public boolean addNewGrade(Grade grade) {
        openDBConnection();
        sql = "INSERT grades " +
                "SET user_id = ?, grade = ?";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, grade.getUser_id());
            ps.setInt(2, grade.getGrade());
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
                grade.setGrade(rs.getInt("grade"));
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
                question.setDifficulty_level(rs.getString("difficulty_level"));
                question.setCategory_type(rs.getString("category_type"));
                question.setHas_image(rs.getBoolean("has_image"));
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
