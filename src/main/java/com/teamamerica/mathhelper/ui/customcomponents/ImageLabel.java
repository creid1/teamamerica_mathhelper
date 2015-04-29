/**
 * Name: Christina Reid
 * Date Produced: April 29,2015
 * Purpose: The purpose of this software is to help children learn math.
 */
package com.teamamerica.mathhelper.ui.customcomponents;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by Christina on 4/10/2015.
 */

/**
 * This class overrides the design component of a JLabel in order to display both images and text as the label
 */
public class ImageLabel extends JLabel {

    /**
     * The width of the button
     */
    private int width;
    /**
     * The height of the button.
     */
    private int height;

    public ImageLabel(int width, int height) {
        this.width = width;
        this.height = height;
    }


    /**
     * The constructor
     *
     * @param hasImage
     * @param fileName
     * @param width
     * @param height
     */
    public ImageLabel(boolean hasImage, String fileName, int width, int height) {
        this.width = width;
        this.height = height;
        changeLabelImage(hasImage, fileName);

    }


    /**
     * This method changes the label images based on whether the fileName is an image or String text
     *
     * @param hasImage
     * @param fileName
     */
    public void changeLabelImage(boolean hasImage, String fileName) {
        this.setEnabled(true);
        if (hasImage) {
            createLabelImage(fileName);
        } else {
            createLabelText(fileName);
        }


    }

    /**
     * This method creates the label text based on the filename
     * @param fileName
     */
    private void createLabelText(String fileName) {
        this.setPreferredSize(new Dimension(1000, 60));
        this.setIcon(null);
        this.setText(fileName);
        this.setFont(new Font("DejaVu Serif", 0, 26));
        this.setBackground(Color.WHITE);

    }

    /**
     * Creates the button according to the fields set by the constructor.
     */
    private void createLabelImage(String fileName) {
        this.setText(null);
        this.setIcon(getImageIcon(fileName));
        this.setPreferredSize(new Dimension(width, height));
        this.setMaximumSize(new Dimension(width, height));
        this.setOpaque(false);
        this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }

    /**
     * This method returns the image icon based on the filename
     * @param fileName
     * @return ImageIcon
     */
    public ImageIcon getImageIcon(String fileName) {
        URL imageUrl = ImageLabel.class.getClassLoader().getResource(fileName);
        return new ImageIcon(imageUrl);
    }

}
