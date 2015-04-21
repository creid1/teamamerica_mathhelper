package com.teamamerica.mathhelper.ui.panels;

import com.teamamerica.mathhelper.configurators.TutorialsPageConfigurator;
import com.teamamerica.mathhelper.configurators.UserInteractionsConfigurator;
import com.teamamerica.mathhelper.controllers.GradeLevel;
import com.teamamerica.mathhelper.controllers.MainMenuSelection;
import com.teamamerica.mathhelper.environment.ConfigDirectory;
import com.teamamerica.mathhelper.ui.customcomponents.ImageButton;
import com.teamamerica.mathhelper.ui.customcomponents.YouTubeFrame;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MathHelperMain extends JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnHelp;
    private JButton btnPractice;
    private JButton btnTutorials;
    private JButton btnTests;
    private JButton btnLogout;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel lblLearnNewSubject;
    private JLabel lblTestYourKnowledge;
    private JLabel lblPracticeMakesPerfect;
    private JPanel jPanel1;

    private ImageButton btnSchoolsOut;
    // End of variables declaration//GEN-END:variables

    public MathHelperMain() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setPreferredSize(new java.awt.Dimension(1016, 738));
        setBackground(Color.WHITE);

        jPanel1 = new JPanel();
        jPanel1.setBackground(Color.WHITE);
        btnSchoolsOut = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_logout.gif"), 150, 101);
        btnSchoolsOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSchoolsOutActionPerformed(evt);
            }
        });
        jPanel1.add(btnSchoolsOut);
        btnSchoolsOut.setBounds(850, 10, 110, 101);

        lblLearnNewSubject = new JLabel();
        lblTestYourKnowledge = new JLabel();
        lblPracticeMakesPerfect = new JLabel();
        btnLogout = new JButton();
        btnHelp = new JButton();
        btnTests = new JButton();
        btnTutorials = new JButton();
        btnPractice = new JButton();
        jLabel2 = new JLabel();
        jLabel1 = new JLabel();


        jPanel1.setLayout(null);

        lblLearnNewSubject.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblLearnNewSubject.setForeground(new java.awt.Color(0, 255, 0));
        lblLearnNewSubject.setText("Learn a new subject!");
        jPanel1.add(lblLearnNewSubject);
        lblLearnNewSubject.setBounds(10, 130, 180, 26);

        lblTestYourKnowledge.setBackground(new java.awt.Color(0, 255, 0));
        lblTestYourKnowledge.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblTestYourKnowledge.setForeground(new java.awt.Color(0, 255, 0));
        lblTestYourKnowledge.setText("Test your knowledge!");
        jPanel1.add(lblTestYourKnowledge);
        lblTestYourKnowledge.setBounds(210, 130, 190, 26);

        lblPracticeMakesPerfect.setBackground(new java.awt.Color(0, 255, 0));
        lblPracticeMakesPerfect.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblPracticeMakesPerfect.setForeground(new java.awt.Color(0, 255, 0));
        lblPracticeMakesPerfect.setText("Practice Makes Perfect!");
        jPanel1.add(lblPracticeMakesPerfect);
        lblPracticeMakesPerfect.setBounds(420, 130, 180, 26);

        btnLogout.setBackground(new java.awt.Color(153, 204, 255));
        btnLogout.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout);
        btnLogout.setBounds(450, 10, 110, 40);

        btnHelp.setBackground(new java.awt.Color(153, 204, 255));
        btnHelp.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnHelp.setText("Help");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        jPanel1.add(btnHelp);
        btnHelp.setBounds(460, 320, 110, 40);

        btnTests.setBackground(new java.awt.Color(255, 255, 0));
        btnTests.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnTests.setText("Tests");
        btnTests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestsActionPerformed(evt);
            }
        });
        jPanel1.add(btnTests);
        btnTests.setBounds(240, 160, 110, 86);

        btnTutorials.setBackground(new java.awt.Color(102, 255, 102));
        btnTutorials.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnTutorials.setText("Tutorials");
        btnTutorials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTutorialsActionPerformed(evt);
            }
        });
        jPanel1.add(btnTutorials);
        btnTutorials.setBounds(40, 160, 107, 86);

        btnPractice.setBackground(new java.awt.Color(255, 0, 0));
        btnPractice.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnPractice.setText("Practice");
        btnPractice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPracticeActionPerformed(evt);
            }
        });
        jPanel1.add(btnPractice);
        btnPractice.setBounds(450, 160, 110, 86);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        jLabel2.setText("Main Menu");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 10, 237, 81);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setIcon(new ImageIcon("backround.jpg")); // NOI18N
        //jLabel1.setText("Learn a new subject!");
        jLabel1.setToolTipText("Check your progress!");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 769, 374);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 738, GroupLayout.PREFERRED_SIZE)
        );

        pack();


    }// </editor-fold>//GEN-END:initComponents

    private void btnSchoolsOutActionPerformed(ActionEvent evt) {

        if (evt.getSource() == btnSchoolsOut) {
            UserInteractionsConfigurator.set_difficulty_level_enum(null);
            UserInteractionsConfigurator.set_category_type_enum(null);
            UserInteractionsConfigurator.set_interactive_grade(null);
            UserInteractionsConfigurator.set_main_menu_selection_enum(null);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(null);
            UserInteractionsConfigurator.set_interactive_user(null);
            this.setVisible(false);
            new LogIn().setVisible(true);

        }
    }

    private void btnPracticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.PRACTICE);
        Object source = evt.getSource();
        if (source == btnPractice) {
            if (UserInteractionsConfigurator.get_interactive_grade_level_enum().equals(GradeLevel.K) ||
                    UserInteractionsConfigurator.get_interactive_grade_level_enum().equals(GradeLevel.PRE_K)) {
                new CategoriesMain().setVisible(true);
                this.setVisible(false);
            } else {
                new PracticeTest().setVisible(true);
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    private void btnTutorialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Object source = evt.getSource();
        if (source == btnTutorials) {
            if (UserInteractionsConfigurator.get_interactive_grade_level_enum().equals(GradeLevel.K) ||
                    UserInteractionsConfigurator.get_interactive_grade_level_enum().equals(GradeLevel.PRE_K)) {
                UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TUTORIALS);
                new CategoriesMain().setVisible(true);
                this.setVisible(false);
            } else {
                TutorialsPageConfigurator.loadTutorialsList();
                //  this.setVisible(false);
                this.dispose();
                new YouTubeFrame(TutorialsPageConfigurator.getTutorial().getTutorial()).setVisible(true);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnTestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Object source = evt.getSource();
        if (source == btnTests) {
            UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TESTS);
            System.out.println(UserInteractionsConfigurator.get_main_menu_selection_str());
            if (UserInteractionsConfigurator.get_interactive_grade_level_enum().equals(GradeLevel.K) ||
                    UserInteractionsConfigurator.get_interactive_grade_level_enum().equals(GradeLevel.PRE_K)) {
                new CategoriesMain().setVisible(true);
                this.setVisible(false);
            } else {
                new Test().setVisible(true);
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed


    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // Creates a File object
        File yourFile = new File("C:" + File.separator + "Windows" + File.separator + "Media" + File.separator + "notify.wav");


        AudioInputStream stream;
        AudioFormat format;
        DataLine.Info info;
        Clip clip;

        // A try/catch block to play the .wav file
        try {
            stream = AudioSystem.getAudioInputStream(yourFile);
            format = stream.getFormat();
            info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(stream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException ex) {
            Logger.getLogger(MathHelperMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(MathHelperMain.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        UserInteractionsConfigurator.set_difficulty_level_enum(null);
        UserInteractionsConfigurator.set_category_type_enum(null);
        UserInteractionsConfigurator.set_interactive_grade(null);
        UserInteractionsConfigurator.set_main_menu_selection_enum(null);
        UserInteractionsConfigurator.set_interactive_grade_level_enum(null);
        UserInteractionsConfigurator.set_interactive_user(null);
        this.setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(MathHelperMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MathHelperMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MathHelperMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MathHelperMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MathHelperMain().setVisible(true);
            }
        });
    }


}
