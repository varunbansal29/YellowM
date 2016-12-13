/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys1.pkg2;

import java.util.HashMap;


/**
 *
 * @author julian.dragoi
 */
public class Sys1Manager
{
   HashMap<String,Project> allProjects;
   HashMap<String,Employee> allEmployees;

    public Sys1Manager() {
        this.allEmployees = new HashMap<>();
        this.allProjects = new HashMap<>();
    }
   
   
   
   public void addEmployeeToList(String empid, Employee emp){
       
      allEmployees.put(empid,emp);
     
   }
   
   public void removeEmployee(String empid, Employee emp){
       
       allEmployees.remove(empid,emp);
   }
   
   
   public Employee getEmployee(Employee emp){
       
       if(emp != null){
           return emp;
       }
       else
       return null;
       
   }
   
   //public void getAllProjects()
   
   //public void getAllEmployees()
}
