/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ashikakalmady
 */
public abstract class Role {
    
    public enum RoleType{
        
        DoctorRole("DocorRole"),
        Patient("Patient"),
        AmbulanceDriver("AmbulanceDriver"),
        StaffRole("StaffRole"),
        Accountant("Accountant"),
        ClaimHandler("ClaimHandler"),
        InsuranceAgent("InsuranceAgent"),
        Phamacist("Phamacist"),
        DeliveryRole("DeliveryRole"),
        MedicineSupplier("MedicineSupplier"),
        LabAssistant("LabAssistant"),
        SurveyVolunteer("LabAssistant"),
        HomeCareVolunteer("HomeCareVolunteer"),
        
        AdminRole("AdminRole"),
        SystemAdminRole("SystemAdminRole"),
        HospitalAdminRole("HospitalAdminRole"),
        CommunityAdminRole("CommunityAdminRole"),
        VolunteerAdminRole("VolunteerAdminRole"),
        DiagnosticAdminRole("DiagnosticAdminRole"),
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
    public abstract JFrame createWorkArea(JFrame userProcessContainer);
    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
