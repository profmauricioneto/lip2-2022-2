/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenp1.questao7;

import java.util.Date;
/**
 *
 * @author maumneto
 */
public class Pedido {
    public int quantidade;
    public Date data;
    public float valor;
    public Cliente cliente;
    
    public Pedido(int quantidade, float valor, Cliente cliente) {
        this.quantidade = quantidade;
        this.valor = valor;
        data = new Date();
        data.getTime();
        this.cliente = cliente;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public float valorTotal() {
        float total = getQuantidade()*valor;
        return total;
    }
}
