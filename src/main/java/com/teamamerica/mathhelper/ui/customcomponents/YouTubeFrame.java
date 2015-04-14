package com.teamamerica.mathhelper.ui.customcomponents;

import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JFlashPlayer;
import com.teamamerica.mathhelper.configurators.TutorialsPageConfigurator;
import com.teamamerica.mathhelper.ui.panels.FirstGradeTutorials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by Christina on 4/14/2015.
 */
public class YouTubeFrame extends JFrame {

    private JFrame frame;
    private JPanel webBrowserPanel;
    private JFlashPlayer flashPlayer;
    private String url;

    public YouTubeFrame(String url) {

        this.url = url;
        NativeInterface.open();

        createFrame();

    }


    public void createFrame() {
        frame = new JFrame("MathHelper YouTube Tutorial Viewer");
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);


        getJFlashPlayer(url);
        frame.getContentPane().add(webBrowserPanel, BorderLayout.CENTER);

        frame.setSize(new Dimension(800, 600));

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
        this.frame.dispose();
        new FirstGradeTutorials().setVisible(true);


    }

    private JPanel createHeaderPanel() {
        JPanel pnButtons = new JPanel();
        pnButtons.setBackground(Color.BLACK);
        pnButtons.setLayout(new GridLayout(1, 2));

        JButton btnTutorialMain = new JButton("Tutorials");
        btnTutorialMain.setFont(new java.awt.Font("Comic Sans MS", 0, 34)); // NOI18N
        btnTutorialMain.setBounds(10, 10, 100, 40);
        btnTutorialMain.setBackground(new java.awt.Color(153, 204, 255));

        btnTutorialMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTutorialsActionPerformed(evt);
            }
        });

        final JButton btnNext = new JButton("Next Page");
        btnNext.setFont(new java.awt.Font("Comic Sans MS", 0, 34)); // NOI18N
        btnNext.setBounds(470, 10, 100, 40);
        btnNext.setBackground(new java.awt.Color(153, 204, 255));

        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });


        JLabel lblTutorial = new JLabel("   ");
        lblTutorial.setFont(new java.awt.Font("Comic Sans MS", 0, 32)); // NOI18N
        lblTutorial.setBounds(160, -10, 290, 80);

        pnButtons.add(btnTutorialMain);
        pnButtons.add(lblTutorial);
        pnButtons.add(btnNext);


        return pnButtons;
    }

    private void getJFlashPlayer(final String url){

        webBrowserPanel = new JPanel(new BorderLayout());

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





