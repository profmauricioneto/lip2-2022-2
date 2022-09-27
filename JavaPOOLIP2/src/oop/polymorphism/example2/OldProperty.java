/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.polymorphism.example2;

/**
 *
 * @author maumneto
 */
public class OldProperty extends Property {
    private double discount;

    public OldProperty(double price, double discount) {
        super(price);
        this.discount = discount;
    }
    
    public double getDiscount() {
        return discount;
    }
    
    public double getValueOldProperty() {
        return getPrice() - getDiscount();
    }

    @Override
    public double getPriceProperty() {
        return getPrice() - getDiscount();
    }
    
    
}
