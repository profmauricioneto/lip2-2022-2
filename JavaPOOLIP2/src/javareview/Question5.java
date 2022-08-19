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
public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float serieHarm = 0;
        int n, i;
        System.out.print("Digite a repetição da serie: ");
        n = input.nextInt();
        
        for (i = 1; i <= n; i++) {
            serieHarm = serieHarm + (float)1/i;
        }
        System.out.println("Valor da serie harmonica: " + serieHarm);
    }
}
