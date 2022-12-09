/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.Diagnostics.PharmacyAdmin;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ashikakalmady
 */
public class DiagnosticAdminRole extends Role {

    @Override
    public JFrame createWorkArea(UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business) {
         return new PharmacyAdmin(account,organization, enterprise, business);
    }
     @Override
    public String toString(){
        return RoleType.DiagnosticAdminRole.getValue();
    }
    
    
    
}
