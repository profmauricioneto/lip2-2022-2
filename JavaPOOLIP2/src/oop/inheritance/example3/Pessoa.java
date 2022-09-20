/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.inheritance.example3;

/**
 *
 * @author maumneto
 */
public class Pessoa {
    private int codigo;
    protected String nome;
    
    public Pessoa(int codigo) {
        this.codigo = codigo;
    }
    
    public int getCodigo(){
        return codigo;
    }
    public String getNome() {
        return nome;
    }
}
