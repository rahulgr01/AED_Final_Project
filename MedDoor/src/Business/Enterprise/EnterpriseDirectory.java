/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.Organization;
import java.util.ArrayList;

/**
 *
 * @author ashikakalmady
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (null != type)switch (type) {
            case Hospital -> {
                enterprise = new HospitalEnterprise(name);
                enterpriseList.add(enterprise);
            }
            case Insurance -> {
                enterprise = new InsuranceEnterprise(name);
                enterpriseList.add(enterprise);
            }
            case Volunteer -> {
                enterprise = new VolunteerEnterprise(name);
                enterpriseList.add(enterprise);
            }
            case Diagnostics -> {
                enterprise = new DiagnosticsEnterprise(name);
                enterpriseList.add(enterprise);
            }
            default -> {
            }
        }
     
        return enterprise;
    }
}