/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoestructuradatos;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Tareas {
    
    String nombre;
    String id;
     
    public Tareas(){
    }
    
    public Tareas(String id, String nombre){
        
        this.nombre = nombre;
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }    
}
