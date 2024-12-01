/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecometer.EcoMeter;

import java.time.LocalDate;

/**
 *
 * @author joshu
 */
//Stores data for records
public class EmissionsRecord {
    private String type;
    private double amount;
    private double emissions;
    private String date;
    //Creates new emission record with date
    public EmissionsRecord(String type, double amount, double emissions) {
        this.type = type;
        this.amount = amount;
        this.emissions = emissions;
        this.date = LocalDate.now().toString();
    }
    
    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getEmissions() {
        return emissions;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "EmissionsRecord{" + "type=" + type + ", amount=" + amount + ", emissions=" + emissions + ", date=" + date + '}';
    }
    
    
}
