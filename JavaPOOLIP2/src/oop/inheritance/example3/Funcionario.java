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
public class Funcionario extends Pessoa {
    protected double salario;
    public List<Venda> vendas;
    
    public Funcionario(int codigo, String nome) {
        super(codigo);
        this.nome = nome;
        vendas = new ArrayList<>();
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
    public void addVendaFuncionario(Venda venda) {
        this.vendas.add(venda);
    } 
    public void showVendasFuncionario() {
        for(Venda v: vendas) {
            System.out.println(v.getCodigoVenda());
        }
    }
}
