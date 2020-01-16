/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author joses
 */
public class SubjectModel {
    private String id;
    private String degree;
    private String name;
    
    public SubjectModel(String id, String degree, String name){
        this.id = id;
        this.degree = degree;
        this.name = name;
    }
    
    public void setId(String newId){
        this.id = newId;
    }
    
    public String getId(){
        return this.id;
    }
    
    public void setDegree(String newDegree){
        this.id = newDegree;
    }
    
    public String getDegree(){
        return this.degree;
    }
    
    public void setName(String newName){
        this.id = newName;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String toString(){
        return "Asignatura Clave=" + this.id + ", Licenciatura=" + this.degree + ", Nombre=" + this.name;
    }
    
}
