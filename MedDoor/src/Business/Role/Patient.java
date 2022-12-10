/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.PharmacyAdmin.PharmacyAdmin;

/**
 *
 * @author Dell
 */
public class Patient extends Role {
     @Override
    public void createWorkArea(UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business) {
         new PharmacyAdmin(account,organization, enterprise, business).setVisible(true);
    }
     @Override
    public String toString(){
        return RoleType.Patient.getValue();
    }
}
