/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenp1.questao8;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author maumneto
 */
public class Professor {
    public String nome;
    public String id;
    public List<Disciplina> disciplinas;
    
    public Professor(String nome, String id) {
        this.nome = nome;
        this.id = id;
        disciplinas = new ArrayList<>();
    }
    
    public String getId() {
        return id;
    }
    
    public String getNomeProfessor() {
        return nome;
    }
    
    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }
    
    public void mostrarDisciplinasMinistradas() {
        for (Disciplina d: disciplinas) {
            System.out.println(d.nome);
        }
    }
}
