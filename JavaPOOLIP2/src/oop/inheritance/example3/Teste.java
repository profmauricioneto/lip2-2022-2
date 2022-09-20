/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.inheritance.example3;

/**
 *
 * @author maumneto
 */
public class Teste {
    public static void main(String[] args) {
        Cliente fulano = new Cliente(01, "fulano de tal");
        Funcionario cicrano = new Funcionario(123, "cicrano de tal");
        Venda brinquedo = new Venda(321, cicrano, fulano);
        fulano.addVendaCliente(brinquedo);
        cicrano.addVendaFuncionario(brinquedo);
        
        fulano.showVendasCliente();
        cicrano.showVendasFuncionario();
    }
}
