/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.abstractclass.example1;

/**
 *
 * @author maumneto
 */
public class Toy extends Product {
    
    public Toy(String name, double price) {
    super(name, price);
    }

    @Override
    public void update(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void show_info() {
        System.out.println("Toy name: " + name);
        System.out.println("Toy price: " + price);
    }
    
}
