/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author joses
 */

import Controller.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MainController aplication = new MainController();
        aplication.getView().setVisible(true);
        System.out.println(3);
        /*
        aplication.addCourseToTeacher(aplication.getModel().getTeachers().get(0),aplication.getModel().getSubjects().get(1));
        aplication.addCourseToTeacher(aplication.getModel().getTeachers().get(0),aplication.getModel().getSubjects().get(1));
        aplication.addCourseToTeacher(aplication.getModel().getTeachers().get(0),aplication.getModel().getSubjects().get(0));
        aplication.addCourseToTeacher(aplication.getModel().getTeachers().get(0),aplication.getModel().getSubjects().get(3));
        aplication.getModel().getTeachers().get(0).toString();
        System.out.println(aplication.getModel().getTeachers().get(0).toString());*/
        
    }
    
}
