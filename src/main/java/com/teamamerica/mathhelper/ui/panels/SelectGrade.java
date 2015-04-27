package com.teamamerica.mathhelper.ui.panels;

import com.teamamerica.mathhelper.configurators.UserInteractionsConfigurator;
import com.teamamerica.mathhelper.controllers.GradeLevel;
import com.teamamerica.mathhelper.environment.ConfigDirectory;
import com.teamamerica.mathhelper.ui.customcomponents.AudioListener;
import com.teamamerica.mathhelper.ui.customcomponents.ImageButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectGrade extends JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btn3;
    private ImageButton btnHelp, btnHints;
    private ImageButton btn2;
    private ImageButton btnPreK;
    private ImageButton btn1;
    private ImageButton btn4;
    private ImageButton btnK;
    private JLabel lblWelcomeTitle;
    private JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private JLabel lblSelectGrade;

    public SelectGrade() {
        initComponents();
        AudioListener.runAudioListener("selectgrade.wav");

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        setBackground(Color.WHITE);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setLocationByPlatform(true);
        setLocation(0, 0);

        lblWelcomeTitle = new JLabel();
        jPanel1 = new JPanel();
        jPanel1.setBackground(Color.WHITE);

        btn2 = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_2gradefinal.gif"), 250, 101);
        btnPreK = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_prekfinal.gif"), 250, 101);
        btn1 = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_1gradefinal.gif"), 250, 101);
        btn4 = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_4gradefinal.gif"), 250, 101);
        btnK = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_Kinderfinal.gif"), 250, 101);
        btn3 = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_3gradefinal.gif"), 250, 101);

        btn2.setToolTipText("2nd Grade!");
        btnPreK.setToolTipText("Pre-K!");
        btn1.setToolTipText("1st Grade!");
        btn3.setToolTipText("3rd Grade!");
        btnK.setToolTipText("Kindergarten!");
        btn4.setToolTipText("4th Grade!");



        btnHelp = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_help.gif"), 150, 101);
        btnHints = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_helpDesk.png"), 150, 101);

        btnHelp.setToolTipText("I Need Help!");
        btnHints.setToolTipText("HelpDesk Hints!");


        lblSelectGrade = new JLabel();

        lblSelectGrade.setFont(new java.awt.Font("Comic Sans MS", 1, 45)); // NOI18N
        lblSelectGrade.setForeground(new java.awt.Color(51, 255, 51));
        lblSelectGrade.setText("Select a Grade");
        jPanel1.add(lblSelectGrade);
        lblSelectGrade.setBounds(325, 125, 1000, 90);


        jPanel1.setLayout(null);


        btnHints.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnHintsActionPerformed(evt);
            }
        });
        jPanel1.add(btnHints);
        btnHints.setBounds(850, 575, 150, 101);


        btn2.setBackground(new java.awt.Color(102, 255, 102));
        btn2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btn2.setText("2nd");
        btn2.setPreferredSize(new java.awt.Dimension(107, 35));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2);

        btnPreK.setBackground(new java.awt.Color(102, 255, 102));
        btnPreK.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnPreK.setText("Pre-K");
        btnPreK.setPreferredSize(new java.awt.Dimension(107, 35));
        btnPreK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreKActionPerformed(evt);
            }
        });
        jPanel1.add(btnPreK);

        btn1.setBackground(new java.awt.Color(255, 0, 0));
        btn1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btn1.setText("1st");
        btn1.setPreferredSize(new java.awt.Dimension(107, 35));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1);
        btn4.setBackground(new java.awt.Color(255, 0, 0));
        btn4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btn4.setText("4th");
        btn4.setPreferredSize(new java.awt.Dimension(107, 35));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4);


        btnK.setBackground(new java.awt.Color(255, 255, 0));
        btnK.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnK.setText("Kindergarten");
        btnK.setPreferredSize(new java.awt.Dimension(107, 35));
        btnK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKActionPerformed(evt);
            }
        });
        jPanel1.add(btnK);


        btn3.setBackground(new java.awt.Color(255, 255, 0));
        btn3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btn3.setText("3rd");
        btn3.setPreferredSize(new java.awt.Dimension(107, 35));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3);

        lblWelcomeTitle.setFont(new Font("Comic Sans MS", 0, 60)); // NOI18N
        lblWelcomeTitle.setText("Welcome To The Math Helper");
        jPanel1.add(lblWelcomeTitle);
        jPanel1.add(lblSelectGrade);

        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        jPanel1.add(btnHelp);
        btnHelp.setBounds(30, 575, 150, 101);
        btnHelp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        lblWelcomeTitle.setBounds(75, 10, 1000, 100);

        btnPreK.setBounds(75, 315, 250, 101);
        btnK.setBounds(375, 315, 250, 101);
        btn1.setBounds(675, 315, 250, 101);

        btn2.setBounds(75, 450, 250, 101);
        btn3.setBounds(375, 450, 250, 101);
        btn4.setBounds(675, 450, 250, 101);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 1000, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 700, GroupLayout.PREFERRED_SIZE)
        );

        pack();


    }// </editor-fold>//GEN-END:initComponents


    private void btnHintsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        AudioListener.runAudioListener("SpeechOn.wav");
        new HelpDeskHints().setVisible(true);

    }//GEN-LAST:event_jButton7ActionPerformed


    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Object source = evt.getSource();
        if (source == btn2) {
            AudioListener.stopAudioListener();
            AudioListener.runAudioListener("SpeechOn.wav");

            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.SECOND);
            this.dispose();
            new MainMenu().setVisible(true);

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnPreKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Object source = evt.getSource();
        if (source == btnPreK) {
            AudioListener.stopAudioListener();
            AudioListener.runAudioListener("SpeechOn.wav");

            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.PRE_K);
            this.dispose();
            new MainMenu().setVisible(true);

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Object source = evt.getSource();

        if (source == btn1) {
            AudioListener.stopAudioListener();
            AudioListener.runAudioListener("SpeechOn.wav");

            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.FIRST);
            this.dispose();
            new MainMenu().setVisible(true);

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Object source = evt.getSource();

        if (source == btn4) {
            AudioListener.stopAudioListener();
            AudioListener.runAudioListener("SpeechOn.wav");

            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.FOURTH);
            AudioListener.runAudioListener("SpeechOn.wav");
            this.dispose();
            new MainMenu().setVisible(true);

        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Object source = evt.getSource();
        if (source == btnK) {
            AudioListener.stopAudioListener();
            AudioListener.runAudioListener("SpeechOn.wav");

            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.K);

            new MainMenu().setVisible(true);
            this.dispose();

        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Object source = evt.getSource();
        if (source == btn3) {
            AudioListener.stopAudioListener();
            AudioListener.runAudioListener("SpeechOn.wav");

            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.THIRD);
            System.out.println(UserInteractionsConfigurator.get_interactive_grade_level_enum());

            this.dispose();
            new MainMenu().setVisible(true);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AudioListener.stopAudioListener();
        AudioListener.runAudioListener("SpeechOn.wav");
        AudioListener.runAudioListener("selectgrade.wav");


    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SelectGrade().setVisible(true);
            }
        });
    }

}
