/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.inheritance.example3;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author maumneto
 */
public class Cliente extends Pessoa {
    private String email;
    public List<Venda> vendas;
    
    public Cliente(int codigo, String nome) {
        super(codigo);
        this.nome = nome;
        vendas = new ArrayList<>();
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void addVendaCliente(Venda venda) {
        this.vendas.add(venda);
    }
    public void showVendasCliente() {
        for(Venda v: vendas) {
            System.out.println(v.getCodigoVenda());
        }
    }
}
