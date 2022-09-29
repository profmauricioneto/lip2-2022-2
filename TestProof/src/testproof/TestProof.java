/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testproof;
import java.util.Scanner;
public class TestProof{
   public static int fato(int fat) {
     int cont = fat-1;
     int resul=fat;
     while(cont>0){
     resul = resul*cont;
     cont--;
     }
     return resul;
    }







   
    public static void main(String[] args) {
        int fat;
        int resul;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite fatorial: \n");
        fat = sc.nextInt();
        
        // calculating imc and ideal weight based on the input data
        
        resul = fato(fat);
        System.out.println("Fatorial eh: " + resul);
        
    }
}