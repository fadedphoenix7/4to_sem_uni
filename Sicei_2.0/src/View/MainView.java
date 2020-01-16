/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.MainController;
import Model.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author joses
 */
public class MainView extends javax.swing.JFrame {
    private MainController controller;
    /**
     * Creates new form MainView
     */
    public MainView(MainController controller) {
        this.controller = controller;
        System.out.println(1);
        initComponents();
    }

    public DefaultListModel getTeachers(){
        DefaultListModel listModel = new DefaultListModel();
        ArrayList<TeacherModel> arrTeacher = controller.getModel().getTeachers();
        for (int i = 0; i < arrTeacher.size(); i++){
            listModel.addElement(arrTeacher.get(i).getName());
        }
        return listModel;
    }
    
    public DefaultListModel getCourses(){
        DefaultListModel listModel = new DefaultListModel();
        ArrayList<SubjectModel> arrTeacher = controller.getModel().getSubjects();
        for (int i = 0; i < arrTeacher.size(); i++){
            listModel.addElement(arrTeacher.get(i).getName());
        }
        return listModel;
    }
    
    public DefaultListModel getCoursesOfTeachers(int index){
        DefaultListModel listModel = new DefaultListModel();
        ArrayList<SubjectModel> arrTeacher = controller.getModel().getTeachers().get(index).getCourse();
        for (int i = 0; i < arrTeacher.size(); i++){
            listModel.addElement(arrTeacher.get(i).getName());
        }
        return listModel;
    }
    
    public DefaultListModel getCoursesOfTeachers( ){
         DefaultListModel listModel = new DefaultListModel();
         return listModel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TeachersList = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        couseList = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        teacherCourseList = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("ADD >>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("<<  DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        TeachersList.setModel(getTeachers());
        TeachersList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TeachersList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TeachersListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TeachersList);

        couseList.setModel(getCourses());
        jScrollPane2.setViewportView(couseList);

        teacherCourseList.setModel(getCoursesOfTeachers());
        jScrollPane3.setViewportView(teacherCourseList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jButton1)
                        .addGap(58, 58, 58)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        controller.deleteCourseToTeacher(TeachersList.getSelectedIndex(), teacherCourseList.getSelectedIndex());
        DefaultListModel listModel = (DefaultListModel) teacherCourseList.getModel();
        listModel.removeAllElements();
        teacherCourseList.setModel(getCoursesOfTeachers(TeachersList.getSelectedIndex()));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TeachersListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeachersListMouseClicked
        System.out.println(TeachersList.getSelectedIndex());
        DefaultListModel listModel = (DefaultListModel) teacherCourseList.getModel();
        listModel.removeAllElements();
        teacherCourseList.setModel(getCoursesOfTeachers(TeachersList.getSelectedIndex()));
    }//GEN-LAST:event_TeachersListMouseClicked
     
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        controller.addCourseToTeacher(TeachersList.getSelectedIndex(), couseList.getSelectedIndex());
        DefaultListModel listModel = (DefaultListModel) teacherCourseList.getModel();
        listModel.removeAllElements();
        teacherCourseList.setModel(getCoursesOfTeachers(TeachersList.getSelectedIndex()));
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList TeachersList;
    private javax.swing.JList couseList;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList teacherCourseList;
    // End of variables declaration//GEN-END:variables
}