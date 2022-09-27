/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.polymorphism.example2;

/**
 *
 * @author maumneto
 */
public class NewProperty extends Property {
    private double additional;

    public NewProperty(double price, double additional) {
        super(price);
        this.additional = additional;
    }
    
    public double getAdditional() {
        return additional;
    }
    
    public double getValueNewProperty() {
        return getPrice() + getAdditional();
    }

    @Override
    public double getPriceProperty() {
        return getPrice() + getAdditional();
    }
    
    
}
