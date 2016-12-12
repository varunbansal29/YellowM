/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys1.pkg2;


import java.util.Date;
import java.util.*;
/**
 *
 * @author julian.dragoi
 */
public class Employee
{
    String employeeNumber;
    private String firstName;
    private final String surName;
    private final int dob;
    private final String address;
    private EmployeeStatus status;
    private final double rate;
    
    public Employee(String id, String first, String sur, int d, String adrs, EmployeeStatus stat, double rt)
    {
        this.employeeNumber = id;
        this.firstName = first;
        this.surName = sur;
        this.dob = d;
        this.address = adrs;
        this.status = stat;
        this.rate = rt;
    }

    public EmployeeStatus getAvailability()
    {
        return status;
    }
    
    public void changeAvailability(EmployeeStatus newEmpSt)
    {
        status = newEmpSt;
    }
    
    public String getEmployeeNumber()
    {
        return employeeNumber;
    }
    
    public void changeEmployeeNumber(String newEmpNum)
    {
        employeeNumber = newEmpNum;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public void changeFirstName(String newEmpName)
    {
        firstName = newEmpName;
    }
    
    public String getSurNamer()
    {
        return surName;
    }
    
    public void changeSurName(String newEmpSurName)
    {
        firstName = newEmpSurName;
    }
    
    public int getDateOfBirth()
    {
        return dob;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public EmployeeStatus getStatus()
    {
        return status;
    }
    
    public double getRate()
    {
        return rate;
    }
 
    
    public void printEmployeeDetails()
    {
        System.out.println("Employee Number:"+ employeeNumber );
        System.out.println("Employee First Name:"+ firstName );
    }
}
