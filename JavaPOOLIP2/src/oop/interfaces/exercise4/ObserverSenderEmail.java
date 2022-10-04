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
public class ObserverSenderEmail extends Observer {
    private List<String> emails = new ArrayList<>();
    
    public ObserverSenderEmail(Subject subject) {
        subject.attach(this);
    }
    
    public void addEmail(String email) {
        emails.add(email);
    }
    
    public void showEmails() {
        for(String email: emails) {
            System.out.println(email);
        }
    }
    
    @Override
    public void update() {
        System.out.println("A wild event appears!");
        System.out.println("Sending emails!");
        showEmails();
    }
    
}
