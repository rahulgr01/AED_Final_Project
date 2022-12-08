/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author ashikakalmady
 */
public class EcoSystem extends Organization {
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    
    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }
    private EcoSystem() {
        
        super(null);
         networkList = new ArrayList<>();
    }
    
     public ArrayList<Network> getNetworkList() {
        return networkList;
    }
     public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    //  @Override
//    public HashSet<Role> getSupportedRole() {

//    }
    public boolean isUserUnique(String username) {

//        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
//            return false;
//        }

        return true;
    }
}