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
    private ImageButton btnHelp, btnHints, btnSchoolsOut, btnWelcome, btnWelcomeBack, btnGenerateStudents;
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
                gradeList[counter] = "GradeId : " + grade.getGrade_id() + " |Category: N/A }Grade : " +
                        grade.getGrade() + " |Receive Reward : " + grade.hasReceive_reward();
                listModel.addElement(gradeList[counter]);
                counter++;
            } else {
                gradeList[counter] = "GradeId : " + grade.getGrade_id() + " |Category: " + grade.getCategory()
                        + " |Grade : " + grade.getGrade() + " |Receive Reward : " + grade.hasReceive_reward();
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
        btnSchoolsOut = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_logout.gif"), 150, 101);
        btnWelcome = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_welcomeToSchool.jpg"), 225, 225);
        btnWelcomeBack = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_welcomeBack.jpg"), 225, 225);
        btnGenerateStudents = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_generateStudents.png"), 150, 150);

        btnGenerateStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateStudentsActionPerformed(evt);
            }
        });


        jPanel1.add(btnGenerateStudents);

        btnSchoolsOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSchoolsOutActionPerformed(evt);
            }
        });
        jPanel1.add(btnSchoolsOut);
        btnSchoolsOut.setBounds(850, 10, 110, 101);


        btnHelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnHelp) {
                    AudioListener.runAudioListener("SpeechOn.wav");

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

        btnWelcome = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_welcomeToSchool.jpg"), 200, 200);
        btnWelcome.setBounds(650, 375, 200, 225);
        jPanel1.add(btnWelcome);

        btnWelcome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnWelcome) {
                    AdminConfigurator.setIsEditStudent(false);
                    new AddAStudent().setVisible(true);
                    cboStudents.setSelectedIndex(0);

                }
            }
        });
        btnWelcomeBack = new ImageButton(true, ConfigDirectory.getImageFileFromDirectory("panels_welcomeBack.jpg"), 200, 200);
        btnWelcomeBack.setBounds(650, 150, 200, 200);
        jPanel1.add(btnWelcomeBack);
        btnWelcomeBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnWelcomeBack) {
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

                    }
                }
            }
        });

        lblTitle = new JLabel();
        jScrollPane1 = new JScrollPane();

        cboStudents = new JComboBox(cboStudentList);
        cboStudents.setBounds(50, 125, 500, 50);
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
        listGrades.setBounds(50, 225, 500, 325);
        listGrades.setFont(new Font("Comic Sans MS", 0, 24));
        listGrades.setEnabled(false);
        jScrollPane1.setBounds(50, 225, 500, 325);

        lblGrades = new JLabel("Student Progress Grades:");
        lblGrades.setBounds(50, 25, 500, 350);
        lblGrades.setFont(new Font("Comic Sans MS", 0, 24));

        jPanel1.add(lblGrades);

        jPanel1.add(cboStudents);
        jScrollPane1.setViewportView(listGrades);

        jPanel1.add(jScrollPane1);

        btnGenerateStudents.setBounds(400, 550, 150, 150);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel1.add(btnHelp);
        btnHelp.setBounds(30, 575, 150, 101);

        jPanel1.add(btnHints);
        btnHints.setBounds(850, 575, 150, 101);

        lblTitle.setFont(new java.awt.Font("Comic Sans MS", 0, 60)); // NOI18N
        lblTitle.setText("Math Helper Admin Main");
        jPanel1.add(lblTitle);
        lblTitle.setBounds(75, 10, 1000, 60);


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

    private void btnGenerateStudentsActionPerformed(ActionEvent evt) {
        if (evt.getSource() == btnGenerateStudents) {
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
            }else if(generateNewList){

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
            this.setVisible(false);
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
