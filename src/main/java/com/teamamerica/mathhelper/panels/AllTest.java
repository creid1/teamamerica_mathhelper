package com.teamamerica.mathhelper.panels;

import javax.swing.*;
import java.awt.*;

public class AllTest extends JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnNext;
    private JButton btnTests;
    private JButton btnHelp;
    private JLabel lblBackground;
    private JLabel lblTest;
    private JPanel pnMain;

    private JPanel pnQuestion;
    private JPanel pnAnswer;
    private JPanel pnFooter;
    private JButton btnB;
    private JRadioButton btnC;
    private JRadioButton btnA;
    private JRadioButton btnD;

    private JTextField txtQuestion;
    // End of variables declaration//GEN-END:variables

    public AllTest() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {


        pnMain = new JPanel();
        pnFooter = new JPanel();

        btnHelp = new JButton();


        lblTest = new JLabel();
        lblBackground = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createQuestionPanel();
        createAnswerPanel();


        pnMain.setLayout(new BorderLayout());
        pnMain.add(pnQuestion,BorderLayout.NORTH);
        pnMain.add(pnAnswer,BorderLayout.CENTER);

        /*
        pnFooter.setLayout(new FlowLayout());



        btnHelp.setBackground(new java.awt.Color(153, 204, 255));
        btnHelp.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnHelp.setText("Help");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        pnFooter.add(btnHelp, FlowLayout.RIGHT);
       // btnHelp.setBounds(480, 330, 110, 40);


 */

        setLayout(new GridLayout(1, 1));
        add(pnMain);


        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createAnswerPanel(){
        pnAnswer = new JPanel();
        pnAnswer.setLayout(new GridLayout(2,2));

        btnA = new JRadioButton();
        btnB = new JButton();
        btnD = new JRadioButton();
        btnC = new JRadioButton();

        btnA.setBackground(new java.awt.Color(255, 0, 0));
        btnA.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        btnA.setText("A.  2");

        btnB.setBackground(new java.awt.Color(255, 0, 0));
        btnB.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        // btnB.setText("B.  10");
        btnB.setIcon(new ImageIcon("C:\\Users\\Christina\\SCHOOL\\FSU\\CSC362\\images\\shapes\\circle2.jpg"));

        btnC.setBackground(new java.awt.Color(255, 0, 0));
        btnC.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        btnC.setText("C.  5");

        btnD.setBackground(new java.awt.Color(255, 0, 0));
        btnD.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        btnD.setText("D.  7");


        // btnC.setBounds(340, 200, 120, 40);



        // btnA.setBounds(120, 200, 120, 40);


        //btnD.setBounds(340, 260, 120, 40);



        // btnB.setBounds(120, 260, 120, 40);

        pnAnswer.add(btnA);
        pnAnswer.add(btnB);
        pnAnswer.add(btnC);
        pnAnswer.add(btnD);

    }

    private void createQuestionPanel() {

        pnQuestion = new JPanel();
        pnQuestion.setLayout(new GridLayout(2,3));

        btnNext = new JButton();
        btnTests = new JButton();
        txtQuestion = new JTextField();

        btnNext.setBackground(new java.awt.Color(153, 204, 255));
        btnNext.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnNext.setText("Next ");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        lblTest.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        lblTest.setText("Test");

        btnTests.setBackground(new java.awt.Color(153, 204, 255));
        btnTests.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnTests.setText("Tests");
        btnTests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        txtQuestion.setBackground(new java.awt.Color(255, 0, 0));
        txtQuestion.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N

        //TODO: set the txtQuestion
        txtQuestion.setText("Question #1: What shape is a circle?");
        txtQuestion.setEnabled(false);

        pnQuestion.add(btnTests);
        pnQuestion.add(lblTest);
        pnQuestion.add(btnNext);
        pnQuestion.add(new JLabel(""));
        pnQuestion.add(txtQuestion);
        pnQuestion.add(new JLabel(""));

    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Test().setVisible(true);
            }
        });
    }


}
