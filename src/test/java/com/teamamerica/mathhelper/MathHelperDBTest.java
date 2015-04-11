package com.teamamerica.mathhelper;

import com.teamamerica.mathhelper.models.Grade;
import com.teamamerica.mathhelper.models.Question;
import com.teamamerica.mathhelper.models.Tutorial;
import com.teamamerica.mathhelper.models.User;
import com.teamamerica.mathhelper.db.MathHelperDBClient;

import java.util.ArrayList;

/**
 * Created by Christina on 4/11/2015.
 */
public class MathHelperDBTest {

    public static void main(String[] args) {

        MathHelperDBClient mathHelperDBClient = new MathHelperDBClient();
     //   System.out.println("Need user added: " + mathHelperDBClient.add_newUser(new User("tim12", "password", "S")));
       // mathHelperDBClient.print_users();
        //mathHelperDBClient.add_newGrade(new Grade(2, 67));
        //mathHelperDBClient.print_grades();
        //mathHelperDBClient.print_questions();
        //mathHelperDBClient.print_tutorials();

        //User user = mathHelperDBClient.searchUsers_userid(1);
        //System.out.println(user.getUsername());

        //ArrayList<Grade> grades = mathHelperDBClient.searchGrades_userId(user.getUser_id());
        //for(Grade g : grades){
          //  System.out.println(g.getGrade());
        //}

        ArrayList<Tutorial> tutorials = mathHelperDBClient.searchTutorials_grLevel("K");
        for(Tutorial t : tutorials){
            System.out.println(t.getTutorial());
        }

        ArrayList<Question> questions = mathHelperDBClient.searchQuestions_grLevel("k");
        for(Question q : questions){
            System.out.println(q.getQuestion());
        }
    }
}
