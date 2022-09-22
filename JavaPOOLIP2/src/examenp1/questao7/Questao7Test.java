/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenp1.questao7;

/**
 *
 * @author maumneto
 */
public class Questao7Test {
    public static void main(String[] args) {
        Cliente mauricio = new Cliente("12345678", "mauricio", "8511223344");
        Pedido ifood = new Pedido(4, 100, mauricio);
        
        System.out.println(ifood.valorTotal());
    }
}
