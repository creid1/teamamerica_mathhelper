package com.teamamerica.mathhelper.ui.panels;

import com.teamamerica.mathhelper.controllers.SecurityQuestion;

import javax.swing.*;

public class AddAStudent extends JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnSubmit;
    private JButton btnHelp;
    private JFormattedTextField txtPassword;
    private JFormattedTextField txtFirstName;
    private JFormattedTextField txtLastName;
    private JFormattedTextField txtUserName;

    private JComboBox cboSecurityQuestion;
    private JFormattedTextField txtSecurityAnswer;
    private final String[] comboList = {"Security Question",SecurityQuestion.COLOR.toString(), SecurityQuestion.MOVIE.toString(), SecurityQuestion.PET.toString(),
            SecurityQuestion.PLACE.toString(), SecurityQuestion.SCHOOL.toString()};

    private JLabel jLabel1;
    private JLabel lblLastName;
    private JLabel lblUserName;
    private JLabel lblAddStudent;
    private JLabel lblPassword;
    private JLabel lblHelp;
    private JLabel lblFirstName;
    private JPanel jPanel1;


    // End of variables declaration//GEN-END:variables
    public AddAStudent() {


        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLocation(850,0);


        jPanel1 = new JPanel();
        btnSubmit = new JButton();
        btnHelp = new JButton();
        jLabel1 = new JLabel();
        lblAddStudent = new JLabel();
        lblPassword = new JLabel();
        lblHelp = new JLabel();
        txtPassword = new JFormattedTextField();
        lblFirstName = new JLabel();
        lblLastName = new JLabel();
        lblUserName = new JLabel();
        txtFirstName = new JFormattedTextField();
        txtLastName = new JFormattedTextField();
        txtUserName = new JFormattedTextField();

        cboSecurityQuestion = new JComboBox(comboList);
        cboSecurityQuestion.setSelectedIndex(0);
        txtSecurityAnswer = new JFormattedTextField();


        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        btnSubmit.setBackground(new java.awt.Color(153, 204, 255));
        btnSubmit.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit);
        btnSubmit.setBounds(180, 220, 120, 45);

        btnHelp.setBackground(new java.awt.Color(153, 204, 255));
        btnHelp.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHelp);
        btnHelp.setBounds(440, 250, 45, 45);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 380);

        lblAddStudent.setFont(new java.awt.Font("Comic Sans MS", 0, 35)); // NOI18N
        lblAddStudent.setText("Add a Student");
        jPanel1.add(lblAddStudent);
        lblAddStudent.setBounds(120, 10, 250, 60);

        lblPassword.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblPassword.setText("Password:");
        jPanel1.add(lblPassword);
        lblPassword.setBounds(70, 180, 150, 30);

        lblHelp.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHelp.setText("Help");
        jPanel1.add(lblHelp);
        lblHelp.setBounds(440, 230, 40, 20);
        jPanel1.add(txtPassword);
        txtPassword.setBounds(280, 180, 150, 25);


        lblFirstName.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblFirstName.setText("First Name:");
        jPanel1.add(lblFirstName);
        lblFirstName.setBounds(70, 90, 150, 30);

        lblLastName.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblLastName.setText("Last Name:");
        jPanel1.add(lblLastName);
        lblLastName.setBounds(70, 120, 150, 30);

        lblUserName.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblUserName.setText("Username:");
        jPanel1.add(lblUserName);
        lblUserName.setBounds(70, 150, 150, 30);
        jPanel1.add(txtFirstName);
        txtFirstName.setBounds(280, 90, 150, 25);
        jPanel1.add(txtLastName);
        txtLastName.setBounds(280, 120, 150, 25);
        jPanel1.add(txtUserName);
        txtUserName.setBounds(280, 150, 150, 25);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AddAStudent().setVisible(true);
            }
        });
    }

}
