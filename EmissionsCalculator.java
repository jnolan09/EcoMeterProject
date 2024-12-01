/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecometer.EcoMeter;

/**
 *
 * @author joshu
 */
public class EmissionsCalculator {
    //Emission factors for all types
    private static final double ENERGY_FACTOR = 0.5;
    private static final double DIET_FACTOR = 0.3;
    private static final double WASTE_FACTOR = 0.4;
    //Calculates emissions based on type and amount
    public double calculateEmissions(String type, double amount) {
        switch(type) {
            case "Energy Emissions":
                return amount * ENERGY_FACTOR;
            case "Diet Emissions":
                return amount * DIET_FACTOR;
            case "Waste Emissions":
                return amount * WASTE_FACTOR;
            default:
                return 0.0;
        }
    }
    
    
}
