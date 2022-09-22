/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenp1.questao6;

/**
 *
 * @author maumneto
 */
public class Produto {
    public String nome;
    public String descricao;
    public String codigo;
    public float preco;
    
    public Produto(String nome, String descricao, String codigo, float preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.codigo = codigo;
        this.preco = preco;
    }
    
    public void mostrarDadosProduto(){
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);  
        System.out.println("Codigo: " + codigo);   
        System.out.println("Preco: " + preco);
    }
    
    public float calcularTotal(int quantidade) {
        float total = quantidade * preco;
        return total;
    }
}
