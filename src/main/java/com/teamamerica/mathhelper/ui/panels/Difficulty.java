package com.teamamerica.mathhelper.ui.panels;

import com.teamamerica.mathhelper.configurators.UserInteractionsConfigurator;
import com.teamamerica.mathhelper.controllers.DifficultyLevel;
import com.teamamerica.mathhelper.environment.ConfigDirectory;
import com.teamamerica.mathhelper.ui.customcomponents.AudioListener;
import com.teamamerica.mathhelper.ui.customcomponents.ImageButton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Christina on 4/21/2015.
 */
public class Difficulty extends JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ImageButton btnSchoolsOut;
    private ImageButton btnMain;
    private ImageButton btnHelp;
    private ImageButton btnHints;

    private ImageButton btnEasy;
    private ImageButton btnMedium;
    private ImageButton btnHard;
    private JLabel lblTitleDifficulty;
    private JLabel lblEasy;
    private JLabel lblHard;
    private JLabel lblMedium;
    private JPanel jPanel1;
    // End of variables declaration//GEN-END:variables


    /**
     * Creates new form Difficulty
     */
    public Difficulty() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1 = new JPanel();
        btnEasy = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_easy.png"), 220, 220);
        btnMedium = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_medium2.jpg"), 240, 160);
        btnHard = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_hard.jpg"), 224, 187);
        lblTitleDifficulty = new JLabel();
        lblEasy = new JLabel();
        lblHard = new JLabel();
        lblMedium = new JLabel();

        btnSchoolsOut = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_logout.gif"), 150, 101);
        btnSchoolsOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSchoolsOutActionPerformed(evt);
            }
        });
        jPanel1.add(btnSchoolsOut);
        btnSchoolsOut.setBounds(850, 10, 110, 101);

        btnMain = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_home.png"), 150, 125);
        btnMain.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMainActionPerformed(evt);
            }
        });
        jPanel1.add(btnMain);
        btnMain.setBounds(10, 10, 150, 125);

        btnHelp = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_help.gif"), 150, 101);
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        jPanel1.add(btnHelp);
        btnHelp.setBounds(30, 575, 150, 101);

        btnHints = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_helpDesk.png"), 150, 101);
        btnHints.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnHintsActionPerformed(evt);
            }
        });
        jPanel1.add(btnHints);
        btnHints.setBounds(850, 575, 150, 101);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(null);

        jPanel1.add(btnEasy);
        btnEasy.setBounds(80, 240, 220, 220);
        btnEasy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnEasyActionPerformed(evt);
            }
        });

        btnMedium.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMediumActionPerformed(evt);
            }
        });

        jPanel1.add(btnMedium);
        btnMedium.setBounds(320, 255, 240, 160);


        btnHard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHardActionPerformed(evt);
            }
        });
        jPanel1.add(btnHard);
        btnHard.setBounds(620, 205, 233, 216);

        lblEasy.setBounds(40, 395, 1000, 150);
        lblMedium.setBounds(335, 395, 1000, 150);
        lblHard.setBounds(630, 395, 1000, 150);

        lblTitleDifficulty.setFont(new java.awt.Font("Comic Sans MS", 0, 70)); // NOI18N
        lblTitleDifficulty.setText("Select Difficulty");
        jPanel1.add(lblTitleDifficulty);
        lblTitleDifficulty.setBounds(220, 30, 557, 100);

        lblEasy.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        lblEasy.setText("         Easy");
        lblEasy.setToolTipText("");
        lblEasy.setPreferredSize(new java.awt.Dimension(1000, 400));
        jPanel1.add(lblEasy);

        lblHard.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        lblHard.setText("        Hard");
        lblHard.setToolTipText("");
        lblHard.setPreferredSize(new java.awt.Dimension(1000, 400));
        jPanel1.add(lblHard);


        lblMedium.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        lblMedium.setText("      Medium");
        lblMedium.setToolTipText("");
        lblMedium.setPreferredSize(new java.awt.Dimension(1000, 400));
        jPanel1.add(lblMedium);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnEasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Object source = evt.getSource();
        if (source == btnEasy) {

            UserInteractionsConfigurator.set_difficulty_level_enum(DifficultyLevel.EASY);
            System.out.println(UserInteractionsConfigurator.get_difficulty_level_str());
            new Test().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton6ActionPerformed


    private void btnMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Object source = evt.getSource();
        if (source == btnMedium) {
            UserInteractionsConfigurator.set_difficulty_level_enum(DifficultyLevel.MEDIUM);
            System.out.println(UserInteractionsConfigurator.get_difficulty_level_str());
            new Test().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnHardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Object source = evt.getSource();
        if (source == btnHard) {
            UserInteractionsConfigurator.set_difficulty_level_enum(DifficultyLevel.HARD);
            System.out.println(UserInteractionsConfigurator.get_difficulty_level_str());
            new Test().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton8ActionPerformed


    private void btnMainActionPerformed(ActionEvent evt) {

        AudioListener.runAudioListener("SpeechOn.wav");
        new MainMenu().setVisible(true);
        this.dispose();

    }

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


    private void btnHelpActionPerformed(ActionEvent evt) {

        AudioListener.runAudioListener("SpeechOn.wav");


    }


    private void btnHintsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        AudioListener.runAudioListener("SpeechOn.wav");
        new HelpDeskHints().setVisible(true);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
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
            java.util.logging.Logger.getLogger(NewDifficulty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewDifficulty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewDifficulty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewDifficulty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new NewDifficulty().setVisible(true);
            }
        });
    }

}
