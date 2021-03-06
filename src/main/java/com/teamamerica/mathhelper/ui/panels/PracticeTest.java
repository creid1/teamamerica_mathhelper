/**
 * Name: Christina Reid, Brandon Cousen, Ian Nielson
 * Date Produced: April 29,2015
 * Purpose: The purpose of this software is to help children learn math.
 */
package com.teamamerica.mathhelper.ui.panels;

import com.teamamerica.mathhelper.configurators.QuestionsPageConfigurator;
import com.teamamerica.mathhelper.configurators.TutorialsPageConfigurator;
import com.teamamerica.mathhelper.configurators.UserInteractionsConfigurator;
import com.teamamerica.mathhelper.controllers.CategoryType;
import com.teamamerica.mathhelper.controllers.DifficultyLevel;
import com.teamamerica.mathhelper.controllers.GradeLevel;
import com.teamamerica.mathhelper.environment.ConfigDirectory;
import com.teamamerica.mathhelper.models.Question;
import com.teamamerica.mathhelper.ui.customcomponents.AudioListener;
import com.teamamerica.mathhelper.ui.customcomponents.ImageButton;
import com.teamamerica.mathhelper.ui.customcomponents.ImageLabel;
import com.teamamerica.mathhelper.ui.customcomponents.YouTubeFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Christina on 4/18/2015.
 */
public class PracticeTest extends JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ImageButton btnC;
    private ImageButton btnA;
    private ImageButton btnHome;
    private ImageButton btnNext;
    private ImageButton btnHints;
    private ImageButton btnHelp;
    private ImageButton btnD;
    private ImageButton btnB;
    private JLabel lblQuestionCounter;
    private ImageLabel lblAnswer;
    private ImageLabel lblCorrect;
    private ImageLabel lblQuestion;
    private JPanel jPanel1;
    private ImageButton btnPencilReady;
    private ImageButton btnLearnNow;

    // End of variables declaration//GEN-END:variables

    //private variable for data creation
    private Question question;
    private ImageButton correctAnswer;
    private ArrayList<ImageButton> listOfButtons;


    public PracticeTest() {

        QuestionsPageConfigurator.loadQuestions();
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
        btnHome = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_home.png"), 150, 125);
        btnHints = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_helpDesk.png"), 150, 101);
        btnHelp = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_help.gif"), 150, 101);

        btnHome.setToolTipText("Home!");
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
        btnPencilReady = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_psharpener.png"), 150, 113);

        btnLearnNow = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_videoTutorial.jpg"), 150, 113);
        btnLearnNow.setToolTipText("Learn Now!");
        btnPencilReady.setToolTipText("Pencils Ready!");
        btnNext.setToolTipText("Next!");

        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel1.setLayout(null);

        btnHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMainActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome);

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

        jPanel1.add(btnLearnNow);
        btnLearnNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLearnNowActionPerformed(evt);
            }
        });


        btnA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if (source == btnA) {
                    if (btnA == correctAnswer) {
                        lblCorrect.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_correct.jpg"));
                    } else {
                        lblCorrect.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_wrong.jpg"));

                    }
                    lblCorrect.setVisible(true);
                    checkAnswerButtons();
                }
            }
        });
        jPanel1.add(btnA);


        btnD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if (source == btnD) {
                    if (btnD == correctAnswer) {
                        lblCorrect.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_correct.jpg"));
                    } else {
                        lblCorrect.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_wrong.jpg"));

                    }
                    lblCorrect.setVisible(true);
                    checkAnswerButtons();
                }
            }
        });
        jPanel1.add(btnD);

        btnB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if (source == btnB) {
                    if (btnB == correctAnswer) {
                        lblCorrect.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_correct.jpg"));
                    } else {
                        lblCorrect.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_wrong.jpg"));

                    }
                    lblCorrect.setVisible(true);
                    checkAnswerButtons();
                }
            }
        });
        jPanel1.add(btnB);
        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if (source == btnC) {
                    if (btnC == correctAnswer) {
                        lblCorrect.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_correct.jpg"));
                    } else {
                        lblCorrect.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_wrong.jpg"));

                    }
                    lblCorrect.setVisible(true);
                    checkAnswerButtons();
                }
            }
        });
        jPanel1.add(btnC);

        btnA.setBounds(75, 390, 175, 175);
        btnB.setBounds(290, 390, 175, 175);

        btnC.setBounds(500, 390, 175, 175);
        btnD.setBounds(715, 390, 175, 175);

        jPanel1.add(lblAnswer);
        lblAnswer.setVisible(false);

        jPanel1.add(lblCorrect);


        jPanel1.add(btnPencilReady);

        btnPencilReady.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestsActionPerformed(evt);
            }
        });

        jPanel1.add(lblQuestion);

        lblQuestionCounter.setFont(new Font("Comic Sans MS", 0, 85)); // NOI18N
        lblQuestionCounter.setText("Practice");
        jPanel1.add(lblQuestionCounter);

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
        btnNext.setVisible(false);

        btnHome.setBounds(10, 10, 150, 125);
        btnPencilReady.setBounds(145, 25, 150, 101);
        lblQuestionCounter.setBounds(300, 30, 1000, 101);
        btnLearnNow.setBounds(650, 20, 150, 113);
        btnNext.setBounds(820, 30, 150, 101);


        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );

        pack();
        System.out.println(this.getX());
        int width = this.getWidth();
        int height = this.getHeight();
        System.out.println(width + ":" + height);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTestsActionPerformed(ActionEvent evt) {
        AudioListener.stopAudioListener();
        AudioListener.runAudioListener("SpeechOn.wav");

        this.dispose();
        new Difficulty().setVisible(true);

    }

    private void btnHelpActionPerformed(ActionEvent evt) {
        AudioListener.stopAudioListener();
        AudioListener.runAudioListener("SpeechOn.wav");
        AudioListener.runAudioListener("practice.wav");

    }

    private void btnLearnNowActionPerformed(ActionEvent evt) {
        AudioListener.stopAudioListener();
        AudioListener.runAudioListener("SpeechOn.wav");

        if (evt.getSource().equals(btnLearnNow)) {

            TutorialsPageConfigurator.loadTutorialsList();

            this.dispose();
            new YouTubeFrame(TutorialsPageConfigurator.getTutorial().getTutorial()).setVisible(true);
        }
    }

    private void btnMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        if (evt.getSource() == btnHome) {
            AudioListener.stopAudioListener();
            AudioListener.runAudioListener("SpeechOn.wav");
            this.dispose();
            new MainMenu().setVisible(true);

        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnHintsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        AudioListener.runAudioListener("SpeechOn.wav");
        new HelpDeskHints().setVisible(true);

    }//GEN-LAST:event_jButton7ActionPerformed


    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        AudioListener.runAudioListener("SpeechOn.wav");

        btnNext.setVisible(false);
        question = QuestionsPageConfigurator.getQuestion();
        System.out.println(question.getQuestion());
        lblQuestion.changeLabelImage(question.getHas_question_image(), checkHasFileToGenerateFullPath(question.getQuestion(), question.getHas_question_image()));
        lblAnswer.changeLabelImage(question.getHas_answer_image(), checkHasFileToGenerateFullPath(question.getAnswer(), question.getHas_answer_image()));
        lblAnswer.setVisible(false);
        lblCorrect.setVisible(false);
        generateAnswerButtons();

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
                new PracticeTest().setVisible(true);
            }
        });
    }
}
