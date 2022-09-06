/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.inheritance.example1;

/**
 *
 * @author maumneto
 */
public class Test {
    public static void main(String[] args) {
        SubClasse subclasse = new SubClasse("Hello", 123, "World!");
        subclasse.mostrarAtributos();
        
        subclasse.metodo1();
        subclasse.metodo2();
        subclasse.metodo3();
//        subclasse.metodo4();
    }
}
