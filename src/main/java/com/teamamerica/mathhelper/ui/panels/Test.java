package com.teamamerica.mathhelper.ui.panels;

public class Test extends javax.swing.JFrame {

   
    public Test() {
        initComponents();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton5.setBackground(new java.awt.Color(153, 204, 255));
        jButton5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton5.setText("Next ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(480, 10, 110, 40);

        jButton6.setBackground(new java.awt.Color(153, 204, 255));
        jButton6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton6.setText("Welcome Page");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(0, 10, 110, 40);

        jButton7.setBackground(new java.awt.Color(153, 204, 255));
        jButton7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton7.setText("Help");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(480, 330, 110, 40);

        jRadioButton2.setBackground(new java.awt.Color(255, 0, 0));
        jRadioButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jRadioButton2.setText("C.  5");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(340, 200, 120, 40);

        jRadioButton3.setBackground(new java.awt.Color(255, 0, 0));
        jRadioButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jRadioButton3.setText("A.  2");
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(120, 200, 120, 40);

        jRadioButton4.setBackground(new java.awt.Color(255, 0, 0));
        jRadioButton4.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jRadioButton4.setText("D.  7");
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(340, 260, 120, 40);

        jRadioButton1.setBackground(new java.awt.Color(255, 0, 0));
        jRadioButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jRadioButton1.setText("B.  10");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(120, 260, 120, 40);

        jTextField2.setBackground(new java.awt.Color(255, 0, 0));
        jTextField2.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jTextField2.setText("Question #1:    1 + 1 = ?");
        jPanel1.add(jTextField2);
        jTextField2.setBounds(80, 70, 430, 100);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel2.setText("Pre-Test");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(240, 10, 150, 50);

        jTextField1.setBackground(new java.awt.Color(255, 0, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(50, 190, 490, 120);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ian\\Documents\\backround.jpeg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 595, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       Object source = evt.getSource();
       if(source == jButton6){
          new SplashPage1().setVisible(true);
          this.setVisible(false);
       }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Test().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
