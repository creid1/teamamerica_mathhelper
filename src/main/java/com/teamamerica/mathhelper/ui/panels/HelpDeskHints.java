package com.teamamerica.mathhelper.ui.panels;

import com.teamamerica.mathhelper.environment.ConfigDirectory;
import com.teamamerica.mathhelper.ui.customcomponents.AudioListener;
import com.teamamerica.mathhelper.ui.customcomponents.ImageButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Christina on 4/18/2015.
 */
public class HelpDeskHints extends JFrame {
    // Variables declaration - do not modify//GEN-BEGIN:variables
    JPanel jPanel1;
    private ImageButton btnHome;
    private ImageButton btnNext;
    private ImageButton btnHints;
    private ImageButton btnINeedHelp;
    private ImageButton btnPencilReady;
    private ImageButton btnLearnNow;
    private ImageButton btnLetMeTry;
    private ImageButton btnPrint;
    private ImageButton btnSchoolsOut;
    private JLabel lblHelpDeskHints;

    private JLabel lblINeedHelp, lblHints, lblLogout;
    private JLabel lblHome, lblLetMeTry, lblNext;
    private JLabel lblPencilsReady, lblLearnNow, lblPrint;

    private ImageButton btnBus;


    // End of variables declaration//GEN-END:variables


    public HelpDeskHints() {
        initComponents();

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setLocation(850, 0);

        jPanel1 = new JPanel();
        lblHelpDeskHints = new JLabel();
        btnHome = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_home.png"), 150, 101);
        btnHints = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_helpDesk.png"), 150, 115);
        btnINeedHelp = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_help.gif"), 150, 101);
        btnNext = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_arrow.jpg"), 150, 101);
        btnPencilReady = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_psharpener.png"), 150, 113);
        btnLearnNow = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_videoTutorial.jpg"), 150, 113);

        btnSchoolsOut = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_kidsSchoolBus.gif"), 275, 100);
        btnLetMeTry = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_practice.jpg"), 150, 113);
        btnPrint = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_print.png"), 150, 113);

        btnBus = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_bus6.gif"), 150, 113);


        btnHome.setToolTipText("Home!");
        btnSchoolsOut.setToolTipText("Schools Out!");
        btnINeedHelp.setToolTipText("I Need Help!");
        btnHints.setToolTipText("HelpDesk Hints!");
        btnNext.setToolTipText("Next!");
        btnPencilReady.setToolTipText("Pencils Ready!");
        btnLearnNow.setToolTipText("Learn Now!");
        btnLetMeTry.setToolTipText("Let Me Try!");
        btnPrint.setToolTipText("Print!");
        btnBus.setToolTipText("Close HelpDesk Hints!");


        lblHints = new JLabel("HelpDesk Hints!");
        lblHome = new JLabel("Home!");
        lblINeedHelp = new JLabel("I Need Help!");
        lblLearnNow = new JLabel("Learn Now!");
        lblLogout = new JLabel("Schools Out!");
        lblNext = new JLabel("Next!");
        lblPencilsReady = new JLabel("Pencils Ready!");
        lblLetMeTry = new JLabel("Let Me Try!");
        lblPrint = new JLabel("Print Me!");


        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel1.add(btnHome);
        jPanel1.add(btnHints);
        jPanel1.add(btnINeedHelp);

        jPanel1.add(btnLearnNow);
        jPanel1.add(btnPencilReady);
        jPanel1.add(btnNext);


        jPanel1.add(btnLetMeTry);
        jPanel1.add(btnSchoolsOut);
        jPanel1.add(btnPrint);

        jPanel1.add(btnBus);

        jPanel1.add(lblINeedHelp);
        jPanel1.add(lblHints);
        jPanel1.add(lblLogout);

        jPanel1.add(lblHome);
        jPanel1.add(lblLetMeTry);
        jPanel1.add(lblNext);


        jPanel1.add(lblLearnNow);
        jPanel1.add(lblPencilsReady);
        jPanel1.add(lblPrint);

        lblHelpDeskHints.setFont(new Font("Comic Sans MS", 0, 60)); // NOI18N
        lblHelpDeskHints.setText("HelpDesk Hints!");
        jPanel1.add(lblHelpDeskHints);
        lblHelpDeskHints.setBounds(30, 10, 1000, 90);


        btnINeedHelp.setBounds(30, 115, 150, 101);
        btnINeedHelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnINeedHelp) {
                    AudioListener.stopAudioListener();
                    AudioListener.runAudioListener("HelpButton.wav");
                }
            }
        });
        btnHints.setBounds(185, 115, 150, 101);
        btnHints.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnHints) {
                    AudioListener.stopAudioListener();
                    AudioListener.runAudioListener("Helpdeskhints.wav");
                }
            }
        });
        btnSchoolsOut.setBounds(265, 115, 275, 100);
        btnSchoolsOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnSchoolsOut) {
                    AudioListener.stopAudioListener();
                    AudioListener.runAudioListener("Schoolsout.wav");
                }
            }
        });

        lblINeedHelp.setBounds(55, 175, 150, 101);
        lblINeedHelp.setFont(new Font("Comic Sans MS", 1, 16)); // NOI18N
        lblHints.setBounds(200, 175, 150, 101);
        lblHints.setFont(new Font("Comic Sans MS", 1, 16)); // NOI18N
        lblLogout.setBounds(355, 175, 300, 101);
        lblLogout.setFont(new Font("Comic Sans MS", 1, 16)); // NOI18N


        btnHome.setBounds(10, 240, 150, 115);
        btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnHome) {
                    AudioListener.stopAudioListener();
                    AudioListener.runAudioListener("Homebutton.wav");
                }
            }
        });
        btnLetMeTry.setBounds(165, 250, 150, 101);
        btnLetMeTry.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnLetMeTry) {
                    AudioListener.stopAudioListener();
                    AudioListener.runAudioListener("Letmetry.wav");
                }
            }
        });
        btnNext.setBounds(248, 260, 325, 101);
        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnNext) {
                    AudioListener.stopAudioListener();
                    AudioListener.runAudioListener("Nextbutton.wav");
                }
            }
        });

        lblHome.setBounds(65, 315, 150, 101);
        lblHome.setFont(new Font("Comic Sans MS", 1, 16)); // NOI18N

        lblLetMeTry.setBounds(190, 315, 150, 101);
        lblLetMeTry.setFont(new Font("Comic Sans MS", 1, 16)); // NOI18N

        lblNext.setBounds(378, 315, 150, 101);
        lblNext.setFont(new Font("Comic Sans MS", 1, 16)); // NOI18N

        btnLearnNow.setBounds(25, 395, 150, 113);
        btnLearnNow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnLearnNow) {
                    AudioListener.stopAudioListener();
                    AudioListener.runAudioListener("Learnnow.wav");
                }
            }
        });
        btnPencilReady.setBounds(200, 395, 125, 101);
        btnPencilReady.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnPencilReady) {
                    AudioListener.stopAudioListener();
                    AudioListener.runAudioListener("Pencilsready.wav");
                }
            }
        });
        btnPrint.setBounds(250, 388, 325, 113);
        btnPrint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnPrint) {
                    AudioListener.stopAudioListener();
                    AudioListener.runAudioListener("Printme.wav");
                }
            }
        });


        lblLearnNow.setBounds(60, 468, 150, 101);
        lblLearnNow.setFont(new Font("Comic Sans MS", 1, 16)); // NOI18N

        lblPencilsReady.setBounds(215, 468, 150, 101);
        lblPencilsReady.setFont(new Font("Comic Sans MS", 1, 16)); // NOI18N

        lblPrint.setBounds(380, 468, 150, 101);
        lblPrint.setFont(new Font("Comic Sans MS", 1, 16)); // NOI18N

        btnBus.setBounds(120, 525, 247, 181);
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
        AudioListener.stopAudioListener();
        AudioListener.runAudioListener("SpeechOn.wav");
        if (evt.getSource() == btnBus) {
            this.dispose();
        }
    }


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new HelpDeskHints().setVisible(true);
            }
        });
    }

}
