/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Community;

import java.util.Date;
import java.util.UUID;

/**
 *
 * @author ashikakalmady
 */
public class Tenant extends Person {
    private String tenantID;
    private String emailId;
    
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    private String phoneNumber;
    
    public String getTenantID() {
        return tenantID;
    }

    public void setTenantID(String tenantID) {
        this.tenantID = tenantID;
    }
    
    public Tenant(String fName, String lName, Date dob, String gender,Integer age,String email, String phone, House residence) {
        super(fName, lName, dob, gender, age, residence);
        String uniqueID = UUID.randomUUID().toString();
        this.tenantID = uniqueID;
	this.emailId = email;
        this.phoneNumber = phone;
    }
    public Tenant() {
    }
    
}
