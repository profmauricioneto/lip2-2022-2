/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.class1;

/**
 *
 * @author maumneto
 */
public class Principal {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.qtdPneus = 4;
        c.qtdPortas = 4;
        c.cor = "Preto";
        c.acelerar();
        c.frear();
        System.out.println("O object c possui " + c.qtdPneus + " pneus e " + c.qtdPortas + " portas");
    }
}
