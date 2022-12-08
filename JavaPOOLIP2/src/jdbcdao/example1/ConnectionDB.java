/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcdap.example1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author mauricio.moreira
 */
public class ConnectionDB {
//    private static ConnectionDB instance;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/jdbcdaoexample?useSSL=true";
    private String username = "root";
    private String password = "mauricio123";
    
    ConnectionDB() throws SQLException {
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
}
