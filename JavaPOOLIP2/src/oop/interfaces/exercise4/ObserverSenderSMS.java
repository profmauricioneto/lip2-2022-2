/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.interfaces.exercise4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maumneto
 */
public class ObserverSenderSMS extends Observer {
    private List<String> messages = new ArrayList<>();
    
    public ObserverSenderSMS(Subject subject) {
        subject.attach(this);
    }
    
    public void addSMS(String sms) {
        messages.add(sms);
    }
    
    public void showSMS() {
        for(String sms: messages) {
            System.out.println(sms);
        }
    }
    @Override
    public void update() {
        System.out.println("A wild event appears!");
        System.out.println("Sending sms!");
        showSMS();
    }
    
}
