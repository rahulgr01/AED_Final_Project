/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Community;

import Business.Network.Network;
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
        addNewCommunity(new Community("com1234", "Allston-Suffolk", 20134, city));
        addNewCommunity(new Community("com1235", "Allston-Brighton", 20135, city));
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

