/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.designpatterns.singleton;

/**
 *
 * @author maumneto
 */
public class TestSingleton {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getIntance();
        Singleton instance2 = Singleton.getIntance();
        if (instance1 == instance2) {
            System.out.println("same instance");
        } else {
            System.out.println("Error in singleton");
        }
        System.out.println(instance1);
        System.out.println(instance2);
    }
}
