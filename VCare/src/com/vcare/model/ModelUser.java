
package com.vcare.model;


public class ModelUser {
    
    int userID;
    String userName;
    String email;
    String password;
    String role;
    String verifyCode;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }
    
    
    public ModelUser(int userID, String userName, String email, String password,String role, String verifyCode)
    {
        this.userID=userID;
        this.userName=userName;
        this.email=email;
        this.password=password;
        this.role=role;
        this.verifyCode=verifyCode;
    }
    public ModelUser(int userID, String userName, String email, String password,String role)
    {
        this.userID=userID;
        this.userName=userName;
        this.email=email;
        this.password=password;
        this.role=role;
    }
         
}
