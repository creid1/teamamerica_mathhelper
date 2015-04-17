package com.teamamerica.mathhelper.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Christina on 4/16/2015.
 */
public class MathHelperDBClean {

    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://csc362dbinstance.c9giv8vwad8d.us-east-1.rds.amazonaws.com:3306";    // Use MySQL workbench home window to figure out what comes after localhost

    //  Database credentials
    private final String USER = "mathhelper";    //default
    private final String PASS = "teamamerica";        //no password by default


    private Connection conn = null;
    private Statement statement = null;
    private String sql = null;

    public static void main(String[] args){
        new MathHelperDBClean().dbDrop();
    }

    public void dbDrop() {
        try {
            System.out.println("Connecting to database...");
            conn = connectToDatabase();

            // A Statement object is used to execute SQL statements. It has 3 methods:
            // Statement.execute(String sql), which simply executes the SQL statement.
            // Statement.executeUpdate(String sql), which executes a SQL statement that changes the database (i.e. UPDATE/INSERT).
            // Statement.executeQuery(String sql), which executes a SQL statement that returns a Result Set (i.e. SELECT).
            System.out.println("Creating statement...");
            statement = conn.createStatement();


            System.out.println("Checking for database...     ");
            initializeDatabase(statement);
            System.out.println("Not found.  Created new database.");
        } catch (SQLException se) {
            System.out.println("Found!      Using existing database.");
            // Database already exists, continue.
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            // Use the mathhelper database
            String sql = "DROP DATABASE mathhelper";
            System.out.println("Database dropped...     ");

            statement.execute(sql);
        } catch (SQLException e) {
            System.out.println("Error dropping database...     ");

            e.printStackTrace();
        }
        finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

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

    private Connection connectToDatabase() throws SQLException, ClassNotFoundException {
        //STEP 2: Register JDBC driver
        Class.forName(JDBC_DRIVER);

        //STEP 3: Open a connection
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        return conn;
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

    private void userMathHelperDB() {
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


}
