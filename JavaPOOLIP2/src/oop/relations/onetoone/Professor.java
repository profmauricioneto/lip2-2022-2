/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.relations.onetoone;

/**
 *
 * @author maumneto
 */
public class Professor {
    public Course course;
    public String name;
    public int id_professor;
    
    public Professor(String name, int id_professor) {
        this.name = name;
        this.id_professor = id_professor;
    }
}
