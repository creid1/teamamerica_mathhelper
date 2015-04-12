package com.teamamerica.mathhelper.ui.panels;

import com.teamamerica.mathhelper.configurators.QuestionsPageConfigurator;
import com.teamamerica.mathhelper.configurators.UserInteractionsConfigurator;
import com.teamamerica.mathhelper.controllers.CategoryType;
import com.teamamerica.mathhelper.controllers.DifficultyLevel;
import com.teamamerica.mathhelper.controllers.GradeLevel;
import com.teamamerica.mathhelper.environment.ConfigDirectory;
import com.teamamerica.mathhelper.models.Question;
import com.teamamerica.mathhelper.ui.customcomponents.ImageButton;
import com.teamamerica.mathhelper.ui.customcomponents.ImageLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Christina on 4/12/2015.
 */
public class GlobalTestMain extends JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Question question;

    private JButton btnNext;
    private JButton btnTests;
    private JButton btnHelp;
    private JLabel lblTest;
    private JPanel pnQuestionAnswer, pnAnswerButtons, pnHeader, pnQuestion;
    private ImageButton btnB;
    private ImageButton btnC;
    private ImageButton btnA;
    private ImageButton btnD;
    private JLabel lblQuestion, lblQuestionTitle;
    ImageLabel lblAnswer;

    private ArrayList<ImageButton> listOfButtons;
    private ImageButton correctAnswer;
    // End of variables declaration//GEN-END:variables


    public GlobalTestMain() {

        QuestionsPageConfigurator.loadQuestionsList();
        question = QuestionsPageConfigurator.getQuestion();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new BorderLayout());
        // pack();
        setLocationRelativeTo(null);
        initComponents();
        add(pnHeader, BorderLayout.NORTH);
        add(pnQuestionAnswer, BorderLayout.CENTER);
        add(btnHelp, BorderLayout.SOUTH);

        listOfButtons = new ArrayList<>();
        listOfButtons.add(btnA);
        listOfButtons.add(btnB);
        listOfButtons.add(btnC);
        listOfButtons.add(btnD);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createHeaderPanel();
        createAnswerButtonsPanel();
        createQuestionPanel();
        createQuestionAnswerPanel();

        btnHelp = new JButton();
        btnHelp.setBackground(new java.awt.Color(153, 204, 255));
        btnHelp.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnHelp.setText("Help");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });


    }// </editor-fold>//GEN-END:initComponents

    private void createAnswerButtonsPanel() {

        pnAnswerButtons = new JPanel();
        pnAnswerButtons.setLayout(new GridLayout(2, 2));

        btnA = new ImageButton(question.getHas_image(),checkHasFileToGenerateFullPath(question.getAnswer()), 50, 50);
        correctAnswer = btnA;
        btnB = new ImageButton(question.getHas_image(),checkHasFileToGenerateFullPath(question.getWrong_1()), 50, 50);
        btnC = new ImageButton(question.getHas_image(),checkHasFileToGenerateFullPath(question.getWrong_2()), 50, 50);
        btnD = new ImageButton(question.getHas_image(),checkHasFileToGenerateFullPath(question.getWrong_3()), 50, 50);

        btnA.setPreferredSize(new Dimension(120, 40));
        btnB.setPreferredSize(new Dimension(120, 40));
        btnC.setPreferredSize(new Dimension(120, 40));
        btnD.setPreferredSize(new Dimension(120, 40));

        btnA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if (source == btnA) {
                    checkAnswerButtons();
                }
            }
        });
        btnB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if (source == btnB) {
                    checkAnswerButtons();
                }
            }
        });
        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if (source == btnC) {
                    checkAnswerButtons();
                }
            }
        });
        btnD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if (source == btnD) {
                    checkAnswerButtons();
                }
            }
        });

        pnAnswerButtons.add(btnA);
        pnAnswerButtons.add(btnB);
        pnAnswerButtons.add(btnC);
        pnAnswerButtons.add(btnD);


    }

    private void createQuestionAnswerPanel() {

        pnQuestionAnswer = new JPanel();
        pnQuestionAnswer.setLayout(new BorderLayout());

        pnQuestionAnswer.add(pnQuestion,BorderLayout.NORTH);
        pnQuestionAnswer.add(pnAnswerButtons, BorderLayout.CENTER);


    }

    private void createQuestionPanel(){

        pnQuestion = new JPanel();
        pnQuestion.setLayout(new GridLayout(1,3));

        lblQuestion = new JLabel(question.getQuestion());
        lblQuestion.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        lblQuestion.setVisible(true);
        lblQuestion.setPreferredSize(new Dimension(100, 40));

        lblAnswer = new ImageLabel(question.getHas_image(),checkHasFileToGenerateFullPath(question.getAnswer()),300,100);
        lblAnswer.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        lblAnswer.setVisible(false);
        lblAnswer.setPreferredSize(new Dimension(100, 40));

        lblQuestionTitle = new JLabel("Question: ");
        lblQuestionTitle.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        lblQuestionTitle.setVisible(true);
        lblQuestionTitle.setPreferredSize(new Dimension(300,40));


        pnQuestion.add(lblQuestionTitle);
        pnQuestion.add(lblQuestion);
        pnQuestion.add(lblAnswer);

    }


    private void createHeaderPanel() {

        pnHeader = new JPanel();
        pnHeader.setLayout(new GridLayout(1, 3));

        lblTest = new JLabel();
        btnNext = new JButton();
        btnTests = new JButton();


        lblTest.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        lblTest.setText("Test");
        lblTest.setPreferredSize(new Dimension(40, 40));

        btnNext.setBackground(new java.awt.Color(153, 204, 255));
        btnNext.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnNext.setText("Next ");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        btnNext.setPreferredSize(new Dimension(40, 40));

        btnTests.setBackground(new java.awt.Color(153, 204, 255));
        btnTests.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnTests.setText("Tests");
        btnTests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        btnTests.setPreferredSize(new Dimension(40, 40));


        pnHeader.add(btnTests);
        pnHeader.add(lblTest);
        pnHeader.add(btnNext);


    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        question = QuestionsPageConfigurator.getQuestion();
        lblQuestion.setText(question.getQuestion());
        lblAnswer.changeLabelImage(question.getHas_image(),checkHasFileToGenerateFullPath(question.getAnswer()));
        lblAnswer.setVisible(false);
        generateAnswerButtons();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Object source = evt.getSource();
        if (source == btnTests) {
            new FirstGradeTestMain().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed


    private void checkAnswerButtons() {
        lblAnswer.setVisible(true);
        for (ImageButton button : listOfButtons) {
            if (button == correctAnswer) {
                correctAnswer.createRightAnswerButton();
            } else {
                button.createWrongAnswerButton();
            }
        }
    }

    private String checkHasFileToGenerateFullPath(String fileName) {

        if (question.getHas_image()) {
            return ConfigDirectory.getImageFileFromDirectory(fileName);
        } else {
            return fileName;
        }

    }


    private void generateAnswerButtons() {
        int answer = randInt(0, 3);
        System.out.println(answer);
        ImageButton button = listOfButtons.get(answer);
        if (button == btnA) {
            System.out.println("ButtonA");
            correctAnswer = btnA;
            btnA.changeButtonImage(question.getHas_image(),checkHasFileToGenerateFullPath(question.getAnswer()));
            btnB.changeButtonImage(question.getHas_image(),checkHasFileToGenerateFullPath(question.getWrong_1()));
            btnC.changeButtonImage(question.getHas_image(),checkHasFileToGenerateFullPath(question.getWrong_2()));
            btnD.changeButtonImage(question.getHas_image(),checkHasFileToGenerateFullPath(question.getWrong_3()));
        }
        if (listOfButtons.get(answer) == btnB) {
            System.out.println("ButtonB");
            correctAnswer = btnB;
            btnB.changeButtonImage(question.getHas_image(),checkHasFileToGenerateFullPath(question.getAnswer()));
            btnA.changeButtonImage(question.getHas_image(), checkHasFileToGenerateFullPath(question.getWrong_3()));
            btnC.changeButtonImage(question.getHas_image(),checkHasFileToGenerateFullPath(question.getWrong_1()));
            btnD.changeButtonImage(question.getHas_image(),checkHasFileToGenerateFullPath(question.getWrong_2()));


        }

        if (listOfButtons.get(answer) == btnC) {
            System.out.println("ButtonC");
            correctAnswer = btnC;
            btnC.changeButtonImage(question.getHas_image(),checkHasFileToGenerateFullPath(question.getAnswer()));
            btnA.changeButtonImage(question.getHas_image(),checkHasFileToGenerateFullPath(question.getWrong_3()));
            btnB.changeButtonImage(question.getHas_image(),checkHasFileToGenerateFullPath(question.getWrong_2()));
            btnD.changeButtonImage(question.getHas_image(),checkHasFileToGenerateFullPath(question.getWrong_1()));

        }
        if (listOfButtons.get(answer) == btnD) {
            System.out.println("ButtonD");
            correctAnswer = btnD;
            btnD.changeButtonImage(question.getHas_image(),checkHasFileToGenerateFullPath(question.getAnswer()));
            btnA.changeButtonImage(question.getHas_image(),checkHasFileToGenerateFullPath(question.getWrong_3()));
            btnC.changeButtonImage(question.getHas_image(),checkHasFileToGenerateFullPath(question.getWrong_2()));
            btnB.changeButtonImage(question.getHas_image(),checkHasFileToGenerateFullPath(question.getWrong_1()));



        }
    }


    private int randInt(int min, int max) {

        // Usually this can be a field rather than a method variable
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }


    public static void main(String args[]) {

        UserInteractionsConfigurator.set_category_type_enum(CategoryType.ADDITION);
        UserInteractionsConfigurator.set_difficulty_level_enum(DifficultyLevel.EASY);
        UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.K);


        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GlobalTestMain().setVisible(true);
            }
        });
    }

}
