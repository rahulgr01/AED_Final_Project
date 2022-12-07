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
//        if (type == Enterprise.EnterpriseType.Hospital){
//            enterprise = new HospitalEnterprise(name);
//            enterpriseList.add(enterprise);
//        }
//        else if (type == Enterprise.EnterpriseType.Government){
//            enterprise = new GovernmentEnterprise(name);
//            enterpriseList.add(enterprise);
//        }
//        else  if (type == Enterprise.EnterpriseType.NonProfit){
//            enterprise = new NonProfitEnterprise(name);
//            enterpriseList.add(enterprise);
//        }
//        else  if (type == Enterprise.EnterpriseType.AirAmbulance){
//            enterprise = new AirAmbulanceEnterprise(name);
//            enterpriseList.add(enterprise);
//        }
     
        return enterprise;
    }
}