/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenp1.questao8;

/**
 *
 * @author maumneto
 */
public class Disciplina {
    public String nome;
    public String codigo;
    public int cargaHoraria;
    public Professor professor;
    
    public Disciplina(String nome, String codigo, int cargaHoraria) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public String getNomeProfessor() {
        return professor.getNomeProfessor();
    }
    
    public void adicionarProfessor(Professor professor) {
        this.professor = professor;
    }
}
