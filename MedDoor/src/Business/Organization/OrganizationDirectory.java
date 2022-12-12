/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import Business.Role.ClaimHandler;
import Business.Role.HomeCareVolunteerRole;
import Business.Role.LabAssistantRole;
import Business.Role.Pharmacist;
import Business.Role.PharmacistRole;
import Business.Role.SurveyVolunteerRole;
import java.util.ArrayList;

/**
 *
 * @author ashikakalmady
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }
    
    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public ArrayList<Organization> getOrganizationList(Type type) {
        return organizationList;
    }
    
     public Organization createOrganization(Type type, String name){
        Organization organization = null;
        if (type.getValue().equals(Type.LabService.getValue())){
            organization = new LabServiceOrganization();
            organization.setName(name);
             organization.getUserAccountDirectory().createUserAccount("ladmin","ladmin",organization.getEmployeeDirectory().createEmployee("ladmin"),new LabAssistantRole());
           
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Admin.getValue())){
            organization = new AdminOrganization();
            organization.setName(name);
            organizationList.add(organization);
        }
           
        else if (type.getValue().equals(Type.Pharmacy.getValue())){
            organization = new PharmacyOrganization();
            organization.setName(name);
             organization.getUserAccountDirectory().createUserAccount("padmin","padmin",organization.getEmployeeDirectory().createEmployee("padmin"),new PharmacistRole());
           
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organization.setName(name);
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.HospitalStaff.getValue())){
            organization = new HospitalStaffOrganization();
            organization.setName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.SurveyVolunteer.getValue())){
            organization = new SurveyVolunteerOrganization();
            organization.getUserAccountDirectory().createUserAccount("sadmin","sadmin",organization.getEmployeeDirectory().createEmployee("sadmin"),new SurveyVolunteerRole());
            organization.setName(name);
            organizationList.add(organization);
        }
          else if (type.getValue().equals(Type.HomeCareVolunteer.getValue())){
            organization = new HomeCareVolunteerOrganization();
             organization.getUserAccountDirectory().createUserAccount("hadmin","hadmin",organization.getEmployeeDirectory().createEmployee("hadmin"),new HomeCareVolunteerRole());
            organization.setName(name);
            organizationList.add(organization);
        }
           else if (type.getValue().equals(Type.Policy.getValue())){
            organization = new PolicyOrganization();
            organization.setName(name);
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Claims.getValue())){
            organization = new ClaimsOrganization();
             organization.getUserAccountDirectory().createUserAccount("cadmin","cadmin",organization.getEmployeeDirectory().createEmployee("chadmin"),new ClaimHandler());
          
            organization.setName(name);
            organizationList.add(organization);
        }
        
        
        return organization;  
     }
    
}
