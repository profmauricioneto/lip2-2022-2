/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.designpatterns.singleton;

/**
 *
 * @author maumneto
 */
public class Singleton {
    private static Singleton instance = null;
    private Singleton() {}
    public static synchronized Singleton getIntance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
