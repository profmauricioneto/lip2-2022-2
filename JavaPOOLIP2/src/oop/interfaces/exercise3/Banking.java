/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.interfaces.exercise3;

/**
 *
 * @author maumneto
 */
public class Banking {
    public static void main(String[] args) {
        CheckingAccount mauricio_account = new CheckingAccount(1000, "mauricio");
        mauricio_account.deposit(5000);
        mauricio_account.withdraw(2500);
        System.out.println("Your balance: " + mauricio_account.balance());
        
        System.out.println("-----------------");
        
        SpecialCheckingAccount fulano_account = new SpecialCheckingAccount(1000, "fulano");
        fulano_account.deposit(5000);
        fulano_account.withdraw(2500);
        System.out.println("Your balance: " + fulano_account.balance());
    }
}
