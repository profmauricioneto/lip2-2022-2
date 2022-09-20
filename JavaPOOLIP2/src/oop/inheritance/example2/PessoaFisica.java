/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.inheritance.example2;

/**
 *
 * @author maumneto
 */
public class PessoaFisica extends Pessoa {
   private String cpf;
   
   public PessoaFisica(int id_pessoa_fisica, String nome) {
       super(id_pessoa_fisica);
       setNome(nome);
   }
   public void setCpf(String cpf) {
       this.cpf = cpf;
   }
   public String getCpf() {
       return cpf;
   }
}
