/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.polymorphism.example2;

/**
 *
 * @author maumneto
 */
public class Property {
    private double price;
    protected String address;
    
    public Property(double price) {
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }
    
    public double getPriceProperty() {
        return price;
    }
}
