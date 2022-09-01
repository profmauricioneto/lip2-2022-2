/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.relations.reflexive;

/**
 *
 * @author maumneto
 */
public class TestReflexiveAssociation {
    public static void main(String[] args) {
        Professor mauricio = new Professor(1);
        Course lip1 = new Course(123, "LIP1");
        Course lip2 = new Course(456, "LIP2");
        Course algoritmos = new Course(789, "ALGO");
        Course prog_web = new Course(987, "PROGWEB");
        Course sis_dist = new Course(654, "SIS_DIST");
        
        lip2.addCourseWithPreRequire(lip1);
        lip2.addCourseWithPreRequire(algoritmos);
        lip2.addCourseAsPreRequire(prog_web);
        lip2.addCourseAsPreRequire(sis_dist);
        
        System.out.println("With Prerequire Course: ");
        lip2.showAllCoursesWithPreRequire();
        
        System.out.println("As Prerequire Course: ");
        lip2.showAllCoursesAsPreRequire();
    }
}
