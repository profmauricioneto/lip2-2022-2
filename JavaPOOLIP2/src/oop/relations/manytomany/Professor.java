/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.relations.manytomany;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maumneto
 */
public class Professor {
        public List<Course> courses;
    public String name_professor;
    public int id_professor;
    
    public Professor(String name_professor, int id_professor) {
        this.name_professor = name_professor;
        this.id_professor = id_professor;
        courses = new ArrayList<>();
    }
    
    public String getNameProfessor() {
        return name_professor;
    }
    
    public int getIdProfessor() {
        return id_professor;
    }
    
    public void addCourse(Course course) {
        this.courses.add(course);
    }
    
    public void getAllCourses() {
        System.out.println(this.name_professor + " Courses: ");
        for(Course c: courses) {
            System.out.println(c.getNameCourse());
        }
    }
}
