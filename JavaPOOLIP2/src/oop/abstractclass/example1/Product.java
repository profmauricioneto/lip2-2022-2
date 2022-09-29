/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.abstractclass.example1;

/**
 *
 * @author maumneto
 */
public abstract class Product {
    public String name;
    public double price;
    public int id_product;
    
    public Product(String name, double price) {
        this.price = price;
        this.name = name;
        id_product = 0;
    }
    
    public int getId() {
        return id_product;
    }
    
    public void setId(int id_product) {
        this.id_product = id_product;
    }
    
    public abstract void update(String name, double price);
    
    public abstract void show_info();
    
}
