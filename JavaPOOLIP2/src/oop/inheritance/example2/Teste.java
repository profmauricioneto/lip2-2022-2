/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.inheritance.example2;

/**
 *
 * @author maumneto
 */
public class Teste {
    public static void main(String[] args) {
        PessoaFisica mauricio = new PessoaFisica(1, "mauricio");
        System.out.println(mauricio.getNome());
        System.out.println(mauricio.getId());
        mauricio.setCpf("1234567890");
        System.out.println(mauricio.getCpf());
    }
}
