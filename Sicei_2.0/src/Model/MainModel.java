/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.ArrayList;

/**
 *
 * @author joses
 */
public class MainModel {
    
    private ArrayList<TeacherModel> teachers = new ArrayList<TeacherModel>();
    private ArrayList<SubjectModel> course = new ArrayList<SubjectModel>();
    
    public MainModel(ArrayList<Object> teachers, ArrayList<Object> course){
        this.teachers = (ArrayList<TeacherModel>)teachers.clone();
        this.course = (ArrayList<SubjectModel>)course.clone();
    }
    
    public ArrayList<TeacherModel> getTeachers(){
        return teachers;
    }
    
    public ArrayList<SubjectModel> getSubjects(){
        return course;
    }
    
}
