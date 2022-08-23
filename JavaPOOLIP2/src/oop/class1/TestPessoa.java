/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.class1;

/**
 *
 * @author maumneto
 */
public class TestPessoa {
    public static void main(String[] args) {
        Pessoa mauricio = new Pessoa();
        mauricio.altura = 1.61f;
        mauricio.anoNascimento = 1990;
        mauricio.nome = "Maurício";
        mauricio.mostrarDados();
        System.out.println("A idade de " + mauricio.nome + " é " + mauricio.calcularIdade());
    }
}
