package com.teamamerica.mathhelper.ui.customcomponents;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by Christina on 4/10/2015.
 */
public class ImageLabel extends JLabel {


    /** Filename of the image to be used as the button's icon. */
    private String fileName;
    /** The width of the button */
    private int width;
    /** The height of the button. */
    private int height;

    public ImageLabel(boolean hasImage,String fileName, int width, int height){
        this.fileName = fileName;
        this.width = width;
        this.height = height;
        changeLabelImage(hasImage, fileName);

    }

    public void changeLabelImage(boolean hasImage, String fileName) {
        this.setEnabled(true);
        if (hasImage) {
            createLabelImage(fileName);
        } else {
            createLabelText(fileName);
        }


    }


    private void createLabelText(String fileName) {
        this.setIcon(null);
        this.setText(fileName);

    }

    /**
     * Creates the button according to the fields set by the constructor.
     */
    private void createLabelImage(String fileName){
        this.setText(null);
        this.setIcon(getImageIcon(fileName));
        this.setPreferredSize(new Dimension(width, height));
        this.setMaximumSize(new Dimension(width, height));
        this.setOpaque(false);
        this.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
    }

    public ImageIcon getImageIcon(String fileName) {
        URL imageUrl = ImageButton.class.getClassLoader().getResource(fileName);
        return new ImageIcon(imageUrl);
    }

}
