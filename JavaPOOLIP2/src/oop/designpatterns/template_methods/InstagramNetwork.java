/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.designpatterns.template_methods;

/**
 *
 * @author maumneto
 */
public class InstagramNetwork extends SocialNetwork {

    public InstagramNetwork(String username, String password) {
        this.username = username;
        this.password = password;
    }
    @Override
    public boolean login(String username, String password) {
        System.out.println("Name: " + this.username);
        System.out.print("Password: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }
        System.out.println("\nLogin realizado com sucesso!");
        return true;
    }
    @Override
    public boolean sendData(byte[] data) {
        boolean message = true;
        if (message){
            System.out.println("Mensagem: " + new String(data) + " foi postada no instagram!");
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void logout(){
        System.out.println("Usuário: " + username + " foi desconectado do instagram!");
    }
}
