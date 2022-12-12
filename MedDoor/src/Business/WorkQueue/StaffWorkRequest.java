/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.Community.Tenant;
import Business.Patient.Patient;
import java.util.Date;

/**
 *
 * @author Gursheen Kaur
 */


public class StaffWorkRequest extends WorkRequest {
   public Tenant patient;
   public String doctorAssigned;
   public String labStatus;
   public  String sugar;
   public String creatinine;
   public String prescription;
   public String labReport;
   public String prescriptionObj;
   public int medicinesPrice;
 
    
    public Tenant getPatient() {
        return patient;
    }

    public void setPatient(Tenant patient) {
        this.patient = patient;
    }

    public String getDoctorAssigned() {
        return doctorAssigned;
    }

    public void setDoctorAssigned(String doctorAssigned) {
        this.doctorAssigned = doctorAssigned;
    }

    public String getLabStatus() {
        return labStatus;
    }

    public void setLabStatus(String labStatus) {
        this.labStatus = labStatus;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getCreatinine() {
        return creatinine;
    }

    public void setCreatinine(String creatinine) {
        this.creatinine = creatinine;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getLabReport() {
        return labReport;
    }

    public void setLabReport(String labReport) {
        this.labReport = labReport;
    }

    public String getPrescriptionObj() {
        return prescriptionObj;
    }

    public void setPrescriptionObj(String prescriptionObj) {
        this.prescriptionObj = prescriptionObj;
    }

    public int getMedicinesPrice() {
        return medicinesPrice;
    }

    public void setMedicinesPrice(int medicinesPrice) {
        this.medicinesPrice = medicinesPrice;
    }
    
    
    

    
}
