/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Community;

/**
 *
 * @author ashikakalmady
 */
public class House {
    private String houseNumer;
    private String streeAdredss;
    private Community community;
    public TenantDirectory tenats;
    
    public String getStreeAdredss() {
        return streeAdredss;
    }

    public void setStreeAdredss(String streeAdredss) {
        this.streeAdredss = streeAdredss;
    }
    
    public String getHouseNumer() {
        return houseNumer;
    }

    public void setHouseNumer(String houseNumer) {
        this.houseNumer = houseNumer;
    }

    
    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }
    
    public House(String houseNumer, String streeAdredss) {
        this.houseNumer = houseNumer;
        this.streeAdredss = streeAdredss;
    }

    public House(String houseNumer, String streetAdd, Community community) {
        this.houseNumer = houseNumer;
        this.streeAdredss = streetAdd;
        this.community = community;
    }
    
    public House() {
        
    }
    
}
