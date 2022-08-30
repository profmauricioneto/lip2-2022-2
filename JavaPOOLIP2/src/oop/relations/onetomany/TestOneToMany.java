/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.relations.onetomany;

/**
 *
 * @author maumneto
 */
public class TestOneToMany {
    public static void main(String[] args) {
        Professor mauricio = new Professor("Mauricio Neto", 001);
        Professor fulano = new Professor("Fulano da Silva", 002);
        Course poo = new Course("Oriented Object Programming", 123, mauricio);
        Course lip1 = new Course("Programming Language I", 345, mauricio);
        Course datavis = new Course("Data Visualization", 678, mauricio);

        Course algo = new Course("Algorithm", 321, fulano);
        Course database = new Course("Database I", 543, fulano);
        
        mauricio.addCourse(poo);
        mauricio.addCourse(lip1);
        mauricio.addCourse(datavis);
        
        fulano.addCourse(database);
        fulano.addCourse(algo);
        
        mauricio.getAllCourses();
        
        System.out.println("------------");
        fulano.getAllCourses();
    }
}
