/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ian
 */

package com.teamamerica.mathhelper.ui.panels;

import com.teamamerica.mathhelper.configurators.UserInteractionsConfigurator;
import com.teamamerica.mathhelper.controllers.DifficultyLevel;

public class Difficulty extends javax.swing.JFrame {

    /**
     * Creates new form Difficulty
     */
    public Difficulty() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEasy = new javax.swing.JButton();
        btnMedium = new javax.swing.JButton();
        btnHard = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btnTutorials = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(610, 410));

        jPanel1.setPreferredSize(new java.awt.Dimension(436, 308));
        jPanel1.setLayout(null);

        btnEasy.setBackground(new java.awt.Color(102, 255, 102));
        btnEasy.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnEasy.setText("Easy");
        btnEasy.setPreferredSize(new java.awt.Dimension(107, 35));
        btnEasy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEasyActionPerformed(evt);
            }
        });
        jPanel1.add(btnEasy);
        btnEasy.setBounds(30, 150, 112, 86);

        btnMedium.setBackground(new java.awt.Color(255, 255, 0));
        btnMedium.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnMedium.setText("Medium");
        btnMedium.setPreferredSize(new java.awt.Dimension(107, 35));
        btnMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMediumActionPerformed(evt);
            }
        });
        jPanel1.add(btnMedium);
        btnMedium.setBounds(230, 150, 112, 86);

        btnHard.setBackground(new java.awt.Color(255, 0, 51));
        btnHard.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnHard.setText("Hard");
        btnHard.setPreferredSize(new java.awt.Dimension(107, 35));
        btnHard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHardActionPerformed(evt);
            }
        });
        jPanel1.add(btnHard);
        btnHard.setBounds(440, 150, 112, 86);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        jLabel2.setText("Select Difficulty");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 20, 393, 70);

        jButton3.setBackground(new java.awt.Color(153, 204, 255));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton3.setText("Help");
        jPanel1.add(jButton3);
        jButton3.setBounds(440, 320, 112, 43);

        btnTutorials.setBackground(new java.awt.Color(153, 204, 255));
        btnTutorials.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnTutorials.setText("Tutorials");
        btnTutorials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnTutorials);
        btnTutorials.setBounds(30, 320, 112, 43);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ian\\Documents\\backround.jpeg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 595, 374);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       Object source = evt.getSource();
       if(source == btnEasy){

           UserInteractionsConfigurator.set_difficulty_level_enum(DifficultyLevel.EASY);
           System.out.println(UserInteractionsConfigurator.get_difficulty_level_str());
           new Test().setVisible(true);
          this.dispose();
       }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       Object source = evt.getSource();
       if(source == btnMedium){
           UserInteractionsConfigurator.set_difficulty_level_enum(DifficultyLevel.MEDIUM);
           System.out.println(UserInteractionsConfigurator.get_difficulty_level_str());
           new Test().setVisible(true);
           this.dispose();
       }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnHardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       Object source = evt.getSource();
       if(source == btnHard){
           UserInteractionsConfigurator.set_difficulty_level_enum(DifficultyLevel.HARD);
           System.out.println(UserInteractionsConfigurator.get_difficulty_level_str());
           new CategoriesMain().setVisible(true);
          this.dispose();
       }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Object source = evt.getSource();
       if(source == btnTutorials){
          new CategoriesMain().setVisible(true);
          this.dispose();
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Difficulty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Difficulty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Difficulty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Difficulty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Difficulty().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTutorials;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton btnEasy;
    private javax.swing.JButton btnMedium;
    private javax.swing.JButton btnHard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
