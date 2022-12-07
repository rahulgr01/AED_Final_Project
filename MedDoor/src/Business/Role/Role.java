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
public abstract class Role {
    
    public enum RoleType{
        AdminRole("AdminRole"),
        DoctorRole("DocorRole");
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
    public abstract JPanel createWorkArea(JPanel userProcessContainer);
    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
