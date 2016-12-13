/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys1.pkg2;

import java.util.HashMap;
import java.util.Set;


/**
 *
 * @author julian.dragoi
 */
public class Sys1Manager implements Sys1Interface
{
   HashMap<String,Project> allProjects;
   HashMap<String,Employee> allEmployees;

    public Sys1Manager() {
        this.allEmployees = new HashMap<>();
        this.allProjects = new HashMap<>();
    }
   
   
   
   @Override
   public void addEmployeeToList(String empid, Employee emp){
       
      allEmployees.put(empid,emp);
     
   }
   
   @Override
   public void removeEmployee(String empid, Employee emp){
       
       allEmployees.remove(empid,emp);
   }
   
   
   @Override
   public Employee getEmployee(Employee emp){
       
       if(emp != null){
           return emp;
       }
       else
       return null;
       
   }
   
   @Override
   public void getAllEmployees(){
       
       Set<String> keys = allEmployees.keySet();
       for(String emp: keys){
            System.out.println(emp);
        }
   }
           
   @Override
 public void addProjectToList(String projid, Project proj){
       
      allProjects.put(projid,proj);
     
   }
   
   @Override
 public void removeProjectToList(String projid, Project proj){
       
      allProjects.remove(projid,proj);
     
   }
   
   
   @Override
   public Project getProject(Project proj){
       
       if(proj != null){
           return proj;
       }
       else
       return null;
       
   }
   
   @Override
   public void getAllProjects(){
       
       Set<String> keys = allProjects.keySet();
       for(String proj: keys){
            System.out.println(proj);
        }
   }
       
}
