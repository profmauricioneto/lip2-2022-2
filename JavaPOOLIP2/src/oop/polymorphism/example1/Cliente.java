/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.polymorphism.example1;

/**
 *
 * @author maumneto
 */
public class Cliente extends Pessoa {
    private int cpf;
    
    public Cliente(String nome) {
        super(nome);
    }
    
    public int getCpf() {
        return cpf;
    }
    
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public void imprimir() {
        System.out.println("Cliente: " + getNome());
    }
}
