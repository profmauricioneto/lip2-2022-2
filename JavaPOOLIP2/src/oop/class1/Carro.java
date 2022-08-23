/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.class1;

/**
 *
 * @author maumneto
 */
public class Carro {
    int qtdPortas;
    int qtdPneus;
    String cor;
    Carro() {
        System.out.println("Um carro foi instanciado...");
    }
    void acelerar(){
        System.out.println("Acelerando...");
    }
    void frear(){
        System.out.println("Freando...");
    }
}
