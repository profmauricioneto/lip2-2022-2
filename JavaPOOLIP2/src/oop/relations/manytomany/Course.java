
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.relations.manytomany;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author maumneto
 */
public class Course {
    public List<Professor> professors;
    public String name_course;
    public int id_course;

    public Course(String name_course, int id_course) {
        this.name_course = name_course;
        this.id_course = id_course;
        professors = new ArrayList<>();
    }
    
    public String getNameCourse() {
        return name_course;
    }
    
    public int getIdCourse() {
        return id_course;
    }
    
    public void addProfessor(Professor professor){
        this.professors.add(professor);
    }
    
    public void showProfessors() {
        System.out.println(this.getNameCourse() + " professors: ");
        for(Professor p: professors) {
            System.out.println(p.getNameProfessor());
        }
    }
}

