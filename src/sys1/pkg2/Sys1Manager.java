/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys1.pkg2;

import java.util.HashSet;

/**
 *
 * @author julian.dragoi
 */
public class Sys1Manager
{
   HashSet<Project> allProjects = new HashSet<>();
   HashSet<Employee> allEmployees = new HashSet<>();
   
   
   
   public void addEmployeeToList(Employee emp){
       
      allEmployees.add(emp);
     
   }
   
   
   //public void getAllProjects()
   
   //public void getAllEmployees()
}
