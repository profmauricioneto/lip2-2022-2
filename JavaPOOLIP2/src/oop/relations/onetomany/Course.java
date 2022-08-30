/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.relations.onetomany;

/**
 *
 * @author maumneto
 */
public class Course {
    public Professor professor;
    public String name_course;
    public int id_course;

    public Course(String name_course, int id_course, Professor professor) {
        this.name_course = name_course;
        this.id_course = id_course;
        this.professor = professor;
    }
    
    public String getNameCourse() {
        return name_course;
    }
    
    public int getIdCourse() {
        return id_course;
    }
}
