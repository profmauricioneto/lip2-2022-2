/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.statics;

/**
 *
 * @author maumneto
 */
public class Usuario {
    private static int id = 0;

    public Usuario() {
        incrementar();
    }
    
    private static void incrementar() {
        id++;
    }
    public int getId(){
        return id;
    }
    
}
