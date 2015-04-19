package com.teamamerica.mathhelper.ui.panels;

import com.teamamerica.mathhelper.environment.ConfigDirectory;
import com.teamamerica.mathhelper.ui.customcomponents.ImageButton;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Christina on 4/18/2015.
 */
public class HelpfulHints extends JFrame {
    // Variables declaration - do not modify//GEN-BEGIN:variables
    JPanel jPanel1;
    private ImageButton btnMain;
    private ImageButton btnNext;
    private ImageButton btnInfo;
    private ImageButton btnHelp;
    private ImageButton btnPencilReady;
    private ImageButton btnLearnNow;
    private ImageButton btnReadyToPractice;
    private ImageButton btnPrint;
    private ImageButton btnLogout;
    private JLabel lblHelpfulHints;

    private ImageButton btnBus;




    // End of variables declaration//GEN-END:variables


    public HelpfulHints() {
        initComponents();

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1 = new JPanel();
        lblHelpfulHints = new JLabel();
        btnMain = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_home.png"), 150, 125);
        btnInfo = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_helpDesk.png"), 150, 101);
        btnHelp = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_help.gif"), 150, 101);
        btnNext = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_arrow.jpg"), 150, 101);
        btnPencilReady = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_psharpener.png"), 150, 113);
        btnLearnNow = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_videoTutorial.jpg"), 150, 113);

        btnLogout= new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_logout.gif"), 150, 101);
        btnReadyToPractice = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_practice.jpg"), 150, 113);
        btnPrint = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_print.png"), 150, 113);

        btnBus = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_bus6.gif"), 150, 113);






        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel1.add(btnMain);
        jPanel1.add(btnInfo);
        jPanel1.add(btnHelp);

        jPanel1.add(btnLearnNow);
        jPanel1.add(btnPencilReady);
        jPanel1.add(btnNext);


        jPanel1.add(btnReadyToPractice);
        jPanel1.add(btnLogout);
        jPanel1.add(btnPrint);

        jPanel1.add(btnBus);


        lblHelpfulHints.setFont(new Font("Comic Sans MS", 0, 68)); // NOI18N
        lblHelpfulHints.setText("Helpful Hints");
        jPanel1.add(lblHelpfulHints);
        lblHelpfulHints.setBounds(30, 10, 1000, 90);


        btnHelp.setBounds(30, 125, 125, 101);
        btnInfo.setBounds(175, 125, 150, 101);
        btnLogout.setBounds(260, 125,300, 101);


        btnMain.setBounds(10, 250, 150, 125);
        btnReadyToPractice.setBounds(165, 250, 150, 101);
        btnNext.setBounds(250, 270,325, 101);

        btnLearnNow.setBounds(20, 400, 150, 113);
        btnPencilReady.setBounds(200, 400, 125, 101);
        btnPrint.setBounds(250, 400, 325, 113);

        btnBus.setBounds(100,525,247,181);




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


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new HelpfulHints().setVisible(true);
            }
        });
    }

}
