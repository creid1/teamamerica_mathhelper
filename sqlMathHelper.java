import java.sql.*;
import java.sql.SQLException;

/**
 * You need to download the Java Database Connector (JDBC) here (http://dev.mysql.com/downloads/connector/j/).
 * Once downloaded, you will need to move the .jar file which was part of the .zip you downloaded for the JDBC.
 * Move the JAR file to the folder: /Library/Java/Extensions
 */
public class sqlMathHelper {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306";    // Use MySQL workbench home window to figure out what comes after localhost

    //  Database credentials
    static final String USER = "root";    //default
    static final String PASS = "csc400";        //no password by default

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
            createTestProblemsTable(stmt);
            createGradesTable(stmt);
            createTutorialsTable(stmt);
            // Use the groupproject database
            sql = "USE mathhelper";
            stmt.execute(sql);

            // Show initial state of members table
            printUsers(stmt);
            printTestProblems(stmt);
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
            int id = rs.getInt("userid");
            String username = rs.getString("username");
            String password = rs.getString("password");

            // Display values
            System.out.println("ID: " + id);
            System.out.println(", UserName: " + username);
            System.out.println(", Password: " + password);
            System.out.println(" ");
        }

        // Close result set.
        try {
            rs.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }


    private static void printGrades(Statement stmt) throws SQLException {
        String sql = "SELECT * FROM grades";
        ResultSet rs = stmt.executeQuery(sql);

        System.out.println("SHOWING TABLE: GRADES");
        // Extract data from result set.
        while (rs.next()) { // Advances to the next entry (row) in the result set.
            // Retrieve entry's attributes by column name
            int id = rs.getInt("gradeid");
            String userid = rs.getString("userid");
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


    private static void printTestProblems(Statement stmt) throws SQLException {
        String sql = "SELECT * FROM testproblems";
        ResultSet rs = stmt.executeQuery(sql);


        System.out.println("SHOWING TABLE: TESTPROBLEMS");
        // Extract data from result set.
        while (rs.next()) { // Advances to the next entry (row) in the result set.
            // Retrieve entry's attributes by column name
            int id = rs.getInt("problemid");
            String gradelevel = rs.getString("gradelevel");
            String questionlevel = rs.getString("questionlevel");
            String question = rs.getString("question");
            String answer = rs.getString("answer");

            // Display values
            System.out.println("ID: " + id);
            System.out.println(", Grade Level: " + gradelevel);
            System.out.println(", Question Level: " + questionlevel);
            System.out.println(", Question: " + question);
            System.out.println(", Answer: " + answer);
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
            int id = rs.getInt("tutorialid");
            String gradelevel = rs.getString("gradelevel");
            String tutoriallevel = rs.getString("tutoriallevel");
            String tutorial = rs.getString("tutorial");

            // Display values
            System.out.println("ID: " + id);
            System.out.println(", Grade Level: " + gradelevel);
            System.out.println(", Tutorial Level: " + tutoriallevel);
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
        Class.forName("com.mysql.jdbc.Driver");

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

        try{
        // Creates a users table
        sql = "CREATE TABLE users" +
                "(userid INT UNSIGNED NOT NULL, " +
                "username CHAR(30) NOT NULL, " +
                "password CHAR(40) NOT NULL, " +
                "PRIMARY KEY(userid));";
        stmt.execute(sql);
        String[] users = {"testUser1", "testUser2", "creid", "billybob"};
        for (int i = 1; i <= 4; i++) {
            sql = "INSERT INTO users values (" + i + ", '" + users[i] + "', 'password');";
            stmt.executeUpdate(sql);
        }
        } catch (SQLException se) {
            System.out.println("Found!      Using existing users table.");
            // Table already exists, continue.
        }
    }

    private static void createTestProblemsTable(Statement stmt) throws SQLException {

        // Use the mathhelper database
        String sql = "USE mathhelper";
        stmt.execute(sql);

        try{
        // Creates a testproblems table
        sql = "CREATE TABLE testproblems" +
                "(problemid INT UNSIGNED NOT NULL, " +
                "gradelevel CHAR(30) NOT NULL, " +
                "questionlevel CHAR(40) NOT NULL, " +
                "question CHAR(40) NOT NULL, " +
                "answer CHAR(40) NOT NULL, " +
                "PRIMARY KEY(problemid));";
        stmt.execute(sql);
        sql = "INSERT INTO testproblems values (1, 'K','B','What is 2 + 2?', '4');";
        stmt.executeUpdate(sql);
        } catch (SQLException se) {
            System.out.println("Found!      Using existing testproblems table.");
            // Table already exists, continue.
        }
    }

    private static void createTutorialsTable(Statement stmt) throws SQLException {

        // Use the mathhelper database
        String sql = "USE mathhelper";
        stmt.execute(sql);

        try{
            // Creates a testproblems table
            sql = "CREATE TABLE tutorials" +
                    "(tutorialid INT UNSIGNED NOT NULL, " +
                    "gradelevel CHAR(30) NOT NULL, " +
                    "tutoriallevel CHAR(40) NOT NULL, " +
                    "tutorial CHAR(40) NOT NULL, " +
                    "PRIMARY KEY(tutorialid));";
            stmt.execute(sql);
            sql = "INSERT INTO tutorials values (1, 'K','B','2 + 2 = 4');";
            stmt.executeUpdate(sql);
        } catch (SQLException se) {
            System.out.println("Found!      Using existing tutorials table.");
            // Table already exists, continue.
        }
    }

    private static void createGradesTable(Statement stmt) throws SQLException {

        // Use the mathhelper database
        String sql = "USE mathhelper";
        stmt.execute(sql);

        try{
            // Creates a testproblems table
            sql = "CREATE TABLE grades" +
                    "(gradeid INT UNSIGNED NOT NULL, " +
                    "userid INT UNSIGNED NOT NULL, " +
                    "grade INT UNSIGNED NOT NULL, " +
                    "PRIMARY KEY(gradeid));";
            stmt.execute(sql);
            sql = "INSERT INTO grades values (1,1,97);";
            stmt.executeUpdate(sql);
        } catch (SQLException se) {
            System.out.println("Found!      Using existing grades table.");
            // Table already exists, continue.
        }
    }
}