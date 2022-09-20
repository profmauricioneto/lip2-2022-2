/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.inheritance.example2;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author maumneto
 */
public class Departamento {
    private int id_departamento;
    public String descricao;
    public List<Pessoa> pessoas;
    
    public Departamento(int id_departamento) {
        this.id_departamento = id_departamento;
        pessoas = new ArrayList<>();
    }
    public int getId() {
        return id_departamento;
    }
}
