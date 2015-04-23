package com.teamamerica.mathhelper.ui.panels;

import com.teamamerica.mathhelper.environment.ConfigDirectory;
import com.teamamerica.mathhelper.ui.customcomponents.AudioListener;
import com.teamamerica.mathhelper.ui.customcomponents.ImageButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Christina on 4/20/2015.
 */
public class HelpDeskAdminHints extends JFrame {
    // Variables declaration - do not modify//GEN-BEGIN:variables
    JPanel jPanel1;
    private ImageButton btnUpdateMathHelper;
    private ImageButton btnFindMathHelpers;
    private ImageButton btnTeacherZone;
    private ImageButton btnExit;
    private ImageButton btnNewMathHelper;
    private ImageButton btnSubmit;
    private ImageButton btnDelete;

    private JLabel lblAdminHints, lblDelete;

    private JLabel lblUpdateMathHelper, lblNewMathHelper, lblFindMathHelpers;
    private JLabel lblExit, lblSubmit, lblTeacherZone;

    private ImageButton btnBus;


    // End of variables declaration//GEN-END:variables


    public HelpDeskAdminHints() {
        initComponents();

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setLocation(850, 0);

        jPanel1 = new JPanel();
        lblAdminHints = new JLabel();
        btnUpdateMathHelper = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_welcomeBackAdmin.jpg"), 95, 95);
        btnFindMathHelpers = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_generateStudentsAdmin.png"), 95, 95);
        btnNewMathHelper = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_welcomeAdmin.jpg"), 95, 95);

        btnTeacherZone = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_teacherZoneAdmin.jpg"), 111, 95);
        btnExit = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_bookWorm.gif"), 175, 150);

        btnSubmit = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_teacherNotesAdmin.jpg"), 148, 95);
        btnDelete = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_pencilErasing.gif"), 90, 89);
        btnBus = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_bus6.gif"), 150, 113);
        btnBus.setToolTipText("Close HelpDesk Hints!");


        lblUpdateMathHelper = new JLabel("Update MathHelper!");
        lblExit = new JLabel("Exit!");
        lblFindMathHelpers = new JLabel("Find MathHelpers!");
        lblNewMathHelper = new JLabel("New MathHelper!");
        lblSubmit = new JLabel("Submit MathHelper!");
        lblTeacherZone = new JLabel("Admin Account!");
        lblDelete = new JLabel("Delete MathHelper!");

        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel1.add(btnUpdateMathHelper);
        jPanel1.add(btnExit);
        jPanel1.add(btnFindMathHelpers);
        jPanel1.add(btnNewMathHelper);
        jPanel1.add(btnSubmit);
        jPanel1.add(btnBus);
        jPanel1.add(btnTeacherZone);
        jPanel1.add(lblTeacherZone);
        jPanel1.add(lblUpdateMathHelper);
        jPanel1.add(lblNewMathHelper);
        jPanel1.add(lblFindMathHelpers);
        jPanel1.add(btnDelete);
        jPanel1.add(lblDelete);


        jPanel1.add(lblExit);
        jPanel1.add(lblSubmit);


        lblAdminHints.setFont(new Font("Comic Sans MS", 0, 60)); // NOI18N
        lblAdminHints.setText("     HelpDesk");
        jPanel1.add(lblAdminHints);
        lblAdminHints.setBounds(30, 10, 1000, 90);


        JLabel lblAdminHints2 = new JLabel("   Admin Hints!");
        lblAdminHints2.setFont(new Font("Comic Sans MS", 0, 60)); // NOI18N
        jPanel1.add(lblAdminHints2);
        lblAdminHints2.setBounds(15, 90, 1000, 90);


        btnUpdateMathHelper.setBounds(20, 215, 95, 95);
        btnNewMathHelper.setBounds(150, 215, 95, 95);
        btnFindMathHelpers.setBounds(252, 215, 95, 95);
        btnTeacherZone.setBounds(370, 215, 111, 95);

        lblUpdateMathHelper.setBounds(10, 275, 150, 101);
        lblUpdateMathHelper.setFont(new Font("Comic Sans MS", 1, 13)); // NOI18N

        lblNewMathHelper.setBounds(145, 275, 150, 101);
        lblNewMathHelper.setFont(new Font("Comic Sans MS", 1, 13)); // NOI18N

        lblFindMathHelpers.setBounds(265, 275, 150, 101);
        lblFindMathHelpers.setFont(new Font("Comic Sans MS", 1, 13)); // NOI18N

        lblTeacherZone.setFont(new Font("Comic Sans MS", 1, 13)); // NOI18N
        lblTeacherZone.setBounds(390, 275, 150, 101);

        btnExit.setBounds(10, 350, 175, 150);
        btnDelete.setBounds(185, 400, 90, 89);
        btnSubmit.setBounds(300, 370, 200, 150);


        lblSubmit.setBounds(340, 460, 150, 101);
        lblSubmit.setFont(new Font("Comic Sans MS", 1, 13)); // NOI18N
        lblExit.setBounds(80, 460, 150, 101);
        lblExit.setFont(new Font("Comic Sans MS", 1, 13)); // NOI18N
        lblDelete.setBounds(175, 460, 150, 101);
        lblDelete.setFont(new Font("Comic Sans MS", 1, 13)); // NOI18N


        btnBus.setBounds(120, 530, 247, 181);
        btnBus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnBusActionPerformed(evt);
            }
        });


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


    private void btnBusActionPerformed(ActionEvent evt) {
        AudioListener.runAudioListener("SpeechOn.wav");
        if (evt.getSource() == btnBus) {
            this.dispose();
        }
    }


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new HelpDeskAdminHints().setVisible(true);
            }
        });
    }
}