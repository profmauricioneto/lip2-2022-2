/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.designpatterns.template_methods.CompilerExample;

import java.util.Scanner;

/**
 *
 * @author maumneto
 */
public class TestTemplateMethod {
    public static void main(String[] args) {
        String language;
        Compiler compiler;
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your compile: ");
        language = scan.next().toLowerCase();
        if (language.equals("ios")) {
            compiler = new IOSCompiler();
        } else if (language.equals("android")) {
            compiler = new AndroidCompiler();
        } else if (language.equals("cpp")) {
            compiler = new CppCompile();
        } else {
            System.err.println("Compiler not found!");
        }
        scan.close();
    }
}
