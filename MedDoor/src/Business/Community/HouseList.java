/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Community;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ashikakalmady
 */
public class HouseList {
     ArrayList<House> houseList;
    
    public HouseList() {
        this.houseList = new ArrayList<>();
    }
    public List<House> getHouses() {
        return houseList;
    }

    public void setHouses(ArrayList<House> house) {
        this.houseList = house;
    }
    
    public House addNewHouse(House hospital){
        houseList.add(hospital); 
        return hospital;
    }
    
    public House addHouse() {
        House newHouse = new House();
        houseList.add(newHouse);  
        return newHouse;
    } 
    
    public void deleteHouse(int index) {
        houseList.remove(index);
    } 
    
    public void updateHouse(House hos,int index){
        houseList.set(index,hos);
    }
}
