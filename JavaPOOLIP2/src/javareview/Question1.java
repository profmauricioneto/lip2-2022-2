/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javareview;

import java.util.Scanner;
/**
 *
 * @author maumneto
 */
public class Question1 {
    public static void main(String[] args) {
        double radiano, graus;
//        final double PI = 3.1415f;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor em Graus: ");
        graus = in.nextDouble();
        radiano = (graus*Math.PI)/180;
        System.out.println("Valor em Radianos: " + radiano);
    }
}
