package com.teamamerica.mathhelper.ui.panels;


import com.teamamerica.mathhelper.configurators.UserInteractionsConfigurator;
import com.teamamerica.mathhelper.db.MathHelperDBClient;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Christina on 4/12/2015.
 */
public class LogIn extends JFrame {

    private MathHelperDBClient mathHelperDBClient = null;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnSignIn;
    private JButton btnHelp;
    private JFormattedTextField txtUserName;
    private JLabel lblUserName;
    private JLabel jLabel2;
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
        btnSignIn = new JButton();
        btnHelp = new JButton();
        jLabel4 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));


        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        setLocation((d.width - this.getWidth())/2,(d.height - this.getHeight())/2);


        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 70)); // NOI18N
        jLabel2.setText("Welcome to Math Helper!");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 10, 850, 120);

        jPasswordField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPasswordField.setToolTipText("");
        jPanel1.add(jPasswordField);
        jPasswordField.setBounds(510, 350, 250, 60);

        txtUserName.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jPanel1.add(txtUserName);
        txtUserName.setBounds(510, 250, 250, 60);

        lblUserName.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        lblUserName.setText("Username:");
        jPanel1.add(lblUserName);
        lblUserName.setBounds(240, 260, 178, 40);

        lblPassword.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        lblPassword.setText("Password:");
        jPanel1.add(lblPassword);
        lblPassword.setBounds(250, 360, 165, 30);

        btnSignIn.setBackground(new java.awt.Color(204, 204, 255));
        btnSignIn.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnSignIn.setText("Sign-In ");
        btnSignIn.setMaximumSize(new java.awt.Dimension(87, 35));
        btnSignIn.setMinimumSize(new java.awt.Dimension(87, 35));
        btnSignIn.setPreferredSize(new java.awt.Dimension(87, 35));
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignIn);
        btnSignIn.setBounds(400, 440, 170, 80);

        btnHelp.setBackground(new java.awt.Color(204, 204, 255));
        btnHelp.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnHelp.setText("Help");
        btnHelp.setMaximumSize(new java.awt.Dimension(87, 35));
        btnHelp.setMinimumSize(new java.awt.Dimension(87, 35));
        btnHelp.setPreferredSize(new java.awt.Dimension(87, 35));
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHelp);
        btnHelp.setBounds(840, 530, 150, 60);

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
            new SplashPage1().setVisible(true);
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Please check your username and password.", "Login Error", JOptionPane.ERROR_MESSAGE);
            txtUserName.setText("");
            jPasswordField.setText("");
        }

    }

    //GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
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
