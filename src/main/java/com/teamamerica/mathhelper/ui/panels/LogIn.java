package com.teamamerica.mathhelper.ui.panels;


import com.teamamerica.mathhelper.configurators.UserInteractionsConfigurator;
import com.teamamerica.mathhelper.db.MathHelperDBClient;
import com.teamamerica.mathhelper.environment.ConfigDirectory;
import com.teamamerica.mathhelper.tunnels.MathHelperTrojan;
import com.teamamerica.mathhelper.ui.customcomponents.AudioListener;
import com.teamamerica.mathhelper.ui.customcomponents.ImageButton;
import com.teamamerica.mathhelper.ui.customcomponents.ImageLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Christina on 4/12/2015.
 */
public class LogIn extends JFrame {

    private MathHelperDBClient mathHelperDBClient = null;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ImageButton btnSignIn;
  //  private ImageButton btnHelp;
    private JFormattedTextField txtUserName;
    private JLabel lblUserName;
    private JLabel jLabel2, lblOne, lblTwo;
    private JLabel lblPassword;
    private JLabel jLabel4;
    private JPanel jPanel1;
    private JPasswordField jPasswordField;
    // End of variables declaration//GEN-END:variables

    private ImageButton btnTrojan;
    private ImageButton btnHelp;

    public LogIn() {

        this.mathHelperDBClient = new MathHelperDBClient();

        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        jPasswordField = new JPasswordField();
        txtUserName = new JFormattedTextField();
        lblUserName = new JLabel();
        lblPassword = new JLabel();
        btnSignIn = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_openDoor.gif"), 400, 400);
        jLabel4 = new JLabel();

        lblOne = new ImageLabel(true, ConfigDirectory.getImageFileFromDirectory("panels_oneTwoThree.jpg"), 200, 160);
        lblTwo = new ImageLabel(true, ConfigDirectory.getImageFileFromDirectory("panels_oneTwoThree.jpg"), 200, 160);

        btnHelp = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_help.gif"), 150, 101);

        btnTrojan = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_trojan.png"), 20, 20);


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(Color.WHITE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(null);
        jPanel1.setBackground(Color.WHITE);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 70)); // NOI18N
        jLabel2.setText("Welcome to Math Helper!");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 10, 850, 120);

        jPasswordField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPasswordField.setToolTipText("");
        jPanel1.add(jPasswordField);
        jPasswordField.setBounds(510, 425, 250, 60);

        lblTwo.setBounds(775, 140, 200, 160);
        jPanel1.add(lblTwo);

        txtUserName.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jPanel1.add(txtUserName);
        txtUserName.setBounds(510, 325, 250, 60);

        lblOne.setBounds(20, 140, 200, 160);
        jPanel1.add(lblOne);

        lblUserName.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        lblUserName.setText("Username:");
        jPanel1.add(lblUserName);
        lblUserName.setBounds(240, 325, 178, 40);

        lblPassword.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        lblPassword.setText("Password:");
        jPanel1.add(lblPassword);
        lblPassword.setBounds(250, 425, 165, 30);

        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignIn);
        btnSignIn.setBounds(300, 400, 400, 400);

        btnTrojan.setBounds(80, 560, 20, 20);
        btnTrojan.setVisible(true);
        btnTrojan.setEnabled(true);
        jPanel1.add(btnTrojan);
        btnTrojan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrojanActionPerformed(evt);
            }
        });


        btnHelp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        jPanel1.add(btnHelp);
        btnHelp.setBounds(30, 575, 150, 101);


        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 56)); // NOI18N
        jLabel4.setText("Please Sign In");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 175, 1000, 90);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
        setResizable(false);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String username = txtUserName.getText();
        String password = new String(jPasswordField.getPassword());
        if (mathHelperDBClient.validate_user_login(username, password)) {
            UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username(username));
            System.out.println("User logged in!");
            System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
            new SelectGrade().setVisible(true);
            this.dispose();
        } else {
            AudioListener.runAudioListener("SpeechOn.wav");
            JOptionPane.showMessageDialog(null,
                    "Please check your username and/or password.", "Login Error", JOptionPane.ERROR_MESSAGE);
            txtUserName.setText("");
            jPasswordField.setText("");
        }

    }

    private void btnTrojanActionPerformed(ActionEvent e) {

        Object source = e.getSource();
        if (source == btnTrojan) {
            String input = JOptionPane.showInputDialog(null, "Please enter code:");
            this.setVisible(false);
            MathHelperTrojan.goToPage(input);

        }
    }


    //GEN-LAST:event_jButton1ActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        AudioListener.runAudioListener("SpeechOn.wav");
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

}
