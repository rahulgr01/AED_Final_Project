/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Community;

import Business.Network.Network;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ashikakalmady
 */
public class Community {
    private String communityId;
    private String communityName; 
    private Integer zipCode; 
    private Network city;
    public HouseList house;
    
    public Community() {}
    
    public Community(String communityId, String communityName, Integer zipCode, Network city) {
        this.communityId = communityId;
        this.communityName = communityName;
        this.zipCode = zipCode;
        this.city = city;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public Network getCity() {
        return city;
    }

    public void setCity(Network city) {
        this.city = city;
    }
    
    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String name) {
        this.communityName = name;
    }
    
    
}

