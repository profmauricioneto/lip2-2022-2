/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.interfaces.exercise4;

import java.util.Timer;

/**
 *
 * @author maumneto
 */
public class TestObserver {
    public static void main(String[] args) {
        Subject subject = new Subject();
        
        ObserverSenderEmail observer1 = new ObserverSenderEmail(subject);
        ObserverSenderSMS observer2 = new ObserverSenderSMS(subject);
        
        observer1.addEmail("mauricio.moreira@unichristus.edu.br");
        observer1.addEmail("fulano@unichristus.edu.br");
        
        observer2.addSMS("08512345678");
        observer2.addSMS("08598765432");
        
        for(int i = 0; i < 5; i++) {
            if (subject.isEven(i)) {
                subject.notifyAllAttaches();
                System.out.println("==============");
            }
        }
     }
}
