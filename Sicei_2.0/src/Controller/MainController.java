/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import View.*;
import java.util.ArrayList;

/**
 *
 * @author joses
 */
public class MainController {
    private MainModel mainModel;
    private MainView mainView;
    
    public MainController(){
        InitReadFiles initFiles = new InitReadFiles();
        
        ArrayList <Object> teachers = initFiles.getList("Teachers");
        ArrayList <Object> subjects = initFiles.getList("Subjects");
        
        mainModel = new MainModel(teachers,subjects);        
        mainView = new MainView(this);
        //mainView.setVisible(true);
        System.out.println(2);
    }
    
    public void addCourseToTeacher(int teacherInt, int courseInt){
        TeacherModel teacher = mainModel.getTeachers().get(teacherInt);
        SubjectModel course = mainModel.getSubjects().get(courseInt);
        if(!teacher.haveCourseT(course)){
            teacher.addCourse(course);
            System.out.println("Se agrego con exito");
            System.out.println(teacher.toString());
        }
        else{
            System.out.println("Ya se encuentra la materia");
        }
        
    }
    
    public void deleteCourseToTeacher(int teacherInt, int courseInt){
        TeacherModel teacher = mainModel.getTeachers().get(teacherInt);
        System.out.println(teacher.getCourse().size());
        SubjectModel course = teacher.getCourse().get(courseInt);
        if(teacher.haveCourseT(course)){
            teacher.deleteCourse(course);
            System.out.println("Se elimino con exito");
            System.out.println(teacher.toString()+"\n"+teacher.getCourse().size());
        }
        else{
            System.out.println("No se encuentra el curso");
        }
    }
    
    public MainModel getModel(){
        return mainModel;
    }
    
    public MainView getView(){
        return mainView;
    }
    
}
