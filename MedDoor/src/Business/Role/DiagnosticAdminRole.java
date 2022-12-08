/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import UI.Diagnostics.PharmacyAdmin;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ashikakalmady
 */
public class DiagnosticAdminRole extends Role {

    @Override
    public JFrame createWorkArea(JFrame userProcessContainer) {
         return new PharmacyAdmin(userProcessContainer);
    }
     @Override
    public String toString(){
        return RoleType.DiagnosticAdminRole.getValue();
    }
    
    
    
}
