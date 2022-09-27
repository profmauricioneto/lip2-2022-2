/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.polymorphism.example2;

/**
 *
 * @author maumneto
 */
public class TestExample2 {
    public static void main(String[] args) {
//        Property p1 = new NewProperty(200000, 10000);
        NewProperty p2 = new NewPropertyRealtor(200000, 10000, 0.1);
        System.out.print(p2.getValueNewProperty());
    }
}
