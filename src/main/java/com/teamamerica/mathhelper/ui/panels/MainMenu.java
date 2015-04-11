package com.teamamerica.mathhelper.ui.panels;

import com.teamamerica.mathhelper.configurators.UserInteractionsConfigurator;
import com.teamamerica.mathhelper.controllers.MainMenuSelection;

public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
      initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnTests = new javax.swing.JButton();
        btnTutorials = new javax.swing.JButton();
        btnScores = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(610, 410));

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("Learn a new subject!");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 130, 180, 26);

        jLabel4.setBackground(new java.awt.Color(0, 255, 0));
        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 0));
        jLabel4.setText("Test your knowledge!");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, 130, 190, 26);

        jLabel5.setBackground(new java.awt.Color(0, 255, 0));
        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 0));
        jLabel5.setText("Check your progress!");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(420, 130, 180, 26);

        btnLogout.setBackground(new java.awt.Color(153, 204, 255));
        btnLogout.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout);
        btnLogout.setBounds(450, 10, 110, 40);

        btnHelp.setBackground(new java.awt.Color(153, 204, 255));
        btnHelp.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnHelp.setText("Help");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        jPanel1.add(btnHelp);
        btnHelp.setBounds(460, 320, 110, 40);

        btnTests.setBackground(new java.awt.Color(255, 255, 0));
        btnTests.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnTests.setText("Tests");
        btnTests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestsActionPerformed(evt);
            }
        });
        jPanel1.add(btnTests);
        btnTests.setBounds(240, 160, 110, 86);

        btnTutorials.setBackground(new java.awt.Color(102, 255, 102));
        btnTutorials.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnTutorials.setText("Tutorials");
        btnTutorials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTutorialsActionPerformed(evt);
            }
        });
        jPanel1.add(btnTutorials);
        btnTutorials.setBounds(40, 160, 107, 86);

        btnScores.setBackground(new java.awt.Color(255, 0, 0));
        btnScores.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnScores.setText("Scores");
        btnScores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScoresActionPerformed(evt);
            }
        });
        jPanel1.add(btnScores);
        btnScores.setBounds(450, 160, 110, 86);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        jLabel2.setText("Main Menu");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 10, 237, 81);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("backround.jpg")); // NOI18N
       	//jLabel1.setText("Learn a new subject!");
       	jLabel1.setToolTipText("Check your progress!");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 769, 374);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnScoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.SCORES);

   }//GEN-LAST:event_jButton2ActionPerformed

    private void btnTutorialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Object source = evt.getSource();
       if(source == btnTutorials){
           UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TUTORIALS);
          new FirstGradeTutorials().setVisible(true);
          this.setVisible(false);
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnTestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       Object source = evt.getSource();
       if(source == btnTests){
           UserInteractionsConfigurator.set_main_menu_selection_enum(MainMenuSelection.TESTS);
           System.out.println(UserInteractionsConfigurator.get_main_menu_selection_str());
          new FirstGradeTestMain().setVisible(true);
          this.setVisible(false);
       }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnScores;
    private javax.swing.JButton btnTutorials;
    private javax.swing.JButton btnTests;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
