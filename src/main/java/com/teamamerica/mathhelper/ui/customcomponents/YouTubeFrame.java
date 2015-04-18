package com.teamamerica.mathhelper.ui.customcomponents;

import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JFlashPlayer;
import com.teamamerica.mathhelper.configurators.TutorialsPageConfigurator;
import com.teamamerica.mathhelper.configurators.UserInteractionsConfigurator;
import com.teamamerica.mathhelper.controllers.GradeLevel;
import com.teamamerica.mathhelper.environment.ConfigDirectory;
import com.teamamerica.mathhelper.ui.panels.AllTutorials;
import com.teamamerica.mathhelper.ui.panels.FirstGradeTestMain;
import com.teamamerica.mathhelper.ui.panels.MainMenu;
import com.teamamerica.mathhelper.ui.panels.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Christina on 4/14/2015.
 */
public class YouTubeFrame extends JFrame {

    private JFrame frame;
    private JPanel webBrowserPanel;
    private JFlashPlayer flashPlayer;
    private String url;

    public YouTubeFrame(String url) {
        setBackground(Color.WHITE);

        this.url = url;
        NativeInterface.open();

        createFrame();

    }


    public void createFrame() {

        frame = new JFrame("Math Helper Tutorials");

        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);




        getJFlashPlayer(url);
        frame.getContentPane().add(webBrowserPanel, BorderLayout.CENTER);


        frame.setSize(new Dimension(1016, 638));

        frame.setLocationByPlatform(true);
        frame.setVisible(true);


        frame.getContentPane().add(createHeaderPanel(), BorderLayout.NORTH);

        add(frame, BorderLayout.CENTER); //this throws an exception but it is the only way the browser loads and the frame loads in the frame


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
                flashPlayer.getWebBrowser().navigate(TutorialsPageConfigurator.getTutorial().getTutorial());
            }
        });
    }


    private void btnTutorialsActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        GradeLevel gradeLevel = UserInteractionsConfigurator.get_interactive_grade_level_enum();
        if(gradeLevel == GradeLevel.K || gradeLevel == GradeLevel.PRE_K) {
            this.dispose();
            this.frame.dispose();
            new AllTutorials().setVisible(true);
        }
        else{


        }
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
        btnMain.setBounds(10, 10, 150, 125);


        ImageButton btnTutorialMain = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_videoTutorial.jpg"), 150, 113);
        btnTutorialMain.setBounds(10, 300, 150, 113);

        btnTutorialMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTutorialsActionPerformed(evt);
            }
        });

        final ImageButton btnHelp = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_helpDesk.png"), 150, 101);
        btnHelp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        btnHelp.setBounds(10, 100, 150, 101);

        final ImageButton btnNext = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_arrow.jpg"), 150, 101);
        btnNext.setBounds(820, 10, 150, 101);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });


        ImageButton btnTests = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_test.png"), 150, 101);
        btnTests.setBounds(10, 700, 150, 101);

        btnTests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestsActionPerformed(evt);
            }
        });


        pnButtons.add(btnMain);
        pnButtons.add(btnHelp);
        pnButtons.add(btnTutorialMain);
        pnButtons.add(btnTests);
        pnButtons.add(btnNext);


        return pnButtons;
    }

    private void btnTestsActionPerformed(ActionEvent evt) {

        GradeLevel gradeLevel = UserInteractionsConfigurator.get_interactive_grade_level_enum();
        if(gradeLevel == GradeLevel.K || gradeLevel == GradeLevel.FIRST ){
            this.dispose();
            this.frame.dispose();
            new FirstGradeTestMain().setVisible(true);
        }
        else{
            this.dispose();
            this.frame.dispose();
            new Test().setVisible(true);
        }

    }

    private void btnMainActionPerformed(ActionEvent evt) {

        AudioListener.runAudioListener("SpeechOn.wav");
        this.dispose();
        this.frame.dispose();
        new MainMenu().setVisible(true);

    }


    private void btnHelpActionPerformed(ActionEvent evt) {
        AudioListener.runAudioListener("SpeechOn.wav");

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





