package com.teamamerica.mathhelper.ui.panels;

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
    private ImageButton btnHelp;
    private ImageButton btnD;
    private ImageButton btnB;
    private JLabel lblQuestionHeader;
    private ImageLabel lblAnswer;
    private JLabel lblNext;
    private ImageLabel lblCorrect;
    private ImageLabel lblQuestion;
    private JLabel lblMainMenu;
    private JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    //private variable for data creation
    private Question question;
    private ImageButton correctAnswer;
    private ArrayList<ImageButton> listOfButtons;


    public Test() {
        QuestionsPageConfigurator.loadQuestionsList();
        initComponents();
        listOfButtons = new ArrayList<>();
        listOfButtons.add(btnA);
        listOfButtons.add(btnB);
        listOfButtons.add(btnC);
        listOfButtons.add(btnD);

        correctAnswer = btnA;

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        question = QuestionsPageConfigurator.getQuestion();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        jPanel1 = new JPanel();
        btnMain = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_homepage.png"), 150, 100);
        btnHelp = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_helpIcon.jpeg"), 80, 80);
        lblNext = new JLabel();
        btnA = new ImageButton(question.getHas_image(), checkHasFileToGenerateFullPath(question.getAnswer()), 150, 150);
        btnB = new ImageButton(question.getHas_image(), checkHasFileToGenerateFullPath(question.getWrong_1()), 150, 150);
        btnC = new ImageButton(question.getHas_image(), checkHasFileToGenerateFullPath(question.getWrong_2()), 150, 150);
        btnD = new ImageButton(question.getHas_image(), checkHasFileToGenerateFullPath(question.getWrong_3()), 150, 150);

        lblQuestionHeader = new JLabel();
        lblAnswer = new ImageLabel(question.getHas_image(), checkHasFileToGenerateFullPath(question.getAnswer()), 150, 150);
        lblCorrect = new ImageLabel(true, ConfigDirectory.getImageFileFromDirectory("panels_correct.jpg"),150,150);
        lblQuestion = new ImageLabel(question.getHas_image(), checkHasFileToGenerateFullPath(question.getQuestion()), 150, 150);
        btnNext = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_arrow.jpg"), 150, 101);
        lblMainMenu = new JLabel();


        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        btnMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainActionPerformed(evt);
            }
        });
        jPanel1.add(btnMain);
        btnMain.setBounds(10, 10, 150, 100);

        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        jPanel1.add(btnHelp);
        btnHelp.setBounds(880, 500, 80, 80);


        lblNext.setBackground(new java.awt.Color(255, 255, 255));
        lblNext.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblNext.setText("      Next");
        jPanel1.add(lblNext);
        lblNext.setBounds(840, 70, 150, 34);

        btnA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if (source == btnA) {
                    if (btnA == correctAnswer) {
 //                       lblCorrect.setText("Correct");
                    }
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
                       // lblCorrect.setText("Correct");
                    }
                    checkAnswerButtons();
                }
            }
        });
        jPanel1.add(btnD);
        btnD.setBounds(575, 410, 150, 150);

        btnB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if (source == btnB) {
                    if (btnB == correctAnswer) {
                      //  lblCorrect.setText("Correct");
                    }
                    checkAnswerButtons();
                }
            }
        });
        jPanel1.add(btnB);
        btnB.setBounds(160, 410, 150, 150);
        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if (source == btnC) {
                    if (btnA == correctAnswer) {
                     //   lblCorrect.setText("Correct!");
                    } else {
                     //   lblCorrect.setText("Wrong!");
                    }
                    checkAnswerButtons();
                }
            }
        });
        jPanel1.add(btnC);

        btnA.setBounds(160,230, 150, 150);
        btnC.setBounds(575, 230, 150, 150);

        lblQuestionHeader.setFont(new java.awt.Font("Comic Sans MS", 0, 58)); // NOI18N
        lblQuestionHeader.setText("Question: 1/5");
        jPanel1.add(lblQuestionHeader);
        lblQuestionHeader.setBounds(300, 10, 370, 60);

        lblAnswer.setFont(new java.awt.Font("Comic Sans MS", 0, 100)); // NOI18N
        jPanel1.add(lblAnswer);
        lblAnswer.setBounds(400, 80, 150, 150);
        lblAnswer.setVisible(false);

        jPanel1.add(lblCorrect);
        lblCorrect.setBounds(730, 80, 150, 150);
        lblCorrect.setVisible(true);

        lblQuestion.setFont(new java.awt.Font("Comic Sans MS", 0, 40)); // NOI18N
        jPanel1.add(lblQuestion);
        lblQuestion.setBounds(75, 80, 150, 150);

        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel1.add(btnNext);
        btnNext.setBounds(820, 10, 150, 101);

        lblMainMenu.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblMainMenu.setText("  Main Menu");
        jPanel1.add(lblMainMenu);
        lblMainMenu.setBounds(10, 70, 150, 30);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        AudioListener.runAudioListener("SpeechOn.wav");
        int userInput = JOptionPane.showConfirmDialog(
                null, "Are you sure you want to exit the test?", "Test Exit?", JOptionPane.YES_NO_OPTION);
        if (userInput == 0) {
            new MainMenu().setVisible(true);
            this.dispose();
        } else {


        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        AudioListener.runAudioListener("SpeechOn.wav");

    }//GEN-LAST:event_jButton7ActionPerformed


    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        question = QuestionsPageConfigurator.getQuestion();
        lblQuestion.setText(question.getQuestion());
        lblAnswer.changeLabelImage(question.getHas_image(), checkHasFileToGenerateFullPath(question.getAnswer()));
        lblAnswer.setVisible(false);
        generateAnswerButtons();
    }//GEN-LAST:event_jButton6ActionPerformed


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
            btnA.changeButtonImage(question.getHas_image(), checkHasFileToGenerateFullPath(question.getAnswer()));
            btnB.changeButtonImage(question.getHas_image(), checkHasFileToGenerateFullPath(question.getWrong_1()));
            btnC.changeButtonImage(question.getHas_image(), checkHasFileToGenerateFullPath(question.getWrong_2()));
            btnD.changeButtonImage(question.getHas_image(), checkHasFileToGenerateFullPath(question.getWrong_3()));
        }
        if (listOfButtons.get(answer) == btnB) {
            System.out.println("ButtonB");
            correctAnswer = btnB;
            btnB.changeButtonImage(question.getHas_image(), checkHasFileToGenerateFullPath(question.getAnswer()));
            btnA.changeButtonImage(question.getHas_image(), checkHasFileToGenerateFullPath(question.getWrong_3()));
            btnC.changeButtonImage(question.getHas_image(), checkHasFileToGenerateFullPath(question.getWrong_1()));
            btnD.changeButtonImage(question.getHas_image(), checkHasFileToGenerateFullPath(question.getWrong_2()));


        }

        if (listOfButtons.get(answer) == btnC) {
            System.out.println("ButtonC");
            correctAnswer = btnC;
            btnC.changeButtonImage(question.getHas_image(), checkHasFileToGenerateFullPath(question.getAnswer()));
            btnA.changeButtonImage(question.getHas_image(), checkHasFileToGenerateFullPath(question.getWrong_3()));
            btnB.changeButtonImage(question.getHas_image(), checkHasFileToGenerateFullPath(question.getWrong_2()));
            btnD.changeButtonImage(question.getHas_image(), checkHasFileToGenerateFullPath(question.getWrong_1()));

        }
        if (listOfButtons.get(answer) == btnD) {
            System.out.println("ButtonD");
            correctAnswer = btnD;
            btnD.changeButtonImage(question.getHas_image(), checkHasFileToGenerateFullPath(question.getAnswer()));
            btnA.changeButtonImage(question.getHas_image(), checkHasFileToGenerateFullPath(question.getWrong_3()));
            btnC.changeButtonImage(question.getHas_image(), checkHasFileToGenerateFullPath(question.getWrong_2()));
            btnB.changeButtonImage(question.getHas_image(), checkHasFileToGenerateFullPath(question.getWrong_1()));


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