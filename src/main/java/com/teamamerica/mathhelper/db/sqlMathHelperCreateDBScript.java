package com.teamamerica.mathhelper.db;

import java.sql.*;
import java.sql.SQLException;

/**
 * You need to download the Java Database Connector (JDBC) here (http://dev.mysql.com/downloads/connector/j/).
 * Once downloaded, you will need to move the .jar file which was part of the .zip you downloaded for the JDBC.
 * Move the JAR file to the folder: /Library/Java/Extensions
 */
public class sqlMathHelperCreateDBScript {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306";    // Use MySQL workbench home window to figure out what comes after localhost

    //  Database credentials
    static final String USER = "root";    //default
    static final String PASS = "csc400";        //no password by default

    static MathHelperDB mathHelperDB;

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
            e.printStackTrace();
        } finally

        {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
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
            String role = rs.getString("role");

            // Display values
            System.out.println("ID: " + id);
            System.out.println(", UserName: " + username);
            System.out.println(", Password: " + password);
            System.out.println(",Role: " + role);
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
            String userid = rs.getString("user_id");
            String grade = rs.getString("grade");

            // Display values
            System.out.println("ID: " + id);
            System.out.println(", userid: " + userid);
            System.out.println(", grade: " + grade);
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
            String questionlevel = rs.getString("question_level");
            String questionType = rs.getString("question_type");
            String question = rs.getString("question");
            String answer = rs.getString("answer");
            String wrong1 = rs.getString("wrong_1");
            String wrong2 = rs.getString("wrong_2");
            String wrong3 = rs.getString("wrong_2");

            // Display values
            System.out.println("ID: " + id);
            System.out.println(", Grade Level: " + gradelevel);
            System.out.println(", Question Level: " + questionlevel);
            System.out.println(", Question Tpe: " + questionType);
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
            String tutoriallevel = rs.getString("tutorial_level");
            String tutorialtype = rs.getString("tutorial_type");
            String tutorial = rs.getString("tutorial");

            // Display values
            System.out.println("ID: " + id);
            System.out.println(", Grade Level: " + gradelevel);
            System.out.println(", Tutorial Level: " + tutoriallevel);
            System.out.println(", Tutorial Type: " + tutorialtype);
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
                    "username CHAR(30) NOT NULL, " +
                    "password CHAR(40) NOT NULL, " +
                    "role CHAR(40) NOT NULL, " +
                    "PRIMARY KEY(user_id));";
            stmt.execute(sql);
            String[] users = {"testUser1", "testUser2", "creid", "billybob"};
            String[] role = {"A", "S", "A", "S"};
            for (int i = 0; i < users.length; i++) {
                sql = "INSERT INTO users (username,password,role)" +
                        "VALUES ('" + users[i] + "', 'password','" + role[i] + "');";
                stmt.executeUpdate(sql);
            }
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
                    "question_level CHAR(40) NOT NULL, " +
                    "question_type CHAR(40) NOT NULL, " +
                    "question TEXT NOT NULL, " +
                    "answer TEXT NOT NULL, " +
                    "wrong_1 TEXT NOT NULL, " +
                    "wrong_2 TEXT NOT NULL, " +
                    "wrong_3 TEXT NOT NULL, " +
                    "PRIMARY KEY(question_id));";
            stmt.execute(sql);
            sql = "INSERT INTO questions (grade_level,question_level,question_type,question,answer,wrong_1,wrong_2,wrong_3)" +
                    "VALUES ('K','E','addition','What is 2 + 2?','4','3','7','9');";
            stmt.executeUpdate(sql);
        } catch (SQLException se) {
            System.out.println("Found!      Using existing questions table.");
            System.out.println(se.getMessage());
            System.out.println(se.getStackTrace().toString());
            // Table already exists, continue.
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
                    "tutorial_level CHAR(40) NOT NULL, " +
                    "tutorial_type CHAR(40) NOT NULL, " +
                    "tutorial TEXT NOT NULL, " +
                    "PRIMARY KEY(tutorial_id));";
            stmt.execute(sql);
            sql = "INSERT INTO tutorials(grade_level,tutorial_level,tutorial_type, tutorial)" +
                    "VALUES ('K','E','addition','2 + 2 = 4');";
            stmt.executeUpdate(sql);
        } catch (SQLException se) {
            System.out.println("Found!      Using existing tutorials table.");
            System.out.println(se.getMessage());
            System.out.println(se.getStackTrace().toString());
            // Table already exists, continue.
        }
    }

    private static void createGradesTable(Statement stmt) throws SQLException {

        // Use the mathhelper database
        String sql = "USE mathhelper";
        stmt.execute(sql);

        try {
            // Creates a testproblems table
            sql = "CREATE TABLE grades" +
                    "(grade_id INT UNSIGNED NOT NULL AUTO_INCREMENT, " +
                    "user_id INT UNSIGNED NOT NULL, " +
                    "grade FLOAT UNSIGNED NOT NULL, " +
                    "PRIMARY KEY(grade_id));";
            stmt.execute(sql);
            sql = "INSERT INTO grades(user_id,grade)" +
                    "VALUES (1,97);";
            stmt.executeUpdate(sql);
        } catch (SQLException se) {
            System.out.println("Found!      Using existing grades table.");
            System.out.println(se.getMessage());
            // Table already exists, continue.
        }
    }
}