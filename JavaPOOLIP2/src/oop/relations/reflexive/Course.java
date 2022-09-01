/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.relations.reflexive;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maumneto
 */
public class Course {
    public int id_course;
    public String name_course;
    public Professor professor;
    public List<Course> course_as_prerequire;
    public List<Course> course_with_prerequire;
    
    public Course(int id_course, String name_course) {
        this.id_course = id_course;
        this.name_course = name_course;
        course_as_prerequire = new ArrayList<>();
        course_with_prerequire = new ArrayList<>();
    }
    
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public void addCourseAsPreRequire(Course course) {
        this.course_as_prerequire.add(course);
    }
    
    public void addCourseWithPreRequire(Course course) {
        this.course_with_prerequire.add(course);
    }
    
    public String getNameCourse() {
        return name_course;
    }
    
    public void showAllCoursesWithPreRequire() {
        for(Course c: course_with_prerequire) {
            System.out.println(c.getNameCourse());
        }
    }
    
        public void showAllCoursesAsPreRequire() {
        for(Course c: course_as_prerequire) {
            System.out.println(c.getNameCourse());
        }
    }
    
}
