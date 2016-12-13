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
    private final int projectNumber;
    private final String title;
    private final double budget;
    private final int teamMembersNeeded;
    private final int daysForCompletion;
    private final ProjectStatus status;
    
    ArrayList<Employee> team = new ArrayList<>();
    
    public Project(String ti, double bud, int mem, int days, ProjectStatus stat )
    {
        projectNumber = ++number;
        title = ti;
        budget = bud;
        teamMembersNeeded = mem;
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
    
    public int getteamMembersNeeded()
    {
        return teamMembersNeeded;
    }
    
    public int getDaysForCompletion()
    {
        return daysForCompletion;
    }
    
    public void addEmployeeToteam(Employee emp)
    {
        team.add(emp);
        
        System.out.println("Employee added to team");
    }
    
    public void removeEmployeeFromteam(Employee emp)
    {
        team.remove(emp);
        
        System.out.println("Employee removed from team");
    }
    
 
    
    
    
}

