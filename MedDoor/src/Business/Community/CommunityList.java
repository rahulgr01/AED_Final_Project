/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Community;

import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import java.util.ArrayList;

/**
 *
 * @author ashikakalmady
 */
public class CommunityList {
    private ArrayList<Community> communityList;

    public ArrayList<Community> getCommunityList() {
        ArrayList<String> names2 = new ArrayList<String>();
        System.out.println(names2);

        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }
    
    public CommunityList() {
        this.communityList = new ArrayList<Community>();
    }
    
    public void tempCommList(Network city) { 
        addNewCommunity(new Community("Allston-Suffolk", 20134, city));
        addNewCommunity(new Community("Allston-Brighton", 20135, city));
    }   
    
    
    public Community addNewCommunity(Community community){
        communityList.add(community); 
        return community;
    }
    
    public Community addCommunity() {
        Community newCommunity = new Community();
        communityList.add(newCommunity);  
        return newCommunity;
    } 
    
    public void deleteCommunity(int index) {
        communityList.remove(index);
    } 
    
    public void updateCommunity(Community com,int index){
        communityList.set(index,com);
    }
}

