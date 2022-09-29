/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.abstractclass.example2;

/**
 *
 * @author maumneto
 */
public class TestExample {
    public static void main(String[] args) {
        Employee dev = new Developer();
        Employee manager = new Manager();
        dev.setSalary(6000);
        dev.increaseSalary();
        manager.setSalary(6000);
        manager.increaseSalary();
    }
}
