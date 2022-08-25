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
public class Course {
    public Professor professor;
    public String name_course;
    public int id_course;
    
    public Course(String name_course, int id_course) {
        this.name_course = name_course;
        this.id_course = id_course;
    }
    
    public String getNameCourse() {
        return name_course;
    }
    
    public void addProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public String getNameProfessor() {
        return professor.name;
    }
    
}
