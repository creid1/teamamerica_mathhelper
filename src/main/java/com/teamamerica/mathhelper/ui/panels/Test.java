/**
 * Name: Christina Reid, Brandon Cousen, Ian Nielson
 * Date Produced: April 29,2015
 * Purpose: The purpose of this software is to help children learn math.
 */
package com.teamamerica.mathhelper.ui.panels;

import com.teamamerica.mathhelper.configurators.GradeConfigurator;
import com.teamamerica.mathhelper.configurators.QuestionsPageConfigurator;
import com.teamamerica.mathhelper.configurators.UserInteractionsConfigurator;
import com.teamamerica.mathhelper.controllers.CategoryType;
import com.teamamerica.mathhelper.controllers.DifficultyLevel;
import com.teamamerica.mathhelper.controllers.GradeLevel;
import com.teamamerica.mathhelper.environment.ConfigDirectory;
import com.teamamerica.mathhelper.models.Question;
import com.teamamerica.mathhelper.ui.customcomponents.AudioListener;
import com.teamamerica.mathhelper.ui.customcomponents.ImageButton;
import com.teamamerica.mathhelper.ui.customcomponents.ImageLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;


//TODO: fix the frame to bring things in close relative to the image in the center of the frame and adjust outwards from there

public class Test extends JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ImageButton btnC;
    private ImageButton btnA;
    private ImageButton btnMain;
    private ImageButton btnNext;
    private ImageButton btnHints;
    private ImageButton btnD;
    private ImageButton btnB;
    private JLabel lblQuestionCounter;
    private ImageLabel lblAnswer;
    private ImageLabel lblCorrect;
    private ImageLabel lblQuestion;
    private JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    //private variable for data creation
    private Question question;
    private ImageButton correctAnswer;
    private ArrayList<ImageButton> listOfButtons;

    private int testQuestionCounter;
    private double questionsMax;
    private double correct;
    private ImageButton btnHelp;


    public Test() {
        QuestionsPageConfigurator.loadQuestions();
        testQuestionCounter = 0;
        questionsMax = QuestionsPageConfigurator.getNumberOfTestQuestions();
        correct = 0;

        initComponents();
        listOfButtons = new ArrayList<>();
        listOfButtons.add(btnA);
        listOfButtons.add(btnB);
        listOfButtons.add(btnC);
        listOfButtons.add(btnD);
        generateAnswerButtons();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        question = QuestionsPageConfigurator.getQuestion();

        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);


        jPanel1 = new JPanel();
        btnMain = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_home.png"), 150, 125);
        btnHints = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_helpDesk.png"), 150, 101);
        btnHelp = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_help.gif"), 150, 101);

        btnMain.setToolTipText("Home!");
        btnHelp.setToolTipText("I Need Help!");
        btnHints.setToolTipText("HelpDesk Hints!");


        btnA = new ImageButton(question.getHas_answer_image(), checkHasFileToGenerateFullPath(question.getAnswer(), question.getHas_answer_image()), 175, 175);
        btnB = new ImageButton(question.getHas_answer_image(), checkHasFileToGenerateFullPath(question.getWrong_1(), question.getHas_answer_image()), 175, 175);
        btnC = new ImageButton(question.getHas_answer_image(), checkHasFileToGenerateFullPath(question.getWrong_2(), question.getHas_answer_image()), 175, 175);
        btnD = new ImageButton(question.getHas_answer_image(), checkHasFileToGenerateFullPath(question.getWrong_3(), question.getHas_answer_image()), 175, 175);

        btnA.setToolTipText("Is this correct?");
        btnB.setToolTipText("Is this correct?");
        btnC.setToolTipText("Is this correct?");
        btnD.setToolTipText("Is this correct?");

        lblQuestionCounter = new JLabel();
        lblAnswer = new ImageLabel(question.getHas_answer_image(), checkHasFileToGenerateFullPath(question.getAnswer(), question.getHas_answer_image()), 1000, 150);
        lblCorrect = new ImageLabel(150, 150);
        lblQuestion = new ImageLabel(question.getHas_question_image(), checkHasFileToGenerateFullPath(question.getQuestion(), question.getHas_question_image()), 1000, 150);
        btnNext = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_arrow.jpg"), 150, 101);
        btnNext.setToolTipText("Next!");

        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel1.setLayout(null);

        btnMain.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMainActionPerformed(evt);
            }
        });
        jPanel1.add(btnMain);
        btnMain.setBounds(10, 10, 150, 125);

        btnHints.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnHintsActionPerformed(evt);
            }
        });
        jPanel1.add(btnHints);
        btnHints.setBounds(850, 575, 150, 101);


        btnHelp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        jPanel1.add(btnHelp);
        btnHelp.setBounds(30, 575, 150, 101);

        btnA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if (source == btnA & btnA == correctAnswer) {
                    correct++;
                    lblCorrect.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_correct.jpg"));
                } else {
                    lblCorrect.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_wrong.jpg"));

                }
                lblCorrect.setVisible(true);
                checkAnswerButtons();

            }
        });
        jPanel1.add(btnA);


        btnD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if (source == btnD & btnD == correctAnswer) {
                    correct++;
                    lblCorrect.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_correct.jpg"));
                } else {
                    lblCorrect.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_wrong.jpg"));

                }
                lblCorrect.setVisible(true);
                checkAnswerButtons();

            }
        });
        jPanel1.add(btnD);

        btnB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if (source == btnB & btnB == correctAnswer) {
                    correct++;
                    lblCorrect.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_correct.jpg"));
                } else {
                    lblCorrect.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_wrong.jpg"));
                }
                lblCorrect.setVisible(true);
                checkAnswerButtons();
            }

        });
        jPanel1.add(btnB);
        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if (source == btnC & btnC == correctAnswer) {
                    correct++;
                    lblCorrect.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_correct.jpg"));
                } else {
                    lblCorrect.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_wrong.jpg"));
                }
                lblCorrect.setVisible(true);
                checkAnswerButtons();

            }
        });
        jPanel1.add(btnC);

        btnA.setBounds(115, 390, 175, 175);
        btnB.setBounds(315, 390, 175, 175);

        btnC.setBounds(515, 390, 175, 175);
        btnD.setBounds(715, 390, 175, 175);


        jPanel1.add(lblAnswer);
        lblAnswer.setVisible(false);

        jPanel1.add(lblCorrect);

        jPanel1.add(lblQuestion);

        lblQuestionCounter.setFont(new Font("Comic Sans MS", 0, 65)); // NOI18N
        lblQuestionCounter.setText("Question: " + (testQuestionCounter + 1) + "/" + (int) questionsMax);
        jPanel1.add(lblQuestionCounter);
        lblQuestionCounter.setBounds(265, 30, 1000, 90);

        lblQuestion.setBounds(75, 170, 1000, 150);
        lblAnswer.setBounds(450, 170, 1000, 150);
        lblCorrect.setBounds(775, 170, 150, 150);

        lblCorrect.setVisible(false);


        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel1.add(btnNext);
        btnNext.setBounds(820, 30, 150, 101);
        btnNext.setVisible(false);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHelpActionPerformed(ActionEvent evt) {

        AudioListener.stopAudioListener();
        AudioListener.runAudioListener("SpeechOn.wav");
        AudioListener.runAudioListener("test.wav");



    }

    private void btnMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        AudioListener.stopAudioListener();
        AudioListener.runAudioListener("SpeechOn.wav");

        int userInput = JOptionPane.showConfirmDialog(
                null, "Are you sure you want to exit the test?", "Test Exit?", JOptionPane.YES_NO_OPTION);
        if (userInput == 0) {
            new MainMenu().setVisible(true);
            this.setVisible(false);
        } else {


        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnHintsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        AudioListener.runAudioListener("SpeechOn.wav");
        new HelpDeskHints().setVisible(true);

    }//GEN-LAST:event_jButton7ActionPerformed


    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.out.println("Correct: " + correct);
        System.out.println("Counter: " + testQuestionCounter);
        System.out.println("Total: " + questionsMax);
        // TODO add your handling code here:
        btnNext.setVisible(false);
        testQuestionCounter++;
        System.out.println("New testQuestionUpdate: " + testQuestionCounter);
        if (testQuestionCounter >= questionsMax) {
            GradeConfigurator.calculateGradeAndSubmit(correct, questionsMax);
            AudioListener.stopAudioListener();
            AudioListener.runAudioListener("SpeechOn.wav");
            AudioListener.runAudioListener("SpeechOn.wav");
            this.dispose();
            new Results().setVisible(true);

        } else {
            question = QuestionsPageConfigurator.getQuestion();
            lblQuestionCounter.setText("Question: " + (testQuestionCounter + 1) + "/" + (int) questionsMax);
            lblQuestion.changeLabelImage(question.getHas_question_image(), checkHasFileToGenerateFullPath(question.getQuestion(), question.getHas_question_image()));
            lblAnswer.changeLabelImage(question.getHas_answer_image(), checkHasFileToGenerateFullPath(question.getAnswer(), question.getHas_answer_image()));
            lblAnswer.setVisible(false);
            lblCorrect.setVisible(false);
            generateAnswerButtons();
        }
    }//GEN-LAST:event_jButton6ActionPerformed


    private void checkAnswerButtons() {
        lblAnswer.setVisible(true);
        btnNext.setVisible(true);
        for (ImageButton button : listOfButtons) {
            if (button == correctAnswer) {
                correctAnswer.createRightAnswerButton();
            } else {
                button.createWrongAnswerButton();
            }
        }
    }

    private String checkHasFileToGenerateFullPath(String fileName, boolean isImage) {

        if (isImage) {
            return ConfigDirectory.getImageFileFromDirectory(fileName);
        } else {
            return fileName;
        }

    }


    private void generateAnswerButtons() {
        int answer = randInt(0, 3);
        ImageButton button = listOfButtons.get(answer);
        if (button == btnA) {
            correctAnswer = btnA;
            btnA.changeButtonImage(question.getHas_answer_image(), checkHasFileToGenerateFullPath(question.getAnswer(), question.getHas_answer_image()));
            btnB.changeButtonImage(question.getHas_answer_image(), checkHasFileToGenerateFullPath(question.getWrong_1(), question.getHas_answer_image()));
            btnC.changeButtonImage(question.getHas_answer_image(), checkHasFileToGenerateFullPath(question.getWrong_2(), question.getHas_answer_image()));
            btnD.changeButtonImage(question.getHas_answer_image(), checkHasFileToGenerateFullPath(question.getWrong_3(), question.getHas_answer_image()));
        }
        if (listOfButtons.get(answer) == btnB) {
            correctAnswer = btnB;
            btnB.changeButtonImage(question.getHas_answer_image(), checkHasFileToGenerateFullPath(question.getAnswer(), question.getHas_answer_image()));
            btnA.changeButtonImage(question.getHas_answer_image(), checkHasFileToGenerateFullPath(question.getWrong_3(), question.getHas_answer_image()));
            btnC.changeButtonImage(question.getHas_answer_image(), checkHasFileToGenerateFullPath(question.getWrong_1(), question.getHas_answer_image()));
            btnD.changeButtonImage(question.getHas_answer_image(), checkHasFileToGenerateFullPath(question.getWrong_2(), question.getHas_answer_image()));


        }

        if (listOfButtons.get(answer) == btnC) {
            correctAnswer = btnC;
            btnC.changeButtonImage(question.getHas_answer_image(), checkHasFileToGenerateFullPath(question.getAnswer(), question.getHas_answer_image()));
            btnA.changeButtonImage(question.getHas_answer_image(), checkHasFileToGenerateFullPath(question.getWrong_3(), question.getHas_answer_image()));
            btnB.changeButtonImage(question.getHas_answer_image(), checkHasFileToGenerateFullPath(question.getWrong_2(), question.getHas_answer_image()));
            btnD.changeButtonImage(question.getHas_answer_image(), checkHasFileToGenerateFullPath(question.getWrong_1(), question.getHas_answer_image()));

        }
        if (listOfButtons.get(answer) == btnD) {
            correctAnswer = btnD;
            btnD.changeButtonImage(question.getHas_answer_image(), checkHasFileToGenerateFullPath(question.getAnswer(), question.getHas_answer_image()));
            btnA.changeButtonImage(question.getHas_answer_image(), checkHasFileToGenerateFullPath(question.getWrong_3(), question.getHas_answer_image()));
            btnC.changeButtonImage(question.getHas_answer_image(), checkHasFileToGenerateFullPath(question.getWrong_2(), question.getHas_answer_image()));
            btnB.changeButtonImage(question.getHas_answer_image(), checkHasFileToGenerateFullPath(question.getWrong_1(), question.getHas_answer_image()));


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
                new Test().setVisible(true);
            }
        });
    }
}