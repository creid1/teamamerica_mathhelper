/**
 * Name: Christina Reid
 * Date Produced: April 29,2015
 * Purpose: The purpose of this software is to help children learn math.
 */
package com.teamamerica.mathhelper.dbscripts;

import java.sql.*;
import java.sql.SQLException;

/**
 * This class is a script that creates the database and tables for the application.
 * This class is not used in the application but for the DB admin
 */
public class sqlMathHelperCreateDBScript {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://csc362dbinstance.c9giv8vwad8d.us-east-1.rds.amazonaws.com:3306";    // Use MySQL workbench home window to figure out what comes after localhost

    //  Database credentials
    static final String USER = "mathhelper";    //default
    static final String PASS = "teamamerica";        //no password by default


    public static void main(String args[]) {
        Connection conn = null;
        Statement stmt = null;
        String sql = null;
        try {
            System.out.println("Connecting to database...");
            conn = connectToDatabase();

            // A Statement object is used to execute SQL statements. It has 3 methods:
            // Statement.execute(String sql), which simply executes the SQL statement.
            // Statement.executeUpdate(String sql), which executes a SQL statement that changes the database (i.e. UPDATE/INSERT).
            // Statement.executeQuery(String sql), which executes a SQL statement that returns a Result Set (i.e. SELECT).
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            try {
                System.out.println("Checking for database...     ");
                initializeDatabase(stmt);
                System.out.println("Not found.  Created new database.");
            } catch (SQLException se) {
                System.out.println("Found!      Using existing database.");
                // Database already exists, continue.
            }
            createUsersTable(stmt);
            createQuestionsTable(stmt);
            //add values into questions table to test

            createGradesTable(stmt);
            createTutorialsTable(stmt);

            // Use the groupproject database
            sql = "USE mathhelper";
            stmt.execute(sql);

            // Show initial state of members table
            printUsers(stmt);
            printQuestions(stmt);
            printTutorials(stmt);
            printGrades(stmt);

            // Crazy incantation of error catching
        } catch (
                SQLException se
                )

        {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (
                ClassNotFoundException e
                )

        {
            //Handle errors for Class.forName
        } finally

        {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
            }//end finally try
        }//end try

    }


    private static void printUsers(Statement stmt) throws SQLException {
        String sql = "SELECT * FROM users";
        ResultSet rs = stmt.executeQuery(sql);

        System.out.println("SHOWING TABLE: USERS");
        // Extract data from result set.
        while (rs.next()) { // Advances to the next entry (row) in the result set.
            // Retrieve entry's attributes by column name
            int id = rs.getInt("user_id");
            String username = rs.getString("username");
            String password = rs.getString("password");
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            String securityQuestion = rs.getString("security_question");
            String securityAnswer = rs.getString("security_answer");
            String role = rs.getString("role");


            // Display values
            System.out.println("ID: " + id);
            System.out.println(", UserName: " + username);
            System.out.println(", Password: " + password);
            System.out.println(", FirstName: " + firstName);
            System.out.println(", LastName: " + lastName);
            System.out.println(", SecurityQuestion: " + securityQuestion);
            System.out.println(", SecurityAnswer: " + securityAnswer);
            System.out.println(", Role: " + role);
            System.out.println("     ");
        }

        // Close result set.
        try {
            rs.close();
        } catch (SQLException se) {
            se.printStackTrace();
            System.out.println(se.getMessage());
        }
    }


    private static void printGrades(Statement stmt) throws SQLException {
        String sql = "SELECT * FROM grades";
        ResultSet rs = stmt.executeQuery(sql);

        System.out.println("SHOWING TABLE: GRADES");
        // Extract data from result set.
        while (rs.next()) { // Advances to the next entry (row) in the result set.
            // Retrieve entry's attributes by column name
            int id = rs.getInt("grade_id");
            int userid = rs.getInt("user_id");
            String gradeLevel = rs.getString("grade_level");
            String category = rs.getString("category");
            String difficultyLevel = rs.getString("difficulty_level");
            String grade = rs.getString("grade");
            int correct = rs.getInt("correct");
            int total = rs.getInt("total");

            // Display values
            System.out.println("ID: " + id);
            System.out.println(", userid: " + userid);
            System.out.println(", grade_level: " + gradeLevel);
            System.out.println(", category: " + category);
            System.out.println(", difficulty_level: " + difficultyLevel);
            System.out.println(", grade: " + grade);
            System.out.println(", correct: " + correct);
            System.out.println(", total: " + total);
        }

        // Close result set.
        try {
            rs.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }


    private static void printQuestions(Statement stmt) throws SQLException {
        String sql = "SELECT * FROM questions";
        ResultSet rs = stmt.executeQuery(sql);


        System.out.println("SHOWING TABLE: QUESTIONS");
        // Extract data from result set.
        while (rs.next()) { // Advances to the next entry (row) in the result set.
            // Retrieve entry's attributes by column name
            int id = rs.getInt("question_id");
            String gradelevel = rs.getString("grade_level");
            String categoryType = rs.getString("category_type");
            boolean hasQuestionImage = rs.getBoolean("has_question_image");
            boolean hasAnswerImage = rs.getBoolean("has_answer_image");
            String question = rs.getString("question");
            String answer = rs.getString("answer");
            String wrong1 = rs.getString("wrong_1");
            String wrong2 = rs.getString("wrong_2");
            String wrong3 = rs.getString("wrong_3");

            // Display values
            System.out.println("ID: " + id);
            System.out.println(", Grade Level: " + gradelevel);
            System.out.println(", Category Type: " + categoryType);
            System.out.println("Cas Question image: " + hasQuestionImage);
            System.out.println(", Has Answer Image: " + hasAnswerImage);
            System.out.println(", Question: " + question);
            System.out.println(", Answer: " + answer);
            System.out.println(", Wrong1: " + wrong1);
            System.out.println(", Wrong2: " + wrong2);
            System.out.println(", Wrong3: " + wrong3);
        }

        // Close result set.
        try {
            rs.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }

    private static void printTutorials(Statement stmt) throws SQLException {

        String sql = "SELECT * FROM tutorials";
        ResultSet rs = stmt.executeQuery(sql);

        System.out.println("SHOWING TABLE: TUTORIALS");
        // Extract data from result set.
        while (rs.next()) { // Advances to the next entry (row) in the result set.
            // Retrieve entry's attributes by column name
            int id = rs.getInt("tutorial_id");
            String gradelevel = rs.getString("grade_level");
            String categoryType = rs.getString("category_type");
            String tutorial = rs.getString("tutorial");

            // Display values
            System.out.println("ID: " + id);
            System.out.println(", Grade Level: " + gradelevel);
            System.out.println(", Tutorial Type: " + categoryType);
            System.out.println(", Tutorial: " + tutorial);
        }

        // Close result set.
        try {
            rs.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }

    /**
     * Establishes and returns a Connection object for the database.
     */
    private static Connection connectToDatabase() throws SQLException, ClassNotFoundException {
        //STEP 2: Register JDBC driver
        Class.forName(JDBC_DRIVER);

        //STEP 3: Open a connection
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        return conn;
    }

    /**
     * Initialize the database. Only needs to be run once, when your database is empty.
     */
    private static void initializeDatabase(Statement stmt) throws SQLException {
        // Creates a new database
        String sql = "CREATE DATABASE mathhelper";
        stmt.execute(sql);    // executeUpdate method is used for SQL statements which change the database without returning information.

        // Use the mathhelper database
        sql = "USE mathhelper";
        stmt.execute(sql);
    }

    private static void createUsersTable(Statement stmt) throws SQLException {

        // Use the mathhelper database
        String sql = "USE mathhelper";
        stmt.execute(sql);

        try {
            // Creates a users table
            sql = "CREATE TABLE users" +
                    "(user_id INT UNSIGNED NOT NULL AUTO_INCREMENT, " +
                    "username TEXT NOT NULL, " +
                    "password TEXT NOT NULL, " +
                    "first_name TEXT NOT NULL, " +
                    "last_name TEXT NOT NULL, " +
                    "security_question TEXT NOT NULL, " +
                    "security_answer TEXT NOT NULL, " +
                    "role TEXT NOT NULL, " +
                    "PRIMARY KEY(user_id));";
            stmt.execute(sql);
            String[] users = {"swalker", "testUser2", "creid", "billybob", "inielsen", "cousensb", "jsharma0223"};
            String[] role = {"S_creid", "S_creid", "A", "S_jsharma0223", "A", "A", "A"};
            for (int i = 0; i < users.length; i++) {
                sql = "INSERT INTO users (username,password,first_name,last_name,security_question,security_answer,role)" +
                        "VALUES ('" + users[i] + "','password','FakeFirstName','FakeLastName','What is the name of your school?','FSU','" + role[i] + "');";
                stmt.executeUpdate(sql);
            }

            sql = "INSERT INTO users (username,password,first_name,last_name,security_question,security_answer,role)" +
                    "VALUES ('testUser3','password','Chris','Cole','What is the name of your school?','FSU','S_creid');";
            stmt.executeUpdate(sql);
        } catch (SQLException se) {
            System.out.println("Found!      Using existing users table.");
            System.out.println(se.getMessage());
            // Table already exists, continue.
        }
    }

    private static void createQuestionsTable(Statement stmt) throws SQLException {

        // Use the mathhelper database
        String sql = "USE mathhelper";
        stmt.execute(sql);

        try {
            // Creates a questions table
            sql = "CREATE TABLE questions" +
                    "(question_id INT UNSIGNED NOT NULL AUTO_INCREMENT, " +
                    "grade_level CHAR(30) NOT NULL, " +
                    "category_type CHAR(40) NOT NULL, " +
                    "has_question_image BOOLEAN NOT NULL, " +
                    "has_answer_image BOOLEAN NOT NULL, " +
                    "question TEXT NOT NULL, " +
                    "answer TEXT NOT NULL, " +
                    "wrong_1 TEXT NOT NULL, " +
                    "wrong_2 TEXT NOT NULL, " +
                    "wrong_3 TEXT NOT NULL, " +
                    "PRIMARY KEY(question_id));";
            stmt.execute(sql);
        } catch (SQLException se) {
            System.out.println("Found!      Using existing questions table.");
            System.out.println(se.getMessage());
            // Table already exists, continue.
        }
    }


    private static void addTutorialToDB(Statement stmt, String value) {

        // Use the mathhelper database
        String sql = "USE mathhelper";
        try {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            stmt.executeUpdate(value);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    private static void addQuestionToDB(Statement stmt, String value) {

        // Use the mathhelper database
        String sql = "USE mathhelper";
        try {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            stmt.executeUpdate(value);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private static void createTutorialsTable(Statement stmt) throws SQLException {

        // Use the mathhelper database
        String sql = "USE mathhelper";
        stmt.execute(sql);

        try {
            // Creates a tutorials table
            sql = "CREATE TABLE tutorials" +
                    "(tutorial_id INT UNSIGNED NOT NULL AUTO_INCREMENT, " +
                    "grade_level CHAR(30) NOT NULL, " +
                    "category_type CHAR(40) NOT NULL, " +
                    "tutorial TEXT NOT NULL, " +
                    "PRIMARY KEY(tutorial_id));";
            stmt.execute(sql);

        } catch (SQLException se) {
            System.out.println("Found!      Using existing tutorials table.");
            System.out.println(se.getMessage());
            // Table already exists, continue.
        }
    }

    private static void createGradesTable(Statement stmt) throws SQLException {

        // Use the mathhelper database
        String sql = "USE mathhelper";
        stmt.execute(sql);

        try {
            // Creates a grades table
            sql = "CREATE TABLE grades" +
                    "(grade_id INT UNSIGNED NOT NULL AUTO_INCREMENT, " +
                    "user_id INT UNSIGNED NOT NULL, " +
                    "grade_level TEXT NOT NULL, " +
                    "category TEXT NOT NULL, " +
                    "difficulty_level TEXT NOT NULL, " +
                    "grade TEXT NOT NULL, " +
                    "correct INT UNSIGNED NOT NULL, " +
                    "total INT UNSIGNED NOT NULL, " +
                    "PRIMARY KEY(grade_id));";
            stmt.execute(sql);
            sql = "INSERT INTO grades(user_id,grade_level,category,difficulty_level,grade,correct,total)" +
                    "VALUES (1,'K','Addition','Easy','A+',5,5);";
            stmt.executeUpdate(sql);
        } catch (SQLException se) {
            System.out.println("Found!      Using existing grades table.");
            // Table already exists, continue.
        }
    }
}