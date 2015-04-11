package com.teamamerica.mathhelper.ui.customcomponents;

import com.teamamerica.mathhelper.configurations.ConfigDirectory;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Christina on 4/10/2015.
 */
public class ImageCheckBox extends JCheckBox {

    /**
     * Filename of the image to be used as the button's icon.
     */
    private String fileName;
    /**
     * The width of the button
     */
    private int width;
    /**
     * The height of the button.
     */
    private int height;

    public ImageCheckBox(String fileName, int width, int height) {
        this.fileName = fileName;
        this.width = width;
        this.height = height;
        createButton();
    }

    /**
     * Creates the button according to the fields set by the constructor.
     */
    private void createButton() {
        this.setIcon(getImageIcon(fileName));
        this.setPreferredSize(new Dimension(width, height));
        this.setMaximumSize(new Dimension(width, height));
        this.setFocusPainted(false);
        this.setRolloverEnabled(false);
        this.setOpaque(false);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);
        this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }

    public ImageIcon getImageIcon(String fileName) {
        return new ImageIcon(ConfigDirectory.getCircleImageFileFromDirectory(fileName));
    }
}