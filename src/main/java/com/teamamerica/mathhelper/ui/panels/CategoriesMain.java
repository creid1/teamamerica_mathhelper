package com.teamamerica.mathhelper.ui.panels;

import com.teamamerica.mathhelper.configurators.TutorialsPageConfigurator;
import com.teamamerica.mathhelper.configurators.UserInteractionsConfigurator;
import com.teamamerica.mathhelper.controllers.CategoryType;
import com.teamamerica.mathhelper.controllers.MainMenuSelection;
import com.teamamerica.mathhelper.environment.ConfigDirectory;
import com.teamamerica.mathhelper.ui.customcomponents.AudioListener;
import com.teamamerica.mathhelper.ui.customcomponents.ImageButton;
import com.teamamerica.mathhelper.ui.customcomponents.YouTubeFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CategoriesMain extends JFrame {


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ImageButton btnMain;
    private ImageButton btnMoney;
    private ImageButton btnAddition;
    private ImageButton btnSubtraction;
    private ImageButton btnTime;
    private ImageButton btnMeasure;
    private ImageButton btnShapes;


    private JLabel lblCategoriesMain;
    private JLabel lblSelectCategory;
    private JPanel jPanel1;

    private ImageButton btnHints;
    private ImageButton btnHelp;
    private ImageButton btnSchoolsOut;
    // End of variables declaration//GEN-END:variables

    public CategoriesMain() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setBackground(Color.WHITE);
        setLocationByPlatform(true);
        setLocation(0,0);

        jPanel1 = new JPanel();
        btnMoney = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_money.jpg"), 138, 196);
        btnAddition = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_additionFace2.jpg"), 167, 179);
        btnSubtraction = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_subtraction1.jpg"), 228, 148);
        btnTime = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_clock.jpg"), 159, 183);
        btnMeasure = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_measure.jpg"), 110, 216);
        btnShapes = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_shapes2.png"), 200, 200);


        btnMain = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_home.png"), 150, 125);
        btnSchoolsOut = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_kidsSchoolBus.gif"), 300, 101);
        btnHelp = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_help.gif"), 150, 101);
        btnHints = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_helpDesk.png"), 150, 101);

        lblSelectCategory = new JLabel();
        lblCategoriesMain = new JLabel();


        jPanel1.setPreferredSize(new java.awt.Dimension(436, 308));
        jPanel1.setLayout(null);
        jPanel1.setBackground(Color.WHITE);

        btnHelp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        jPanel1.add(btnHelp);
        btnHelp.setBounds(30, 575, 150, 101);

        btnHints.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnHintsActionPerformed(evt);
            }
        });
        jPanel1.add(btnHints);
        btnHints.setBounds(850, 575, 150, 101);


        btnSchoolsOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSchoolsOutActionPerformed(evt);
            }
        });
        jPanel1.add(btnSchoolsOut);
        btnSchoolsOut.setBounds(750, 20, 300, 101);

        btnMain.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMainActionPerformed(evt);
            }
        });
        jPanel1.add(btnMain);
        btnMain.setBounds(3, 10, 150, 125);


        btnAddition.setBounds(150, 170, 167, 179);
        btnSubtraction.setBounds(100, 420, 228, 148);

        btnTime.setBounds(420, 175, 159, 183);
        btnMoney.setBounds(425, 400, 138, 196);

        btnMeasure.setBounds(700, 130, 110, 216);
        btnShapes.setBounds(655, 400, 200, 200);

        btnMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoneyActionPerformed(evt);
            }
        });
        jPanel1.add(btnMoney);

        btnAddition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdditionActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddition);
        btnSubtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtraction(evt);
            }
        });
        jPanel1.add(btnSubtraction);
        btnTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimeActionPerformed(evt);
            }
        });
        jPanel1.add(btnTime);
        btnMeasure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeasureActionPerformed(evt);
            }
        });
        jPanel1.add(btnMeasure);

        btnShapes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShapesActionPerformed(evt);
            }
        });
        jPanel1.add(btnShapes);


        lblSelectCategory.setFont(new java.awt.Font("Comic Sans MS", 1, 26)); // NOI18N
        lblSelectCategory.setForeground(new java.awt.Color(51, 255, 51));
        lblSelectCategory.setText("Select a Category");
        jPanel1.add(lblSelectCategory);
        lblSelectCategory.setBounds(375, 100, 1000, 90);

        lblCategoriesMain.setFont(new java.awt.Font("Comic Sans MS", 0, 58)); // NOI18N
        lblCategoriesMain.setText("Math Helper Categories");
        jPanel1.add(lblCategoriesMain);
        lblCategoriesMain.setBounds(140, 20, 1000, 90);


        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 696, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnHintsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        AudioListener.runAudioListener("SpeechOn.wav");
        new HelpDeskHints().setVisible(true);

    }//GEN-LAST:event_jButton7ActionPerformed


    private void btnMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        AudioListener.runAudioListener("SpeechOn.wav");

        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnSchoolsOutActionPerformed(ActionEvent evt) {

        if (evt.getSource() == btnSchoolsOut) {
            UserInteractionsConfigurator.set_difficulty_level_enum(null);
            UserInteractionsConfigurator.set_category_type_enum(null);
            UserInteractionsConfigurator.set_interactive_grade(null);
            UserInteractionsConfigurator.set_main_menu_selection_enum(null);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(null);
            UserInteractionsConfigurator.set_interactive_user(null);
            this.dispose();
            new LogIn().setVisible(true);

        }
    }


    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AudioListener.runAudioListener("SpeechOn.wav");

    }//GEN-LAST:event_jButton3ActionPerformed

    private void checkForMenuSelectionType() {
        if (UserInteractionsConfigurator.getMain_menu_selection_enum().equals(MainMenuSelection.TESTS)) {
            new Difficulty().setVisible(true);
            this.dispose();
        }
        if (UserInteractionsConfigurator.getMain_menu_selection_enum().equals(MainMenuSelection.PRACTICE)) {
            new PracticeTest().setVisible(true);
            this.dispose();
        }
        if (UserInteractionsConfigurator.getMain_menu_selection_enum().equals(MainMenuSelection.TUTORIALS)) {
            TutorialsPageConfigurator.loadTutorialsList();
            //  this.dispose();
            this.dispose();
            new YouTubeFrame(TutorialsPageConfigurator.getTutorial().getTutorial()).setVisible(true);
        }
    }

    private void btnMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (evt.getSource() == btnMoney) {
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.MONEY);
            System.out.println(UserInteractionsConfigurator.get_category_type_str());
            checkForMenuSelectionType();

        }//GEN-LAST:event_jButton5ActionPerformed
    }


    private void btnAdditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (evt.getSource() == btnAddition) {
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.ADDITION);
            System.out.println(UserInteractionsConfigurator.get_category_type_str());
            checkForMenuSelectionType();

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnSubtraction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (evt.getSource() == btnSubtraction) {
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.SUBTRACTION);
            System.out.println(UserInteractionsConfigurator.get_category_type_str());
            checkForMenuSelectionType();

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (evt.getSource() == btnTime) {
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.TIME);
            System.out.println(UserInteractionsConfigurator.get_category_type_str());
            checkForMenuSelectionType();

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnMeasureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (evt.getSource() == btnMeasure) {
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.MEASURE);
            System.out.println(UserInteractionsConfigurator.get_category_type_str());
            checkForMenuSelectionType();

        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnShapesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Object source = evt.getSource();
        if (evt.getSource() == btnShapes) {
            UserInteractionsConfigurator.set_category_type_enum(CategoryType.SHAPES);
            System.out.println(UserInteractionsConfigurator.get_category_type_str());
            checkForMenuSelectionType();
        }
    }//GEN-LAST:event_jButton9ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CategoriesMain().setVisible(true);
            }
        });
    }


}
