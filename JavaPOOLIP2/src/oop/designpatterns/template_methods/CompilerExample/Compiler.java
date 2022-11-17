/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.designpatterns.template_methods.CompilerExample;

/**
 *
 * @author maumneto
 */
public abstract class Compiler {

    public Compiler() {
        this.SourceCode();
        this.compileToObject();
        this.execute();
    }
    public abstract void SourceCode();
    public abstract void compileToObject();
    public abstract void execute();
}
