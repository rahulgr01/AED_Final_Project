/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ashikakalmady
 */
public abstract class Role {
    
    public enum RoleType{
        
        Doctor("Docor"),
        Patient("Patient"),
//        AmbulanceDriver("AmbulanceDriver"),
        Staff("Staff"),
//        Accountant("Accountant"),
        ClaimHandler("ClaimHandler"),
        InsuranceAgent("InsuranceAgent"),
        Phamacist("Phamacist"),
        LabAssistant("LabAssistant"),
        SurveyVolunteer("LabAssistant"),
        HomeCareVolunteer("HomeCareVolunteer"),
     
//        AdminRole("AdminRole"),
        SystemAdminRole("SystemAdminRole"),
        HospitalAdminRole("HospitalAdminRole"),
        VolunteerAdminRole("VolunteerAdminRole"),
        PharmacyAdminRole("PharmacyAdminRole"),
        LabAdminRole("LabAdminRole"),
        InsuranceAdminRole("InsuranceAdminRole");
        
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    public abstract void createWorkArea(UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);
    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
