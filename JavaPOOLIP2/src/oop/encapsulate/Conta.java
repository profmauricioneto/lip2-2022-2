/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.encapsulate;

/**
 *
 * @author maumneto
 */
public class Conta {
    private double saldo;
    
    public void depositar(double valor) {
        saldo = saldo + valor;
    }
    public void sacar(double valor) {
        if (saldo - valor > 0) {
            saldo = saldo - valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
        
    }
    public double consultar() {
        return saldo;
    }
}
