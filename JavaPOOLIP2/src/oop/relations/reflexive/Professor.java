/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.relations.reflexive;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author maumneto
 */
public class Professor {
    public int id_professor;
    List<Course> courses;
    
    public Professor(int id_professor) {
        this.id_professor = id_professor;
        courses = new ArrayList<>();
    }
    
    public int getIdProfessor() {
        return id_professor; 
    }
    
    public void addCourse(Course course) {
        this.courses.add(course);
    }
}
