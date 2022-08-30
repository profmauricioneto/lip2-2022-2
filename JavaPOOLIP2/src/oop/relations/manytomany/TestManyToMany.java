/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.relations.manytomany;

/**
 *
 * @author maumneto
 */
public class TestManyToMany {
    public static void main(String[] args) {
        // criando os objetos das disciplinas
        Course poo = new Course("Oriented Object Programming", 123);
        Course lip1 = new Course("Programming Language I", 345);
        Course datavis = new Course("Data Visualization", 678);
        // criando os objetos dos professores
        Professor mauricio = new Professor("Mauricio Neto", 001);
        Professor fulano = new Professor("Fulano da Silva", 002);
        Professor cicrano = new Professor("Cicrano da Silva", 003);
        
        poo.addProfessor(mauricio);
        
        lip1.addProfessor(mauricio);
        lip1.addProfessor(fulano);
        
        datavis.addProfessor(mauricio);
        datavis.addProfessor(fulano);
        datavis.addProfessor(cicrano);
       
        mauricio.addCourse(poo);
        mauricio.addCourse(lip1);
        mauricio.addCourse(datavis);

       
        fulano.addCourse(lip1);
        fulano.addCourse(datavis);
        
        cicrano.addCourse(datavis);
        
        System.out.println("--------");
        mauricio.getAllCourses();
        fulano.getAllCourses();
        cicrano.getAllCourses();
        
        System.out.println("--------");
        poo.showProfessors();
        lip1.showProfessors();
        datavis.showProfessors();
    }
}
