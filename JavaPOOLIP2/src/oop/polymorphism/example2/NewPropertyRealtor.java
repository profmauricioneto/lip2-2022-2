/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.polymorphism.example2;

/**
 *
 * @author maumneto
 */
public class NewPropertyRealtor extends NewProperty {
    private double percentage;

    public NewPropertyRealtor(double price, double additional, double percentage) {
        super(price, additional);
        this.percentage = percentage;
    }
    
    public double getPercentage() {
        return percentage;
    }

    @Override
    public double getValueNewProperty() {
        double percentageValue = getPrice()*getPercentage();
        return getPrice() + getAdditional() + percentageValue;
    }

    @Override
    public double getPriceProperty() {
        double percentageValue = getPrice()*getPercentage();
        return getPrice() + getAdditional() + percentageValue;
    }
    
    
    
    
}
