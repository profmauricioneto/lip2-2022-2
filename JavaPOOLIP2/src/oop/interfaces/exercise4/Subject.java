/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.interfaces.exercise4;

import java.util.*;
/**
 *
 * @author maumneto
 */
public class Subject {
    public List<Observer> observers = new ArrayList<>();
    
    public boolean isEven(int value) {
        boolean flag = false;
        if (value % 2 == 0) {
            flag = true;
        }
        return flag;
    }
    
    public void attach(Observer observer) {
        observers.add(observer);
    }
    
    public void dettach(Observer observer) {
        observers.remove(observer);
    }
    
    public void notifyAllAttaches() {
        for (Observer observer: observers) {
            observer.update();
        }
    }
}
