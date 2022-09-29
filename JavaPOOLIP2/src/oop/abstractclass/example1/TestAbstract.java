/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.abstractclass.example1;

/**
 *
 * @author maumneto
 */
public class TestAbstract {
    public static void main(String[] args) {
        Product he_man = new Toy("Masters of Universe", 500);
        Product square_ball = new Ball("Square Ball", 300);
        he_man.show_info();
        he_man.update("He-man", 300);
        he_man.show_info();
    }
}
