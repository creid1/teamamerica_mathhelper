package com.teamamerica.mathhelper.fauxLogin;

import com.teamamerica.mathhelper.configurators.UserInteractionsConfigurator;
import com.teamamerica.mathhelper.db.MathHelperDBClient;
import com.teamamerica.mathhelper.ui.panels.SplashPage1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Christina on 4/11/2015.
 */
public class FauxLoginFrame extends JFrame {

    private MathHelperDBClient mathHelperDBClient = null;

    private FauxLoginPanel fauxLoginPanel;
    private final int WINDOW_WIDTH = 800;
    private final int WINDOW_HEIGHT = 500;


    public FauxLoginFrame() {
        super("FauxLoginFrame");

        this.mathHelperDBClient = new MathHelperDBClient();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setVisible(true);
        setResizable(false);


        //center the frame based on the screen's dimensions
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        setLocation((d.width - WINDOW_WIDTH) / 2, (d.height - WINDOW_HEIGHT) / 2);

        //instantiate the panel and all to the frame
        fauxLoginPanel = new FauxLoginPanel();
        fauxLoginPanel.loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = fauxLoginPanel.usernameField.getText();
                String password = new String(fauxLoginPanel.passwordField.getPassword());
                if (mathHelperDBClient.validate_user_login(username, password)) {
                    UserInteractionsConfigurator.set_interactive_user(mathHelperDBClient.searchUsers_username(username));
                    System.out.println("User logged in!");
                    System.out.println(UserInteractionsConfigurator.get_interactive_user().getUsername());
                    new SplashPage1().setVisible(true);
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Please check your username and password.", "Login Error", JOptionPane.ERROR_MESSAGE);
                    fauxLoginPanel.usernameField.setText("");
                    fauxLoginPanel.passwordField.setText("");
                }
            }
        });
        this.add(fauxLoginPanel);

    }


    public static void main(String[] args) {
        FauxLoginFrame frame = new FauxLoginFrame();
        frame.setVisible(true);
    }


}


