/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.designpatterns.singleton.database_singleton;

import java.sql.SQLException;

/**
 *
 * @author maumneto
 */
public class TestConnectionDatabase {
    public static void main(String[] args) {
        ConnectionSingleton conn;
        ConnectionSingleton conn2;
        try {
            conn = ConnectionSingleton.getInstance();
            System.out.println(conn);
            conn2 = ConnectionSingleton.getInstance();
            System.out.println(conn2);
            if (conn == conn2) {
                System.out.println("Instancias iguais!");
            } else {
                System.out.println("Instancias não iguais!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
