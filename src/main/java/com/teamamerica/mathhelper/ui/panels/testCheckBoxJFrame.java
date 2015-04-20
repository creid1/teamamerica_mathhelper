package com.teamamerica.mathhelper.ui.panels;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Christina on 4/20/2015.
 */
public class testCheckBoxJFrame extends JFrame{

    public testCheckBoxJFrame(){

        final JPanel jPanel = new JPanel();

        this.setTitle("java-buddy.blogspot.com");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton buttonExit = new JButton(" Exit ");
        buttonExit.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        final JRadioButton jRadioButtonA = new JRadioButton("JRadioButton A");
        final JRadioButton jRadioButtonB = new JRadioButton("JRadioButton B");
        final JRadioButton jRadioButtonC = new JRadioButton("JRadioButton C");

        JButton buttonReadRadio = new JButton(" Read Radio Buttons ");
        buttonReadRadio.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
                String radioSetting = "";

                if (jRadioButtonA.isSelected()){
                    radioSetting += "jRadioButtonA is selected.\n";
                }
                if (jRadioButtonB.isSelected()){
                    radioSetting += "jRadioButtonB is selected.\n";
                }
                if (jRadioButtonC.isSelected()){
                    radioSetting += "jRadioButtonC is selected.\n";
                }

                JOptionPane.showMessageDialog(null,radioSetting);
            }
        });

        ButtonGroup buttonGroup  = new ButtonGroup();
        buttonGroup.add(jRadioButtonA);
        buttonGroup.add(jRadioButtonB);
        buttonGroup.add(jRadioButtonC);

        jPanel.add(jRadioButtonA);
        jPanel.add(jRadioButtonB);
        jPanel.add(jRadioButtonC);
        jPanel.add(buttonReadRadio);
        jPanel.add(buttonExit);

        this.add(jPanel);

    }

    public static void main(String[] args){
        new testCheckBoxJFrame().setVisible(true);
    }
}