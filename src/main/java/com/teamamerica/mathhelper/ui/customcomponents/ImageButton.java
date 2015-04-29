/**
 * Name: Christina Reid
 * Date Produced: April 29,2015
 * Purpose: The purpose of this software is to help children learn math.
 */
package com.teamamerica.mathhelper.ui.customcomponents;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.net.URL;

/**
 * Created by Christina on 4/10/2015.
 */

/**
 * This class overrides the design component of a JButton in order to display both images and text as the button
 */
public class ImageButton extends JButton {

    /**
     * The width of the button
     */
    private int width;
    /**
     * The height of the button.
     */
    private int height;


    /**
     * The constructor
     * @param hasImage
     * @param fileName
     * @param width
     * @param height
     */
    public ImageButton(boolean hasImage, String fileName, int width, int height) {
        this.width = width;
        this.height = height;
        changeButtonImage(hasImage, fileName);

    }

    /**
     * This method changes the button images based on whether the fileName is an image or String text
     * @param hasImage
     * @param fileName
     */
    public void changeButtonImage(boolean hasImage, String fileName) {
        this.setEnabled(true);
        if (hasImage) {
            createButtonImage(fileName);
        } else {
            createButtonText(fileName);
        }


    }

    /**
     * This method creates the button text based on the filename
     * @param fileName
     */
    private void createButtonText(String fileName) {

        this.setIcon(null);
        this.setText(fileName);
        this.setFont(new Font("DejaVu Serif", 0, 20));
        this.setBackground(Color.WHITE);
        this.setPreferredSize(new Dimension(width, height));
        this.setMaximumSize(new Dimension(width, height));
        this.setFocusPainted(false);
        this.setRolloverEnabled(false);
        this.setOpaque(false);
        this.setContentAreaFilled(false);
        this.setBorderPainted(true);

        this.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.BLUE.darker(), Color.BLACK),
                BorderFactory.createEtchedBorder(EtchedBorder.LOWERED)));
    }


    /**
     * Creates the button according to the fields set by the constructor.
     */
    private void createButtonImage(String fileName) {
        this.setText(null);
        this.setIcon(getImageIcon(fileName));
        this.setPreferredSize(new Dimension(width, height));
        this.setMaximumSize(new Dimension(width, height));
        this.setFocusPainted(false);
        this.setRolloverEnabled(false);
        this.setOpaque(false);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);
        this.setBackground(null);
        this.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.BLUE.darker(), Color.BLACK),
                BorderFactory.createEtchedBorder(EtchedBorder.LOWERED)));

    }

    /**
     * This method creates the wrong answer buttons displayed in the practice and test pages
     */
    public void createWrongAnswerButton() {

        this.setBackground(Color.RED);
        this.setPreferredSize(new Dimension(width, height));
        this.setMaximumSize(new Dimension(width, height));
        this.setFocusPainted(false);
        this.setRolloverEnabled(false);
        this.setOpaque(false);
        this.setContentAreaFilled(false);
        this.setBorderPainted(true);
        this.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.BLACK, Color.BLACK),
                BorderFactory.createEtchedBorder(EtchedBorder.RAISED)));


        this.setEnabled(false);


    }


    /**
     * This method creates the right answer button displayed in the practice and test pages
     */
    public void createRightAnswerButton() {

        this.setBackground(Color.GREEN);
        this.setPreferredSize(new Dimension(width, height));
        this.setMaximumSize(new Dimension(width, height));
        this.setFocusPainted(false);
        this.setRolloverEnabled(false);
        this.setOpaque(false);
        this.setContentAreaFilled(false);
        this.setBorderPainted(true);

        this.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.BLACK.darker(), Color.BLACK),
                BorderFactory.createEtchedBorder(EtchedBorder.LOWERED)));
        this.setEnabled(false);

    }

    /**
     * This method returns the image icon based on the filename
     * @param fileName
     * @return ImageIcon
     */
    public ImageIcon getImageIcon(String fileName) {
        System.out.println(fileName);
        URL imageUrl = ImageButton.class.getClassLoader().getResource(fileName);
        System.out.println("IMAGE URL:" + imageUrl);
        return new ImageIcon(imageUrl);
    }
}

