/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ColaTareas {
    
    //FIFO - First in - First Out = Primero en ingresar, primero en salir
    Nodo frente;
    Nodo finalCola;
    
    public ColaTareas()
    {
    
        frente = null;
        finalCola = null;
    }

    //Push
    public void push(Tareas Dato)
    {
        Nodo nodoNuevo = new Nodo(Dato);
        
        if (esVacia()) {
            
            frente = nodoNuevo;
            finalCola = nodoNuevo;
        }else
        {
            finalCola.siguiente = nodoNuevo;
            finalCola = nodoNuevo; 
        } 
        JOptionPane.showMessageDialog(null, "Se agrego la tarea exitosamente.");
    }
    
    //Pop
    public void pop()
    {
        if (esVacia()) {
            
            System.out.println("La cola esta vacia.");
            
        }else
        {
            System.out.println("El elemento del frente es: "+frente.tarea+" . Nodo eliminado.");
            frente = frente.siguiente;
            if (frente == null) {
                finalCola = null;
            }
        }
    }
    
    //Validar Si cola esta vacia
    public boolean esVacia()
    {
        return frente == null;
    }
    
    //Tamano de la cola
    
    public int tamano()
    {
        int contador = 0;
        Nodo temporal = frente;
        while(temporal != null)
        {
            contador++;
            temporal = temporal.siguiente;
        }
        return contador;
    }    

    public void imprimirCola() {
        if (esVacia()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("Elementos de la cola:");
            Nodo temporal = frente;
            while (temporal != null) {
                System.out.println(temporal.tarea.getNombre());
                System.out.println(temporal.tarea.getId() + "\n");
                temporal = temporal.siguiente;
            }
        }
    }
}
