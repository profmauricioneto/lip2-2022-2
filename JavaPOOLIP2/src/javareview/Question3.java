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
public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float peso = 0, altura;
        String genero;
        System.out.print("Digite sua altura: \n");
        altura = in.nextFloat();
        System.out.print("Digite seu genero[h/m]: \n");
        genero = in.next();
        genero = genero.toLowerCase();
        in.close();
        switch(genero) {
            case "homem":
            case "h":
                peso = (float)(72.7*altura) - 58;
                break;
            case "mulher":
            case "m":
                peso = (float)(61.2*altura) - 44.7f;
                break;
            default:
                System.out.println("Não foi digitado genero válido.");
                break;
        }
        System.out.println("O peso ideal é: " + peso);
        
    }
}
