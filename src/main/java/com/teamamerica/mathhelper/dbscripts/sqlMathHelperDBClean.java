/**
 * Name: Christina Reid
 * Date Produced: April 29,2015
 * Purpose: The purpose of this software is to help children learn math.
 */
package com.teamamerica.mathhelper.dbscripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Christina on 4/16/2015.
 */
/**
 * This class is a script that deletes the math helper database.
 * This class is not used in the application but for the DB Admin.
 */
public class sqlMathHelperDBClean {

    protected static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    protected static final String DB_URL = "jdbc:mysql://csc362dbinstance.c9giv8vwad8d.us-east-1.rds.amazonaws.com:3306";    // Use MySQL workbench home window to figure out what comes after localhost

    //  Database credentials
    protected static final String USER = "mathhelper";    //default
    protected static final String PASS = "teamamerica";        //no password by default


    protected static Connection conn = null;
    protected static Statement statement = null;
    protected static String sql = null;

    public static void main(String[] args){
        sqlMathHelperDBClean.dbDrop();
    }

    public static void dbDrop() {
        try {
            System.out.println("Connecting to database...");
            conn = connectToDatabase();
         System.out.println("Creating statement...");
            statement = conn.createStatement();

        } catch (SQLException se) {
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
                statement.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }




    protected static Connection connectToDatabase() throws SQLException, ClassNotFoundException {
        //STEP 2: Register JDBC driver
        Class.forName(JDBC_DRIVER);

        //STEP 3: Open a connection
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        return conn;
    }
    /**
     * Establishes and returns a Connection object for the database.
     */
    protected static void openDBConnection() {
        //connect to the database
        dbConnect();
        //create statement
        createStatement();
        //set database math helper
        userMathHelperDB();
    }

    protected static void closeDBConnection() {
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


    protected static void dbConnect() {
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

    protected static void createStatement() {
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

    protected static void userMathHelperDB() {
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
