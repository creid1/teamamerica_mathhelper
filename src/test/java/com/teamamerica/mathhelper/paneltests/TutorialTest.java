package com.teamamerica.mathhelper.paneltests;


import com.teamamerica.mathhelper.ui.customcomponents.YouTubeFrame;
import com.teamamerica.mathhelper.ui.panels.AllTutorials;

import javax.swing.*;


/**
 * Created by Christina on 4/13/2015.
 */
public class TutorialTest extends JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton jButton3;
    private JButton btnNext;
    private JButton jButton5;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JTextField txtTutorial;

    // End of variables declaration//GEN-END:variables

    public TutorialTest() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {


        jPanel1 = new JPanel();
        btnNext = new JButton();
        jButton5 = new JButton();
        jButton3 = new JButton();
        jLabel3 = new JLabel();
        jLabel2 = new JLabel();
        txtTutorial = new JTextField();
        jLabel1 = new JLabel();


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(610, 410));

        jPanel1.setLayout(null);

        btnNext.setBackground(new java.awt.Color(153, 204, 255));
        btnNext.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnNext.setText("Next Page");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel1.add(btnNext);
        btnNext.setBounds(470, 10, 110, 40);

        jButton5.setBackground(new java.awt.Color(153, 204, 255));
        jButton5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton5.setText("Help");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(480, 330, 110, 40);

        jButton3.setBackground(new java.awt.Color(153, 204, 255));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton3.setText("Tutorials");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(10, 10, 110, 40);

        jLabel3.setIcon(new ImageIcon("C:\\Users\\Ian\\Documents\\FirstGradeAdd1.png")); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 70, 300, 240);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel2.setText("Addition Tutorial");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, -10, 290, 80);

        txtTutorial.setBackground(new java.awt.Color(255, 0, 0));
        txtTutorial.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtTutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtTutorial);
        txtTutorial.setBounds(80, 60, 440, 260);

        jLabel1.setBackground(new java.awt.Color(255, 0, 51));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setIcon(new ImageIcon("C:\\Users\\Ian\\Documents\\backround.jpeg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 595, 374);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
        );


        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Object source = evt.getSource();
        if (source == jButton3) {
            new AllTutorials().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);

        System.out.println("NEXT BUTTON" +
                "+ CLICKED!!!!");
        new YouTubeFrame("https://www.youtube.com/v/AQ7THUKx6Es?fs=1").setVisible(true);
       // new YouTubeFrame("https://www.youtube.com/v/b-Cr0EWwaTk?fs=1").setVisible(true);





        //   new YouTubeFrame("https://www.youtube.com/v/b-Cr0EWwaTk?fs=1").setVisible(true);


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TutorialTest().setVisible(true);
            }
        });
    }
}
