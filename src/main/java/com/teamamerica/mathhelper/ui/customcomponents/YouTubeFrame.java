/**
 * Name: Christina Reid
 * Date Produced: April 29,2015
 * Purpose: The purpose of this software is to help children learn math.
 */
package com.teamamerica.mathhelper.ui.customcomponents;

import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JFlashPlayer;
import com.teamamerica.mathhelper.configurators.TutorialsPageConfigurator;
import com.teamamerica.mathhelper.configurators.UserInteractionsConfigurator;
import com.teamamerica.mathhelper.controllers.MainMenuSelection;
import com.teamamerica.mathhelper.environment.ConfigDirectory;
import com.teamamerica.mathhelper.ui.panels.HelpDeskHints;
import com.teamamerica.mathhelper.ui.panels.MainMenu;
import com.teamamerica.mathhelper.ui.panels.PracticeTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Christina on 4/14/2015.
 */

/**
 * This class is the frame that contains the web browser embedded in a frame
 */
public class YouTubeFrame extends JFrame {

    private JFrame frame;
    private JPanel webBrowserPanel;
    private JFlashPlayer flashPlayer;
    private String url;

    public YouTubeFrame(String url) {

        System.out.println("YouTubeAddress: " + url);
        setBackground(Color.WHITE);
        setResizable(true);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.url = url;
        NativeInterface.open();
        createFrame();


    }


    public void createFrame() {

        frame = new JFrame("Math Helper Tutorials");

        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        frame.setResizable(true);


        getJFlashPlayer(url);
        frame.getContentPane().add(webBrowserPanel, BorderLayout.CENTER);

        frame.setSize(new Dimension(1016, 736));
        frame.setLocation(0,0);

        frame.setLocationByPlatform(true);
        frame.setVisible(true);


        frame.getContentPane().add(createHeaderPanel(), BorderLayout.NORTH);
        frame.setResizable(false);

        add(frame, BorderLayout.CENTER); //this throws an exception but it is the only way the browser loads and the frame loads in the frame
        setResizable(false);
        setLocation(0,0);


        NativeInterface.runEventPump();


        //close native components
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                NativeInterface.close();
            }
        }));
    }


    private void btnNextActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                String url = TutorialsPageConfigurator.getTutorial().getTutorial();
                System.out.println("YouTubeAddress: " + url);
                flashPlayer.getWebBrowser().navigate(url);
            }
        });
    }



    private JPanel createHeaderPanel() {
        JPanel pnButtons = new JPanel();
        pnButtons.setBackground(Color.WHITE);
        pnButtons.setLayout(new GridLayout(1, 6));

        final ImageButton btnMain = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_home.png"), 150, 125);
        btnMain.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMainActionPerformed(evt);
            }
        });


        ImageButton btnHelp = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_help.gif"), 150, 113);
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        final ImageButton btnHints = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_helpDesk.png"), 150, 101);
        btnHints.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnHintsActionPerformed(evt);
            }
        });

        final ImageButton btnNext = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_arrow.jpg"), 150, 101);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });


        ImageButton btnPractice = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_practice.jpg"), 150, 101);
        btnPractice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPracticeActionPerformed(evt);
            }
        });

        btnMain.setBounds(10, 10, 150, 125);
        btnHelp.setBounds(10, 100, 150, 113);
        btnPractice.setBounds(10, 300, 150, 101);
        btnHints.setBounds(10, 700, 150, 101);
        btnNext.setBounds(820, 10, 150, 101);

        btnMain.setToolTipText("Home!");
        btnPractice.setToolTipText("Let Me Try!");
        btnHelp.setToolTipText("I Need Help!");
        btnHints.setToolTipText("HelpDesk Hints!");
        btnNext.setToolTipText("Next!");


        pnButtons.add(btnMain);
        pnButtons.add(btnHelp);
        pnButtons.add(btnPractice);
        pnButtons.add(btnHints);
        pnButtons.add(btnNext);


        return pnButtons;
    }

    private void btnPracticeActionPerformed(ActionEvent evt) {
        AudioListener.stopAudioListener();
        AudioListener.runAudioListener("SpeechOn.wav");
        this.dispose();
        this.frame.dispose();
        UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.PRACTICE);
        new PracticeTest().setVisible(true);


    }

    private void btnMainActionPerformed(ActionEvent evt) {
        AudioListener.stopAudioListener();
        AudioListener.runAudioListener("SpeechOn.wav");
        this.dispose();
        this.frame.dispose();

        new MainMenu().setVisible(true);

    }


    private void btnHelpActionPerformed(ActionEvent evt) {
        AudioListener.stopAudioListener();
        AudioListener.runAudioListener("SpeechOn.wav");
        AudioListener.runAudioListener("tutorials.wav");


    }

    private void btnHintsActionPerformed(ActionEvent evt) {
        AudioListener.runAudioListener("SpeechOn.wav");
        new HelpDeskHints().setVisible(true);

    }

    private void getJFlashPlayer(final String url) {

        webBrowserPanel = new JPanel(new BorderLayout());
        webBrowserPanel.setBackground(Color.WHITE);

        flashPlayer = new JFlashPlayer();
        webBrowserPanel.add(flashPlayer, BorderLayout.CENTER);
        flashPlayer.getWebBrowser().setBarsVisible(false);

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                flashPlayer.getWebBrowser().navigate(url);
            }
        });

    }


    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new YouTubeFrame("https://www.youtube.com/v/b-Cr0EWwaTk?fs=1").setVisible(true);
            }
        });
    }
}





