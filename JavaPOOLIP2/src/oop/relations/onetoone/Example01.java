/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.relations.onetoone;

import oop.relations.onetoone.Professor;

/**
 *
 * @author maumneto
 */
public class Example01 {
    public static void main(String[] args) {
        Course lip2 = new Course("Linguagens de Programação II", 1);
        Professor profMauricio = new Professor("Mauricio Neto", 123);
        lip2.addProfessor(profMauricio);
        System.out.println("Course name: " + lip2.getNameCourse());
        System.out.println("Professor name: " + lip2.getNameProfessor());
    }
}
