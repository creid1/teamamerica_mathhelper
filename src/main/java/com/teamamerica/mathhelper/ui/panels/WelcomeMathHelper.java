package com.teamamerica.mathhelper.ui.panels;

import com.teamamerica.mathhelper.configurators.UserInteractionsConfigurator;
import com.teamamerica.mathhelper.controllers.GradeLevel;
import com.teamamerica.mathhelper.environment.ConfigDirectory;
import com.teamamerica.mathhelper.ui.customcomponents.AudioListener;
import com.teamamerica.mathhelper.ui.customcomponents.ImageButton;
import com.teamamerica.mathhelper.ui.customcomponents.ImageLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeMathHelper extends JFrame {
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btn3;
    private ImageButton btnHelp, btnHints;
    private ImageButton btn2;
    private ImageButton btnnPreK;
    private ImageButton btn1;
    private ImageButton btn4;
    private ImageButton btnK;
    private JLabel lblWelcomeTitle;
    private JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private ImageLabel lblWelcomeBackImage, lblSchoolImage;

    public WelcomeMathHelper() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        setBackground(Color.WHITE);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        lblWelcomeTitle = new JLabel();
        jPanel1 = new JPanel();
        jPanel1.setBackground(Color.WHITE);

        btn2 = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_2gradefinal.gif"), 250, 101);
        btnnPreK =new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_prekfinal.gif"), 250, 101);
        btn1 = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_1gradefinal.gif"), 250, 101);
        btn4 = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_4gradefinal.gif"), 250, 101);
        btnK = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_Kinderfinal.gif"), 250, 101);
        btn3 = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_3gradefinal.gif"), 250, 101);

        btnHelp = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_help.gif"), 150, 101);
        btnHints = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_helpDesk.png"), 150, 101);

        lblWelcomeBackImage = new ImageLabel(true, ConfigDirectory.getImageFileFromDirectory("panels_childrenSchool.jpg"), 290, 174);
        lblSchoolImage = new ImageLabel(true, ConfigDirectory.getImageFileFromDirectory("panels_elementary.jpg"), 224, 134);

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

        btnnPreK.setBackground(new java.awt.Color(102, 255, 102));
        btnnPreK.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnnPreK.setText("Pre-K");
        btnnPreK.setPreferredSize(new java.awt.Dimension(107, 35));
        btnnPreK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreKActionPerformed(evt);
            }
        });
        jPanel1.add(btnnPreK);

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
        jPanel1.add(lblWelcomeBackImage);
        lblWelcomeTitle.setText("Welcome To The Math Helper");
        jPanel1.add(lblWelcomeTitle);
        jPanel1.add(lblSchoolImage);

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
        lblWelcomeBackImage.setBounds(500, 100, 290, 174);
        lblSchoolImage.setBounds(175,120,224,134);

        btnnPreK.setBounds(75, 315, 250, 101);
        btnK.setBounds(375, 315, 250, 101);
        btn1.setBounds(675, 315, 250, 101);

        btn2.setBounds(75, 450, 250, 101);
        btn3.setBounds(375, 450, 250, 101);
        btn4.setBounds(675, 450, 250, 101);

          GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 1016, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 738, GroupLayout.PREFERRED_SIZE)
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
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.SECOND);
            new MathHelperOptions().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnPreKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Object source = evt.getSource();
        if (source == btnnPreK) {
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.PRE_K);
            new MathHelperOptions().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Object source = evt.getSource();
        if (source == btn1) {
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.FIRST);

            new MathHelperOptions().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Object source = evt.getSource();
        if (source == btn4) {
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.FOURTH);

            new MathHelperOptions().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Object source = evt.getSource();
        if (source == btnK) {
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.K);
            System.out.println(UserInteractionsConfigurator.get_interactive_grade_level_enum());

            new MathHelperOptions().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Object source = evt.getSource();
        if (source == btn3) {
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.THIRD);
            System.out.println(UserInteractionsConfigurator.get_interactive_grade_level_enum());
            new MathHelperOptions().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AudioListener.runAudioListener("SpeechOn.wav");

    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new WelcomeMathHelper().setVisible(true);
            }
        });
    }

}
