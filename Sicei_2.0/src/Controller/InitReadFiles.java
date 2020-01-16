/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException; 
import Model.*;
import java.util.ArrayList;

/**
 *
 * @author joses
 */
public class InitReadFiles {
    
    
    public static void main(String[] args) throws Exception {
        String line = "";  
        String splitBy = ",";  
        try   {  
            
        //parsing a CSV file into BufferedReader class constructor  
            BufferedReader br = new BufferedReader(new FileReader("./src/Controller/Teachers.csv"));  
            br.readLine().split(splitBy);
            while ((line = br.readLine()) != null){   //returns a Boolean value    
                String[] teacher = line.split(splitBy);    // use comma as separator  
                System.out.println("Maestro [Clave=" + teacher[0] + ", Nombre=" + teacher[1] + ", Apellido=" + teacher[2]);  
                }  
            }   
        catch (IOException e){  
            e.printStackTrace();  
            }  
    }  
    
    public ArrayList<Object> getList(String filename){
        ArrayList <Object> info = new ArrayList<Object>();
        String line = "";  
        String splitBy = ",";  
        
        try   {   
            BufferedReader br = new BufferedReader(new FileReader("./src/Controller/"+ filename +".csv"));  
            br.readLine();
            Object infoRow;
            while ((line = br.readLine()) != null){   //returns a Boolean value    
                String[] rowCsv = line.split(splitBy);    // use comma as separator  
                if(filename.equals("Teachers")){
                    infoRow = new TeacherModel(rowCsv[0],rowCsv[1],rowCsv[2]);
                }
                else{
                    infoRow = new SubjectModel(rowCsv[0],rowCsv[1],rowCsv[2]);
                }
                info.add(infoRow);
            }
            br.close();
        }    
        catch (IOException e){  
            e.printStackTrace();  
            }  
        
        return info;
    }
    
}

