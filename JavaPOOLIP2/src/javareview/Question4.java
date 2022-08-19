/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javareview;

/**
 *
 * @author maumneto
 */
public class Question4 {
    public static void main(String[] args) {
        int somaquad = 0, quadsoma = 0, cont = 1;
        while(cont <= 10) {
            somaquad = somaquad + cont*cont;
            quadsoma = quadsoma + cont;
            cont++;
        }
        quadsoma = quadsoma*quadsoma;
        System.out.println("Soma dos Quadrados: " + somaquad);
        System.out.println("Quadrado da Soma: " + quadsoma);
        int diff;
        diff = quadsoma - somaquad;
        System.out.println("Diferença é: " + diff);
    }
}
