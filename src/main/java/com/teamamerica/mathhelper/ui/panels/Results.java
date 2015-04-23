package com.teamamerica.mathhelper.ui.panels;

import com.teamamerica.mathhelper.configurators.GradeConfigurator;
import com.teamamerica.mathhelper.configurators.UserInteractionsConfigurator;
import com.teamamerica.mathhelper.environment.ConfigDirectory;
import com.teamamerica.mathhelper.ui.customcomponents.AudioListener;
import com.teamamerica.mathhelper.ui.customcomponents.ImageButton;
import com.teamamerica.mathhelper.ui.customcomponents.ImageLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.util.ArrayList;

public class Results extends JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ImageButton btnSchoolsOut;
    private ImageButton btnMain;
    private ImageButton btnHelp;
    private ImageButton btnHints;
    private JLabel lblResults;
    private JPanel jPanel1;
    private JTextArea txtResults;

    private ImageButton btnPrint;
    private ImageLabel lblResultsImage;
    // End of variables declaration//GEN-END:variables

    public Results() {

        initComponents();
        displayGradeResults();
        AudioListener.runAudioListener("watever.wav");


    }

    private void displayGradeResults() {

        ArrayList<String> results = GradeConfigurator.getGradeResultLetter();
        for (String line : results) {
            txtResults.append(line);
        }

        String letterGrade = GradeConfigurator.getLetterGrade();
        if (letterGrade.equals("A+")) {
            lblResultsImage.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_Aplus.png"));

        } else if (letterGrade.equals("A")) {
            lblResultsImage.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_A.png"));

        } else if (letterGrade.equals("A-")) {
            lblResultsImage.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_Aminus.png"));

        } else if (letterGrade.equals("B+")) {
            lblResultsImage.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_Bplus.png"));

        } else if (letterGrade.equals("B")) {
            lblResultsImage.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_B.png"));

        } else if (letterGrade.equals("B-")) {
            lblResultsImage.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_Bminus.png"));

        } else if (letterGrade.equals("C+")) {
            lblResultsImage.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_Cplus.png"));

        } else if (letterGrade.equals("C")) {
            lblResultsImage.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_C.png"));

        } else if (letterGrade.equals("C-")) {
            lblResultsImage.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_Cminus.png"));

        } else if (letterGrade.equals("D+")) {
            lblResultsImage.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_Dplus.png"));

        } else if (letterGrade.equals("D")) {
            lblResultsImage.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_D.png"));

        } else if (letterGrade.equals("D-")) {
            lblResultsImage.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_Dminus.png"));

        } else if (letterGrade.equals("F")) {
            lblResultsImage.changeLabelImage(true, ConfigDirectory.getImageFileFromDirectory("panels_F.png"));

        } else {

            //do nothing this doesn't occur
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationByPlatform(true);
        setLocation(0, 0);


        jPanel1 = new JPanel();
        btnMain = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_home.png"), 150, 125);
        btnSchoolsOut = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_kidsSchoolBus.gif"), 300, 101);
        btnHelp = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_help.gif"), 150, 101);
        btnHints = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_helpDesk.png"), 150, 101);

        lblResultsImage = new ImageLabel(true, ConfigDirectory.getImageFileFromDirectory("panels_Aplus.png"), 306, 350);
        btnPrint = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_print.png"), 113, 113);

        lblResults = new JLabel();

        txtResults = new JTextArea("");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        btnPrint.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrint);
        btnPrint.setBounds(650, 575, 113, 113);
        lblResultsImage.setBounds(675, 175, 306, 350);

        btnHints.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHintsActionPerformed(evt);
            }
        });
        jPanel1.add(btnHints);
        btnHints.setBounds(850, 575, 150, 101);


        btnMain.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainActionPerformed(evt);
            }
        });
        btnMain.setBounds(3, 10, 150, 125);

        btnHelp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        jPanel1.add(btnHelp);
        btnHelp.setBounds(30, 575, 150, 101);


        btnSchoolsOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSchoolsOutActionPerformed(evt);
            }
        });
        jPanel1.add(btnSchoolsOut);
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        btnSchoolsOut.setBounds(750, 20, 300, 101);


        lblResults.setFont(new Font("Comic Sans MS", 0, 60)); // NOI18N
        lblResults.setText("Math Helper Results");
        jPanel1.add(lblResults);
        lblResults.setBounds(175, 20, 1000, 90);

        txtResults.setColumns(1);
        txtResults.setRows(11);
        txtResults.setEditable(false);
        txtResults.setFont(new Font("Comic Sans MS", 0, 26));

        jPanel1.add(txtResults);
        txtResults.setBounds(150, 130, 500, 420);

        jPanel1.add(lblResultsImage);
        btnMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainActionPerformed(evt);
            }
        });
        jPanel1.add(btnMain);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(ActionEvent evt) {
        AudioListener.runAudioListener("SpeechOn.wav");

        if (evt.getSource() == btnPrint) {
            try {
                System.out.println("trying to print: " + txtResults.getText());
                txtResults.print();
                ;
            } catch (PrinterException x) {
                // Print job did not complete.
            }
        }

    }


    private void btnMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        AudioListener.stopAudioListener();
        AudioListener.runAudioListener("SpeechOn.wav");


        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed


    private void btnSchoolsOutActionPerformed(ActionEvent evt) {

        if (evt.getSource() == btnSchoolsOut) {
            UserInteractionsConfigurator.set_difficulty_level_enum(null);
            UserInteractionsConfigurator.set_category_type_enum(null);
            UserInteractionsConfigurator.set_interactive_grade(null);
            UserInteractionsConfigurator.set_main_menu_selection_enum(null);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(null);
            UserInteractionsConfigurator.set_interactive_user(null);
            UserInteractionsConfigurator.playLoginScript = false;

            AudioListener.stopAudioListener();
            AudioListener.runAudioListener("SpeechOn.wav");

            this.dispose();
            new LogIn().setVisible(true);

        }
    }

    private void btnHintsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        AudioListener.runAudioListener("SpeechOn.wav");
        new HelpDeskHints().setVisible(true);

    }//GEN-LAST:event_jButton7ActionPerformed


    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AudioListener.runAudioListener("SpeechOn.wav");

    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Results().setVisible(true);
            }
        });
    }

}
