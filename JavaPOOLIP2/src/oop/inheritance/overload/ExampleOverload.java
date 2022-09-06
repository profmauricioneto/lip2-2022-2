/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.inheritance.overload;

/**
 *
 * @author maumneto
 */
public class ExampleOverload {
    public int sum(int a, int b) {
        return a + b;
    }
    
    public int sum(int... args) {
        int res = 0;
        for(int i: args) {
            res += i;
        }
        return res;
    }
    
    public static void main(String[] args) {
        ExampleOverload overload = new ExampleOverload();
        System.out.println(overload.sum(3, 4));
        System.out.println(overload.sum(1,2,3,4,5,6));
      
    }
}
