/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.inheritance.example1;

/**
 *
 * @author maumneto
 */
public class SubClasse extends SuperClasse {
    public String atributo3;
    
    public SubClasse() {
    }
    
    public SubClasse(String atributo1, int atributo2, String atributo3) {
        super(atributo1, atributo2);
        this.atributo3 = atributo3;
    }
    
    @Override
    public void metodo1() {
        System.out.println("Chamando METODO1 da SUBCLASSE!");
    }
    
    public void metodo3() {
        System.out.println("Chamando METOD32 da SUBCLASSE!");
    }
    
    public void mostrarAtributos() {
        System.out.println("Atributo 1: " + atributo1);
        System.out.println("Atributo 2: " + atributo2);
        System.out.println("Atributo 3: " + atributo3);
    }
}
