/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenp1.questao6;

import examenp1.questao6.Produto;

/**
 *
 * @author maumneto
 */
public class ProdutoTest {
    public static void main(String[] args) {
        Produto boneco = new Produto("Boneco", "Boneco generico", "001", 100);
        boneco.mostrarDadosProduto();
        System.out.println(boneco.calcularTotal(5));
    }
}
