package com.teamamerica.mathhelper.fauxLogin;

import com.teamamerica.mathhelper.db.MathHelperDBClient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Christina on 4/11/2015.
 */
public class FauxLoginPanel extends JPanel {

    private MathHelperDBClient mathHelperDBClient = null;

    public JButton loginButton, registerButton;
    public JTextField usernameField;
    public JPasswordField passwordField;

    public FauxLoginPanel() {
        this.mathHelperDBClient = new MathHelperDBClient();

        setLayout(new BorderLayout());

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
        JPanel entryPanel = new JPanel();
        entryPanel.setLayout(new GridLayout(2, 2));
        entryPanel.setBorder(BorderFactory.createTitledBorder("Please enter your username and password to login."));
        entryPanel.add(new JLabel("Username: "));
        usernameField = new JTextField(24);
        entryPanel.add(usernameField);
        entryPanel.add(new JLabel("Password: "));
        passwordField = new JPasswordField(24);
        entryPanel.add(passwordField);
        centerPanel.add(entryPanel, BorderLayout.CENTER);
        loginButton = new JButton("Login");

        centerPanel.add(loginButton, BorderLayout.SOUTH);
        add(centerPanel, BorderLayout.CENTER);

        JPanel registerPanel = new JPanel();
        registerPanel.setLayout(new GridLayout(2, 1));
        registerPanel.add(new JLabel("Don't have a user account?"));
        registerButton = new JButton("Register a new user");
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mainFrame.registerNewUser();
            }
        });
        registerPanel.add(registerButton);
        add(registerPanel, BorderLayout.SOUTH);
    }
}


