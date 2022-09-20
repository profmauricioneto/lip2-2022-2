/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.inheritance.example2;

/**
 *
 * @author maumneto
 */
public class Pessoa {
    private int id_pessoa;
    protected String nome;
    public Departamento departamento;
    
    public Pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }
    protected int getId() {
        return id_pessoa;
    }
    protected String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
