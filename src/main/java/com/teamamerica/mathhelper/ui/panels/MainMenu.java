package com.teamamerica.mathhelper.ui.panels;

import com.teamamerica.mathhelper.configurators.TutorialsPageConfigurator;
import com.teamamerica.mathhelper.configurators.UserInteractionsConfigurator;
import com.teamamerica.mathhelper.controllers.GradeLevel;
import com.teamamerica.mathhelper.controllers.MainMenuSelection;
import com.teamamerica.mathhelper.environment.ConfigDirectory;
import com.teamamerica.mathhelper.ui.customcomponents.AudioListener;
import com.teamamerica.mathhelper.ui.customcomponents.ImageButton;
import com.teamamerica.mathhelper.ui.customcomponents.YouTubeFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ImageButton btnHelp,btnHints, btnPractice;
    private ImageButton btnLearn;
    private ImageButton btnTest;
    private ImageButton btnSchoolsOut;
    private JLabel lblHome;
    private JLabel lblLearn;
    private JLabel lblSchoolsOut;
    private JLabel lblTest;
    private JLabel lblPractice;
    private JPanel jPanel1;
    // End of variables declaration//GEN-END:variables


    public MainMenu() {
      initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        lblLearn = new JLabel();
        lblSchoolsOut = new JLabel();
        lblSchoolsOut = new JLabel();
        btnSchoolsOut = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_logout.gif"), 300, 101);
        btnHints = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_helpDesk.png"), 150, 101);
        btnHelp = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_help.gif"), 150, 101);

        btnTest =  new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_schoolTest.gif"), 300, 300);
        btnPractice = new ImageButton(true,ConfigDirectory.getImageFileFromDirectory("panels_possPract2.gif"),400,400);
        btnLearn = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_teacherTutorial.gif"), 300, 300);
        lblHome = new JLabel();
        lblTest = new JLabel();
        lblPractice = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        btnLearn.setBounds(10, 175, 300, 300);
        btnPractice.setBounds(275,175,400,400);
        btnTest.setBounds(650, 175, 300, 300);

        lblLearn.setBounds(40, 475, 230, 34);
        lblPractice.setBounds(350, 475, 700, 34);
        lblTest.setBounds(675, 475, 240, 34);


        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        lblLearn.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblLearn.setText("Learn a new subject!");
        jPanel1.add(lblLearn);

        lblPractice.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblPractice.setText("Practice Makes Perfect!");
        jPanel1.add(lblPractice);

        jPanel1.add(btnPractice);
          btnSchoolsOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSchoolsOutActionPerformed(evt);
            }
        });
        jPanel1.add(btnSchoolsOut);

        btnSchoolsOut.setBounds(750, 20, 300, 101);

        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
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
        btnHints.setBounds(850, 575, 150, 101);
       btnTest.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               btnTestActionPerformed(evt);
           }
       });
        jPanel1.add(btnTest);
       btnLearn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLearnActionPerformed(evt);
            }
        });
        jPanel1.add(btnLearn);

        btnPractice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPracticeActionPerformed(evt);
            }
        });

        lblHome.setBackground(new java.awt.Color(255, 255, 255));
        lblHome.setFont(new java.awt.Font("Comic Sans MS", 0, 70)); // NOI18N
        lblHome.setText("Math Helper Home");
        jPanel1.add(lblHome);
        lblHome.setBounds(150, 20, 1000, 120);

        lblTest.setBackground(new java.awt.Color(255, 255, 255));
        lblTest.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblTest.setText("Test your knowledge!");
        jPanel1.add(lblTest);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private void btnHintsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        AudioListener.runAudioListener("SpeechOn.wav");
        new HelpDeskHints().setVisible(true);

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


    private void btnLearnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Object source = evt.getSource();
        if (source == btnLearn) {
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

    private void btnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Object source = evt.getSource();
        if (source == btnTest) {
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


    private void btnHelpActionPerformed(ActionEvent evt) {

        AudioListener.runAudioListener("SpeechOn.wav");


    }
    private void btnSchoolsOutActionPerformed(ActionEvent evt) {

        if (evt.getSource() == btnSchoolsOut) {
            UserInteractionsConfigurator.set_difficulty_level_enum(null);
            UserInteractionsConfigurator.set_category_type_enum(null);
            UserInteractionsConfigurator.set_interactive_grade(null);
            UserInteractionsConfigurator.set_main_menu_selection_enum(null);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(null);
            UserInteractionsConfigurator.set_interactive_user(null);
            this.dispose();
            new LogIn().setVisible(true);

        }
    }


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Object source = evt.getSource();
       if(source == btnLearn){

          this.dispose();
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       Object source = evt.getSource();
       if(source == btnTest){
          this.dispose();
       }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
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
                new MainMenu().setVisible(true);
            }
        });
    }

}
