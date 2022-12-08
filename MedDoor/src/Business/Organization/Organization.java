/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author ashikakalmady
 */
public abstract class Organization {
    private String name;
    private WorkQueue workQueue;
    private UserAccountDirectory userAccountDirectory;
    private EmployeeDirectory employeeDirectory;
    

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    
    public enum Type{
        LabService("LabService Organization"),
        Pharmacy("Pharmacy Organization"),
        Doctor("Doctor Organization"),
        HospitalStaff("HospitalStaff Organization"),
        Admin("Admin Organization"), 
        SurveyVolunteer("SurveyVolunteer Organization"), 
        HomeCareVolunteer("HomeCareVolunteer Organization"),
        Policy("Policy Organization"),
        Claims("Claims Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
      public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        userAccountDirectory = new UserAccountDirectory();
      }
      
       public String getName() {
        return name;
    }
    public abstract ArrayList<Role> getSupportedRole();
        
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
}
