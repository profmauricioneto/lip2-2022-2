/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.inheritance.example3;

import java.util.Date;
/**
 *
 * @author maumneto
 */
public class Venda {
    private int codigo_venda;
    public Date data;
    public Cliente cliente;
    public Funcionario funcionario;
    
    public Venda(int codigo_venda, Funcionario funcionario, Cliente cliente) {
        this.codigo_venda = codigo_venda;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }
    public int getCodigoVenda() {
        return codigo_venda;
    }
}
