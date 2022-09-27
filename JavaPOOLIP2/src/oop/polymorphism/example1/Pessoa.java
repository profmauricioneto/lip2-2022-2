/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.polymorphism.example1;

/**
 *
 * @author maumneto
 */
public class Pessoa {
    private String nome;
    
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public void imprimir() {
        System.out.println("Pessoa: " + nome);
    }
    
    public String getNome() {
        return nome;
    }
}
