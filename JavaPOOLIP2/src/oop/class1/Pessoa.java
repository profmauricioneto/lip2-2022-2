/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.class1;

import java.util.Calendar;

/**
 *
 * @author maumneto
 */
public class Pessoa {
    String nome;
    int anoNascimento;
    float altura;
    
    void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.println("Altura: " + altura);
    }
    
    int calcularIdade() {
        int idade;
        Calendar calendar = Calendar.getInstance();
        int anoAtual = calendar.get(Calendar.YEAR);
        idade = anoAtual - anoNascimento;
        return idade;
    }
    
}
