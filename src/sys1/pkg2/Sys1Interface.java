/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys1.pkg2;

/**
 *
 * @author julian.dragoi
 */
public interface Sys1Interface {
    
    
    public void addEmployeeToList(String empid, Employee emp);
    
    public void removeEmployee(String empid, Employee emp);
    
    public Employee getEmployee(Employee emp);
   
    public void getAllEmployees();
           
    public void addProjectToList(String projid, Project proj);
   
    public void removeProjectToList(String projid, Project proj);
   
    public Project getProject(Project proj);
   
    public void getAllProjects();
    
    
}
