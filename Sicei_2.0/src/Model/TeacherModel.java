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
public class TeacherModel {
    private String id;
    private String name;
    private String lastName;
    private ArrayList<SubjectModel> courses = new ArrayList<SubjectModel>();
    
    public TeacherModel(String id, String name, String lastName){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }
    
    public boolean haveCourseT(SubjectModel course){
        boolean haveCourse = false;
        if(!courses.isEmpty()){
            if(courses.contains(course)){
                haveCourse = true;
            }
        }
        return haveCourse;
    }
    
    public void addCourse(SubjectModel course){
        courses.add(course);
    }
    
    public void deleteCourse(SubjectModel course){
        courses.remove(course);
    }
    
    public ArrayList<SubjectModel> getCourse(){
        return courses;
    }
    
    public void setId(String newId){
        this.id = newId;
    }
    
    public String getId(){
        return this.id;
    }
    
    public void setName(String newName){
        this.id = newName;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public String toString(){
        String text = "Maestro [Clave=" + this.id + ", Nombre=" + this.name + ", Apellido=" + this.lastName + "\n";
        for (int i = 0; i < courses.size(); i++){
            text = text + courses.get(i).toString() + "\n";
        }
        return text;
    }
    
}
