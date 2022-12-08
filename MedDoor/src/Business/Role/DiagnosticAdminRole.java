/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import javax.swing.JPanel;

/**
 *
 * @author ashikakalmady
 */
public class DiagnosticAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     @Override
    public String toString(){
        return RoleType.DiagnosticAdminRole.getValue();
    }
    
    
    
}
