package com.teamamerica.mathhelper.imagetests;

import com.teamamerica.mathhelper.ui.customcomponents.ImageCheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Christina on 4/10/2015.
 */
public class ImageCheckBoxTest extends JFrame implements ActionListener {


    private final int WINDOW_HEIGHT = 150;
    private final int WINDOW_WIDTH = 200;


    //the buttons for the FlowLayout
    private JPanel mainPanel;
    private ImageCheckBox ckImage;


    public ImageCheckBoxTest() {
        super("Image CheckBox Test");
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
        ckImage = new ImageCheckBox("circle.jpg",500,500);
        ckImage.addActionListener(this);
        mainPanel.add(ckImage);
        add(mainPanel);
        pack();
    }


    public static void main(String[] args) {
        ImageCheckBoxTest frame = new ImageCheckBoxTest();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == ckImage ){
            System.out.println("CHECKED!!!!!!!!!!!!!");
        }

        if(source == ckImage & ckImage.isSelected()){
            System.out.println("SELECTED!!!!!!!!!!!!!");
        }
    }
}
