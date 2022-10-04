/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.interfaces.exercise3;

/**
 *
 * @author maumneto
 */
public class CheckingAccount implements BankingOperations, PersonalOperations {
    
    protected double amount;
    protected String name;
    protected int id;
    
    public CheckingAccount(String name) {
        this.name = name;
        this.amount = 0;
        this.id = 0;
    }
    
    public CheckingAccount(double amount, String name) {
        this.amount = amount;
        this.name = name;
        this.id = 0;
    }

    @Override
    public void deposit(double value) {
        this.amount += value; 
    }

    @Override
    public void withdraw(double value) {
        double total = value + 0.05*value;
        if (amount < total) {
            System.out.println("It not possible do this withdraw.");
        } else {
            amount = amount - value - 0.05*value;
        }
    }

    @Override
    public double balance() {
        return amount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }
    
}
