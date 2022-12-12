/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Voluntary;

/**
 *
 * @author ashikakalmady
 */
public class SurveyReport {
     private boolean needHospitalization;
     private boolean isTreated;
private String policyID;

private String surveyStatus;
private String homeCareStatus;

    public String getSurveyStatus() {
        return surveyStatus;
    }

    public void setSurveyStatus(String surveyStatus) {
        this.surveyStatus = surveyStatus;
    }

    public String getHomeCareStatus() {
        return homeCareStatus;
    }

    public void setHomeCareStatus(String homeCareStatus) {
        this.homeCareStatus = homeCareStatus;
    }
    public String getPolicyID() {
        return policyID;
    }

    public void setPolicyID(String policyID) {
        this.policyID = policyID;
    }
    public boolean isIsTreated() {
        return isTreated;
    }

    public void setIsTreated(boolean isTreated) {
        this.isTreated = isTreated;
    }
     public boolean isNeedHospitalization() {
        return needHospitalization;
    }

    public void setNeedHospitalization(boolean needHospitalization) {
        this.needHospitalization = needHospitalization;
    }

    public String getSicknessType() {
        return sicknessType;
    }

    public void setSicknessType(String sicknessType) {
        this.sicknessType = sicknessType;
    }
   private String sicknessType;
   public SurveyReport() {
       
   }
}
