/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.inheritance.example1;

/**
 *
 * @author maumneto
 */
public class SuperClasse {
    
    public String atributo1;
    public int atributo2;

    public SuperClasse() {
    }
    
    public SuperClasse(String atributo1, int atributo2) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }
    
    public void metodo1() {
        System.out.println("Chamando METODO1 da SUPERCLASSE!");
    }
    public void metodo2() {
        System.out.println("Chamando METODO2 da SUPERCLASSE!");

    }
}
