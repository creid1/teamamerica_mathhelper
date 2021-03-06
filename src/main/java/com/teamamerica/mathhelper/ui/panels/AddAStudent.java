/**
 * Name: Christina Reid, Brandon Cousen, Ian Nielson
 * Date Produced: April 29,2015
 * Purpose: The purpose of this software is to help children learn math.
 */
package com.teamamerica.mathhelper.ui.panels;

import com.teamamerica.mathhelper.configurators.AdminConfigurator;
import com.teamamerica.mathhelper.configurators.UserInteractionsConfigurator;
import com.teamamerica.mathhelper.controllers.SecurityQuestion;
import com.teamamerica.mathhelper.environment.ConfigDirectory;
import com.teamamerica.mathhelper.models.User;
import com.teamamerica.mathhelper.ui.customcomponents.AudioListener;
import com.teamamerica.mathhelper.ui.customcomponents.ImageButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AddAStudent extends JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ImageButton btnSubmit, btnClose;
    private JFormattedTextField txtPassword;
    private JFormattedTextField txtFirstName;
    private JFormattedTextField txtLastName;
    private JFormattedTextField txtUserName;
    private JFormattedTextField txtConfirmPassword;
    private JLabel lblConfirmPassword;

    private JComboBox cboSecurityQuestion;
    private JFormattedTextField txtSecurityAnswer;
    private final String[] comboList = {"Security Question", SecurityQuestion.COLOR.toString(), SecurityQuestion.MOVIE.toString(), SecurityQuestion.PET.toString(),
            SecurityQuestion.PLACE.toString(), SecurityQuestion.SCHOOL.toString()};

    private JLabel jLabel1;
    private JLabel lblLastName;
    private JLabel lblUserName;
    private JLabel lblAddStudent;
    private JLabel lblPassword;
    private JLabel lblFirstName;
    private JPanel jPanel1;
    private JRadioButton rbAdmin;
    private ImageButton btnDelete;

    // End of variables declaration//GEN-END:variables
    public AddAStudent() {

        initComponents();
        checkForEditUser();
    }

    private void checkForEditUser() {
        if (AdminConfigurator.getIsEditStudent()) {
            User user = AdminConfigurator.getMathHelperStudent();
            lblAddStudent.setText("   Update MathHelper");
            txtFirstName.setText(user.getFirst_name());
            txtLastName.setText(user.getLast_name());
            txtUserName.setText(user.getUsername());
            txtPassword.setText(user.getPassword());
            txtConfirmPassword.setText(user.getPassword());
            txtSecurityAnswer.setText(user.getSecurity_answer());

            for (int i = 0; i < comboList.length; i++) {
                if (comboList[i].equals(user.getSecurity_question())) {
                    cboSecurityQuestion.setSelectedIndex(i);
                    break;
                }
            }

        } else if (AdminConfigurator.getIsEditAdmin()) {
            User user = AdminConfigurator.getMathHelperStudent();
            lblAddStudent.setText("  Update MathHelper");
            txtFirstName.setText(user.getFirst_name());
            txtLastName.setText(user.getLast_name());
            txtUserName.setText(user.getUsername());
            txtPassword.setText(user.getPassword());
            txtConfirmPassword.setText(user.getPassword());
            txtSecurityAnswer.setText(user.getSecurity_answer());
            rbAdmin.setSelected(true);
            for (int i = 0; i < comboList.length; i++) {
                if (comboList[i].equals(user.getSecurity_question())) {
                    cboSecurityQuestion.setSelectedIndex(i);
                    break;
                }
            }
        } else {
            lblAddStudent.setText("   Add MathHelper");
            txtFirstName.setText("");
            txtLastName.setText("");
            txtUserName.setText("");
            txtPassword.setText("");
            txtConfirmPassword.setText("");
            txtSecurityAnswer.setText("");
            cboSecurityQuestion.setSelectedIndex(0);
            rbAdmin.setSelected(false);

        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        setLocation(850, 0);
        setResizable(false);


        jPanel1 = new JPanel();

        btnSubmit = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_teacherNotes.jpg"), 179, 115);
        btnDelete = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_pencilErasing.gif"), 90, 89);
        btnClose = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_bookWorm.gif"), 130, 150);

        btnSubmit.setToolTipText("Submit MathHelper!");
        btnDelete.setToolTipText("Delete MathHelper!");
        btnClose.setToolTipText("Exit!");

        jPanel1.add(btnClose);

        jLabel1 = new JLabel();
        lblAddStudent = new JLabel();
        lblPassword = new JLabel();
        txtPassword = new JFormattedTextField();
        lblFirstName = new JLabel();
        lblLastName = new JLabel();
        lblUserName = new JLabel();
        txtFirstName = new JFormattedTextField();
        txtLastName = new JFormattedTextField();
        txtUserName = new JFormattedTextField();

        lblConfirmPassword = new JLabel();
        txtConfirmPassword = new JFormattedTextField();

        cboSecurityQuestion = new JComboBox(comboList);
        cboSecurityQuestion.setBackground(Color.WHITE);
        cboSecurityQuestion.setSelectedIndex(0);
        txtSecurityAnswer = new JFormattedTextField();

        rbAdmin = new JRadioButton("MathHelper Administrative User");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionListener(evt);
            }
        });

        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionListener(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionListener(evt);
            }
        });
        jPanel1.add(btnSubmit);

        jPanel1.add(btnDelete);
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 380);

        lblAddStudent.setFont(new java.awt.Font("Comic Sans MS", 0, 40)); // NOI18N

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


    private void btnCloseActionListener(ActionEvent evt) {
        if (evt.getSource() == btnClose) {
            AudioListener.runAudioListener("SpeechOn.wav");
            int userInput = JOptionPane.showConfirmDialog(
                    null, "Are you sure you want to exit?", "Exit Add/Edit User?", JOptionPane.YES_NO_OPTION);
            if (userInput == 0) {
               this.dispose();
                AdminConfigurator.setIsEditAdmin(false);
                AdminConfigurator.setIsEditStudent(false);
                AdminConfigurator.setUserInfo(-1);
            } else {

            }
        }
    }

    private void createStudentInfoComponents() {
        lblAddStudent.setBounds(50, 50, 1000, 60);

        lblFirstName.setFont(new java.awt.Font("Comic Sans MS", 0, 22)); // NOI18N
        lblFirstName.setText("First Name:");
        jPanel1.add(lblFirstName);
        lblFirstName.setBounds(50, 150, 150, 30);

        jPanel1.add(txtFirstName);
        txtFirstName.setBounds(310, 150, 150, 30);

        lblLastName.setFont(new java.awt.Font("Comic Sans MS", 0, 22)); // NOI18N
        lblLastName.setText("Last Name:");
        jPanel1.add(lblLastName);
        lblLastName.setBounds(50, 200, 150, 30);

        jPanel1.add(txtLastName);
        txtLastName.setBounds(310, 200, 150, 30);

        lblUserName.setFont(new java.awt.Font("Comic Sans MS", 0, 22)); // NOI18N
        lblUserName.setText("Username:");
        jPanel1.add(lblUserName);
        lblUserName.setBounds(50, 250, 150, 30);

        jPanel1.add(txtUserName);
        txtUserName.setBounds(310, 250, 150, 30);


        lblPassword.setFont(new java.awt.Font("Comic Sans MS", 0, 22)); // NOI18N
        lblPassword.setText("Password:");

        jPanel1.add(lblPassword);
        lblPassword.setBounds(50, 300, 150, 30);

        jPanel1.add(txtPassword);
        txtPassword.setBounds(310, 300, 150, 30);


        lblConfirmPassword.setFont(new java.awt.Font("Comic Sans MS", 0, 22)); // NOI18N
        lblConfirmPassword.setText("Confirm Password:");

        jPanel1.add(lblConfirmPassword);
        lblConfirmPassword.setBounds(50, 350, 200, 30);

        jPanel1.add(txtConfirmPassword);
        txtConfirmPassword.setBounds(310, 350, 150, 30);


        jPanel1.add(cboSecurityQuestion);
        cboSecurityQuestion.setBounds(50, 400, 250, 30);
        cboSecurityQuestion.setFont(new Font("Comic Sans MS", 0, 12));

        jPanel1.add(txtSecurityAnswer);
        txtSecurityAnswer.setBounds(310, 400, 150, 30);

        jPanel1.add(rbAdmin);

        rbAdmin.setFont(new Font("Comic Sans MS", 0, 22));
        rbAdmin.setBackground(Color.WHITE);
        rbAdmin.setBounds(75, 465, 1000, 30);

        btnClose.setBounds(20, 500, 130, 150);
        btnDelete.setBounds(150, 520, 90, 89);
        btnSubmit.setBounds(275, 525, 179, 115);


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
            } else if (!txtPassword.getText().equals(txtConfirmPassword.getText())) {
                JOptionPane.showMessageDialog(null, "The passwords entered do not match!");
                txtPassword.setText("");
                txtConfirmPassword.setText("");
            } else if (!(txtPassword.getText().length() >= 6 & txtPassword.getText().length() <= 12)) {
                JOptionPane.showMessageDialog(null, "The password length must be between 6 and 12 characters!!");
                txtPassword.setText("");
                txtConfirmPassword.setText("");
            } else if (!(txtUserName.getText().length() >= 5 & txtUserName.getText().length() <= 8)) {
                JOptionPane.showMessageDialog(null, "The user name must be between 5 and 8 characters!");
                txtUserName.setText("");
            } else  {
                int answer = JOptionPane.showConfirmDialog(null, "Are you sure you want to add to Teacher Notes?",
                        "MathHelperAddTeacherNotes",JOptionPane.YES_NO_OPTION);
                if(answer == 0) {
                    User user;
                    if (rbAdmin.isSelected()) {
                        user = new User(txtUserName.getText(), txtPassword.getText(), txtFirstName.getText(), txtLastName.getText(),
                                comboList[cboSecurityQuestion.getSelectedIndex()], txtSecurityAnswer.getText(), AdminConfigurator.generateAdminRole());
                    } else {
                        user = new User(txtUserName.getText(), txtPassword.getText(), txtFirstName.getText(), txtLastName.getText(),
                                comboList[cboSecurityQuestion.getSelectedIndex()], txtSecurityAnswer.getText(), AdminConfigurator.generateStudentRole());
                    }
                    boolean success;
                    if (AdminConfigurator.getIsEditStudent()) {
                        user.setUser_id(AdminConfigurator.getMathHelperStudent().getUser_id());
                        success = AdminConfigurator.updateUser(user);
                        AdminConfigurator.setIsEditStudent(false);
                    } else if (AdminConfigurator.getIsEditAdmin()) {
                        user.setUser_id(UserInteractionsConfigurator.get_interactive_user().getUser_id());
                        success = AdminConfigurator.updateUser(user);
                        AdminConfigurator.setIsEditAdmin(false);
                    } else {
                        if (AdminConfigurator.doesUserNameExist(txtUserName.getText())) {
                            JOptionPane.showMessageDialog(null, "Username already exists!");
                            txtUserName.setText("");
                            success = false;
                        } else {
                            success = AdminConfigurator.addNewUser(user);

                        }
                    }

                    if (success) {
                        JOptionPane.showMessageDialog(null, "MathHelper Admin Information is updated!");

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
                    rbAdmin.setSelected(false);
                    AdminConfigurator.setIsEditStudent(false);
                   this.dispose();
                }else{
                    //do nothing stay on page
                }


            }
        }//GEN-LAST:event_jButton5ActionPerformed
    }


    private void btnDeleteActionListener(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        AudioListener.runAudioListener("SpeechOn.wav");

        // TODO add your handling code here:
        if (evt.getSource() == btnDelete) {
            if (txtFirstName.getText().equalsIgnoreCase("") || txtFirstName.getText().equals(null) ||
                    txtLastName.getText().equalsIgnoreCase("") || txtLastName.getText().equals(null) ||
                    txtUserName.getText().equalsIgnoreCase("") || txtUserName.getText().equals(null) ||
                    txtPassword.getText().equalsIgnoreCase("") || txtPassword.getText().equals(null) ||
                    cboSecurityQuestion.getSelectedIndex() == 0 || txtSecurityAnswer.getText().equalsIgnoreCase("") ||
                    txtSecurityAnswer.getText().equals(null)) {
                JOptionPane.showMessageDialog(null, "Please enter all the required fields!");
            } else if (!txtPassword.getText().equals(txtConfirmPassword.getText())) {
                JOptionPane.showMessageDialog(null, "The passwords entered do not match!");
                txtPassword.setText("");
                txtConfirmPassword.setText("");
            } else if (!(txtPassword.getText().length() >= 6 & txtPassword.getText().length() <= 12)) {
                JOptionPane.showMessageDialog(null, "The password length must be between 6 and 12 characters!!");
                txtPassword.setText("");
                txtConfirmPassword.setText("");
            } else if (!(txtUserName.getText().length() >= 5 & txtUserName.getText().length() <= 8)) {
                JOptionPane.showMessageDialog(null, "The user name must be between 5 and 8 characters!");
                txtUserName.setText("");
            } else {
                int answer = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this MathHelper?",
                        "MathHelper Delete", JOptionPane.YES_NO_OPTION);
                if(answer == 0) {
                    User user;
                    if (rbAdmin.isSelected()) {
                        user = new User(txtUserName.getText(), txtPassword.getText(), txtFirstName.getText(), txtLastName.getText(),
                                comboList[cboSecurityQuestion.getSelectedIndex()], txtSecurityAnswer.getText(), AdminConfigurator.generateAdminRole());
                    } else {
                        user = new User(txtUserName.getText(), txtPassword.getText(), txtFirstName.getText(), txtLastName.getText(),
                                comboList[cboSecurityQuestion.getSelectedIndex()], txtSecurityAnswer.getText(), AdminConfigurator.generateStudentRole());
                    }
                    boolean success;
                    if (AdminConfigurator.getIsEditStudent()) {
                        user.setUser_id(AdminConfigurator.getMathHelperStudent().getUser_id());
                        success = AdminConfigurator.removeMathHelperUser(user.getUser_id());
                        AdminConfigurator.setIsEditStudent(false);
                    } else if (AdminConfigurator.getIsEditAdmin()) {
                        user.setUser_id(UserInteractionsConfigurator.get_interactive_user().getUser_id());
                        success = AdminConfigurator.removeMathHelperUser(user.getUser_id());
                        AdminConfigurator.setIsEditAdmin(false);
                    } else {
                        success = false;
                    }


                    if (success) {
                        JOptionPane.showMessageDialog(null, "MathHelper Has Been Deleted!");

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
                    rbAdmin.setSelected(false);
                    AdminConfigurator.setIsEditStudent(false);
                   this.dispose();
                }else{
                    //do nothing stay on page
                }


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
