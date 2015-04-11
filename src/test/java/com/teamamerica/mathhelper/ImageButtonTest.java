package com.teamamerica.mathhelper;

import com.teamamerica.mathhelper.ui.customcomponents.ImageButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Christina on 4/10/2015.
 */
public class ImageButtonTest extends JFrame implements ActionListener {


    private final int WINDOW_HEIGHT = 150;
    private final int WINDOW_WIDTH = 200;


    //the buttons for the FlowLayout
    private JPanel mainPanel;
    private ImageButton btnImage;
    private JButton btnRegular;
    private JLabel lblMessage;


    public ImageButtonTest() {
        super("Image Button Test");
        //   setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        //disables the ability for a user to resize the window
        // setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //center the frame based on the screen's dimensions
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        setLocation((d.width - WINDOW_WIDTH) / 2, (d.height - WINDOW_HEIGHT) / 2);

        //instantiate the panel and all to the frame
        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        btnImage = new ImageButton("circle.jpg",500,500);
       // btnImage.setIcon(new javax.swing.ImageIcon(getClass().getResource(ConfigDirectory.getCircleImageFileFromDirectory("circle.jpg"))));
       // btnImage.setIcon(new javax.swing.ImageIcon(ConfigDirectory.getImageFileFromDirectory("circle.jpg")));
        btnImage.setBorderPainted(true);
        btnImage.setFocusPainted(false);
        btnImage.setContentAreaFilled(false);

        btnImage.addActionListener(this);

        btnRegular = new JButton("Regular");
        btnRegular.addActionListener(this);
        lblMessage = new JLabel("");
        mainPanel.add(lblMessage);
        mainPanel.add(btnImage);
        mainPanel.add(btnRegular);

        add(mainPanel);
        pack();
    }


    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();
        if (source == btnImage) {
            lblMessage.setText("You clicked Image Button");

        }
        if(source == btnRegular){
            lblMessage.setText("You clicked Regular Button");
        }
    }


    public static void main(String[] args) {
        ImageButtonTest frame = new ImageButtonTest();
        frame.setVisible(true);
    }
}
