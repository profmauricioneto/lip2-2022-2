/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.polymorphism.example1;

/**
 *
 * @author maumneto
 */
public class TestPolymorphism {
    public static void main(String[] args) {
        Pessoa f1 = new Funcionario("Mauricio");
        Funcionario f2 = (Funcionario) f1;
        f2.imprimir();
        System.out.println(f1);
        System.out.println(f2);
    }
}
