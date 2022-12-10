/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.ParmacyAdminRole;
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
        System.out.print("ashikkakaka");
        if (business == null) {
            System.out.print("ash");
            business = new EcoSystem();
        }
        return business;
    }
    private EcoSystem() {
        
        super(null);
        networkList = new ArrayList<>();
        Network network = createAndAddNetwork();
        System.out.print(network);
    }
    
     public ArrayList<Network> getNetworkList() {
        return networkList;
    }
     public Network createAndAddNetwork() {
        Network network = new Network();
        network.setName("Boston");
        networkList.add(network);
        return network;
    }
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new ParmacyAdminRole());
        return roleList;
    }
    public static boolean isUserUnique(String username) {

//        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
//            return false;
//        }

        return true;
    }
}
