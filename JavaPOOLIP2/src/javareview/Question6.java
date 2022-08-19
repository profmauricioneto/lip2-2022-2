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
public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int diagonal = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.printf("Matriz [%d][%d]: ", i+1,j+1);
                matriz[i][j] = input.nextInt();
                if (i == j) {
                    diagonal = diagonal + matriz[i][j];
                }
            }
        }
        System.out.println("O valor do somatório da diagonal principal é: " + diagonal);
    }
}
