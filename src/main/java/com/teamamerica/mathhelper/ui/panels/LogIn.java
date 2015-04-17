package com.teamamerica.mathhelper.ui.panels;


import com.teamamerica.mathhelper.configurators.UserInteractionsConfigurator;
import com.teamamerica.mathhelper.db.MathHelperDBClient;
import com.teamamerica.mathhelper.environment.ConfigDirectory;
import com.teamamerica.mathhelper.ui.customcomponents.AudioListener;
import com.teamamerica.mathhelper.ui.customcomponents.ImageButton;
import com.teamamerica.mathhelper.ui.customcomponents.ImageLabel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Christina on 4/12/2015.
 */
public class LogIn extends JFrame {

    private MathHelperDBClient mathHelperDBClient = null;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ImageButton btnSignIn;
    private ImageButton btnHelp;
    //  private JButton btnHelp;
    private JFormattedTextField txtUserName;
    private JLabel lblUserName;
    private JLabel jLabel2, lblOne,lblTwo,lblThree,lbl4;
    private JLabel lblPassword;
    private JLabel jLabel4;
    private JPanel jPanel1;
    private JPasswordField jPasswordField;
    // End of variables declaration//GEN-END:variables

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
        btnSignIn = new ImageButton(true,ConfigDirectory.getImageFileFromDirectory("panels_openDoor.gif"),400,400);
        btnHelp = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_helpIcon.jpeg"), 90, 90);
        jLabel4 = new JLabel();

        lblOne = new ImageLabel(true, ConfigDirectory.getImageFileFromDirectory("panels_oneTwoThree.jpg"),200,160);
        lblTwo = new ImageLabel(true, ConfigDirectory.getImageFileFromDirectory("panels_oneTwoThree.jpg"),200,160);



        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(Color.WHITE);


        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        setLocationRelativeTo(null);


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
        jPasswordField.setBounds(510, 350, 250, 60);

        lblTwo.setBounds(775,130,200,160);
        jPanel1.add(lblTwo);

        txtUserName.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jPanel1.add(txtUserName);
        txtUserName.setBounds(510, 250, 250, 60);

        lblOne.setBounds(20,130,200,160);
        jPanel1.add(lblOne);

        lblUserName.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        lblUserName.setText("Username:");
        jPanel1.add(lblUserName);
        lblUserName.setBounds(240, 260, 178, 40);

        lblPassword.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        lblPassword.setText("Password:");
        jPanel1.add(lblPassword);
        lblPassword.setBounds(250, 360, 165, 30);

        btnSignIn.setMaximumSize(new java.awt.Dimension(400, 400));
        btnSignIn.setMinimumSize(new java.awt.Dimension(400, 400));
        btnSignIn.setPreferredSize(new java.awt.Dimension(400, 400));
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignIn);
        btnSignIn.setBounds(300, 300, 400, 400);

        btnHelp.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        btnHelp.setMaximumSize(new java.awt.Dimension(90, 90));
        btnHelp.setMinimumSize(new java.awt.Dimension(90, 90));
        btnHelp.setPreferredSize(new java.awt.Dimension(90, 90));
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        jPanel1.add(btnHelp);
        btnHelp.setBounds(840, 480, 90, 90);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel4.setText("Please Sign In");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(360, 150, 260, 60);

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
