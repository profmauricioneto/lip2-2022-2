/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.designpatterns.singleton.database_singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author maumneto
 */
public class ConnectionSingleton {
    private static ConnectionSingleton instance;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/examplesingleton?useSSL=true";
    private String username = "root";
    private String password = "mauricio123";
    
    private ConnectionSingleton() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            System.out.println("Conexão falhou. Erro: " + e.getMessage());
        }
    }
    public Connection getConnection() {
        return connection;
    }
    public static ConnectionSingleton getInstance() throws SQLException {
        if (instance == null) {
            instance = new ConnectionSingleton();
            System.out.println("Conexão realizada com sucesso!");
        } else if (instance.getConnection().isClosed()) {
            instance = new ConnectionSingleton();
        }
        return instance;
    }
}
