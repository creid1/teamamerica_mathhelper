package com.teamamerica.mathhelper.ui.panels;

import com.teamamerica.mathhelper.configurators.QuestionsPageConfigurator;
import com.teamamerica.mathhelper.models.Question;

public class FirstGradeAddTest extends javax.swing.JFrame {

    public FirstGradeAddTest() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        question = QuestionsPageConfigurator.getQuestion();

        jPanel1 = new javax.swing.JPanel();
        btnNext = new javax.swing.JButton();
        btnTests = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnC = new javax.swing.JRadioButton();
        btnA = new javax.swing.JRadioButton();
        btnD = new javax.swing.JRadioButton();
        btnB = new javax.swing.JRadioButton();
        txtQuestion = new javax.swing.JTextField();
        lblTest = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        btnNext.setBackground(new java.awt.Color(153, 204, 255));
        btnNext.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnNext.setText("Next ");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel1.add(btnNext);
        btnNext.setBounds(480, 10, 110, 40);

        btnTests.setBackground(new java.awt.Color(153, 204, 255));
        btnTests.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnTests.setText("Tests");
        btnTests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnTests);
        btnTests.setBounds(0, 10, 110, 40);

        btnHelp.setBackground(new java.awt.Color(153, 204, 255));
        btnHelp.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnHelp.setText("Help");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHelp);
        btnHelp.setBounds(480, 330, 110, 40);

        btnC.setBackground(new java.awt.Color(255, 0, 0));
        btnC.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        btnC.setText(question.getWrong_1());
        jPanel1.add(btnC);
        btnC.setBounds(340, 200, 120, 40);

        btnA.setBackground(new java.awt.Color(255, 0, 0));
        btnA.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        btnA.setText(question.getAnswer());
        jPanel1.add(btnA);
        btnA.setBounds(120, 200, 120, 40);

        btnD.setBackground(new java.awt.Color(255, 0, 0));
        btnD.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        btnD.setText(question.getWrong_2());
        jPanel1.add(btnD);
        btnD.setBounds(340, 260, 120, 40);

        btnB.setBackground(new java.awt.Color(255, 0, 0));
        btnB.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        btnB.setText(question.getWrong_3());
        jPanel1.add(btnB);
        btnB.setBounds(120, 260, 120, 40);

        txtQuestion.setBackground(new java.awt.Color(255, 0, 0));
        txtQuestion.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N

        //TODO: set the txtQuestion
        txtQuestion.setText(question.getQuestion());
        txtQuestion.setEnabled(false);
        jPanel1.add(txtQuestion);
        txtQuestion.setBounds(80, 70, 430, 100);

        lblTest.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        lblTest.setText("Test");
        jPanel1.add(lblTest);
        lblTest.setBounds(180, 10, 260, 50);

        txtAnswer.setBackground(new java.awt.Color(255, 0, 0));
        txtAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtAnswer);
        txtAnswer.setBounds(50, 190, 490, 120);

        lblBackground.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblBackground.setForeground(new java.awt.Color(255, 0, 0));
        lblBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ian\\Documents\\backround.jpeg")); // NOI18N
        jPanel1.add(lblBackground);
        lblBackground.setBounds(0, 0, 595, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        question = QuestionsPageConfigurator.getQuestion();
        btnA.setText(question.getAnswer());
        btnB.setText(question.getWrong_2());
        btnC.setText(question.getWrong_1());
        btnD.setText(question.getWrong_3());
        txtQuestion.setText(question.getQuestion());

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Question question;

    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnTests;
    private javax.swing.JButton btnHelp;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblTest;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton btnB;
    private javax.swing.JRadioButton btnC;
    private javax.swing.JRadioButton btnA;
    private javax.swing.JRadioButton btnD;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextField txtQuestion;
    // End of variables declaration//GEN-END:variables
}
