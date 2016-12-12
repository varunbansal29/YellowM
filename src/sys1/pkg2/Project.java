/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys1.pkg2;

import java.util.ArrayList;

/**
 *
 * @author julian.dragoi
 */
public class Project
{
    private static int number = 001;
    private int projectNumber;
    private String title;
    private double budget;
    private int crewMembersNeeded;
    private int daysForCompletion;
    private final ProjectStatus status;
    
    ArrayList<Employee> crew = new ArrayList<Employee>();
    
    public Project(String ti, double bud, int mem, int days, ProjectStatus stat )
    {
        projectNumber = ++number;
        title = ti;
        budget = bud;
        crewMembersNeeded = mem;
        daysForCompletion = days;
        status = stat;
    }
    
    public ProjectStatus getProjectStatus()
    {
        return status;
    }
    
    public int getProject()
    {
        return projectNumber;
    }
    
    public String getProjectTitle()
    {
        return title;
    }
    
    public double getBudget()
    {
        return budget;
    }
    
    public int getCrewMembersNeeded()
    {
        return crewMembersNeeded;
    }
    
    public int getDaysForCompletion()
    {
        return daysForCompletion;
    }
    
    public void addEmployeeToCrew(Employee emp)
    {
        crew.add(emp);
        
        System.out.println("Employee added to crew");
    }
    
    public void removeEmployeeFromCrew(Employee emp)
    {
        crew.remove(emp);
        
        System.out.println("Employee removed to crew");
    }
    
}

