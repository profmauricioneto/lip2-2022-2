/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.designpatterns.template_methods.CompilerExample;

/**
 *
 * @author maumneto
 */
public class AndroidCompiler extends Compiler {

    public AndroidCompiler() {
        super();
    }
    
    @Override
    public void SourceCode() {
        System.out.println("Getting the Java code...");
    }

    @Override
    public void compileToObject() {
        System.out.println("Generate the intermediary code...");
    }

    @Override
    public void execute() {
        System.out.println("Execute Android application!");
    }   
}
