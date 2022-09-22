/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenp1.questao8;

/**
 *
 * @author maumneto
 */
public class Questao8Test {
    public static void main(String[] args) {
        Professor mauricio = new Professor("Mauricio Neto", "001");
        Disciplina lip1 = new Disciplina("Linguagens I", "101", 80);
        Disciplina lip2 = new Disciplina("Linguagens II", "102", 80);
        
        lip1.adicionarProfessor(mauricio);
        lip2.adicionarProfessor(mauricio);
        
        mauricio.adicionarDisciplina(lip1);
        mauricio.adicionarDisciplina(lip2);
        
        mauricio.mostrarDisciplinasMinistradas();
    }
}
