/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.interfaces.exercise3;

/**
 *
 * @author maumneto
 */
public class SpecialCheckingAccount extends CheckingAccount {

    public SpecialCheckingAccount(String name) {
        super(name);
    }
    public SpecialCheckingAccount(double amount, String name) {
        super(amount, name);
    }
    @Override
    public void withdraw(double value) {
        double total = value + 0.01*value;
        if (amount < total) {
            System.out.println("It not possible do this withdraw.");
        } else {
            amount = amount - value - 0.01*value;
        }
    }
    
}
