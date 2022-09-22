/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenp1.questao7;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author maumneto
 */
public class Cliente {
    public String cpf;
    public String nome;
    public String telefone;
    public List<Pedido> pedidos;
    
    public Cliente(String cpf, String nome, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        pedidos = new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getTelefone() {
        return telefone;
    }
}
