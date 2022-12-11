/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.Community.HouseList;
import java.util.Date;

/**
 *
 * @author ashikakalmady
 */
public class SurveyVolunteerWorkRequest extends WorkRequest {
    public HouseList assignedHouses;
    public Date assignedDate;
    
    public HouseList getAssignedHouses() {
        return assignedHouses;
    }

    public void setAssignedHouses(HouseList assignedHouses) {
        this.assignedHouses = assignedHouses;
    }

    public Date getAssignedDate() {
        return assignedDate;
    }

    public void setAssignedDate(Date assignedDate) {
        this.assignedDate = assignedDate;
    }
    
    
}
