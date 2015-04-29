/**
 * Name: Christina Reid
 * Date Produced: April 29,2015
 * Purpose: The purpose of this software is to help children learn math.
 */
package com.teamamerica.mathhelper.dbscripts;

import com.teamamerica.mathhelper.db.MathHelperDBClient;
import com.teamamerica.mathhelper.environment.ConfigDirectory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Christina on 4/17/2015.
 */

/**
 * This class is a script that uploads the tutorials and questions to the math helper database.
 * This class is not used in the application but for the DB Admin.
 */
public class sqlMathHelperUpload extends sqlMathHelperDBClean{


    public static void main(String args[]) {

        sqlMathHelperUpload.uploadTutorials();
        System.out.println("TUTORIAL TABLE LENGTH: " + new MathHelperDBClient().get_allTutorialList().size());

        sqlMathHelperUpload.uploadQuestions();
        System.out.println("QUESTION TABLE LENGTH: " + new MathHelperDBClient().get_allQuestionList().size());


    }


    public static void uploadTutorials() {

        ArrayList<String> preparedStatements = getPreparedStatements("Tutorials");
        openDBConnection();

        for(String sql : preparedStatements){
            try {
                statement.executeUpdate(sql);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }



    public static void uploadQuestions() {

        ArrayList<String> preparedStatements = getPreparedStatements("Questions");
        openDBConnection();

        for(String sql : preparedStatements){
            try {
                statement.executeUpdate(sql);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }




    public static ArrayList<String> getPreparedStatements(String type) {
        ArrayList<String> tutorialsToUpload;
        ArrayList<String> questionsToUpload;

        if (type.equalsIgnoreCase("tutorials")) {
            tutorialsToUpload = new ArrayList<>();

            BufferedReader br = null;

            try {

                String sCurrentLine;

                try {
                    br = new BufferedReader(new FileReader((ConfigDirectory.getFileStringForFullPath("db/TutorialsDB.txt"))));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                while ((sCurrentLine = br.readLine()) != null) {
                    tutorialsToUpload.add(sCurrentLine);
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (br != null) br.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            return tutorialsToUpload;
        }

        if (type.equalsIgnoreCase("questions")) {

            questionsToUpload = new ArrayList<>();
            BufferedReader br = null;

            try {

                String sCurrentLine;

                try {
                    br = new BufferedReader(new FileReader((ConfigDirectory.getFileStringForFullPath("db/QuestionsDB.txt"))));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                while ((sCurrentLine = br.readLine()) != null) {
                    questionsToUpload.add(sCurrentLine);
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (br != null) br.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            return questionsToUpload;
        }

        return  null;
    }

}
