package com.teamamerica.mathhelper.ui.panels;


import com.teamamerica.mathhelper.configurators.TutorialsPageConfigurator;
import com.teamamerica.mathhelper.configurators.UserInteractionsConfigurator;
import com.teamamerica.mathhelper.controllers.CategoryType;
import com.teamamerica.mathhelper.ui.customcomponents.YouTubeFrame;

public class AllTutorials extends javax.swing.JFrame {

    public AllTutorials() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMoney = new javax.swing.JButton();
        btnAddition = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnTime = new javax.swing.JButton();
        btnMeasure = new javax.swing.JButton();
        btnShapes = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(436, 308));
        jPanel1.setLayout(null);

        btnMoney.setBackground(new java.awt.Color(255, 255, 0));
        btnMoney.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnMoney.setText("Money");
        btnMoney.setPreferredSize(new java.awt.Dimension(107, 35));
        btnMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoneyActionPerformed(evt);
            }
        });
        jPanel1.add(btnMoney);
        btnMoney.setBounds(242, 214, 112, 86);

        btnAddition.setBackground(new java.awt.Color(102, 255, 102));
        btnAddition.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnAddition.setText("Addition");
        btnAddition.setPreferredSize(new java.awt.Dimension(107, 35));
        btnAddition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdditionActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddition);
        btnAddition.setBounds(31, 110, 112, 86);

        btnSub.setBackground(new java.awt.Color(102, 255, 102));
        btnSub.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnSub.setText("Subtraction ");
        btnSub.setPreferredSize(new java.awt.Dimension(107, 35));
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });
        jPanel1.add(btnSub);
        btnSub.setBounds(31, 216, 112, 86);

        btnTime.setBackground(new java.awt.Color(255, 255, 0));
        btnTime.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnTime.setText("Time");
        btnTime.setPreferredSize(new java.awt.Dimension(107, 35));
        btnTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimeActionPerformed(evt);
            }
        });
        jPanel1.add(btnTime);
        btnTime.setBounds(242, 110, 112, 86);

        btnMeasure.setBackground(new java.awt.Color(255, 0, 51));
        btnMeasure.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnMeasure.setText("Measure");
        btnMeasure.setPreferredSize(new java.awt.Dimension(107, 35));
        btnMeasure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeasureActionPerformed(evt);
            }
        });
        jPanel1.add(btnMeasure);
        btnMeasure.setBounds(455, 110, 112, 86);

        btnShapes.setBackground(new java.awt.Color(255, 0, 51));
        btnShapes.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnShapes.setText("Shapes");
        btnShapes.setPreferredSize(new java.awt.Dimension(107, 35));
        btnShapes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(btnShapes);
        btnShapes.setBounds(455, 214, 112, 86);

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton1.setText("Help");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(457, 329, 110, 40);

        jButton2.setBackground(new java.awt.Color(153, 204, 255));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton2.setText("Main Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(33, 329, 110, 40);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("Select a Tutorial");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(230, 70, 140, 26);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel1.setText("First Grade Tutorials");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 20, 510, 44);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ian\\Documents\\backround.jpeg")); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 595, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       Object source = evt.getSource();
       if(source == btnMoney){
           UserInteractionsConfigurator.set_category_type_enum(CategoryType.MONEY);
           TutorialsPageConfigurator.loadTutorialsList();
          new FirstGradeAddTutorial().setVisible(true);
          this.setVisible(false);
       }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnAdditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       Object source = evt.getSource();
       if(source == btnAddition){
           UserInteractionsConfigurator.set_category_type_enum(CategoryType.ADDITION);
           TutorialsPageConfigurator.loadTutorialsList();
         //  this.setVisible(false);
           this.dispose();
           new YouTubeFrame(TutorialsPageConfigurator.getTutorial().getTutorial()).setVisible(true);
       }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       Object source = evt.getSource();
       if(source == btnSub){
           UserInteractionsConfigurator.set_category_type_enum(CategoryType.SUBTRACTION);
           TutorialsPageConfigurator.loadTutorialsList();

           new FirstGradeAddTutorial().setVisible(true);
          this.setVisible(false);
       }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       Object source = evt.getSource();
       if(source == btnTime){
           UserInteractionsConfigurator.set_category_type_enum(CategoryType.TIME);
           TutorialsPageConfigurator.loadTutorialsList();

           new FirstGradeAddTutorial().setVisible(true);
          this.setVisible(false);
       }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnMeasureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       Object source = evt.getSource();
       if(source == btnMeasure){
           UserInteractionsConfigurator.set_category_type_enum(CategoryType.MEASURE);
           TutorialsPageConfigurator.loadTutorialsList();

           new FirstGradeAddTutorial().setVisible(true);
          this.setVisible(false);
       }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       Object source = evt.getSource();
       if(source == btnShapes){
           UserInteractionsConfigurator.set_category_type_enum(CategoryType.SHAPES);
           TutorialsPageConfigurator.loadTutorialsList();

           new FirstGradeAddTutorial().setVisible(true);
          this.setVisible(false);
       }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Object source = evt.getSource();
       if(source == jButton2){
          new MainMenu().setVisible(true);
          this.setVisible(false);
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FirstGradeTestMain().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton btnMoney;
    private javax.swing.JButton btnAddition;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton btnTime;
    private javax.swing.JButton btnMeasure;
    private javax.swing.JButton btnShapes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
