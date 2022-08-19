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
public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float nota1, nota2;
        System.out.println("Digite a NP1: ");
        nota1 = in.nextFloat();
        System.out.println("Digite a NP2: ");
        nota2 = in.nextFloat();
        float media;
        media = (nota1 + nota2)/2;
        System.out.println("Media: " + media);
        if (media >= 7.0) {
            System.out.println("Aprovado!");
        } else {
            if (media < 4.0) {
                System.out.println("Reprovado!");
            } else {
                System.out.println("Esta final!");
                float notaFinal, mediaFinal;
                System.out.println("Digite a Nota Final: ");
                notaFinal = in.nextFloat();
                mediaFinal = (media + notaFinal)/2;
                System.out.println("Media Final: " + mediaFinal);
                if(mediaFinal >= 5.0) {
                    System.out.println("Aprovado por Pouco!");
                } else {
                    System.out.println("Reprovou!");
                }
            }
        }
        
    }
}
