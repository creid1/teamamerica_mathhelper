package com.teamamerica.mathhelper.ui.panels;

import com.teamamerica.mathhelper.configurators.AdminConfigurator;
import com.teamamerica.mathhelper.controllers.SecurityQuestion;
import com.teamamerica.mathhelper.environment.ConfigDirectory;
import com.teamamerica.mathhelper.models.User;
import com.teamamerica.mathhelper.ui.customcomponents.AudioListener;
import com.teamamerica.mathhelper.ui.customcomponents.ImageButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class AddAStudent extends JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ImageButton btnSubmit;
    private ImageButton btnHelp, btnHints;
    private JPasswordField txtPassword;
    private JFormattedTextField txtFirstName;
    private JFormattedTextField txtLastName;
    private JFormattedTextField txtUserName;
    private JPasswordField txtConfirmPassword;
    private JLabel lblConfirmPassword;

    private JComboBox cboSecurityQuestion;
    private JFormattedTextField txtSecurityAnswer;
    private final String[] comboList = {"Security Question", SecurityQuestion.COLOR.toString(), SecurityQuestion.MOVIE.toString(), SecurityQuestion.PET.toString(),
            SecurityQuestion.PLACE.toString(), SecurityQuestion.SCHOOL.toString()};

    private JLabel jLabel1;
    private JLabel lblLastName;
    private JLabel lblUserName;
    public JLabel lblAddStudent;
    private JLabel lblPassword;
    private JLabel lblFirstName;
    private JPanel jPanel1;
    private JCheckBox ckAdmin, ckStudent;
    private ButtonGroup grRole;


    // End of variables declaration//GEN-END:variables
    public AddAStudent() {


        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLocation(850, 0);


        jPanel1 = new JPanel();
        btnSubmit = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_teacherNotes.jpg"), 175, 112);
        btnHelp = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_help.gif"), 150, 96);
        btnHints = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_helpDesk.png"), 150, 101);

        btnHelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnHelp) {
                    AudioListener.runAudioListener("SpeechOn.wav");

                }
            }
        });

        btnHints.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnHints) {
                    new HelpDeskHints().setVisible(true);
                }
            }
        });
        jLabel1 = new JLabel();
        lblAddStudent = new JLabel();
        lblPassword = new JLabel();
        txtPassword = new JPasswordField();
        lblFirstName = new JLabel();
        lblLastName = new JLabel();
        lblUserName = new JLabel();
        txtFirstName = new JFormattedTextField();
        txtLastName = new JFormattedTextField();
        txtUserName = new JFormattedTextField();

        lblConfirmPassword = new JLabel();
        txtConfirmPassword = new JPasswordField();

        cboSecurityQuestion = new JComboBox(comboList);
        cboSecurityQuestion.setBackground(Color.WHITE);
        cboSecurityQuestion.setSelectedIndex(0);
        txtSecurityAnswer = new JFormattedTextField();

        ckAdmin = new JCheckBox("Admin User");
        ckStudent = new JCheckBox("Student User");
        grRole = new ButtonGroup();
        grRole.add(ckAdmin);
        grRole.add(ckStudent);


        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionListener(evt);
            }
        });
        jPanel1.add(btnSubmit);


        btnHelp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        jPanel1.add(btnHelp);
        btnHelp.setBounds(30, 575, 150, 101);


        btnHints.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnHintsActionPerformed(evt);
            }
        });
        jPanel1.add(btnHints);
        btnHints.setBounds(350, 575, 150, 101);


        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 380);

        lblAddStudent.setFont(new java.awt.Font("Comic Sans MS", 0, 40)); // NOI18N
        lblAddStudent.setText("New MathHelper User");
        jPanel1.add(lblAddStudent);

        createStudentInfoComponents();

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

    private void btnHintsActionPerformed(ActionEvent evt) {
        AudioListener.runAudioListener("SpeechOn.wav");
        new HelpDeskHints().setVisible(true);

    }

    private void btnHelpActionPerformed(ActionEvent evt) {
        AudioListener.runAudioListener("SpeechOn.wav");

    }

    private void createStudentInfoComponents() {
        lblAddStudent.setBounds(50, 50, 1000, 60);

        lblFirstName.setFont(new java.awt.Font("Comic Sans MS", 0, 22)); // NOI18N
        lblFirstName.setText("First Name:");
        jPanel1.add(lblFirstName);
        lblFirstName.setBounds(50, 150, 150, 30);

        jPanel1.add(txtFirstName);
        txtFirstName.setBounds(300, 150, 150, 30);

        lblLastName.setFont(new java.awt.Font("Comic Sans MS", 0, 22)); // NOI18N
        lblLastName.setText("Last Name:");
        jPanel1.add(lblLastName);
        lblLastName.setBounds(50, 200, 150, 30);

        jPanel1.add(txtLastName);
        txtLastName.setBounds(300, 200, 150, 30);

        lblUserName.setFont(new java.awt.Font("Comic Sans MS", 0, 22)); // NOI18N
        lblUserName.setText("Username:");
        jPanel1.add(lblUserName);
        lblUserName.setBounds(50, 250, 150, 30);

        jPanel1.add(txtUserName);
        txtUserName.setBounds(300, 250, 150, 30);


        lblPassword.setFont(new java.awt.Font("Comic Sans MS", 0, 22)); // NOI18N
        lblPassword.setText("Password:");

        jPanel1.add(lblPassword);
        lblPassword.setBounds(50, 300, 150, 30);

        jPanel1.add(txtPassword);
        txtPassword.setBounds(300, 300, 150, 30);


        lblConfirmPassword.setFont(new java.awt.Font("Comic Sans MS", 0, 22)); // NOI18N
        lblConfirmPassword.setText("Confirm Password:");

        jPanel1.add(lblConfirmPassword);
        lblConfirmPassword.setBounds(50, 350, 200, 30);

        jPanel1.add(txtConfirmPassword);
        txtConfirmPassword.setBounds(300, 350, 150, 30);


        jPanel1.add(cboSecurityQuestion);
        cboSecurityQuestion.setBounds(50, 400, 225, 30);
        cboSecurityQuestion.setFont(new Font("Comic Sans MS", 0, 12));

        jPanel1.add(txtSecurityAnswer);
        txtSecurityAnswer.setBounds(300, 400, 150, 30);

        jPanel1.add(ckAdmin);
        jPanel1.add(ckStudent);

        ckAdmin.setFont(new Font("Comic Sans MS", 0, 22));
        ckAdmin.setBackground(Color.WHITE);
        ckStudent.setFont(new Font("Comic Sans MS", 0, 22));
        ckStudent.setBackground(Color.WHITE);

        ckAdmin.setBounds(50, 465, 1000, 30);
        ckStudent.setBounds(50, 500, 1000, 30);

        btnSubmit.setBounds(225, 450, 175, 112);


    }

    private void btnSubmitActionListener(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        AudioListener.runAudioListener("SpeechOn.wav");

        // TODO add your handling code here:
        if (evt.getSource() == btnSubmit) {
            if (txtFirstName.getText().equalsIgnoreCase("") || txtFirstName.getText().equals(null) ||
                    txtLastName.getText().equalsIgnoreCase("") || txtLastName.getText().equals(null) ||
                    txtUserName.getText().equalsIgnoreCase("") || txtUserName.getText().equals(null) ||
                    txtPassword.getText().equalsIgnoreCase("") || txtPassword.getText().equals(null) ||
                    cboSecurityQuestion.getSelectedIndex() == 0 || txtSecurityAnswer.getText().equalsIgnoreCase("") ||
                    txtSecurityAnswer.getText().equals(null)) {
                JOptionPane.showMessageDialog(null, "Please enter all the required fields!");

            } else if (!ckStudent.isSelected() & !ckAdmin.isSelected()) {
                JOptionPane.showMessageDialog(null, "Please select the role of the new user!");
            } else if (AdminConfigurator.doesUserNameExist(txtUserName.getText())) {
                JOptionPane.showMessageDialog(null, "Username already exists!");
                txtUserName.setText("");
            } else if (!Arrays.equals(txtPassword.getPassword(), txtConfirmPassword.getPassword())) {
                JOptionPane.showMessageDialog(null, "The passwords entered do not match!");
                txtPassword.setText("");
                txtConfirmPassword.setText("");
            } else if (!(txtPassword.getPassword().length >= 6 & txtPassword.getPassword().length <= 12)) {
                JOptionPane.showMessageDialog(null, "The password length must be between 6 and 12 characters!!");
                txtPassword.setText("");
                txtConfirmPassword.setText("");
            } else if (!(txtUserName.getText().length() >= 5 & txtUserName.getText().length() <= 8)) {
                JOptionPane.showMessageDialog(null, "The user name must be between 5 and 8 characters!");
                txtUserName.setText("");
            } else {
                User user;
                if (ckAdmin.isSelected()) {
                    user = new User(txtUserName.getText(), txtPassword.getPassword().toString(), txtFirstName.getText(), txtLastName.getText(),
                            comboList[cboSecurityQuestion.getSelectedIndex()], txtSecurityAnswer.getText(), AdminConfigurator.generateAdminRole());
                } else {
                    user = new User(txtUserName.getText(), txtPassword.getPassword().toString(), txtFirstName.getText(), txtLastName.getText(),
                            comboList[cboSecurityQuestion.getSelectedIndex()], txtSecurityAnswer.getText(), AdminConfigurator.generateStudentRole());
                }
                boolean isAdded = AdminConfigurator.addNewUser(user);
                if (isAdded) {
                    JOptionPane.showMessageDialog(null, "New MathHelper user has been added!");
                } else {
                    JOptionPane.showMessageDialog(null, "There was an issue processing your request. Please try again later.");
                }

                txtConfirmPassword.setText("");
                txtPassword.setText("");
                txtFirstName.setText("");
                txtLastName.setText("");
                txtUserName.setText("");
                txtSecurityAnswer.setText("");
                cboSecurityQuestion.setSelectedIndex(0);
                grRole.clearSelection();


            }
        }//GEN-LAST:event_jButton5ActionPerformed
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AddAStudent().setVisible(true);
            }
        });
    }

}
