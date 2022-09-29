/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.abstractclass.example2;

/**
 *
 * @author maumneto
 */
public class Developer extends Employee {
    public Developer() {}

    @Override
    public void increaseSalary() {
        salary = salary + salary*0.4;
        System.out.println("Developer Salary: " + salary);
    }
    
    
}
