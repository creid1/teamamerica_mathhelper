package com.teamamerica.mathhelper.ui.panels;

import com.teamamerica.mathhelper.configurators.AdminConfigurator;
import com.teamamerica.mathhelper.configurators.UserInteractionsConfigurator;
import com.teamamerica.mathhelper.environment.ConfigDirectory;
import com.teamamerica.mathhelper.models.Grade;
import com.teamamerica.mathhelper.models.User;
import com.teamamerica.mathhelper.ui.customcomponents.AudioListener;
import com.teamamerica.mathhelper.ui.customcomponents.ImageButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MathHelperAdmin extends JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ImageButton btnHelp, btnHints, btnSchoolsOut, btnNewMathHelper,
            btnUpdateMathHelper, btnFindMathHelpers, btnTeacherZone;
    private JCheckBox ckEditAdminInfo;
    private JLabel lblTitle, lblGrades;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JComboBox cboStudents;
    private JList listGrades;
    // End of variables declaration//GEN-END:variables

    //variables for the interactions
    private ArrayList<User> students;
    private String[] cboStudentList = null;
    private String[] gradeList = null;
    private ArrayList<Grade> grades;
    private DefaultListModel listModel;
    private boolean generateNewList = false;

    public MathHelperAdmin() {

        students = AdminConfigurator.getStudents();
        initializeStudentsList();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        initComponents();
    }

    private void initializeStudentsList() {
        int counter = 0;
        cboStudentList = new String[students.size() + 1];
        cboStudentList[counter++] = "Student Names";

        for (User user : students) {
            cboStudentList[counter++] = user.getFirst_name() + " " + user.getLast_name();
        }
    }

    private int findSelectedUser(String fullName) {
        String[] split = fullName.split(" ");
        String first = split[0];
        String last = split[1];
        for (User user : students) {
            if (user.getFirst_name().equals(first.trim()) && user.getLast_name().equals(last.trim())) {
                return user.getUser_id();
            }
        }
        return -1;
    }


    private void initializeStudentGrades(int studentId) {
        grades = AdminConfigurator.getStudentGrades(studentId);
        gradeList = new String[grades.size()];
        int counter = 0;
        listModel.clear();
        for (Grade grade : grades) {
            if (grade.getCategory().equals("")) {
                gradeList[counter] = "| Grade_Id : " + grade.getGrade_id() + " | Grade_Level : " + grade.getGrade_level() +
                        " | Category : N/A | Difficulty_Level : " + grade.getDifficulty_level() + " | Grade : " +
                        grade.getGrade() + " | Correct :" + grade.getCorrect() + "| Wrong : "
                        + (grade.getTotal() - grade.getCorrect()) + " | Total_Questions : " + grade.getTotal();
                listModel.addElement(gradeList[counter]);
                counter++;
            } else {
                gradeList[counter] = "| Grade_Id : " + grade.getGrade_id() + " | Grade_Level : " + grade.getGrade_level() +
                        " | Category : " + grade.getCategory() + " | Difficulty_Level : " + grade.getDifficulty_level() +
                        " | Grade : " + grade.getGrade() + " | Correct :" + grade.getCorrect() + " | Wrong : "
                        + (grade.getTotal() - grade.getCorrect()) + " | Total_Questions : " + grade.getTotal();
                listModel.addElement(gradeList[counter]);
                counter++;
            }
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        btnHelp = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_help.gif"), 150, 96);
        btnHints = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_helpDesk.png"), 150, 101);
        btnSchoolsOut = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_kidsSchoolBus.gif"), 300, 150);
        btnNewMathHelper = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_welcomeToSchool.jpg"), 175, 175);
        btnUpdateMathHelper = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_welcomeBack.jpg"), 175, 175);
        btnFindMathHelpers = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_generateStudents.png"), 150, 150);
        btnTeacherZone = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_teacherZone.jpg"), 150, 130);

        btnFindMathHelpers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindMathHelpers(evt);
            }
        });
        btnTeacherZone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeacherZoneActionPerformed(evt);
            }
        });

        btnSchoolsOut.setToolTipText("Schools Out!");
        btnHelp.setToolTipText("I Need Help!");
        btnHints.setToolTipText("HelpDesk Hints!");

        btnUpdateMathHelper.setToolTipText("Update MathHelper!");
        btnFindMathHelpers.setToolTipText("Find MathHelpers!");
        btnNewMathHelper.setToolTipText("NewMathHelper!");
        btnTeacherZone.setToolTipText("Admin Account!");



        btnHints.setBounds(850, 575, 150, 101);
        btnUpdateMathHelper.setBounds(750, 150, 175, 175);
        btnNewMathHelper.setBounds(750, 375, 175, 175);
        btnHelp.setBounds(30, 575, 150, 101);


        jPanel1.add(btnFindMathHelpers);
        jPanel1.add(btnTeacherZone);

        btnSchoolsOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSchoolsOutActionPerformed(evt);
            }
        });
        jPanel1.add(btnSchoolsOut);
        btnSchoolsOut.setBounds(750, 20, 300, 101);


        btnHelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnHelp) {
                    AudioListener.stopAudioListener();
                    AudioListener.runAudioListener("SpeechOn.wav");
                    AudioListener.runAudioListener("admin.wav");
                }
            }
        });


        btnHints.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnHints) {
                    new HelpDeskAdminHints().setVisible(true);
                }
            }
        });

        jPanel1.add(btnNewMathHelper);

        btnNewMathHelper.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnNewMathHelper) {
                    AdminConfigurator.setIsEditStudent(false);
                    new AddAStudent().setVisible(true);
                    cboStudents.setSelectedIndex(0);
                    listModel.clear();

                }
            }
        });

        jPanel1.add(btnUpdateMathHelper);
        btnUpdateMathHelper.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnUpdateMathHelper) {
                    if (cboStudents.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(null, "Please select a student from the Student Drop Down List.");
                    } else {
                        AdminConfigurator.setIsEditStudent(true);
                        String fullName = cboStudents.getSelectedItem().toString();
                        System.out.println(fullName);
                        int studentId = findSelectedUser(cboStudents.getSelectedItem().toString());
                        AdminConfigurator.setUserInfo(studentId);
                        new AddAStudent().setVisible(true);
                        cboStudents.setSelectedIndex(0);
                        listModel.clear();

                    }
                }
            }
        });

        lblTitle = new JLabel();
        jScrollPane1 = new JScrollPane();

        cboStudents = new JComboBox(cboStudentList);
        cboStudents.setBounds(100, 125, 600, 50);
        cboStudents.setBackground(Color.WHITE);
        cboStudents.setFont(new Font("Comic Sans MS", 0, 26));
        cboStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboStudentsActionPerformed(evt);
            }
        });
        listModel = new DefaultListModel();
        listGrades = new JList(listModel);
        listGrades.setBackground(Color.WHITE);
        listGrades.setBounds(100, 225, 600, 325);
        listGrades.setFont(new Font("Comic Sans MS", 1, 24));
        listGrades.setEnabled(false);
        jScrollPane1.setBounds(100, 225, 600, 325);

        lblGrades = new JLabel("Student Progress Grades:");
        lblGrades.setBounds(100, 25, 500, 350);
        lblGrades.setFont(new Font("Comic Sans MS", 0, 24));

        jPanel1.add(lblGrades);

        jPanel1.add(cboStudents);
        jScrollPane1.setViewportView(listGrades);

        jPanel1.add(jScrollPane1);

        btnFindMathHelpers.setBounds(500, 550, 150, 150);
        btnTeacherZone.setBounds(300, 563, 150, 130);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel1.add(btnHelp);

        jPanel1.add(btnHints);

        lblTitle.setFont(new java.awt.Font("Comic Sans MS", 0, 60)); // NOI18N
        lblTitle.setText("Math Helper Admin Main");
        jPanel1.add(lblTitle);
        lblTitle.setBounds(75, 10, 1000, 90);


        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTeacherZoneActionPerformed(ActionEvent evt) {
        if (evt.getSource().equals(btnTeacherZone)) {
            AdminConfigurator.setIsEditStudent(false);
            AdminConfigurator.setIsEditAdmin(true);
            AdminConfigurator.setUserInfo(UserInteractionsConfigurator.get_interactive_user().getUser_id());
            new AddAStudent().setVisible(true);
            cboStudents.setSelectedIndex(0);
            listModel.clear();

        }
    }

    private void btnFindMathHelpers(ActionEvent evt) {
        if (evt.getSource() == btnFindMathHelpers) {
            generateNewList = true;
            cboStudents.removeAllItems();
            students = AdminConfigurator.getStudents();
            initializeStudentsList();
            for (String student : cboStudentList) {
                cboStudents.addItem(student);
            }
            cboStudents.setSelectedIndex(0);
            generateNewList = false;
        }
    }

    private void cboStudentsActionPerformed(ActionEvent evt) {
        if (evt.getSource() == cboStudents) {

            if (cboStudents.getSelectedIndex() == 0) {
                //do not show anything
            } else if (generateNewList) {

                //do nothing - the list is being removed from another action listener
            } else {
                int studentId = findSelectedUser(cboStudents.getSelectedItem().toString());
                initializeStudentGrades(studentId);
            }
        }
    }

    private void btnSchoolsOutActionPerformed(ActionEvent evt) {

        if (evt.getSource() == btnSchoolsOut) {
            UserInteractionsConfigurator.set_difficulty_level_enum(null);
            UserInteractionsConfigurator.set_category_type_enum(null);
            UserInteractionsConfigurator.set_interactive_grade(null);
            UserInteractionsConfigurator.set_main_menu_selection_enum(null);
            UserInteractionsConfigurator.set_interactive_grade_level_enum(null);
            UserInteractionsConfigurator.set_interactive_user(null);
            UserInteractionsConfigurator.playLoginScript = false;

            this.dispose();
            new LogIn().setVisible(true);

        }
    }


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MathHelperAdmin().setVisible(true);
            }
        });
    }

}
