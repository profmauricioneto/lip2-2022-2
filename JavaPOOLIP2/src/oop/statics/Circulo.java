/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.statics;

/**
 *
 * @author maumneto
 */
public class Circulo {
    double x;
    double y;
    double raio;
    public double area() {
        return 3.14*raio*raio;
    }
    
    public static void main(String[] args) {
        Circulo  c = new Circulo();
        c.raio = 5;
        double z = c.area();
        System.out.println(z);
    }
}
