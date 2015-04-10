package com.teamamerica.mathhelper;

import com.teamamerica.mathhelper.customcomponents.ImageCheckBox;
import com.teamamerica.mathhelper.customcomponents.ImageRadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Christina on 4/10/2015.
 */
public class ImageRadioButtonTest extends JFrame implements ActionListener {


    private final int WINDOW_HEIGHT = 150;
    private final int WINDOW_WIDTH = 200;


    //the buttons for the FlowLayout
    private JPanel mainPanel;
    private ImageRadioButton rbImage;


    public ImageRadioButtonTest() {
        super("Image RadioButton Test");
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
        rbImage = new ImageRadioButton("circle.jpg", 500, 500);
        rbImage.addActionListener(this);
        mainPanel.add(rbImage);
        add(mainPanel);
        pack();
    }


    public static void main(String[] args) {
        ImageRadioButtonTest frame = new ImageRadioButtonTest();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == rbImage) {
            System.out.println("CHECKED!!!!!!!!!!!!!");
        }

        if (source == rbImage & rbImage.isSelected()) {
            System.out.println("SELECTED!!!!!!!!!!!!!");
        }
    }
}