/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Voluntary;

/**
 *
 * @author ashikakalmady
 */
public class VitalSigns {
   private double respiratoryRate;
   private double heartRate;
   private double temperature;
   private double BP;
   private double weight;
   private double height;
   
   
   public VitalSigns() {
       
   }
   
   public VitalSigns(double respiratoryRate, double heartRate, double temperature, double BP, double weight, double height) {
       this.respiratoryRate = respiratoryRate;
       this.heartRate = heartRate;
       this.weight = weight;
       this.BP = BP;
       this.height = height;
       this.temperature = temperature;
   }
   
   public double getRespiratoryRate() {
        return respiratoryRate;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRespiratoryRate(double respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public double getBP() {
        return BP;
    }

    public void setBP(double BP) {
        this.BP = BP;
    }
    
    
}

