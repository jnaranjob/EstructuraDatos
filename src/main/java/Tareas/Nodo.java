/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas;

/**
 *
 * @author Usuario
 */
public class Nodo {
    
    public Tareas tarea;
    public Nodo siguiente;
    
    public Nodo(Tareas tarea)
    {
        this.tarea = tarea;
        siguiente = null;
    } 
}
