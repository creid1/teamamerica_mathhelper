package com.teamamerica.mathhelper.ui.panels;

import com.teamamerica.mathhelper.configurators.UserInteractionsConfigurator;
import com.teamamerica.mathhelper.controllers.GradeLevel;

public class SelectGrade extends javax.swing.JFrame {

    public SelectGrade() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn2 = new javax.swing.JButton();
        btnnPreK = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnK = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        btn2.setBackground(new java.awt.Color(102, 255, 102));
        btn2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btn2.setText("2nd");
        btn2.setPreferredSize(new java.awt.Dimension(107, 35));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2);
        btn2.setBounds(40, 220, 112, 86);

        btnnPreK.setBackground(new java.awt.Color(102, 255, 102));
        btnnPreK.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnnPreK.setText("Pre-K");
        btnnPreK.setPreferredSize(new java.awt.Dimension(107, 35));
        btnnPreK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreKActionPerformed(evt);
            }
        });
        jPanel1.add(btnnPreK);
        btnnPreK.setBounds(40, 100, 112, 86);

        btn1.setBackground(new java.awt.Color(255, 0, 0));
        btn1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btn1.setText("1st");
        btn1.setPreferredSize(new java.awt.Dimension(107, 35));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1);
        btn1.setBounds(440, 100, 112, 86);

        btn4.setBackground(new java.awt.Color(255, 0, 0));
        btn4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btn4.setText("4th");
        btn4.setPreferredSize(new java.awt.Dimension(107, 35));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4);
        btn4.setBounds(440, 220, 112, 86);

        btnK.setBackground(new java.awt.Color(255, 255, 0));
        btnK.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnK.setText("Kindergarten");
        btnK.setPreferredSize(new java.awt.Dimension(107, 35));
        btnK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKActionPerformed(evt);
            }
        });
        jPanel1.add(btnK);
        btnK.setBounds(240, 100, 112, 86);

        btn3.setBackground(new java.awt.Color(255, 255, 0));
        btn3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btn3.setText("3rd");
        btn3.setPreferredSize(new java.awt.Dimension(107, 35));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3);
        btn3.setBounds(240, 220, 112, 86);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel2.setText("Select Your Grade");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 10, 340, 60);

        jButton2.setBackground(new java.awt.Color(153, 204, 255));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton2.setText("Welcome Page");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(40, 330, 110, 40);

        jButton3.setBackground(new java.awt.Color(153, 204, 255));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton3.setText("Help");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(440, 330, 110, 40);

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
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Object source = evt.getSource();
        if (source == btn2) {
            UserInteractionsConfigurator.set_interactive_grade_level_str("2");
            new MainMenu().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnPreKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Object source = evt.getSource();
        if (source == btnnPreK) {
            UserInteractionsConfigurator.set_interactive_grade_level_enum(GradeLevel.PRE_K);
            new MainMenu().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Object source = evt.getSource();
        if (source == btn1) {
            UserInteractionsConfigurator.set_interactive_grade_level_str("1");

            new MainMenu().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Object source = evt.getSource();
        if (source == btn4) {
            UserInteractionsConfigurator.set_interactive_grade_level_str("4");

            new MainMenu().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Object source = evt.getSource();
        if (source == btnK) {
            UserInteractionsConfigurator.set_interactive_grade_level_str("K");
            System.out.println(UserInteractionsConfigurator.get_interactive_grade_level_enum());

            new MainMenu().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Object source = evt.getSource();
        if (source == btn3) {
            UserInteractionsConfigurator.set_interactive_grade_level_str("3");
            System.out.println(UserInteractionsConfigurator.get_interactive_grade_level_enum());
            new MainMenu().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Object source = evt.getSource();
        if (source == jButton2) {
            new SplashPage1().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SelectGrade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn3;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btnnPreK;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btnK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
