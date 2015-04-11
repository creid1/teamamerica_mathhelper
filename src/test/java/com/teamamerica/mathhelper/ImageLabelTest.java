package com.teamamerica.mathhelper;

import com.teamamerica.mathhelper.ui.customcomponents.ImageLabel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Christina on 4/10/2015.
 */
public class ImageLabelTest extends JFrame{


    private final int WINDOW_HEIGHT = 150;
    private final int WINDOW_WIDTH = 200;


    //the buttons for the FlowLayout
    private JPanel mainPanel;
    private ImageLabel lblMessage;


    public ImageLabelTest() {
        super("Image Label Test");
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
        lblMessage = new ImageLabel("circle.jpg",500,500);
        mainPanel.add(lblMessage);
        add(mainPanel);
        pack();
    }


    public static void main(String[] args) {
        ImageLabelTest frame = new ImageLabelTest();
        frame.setVisible(true);
    }
}
