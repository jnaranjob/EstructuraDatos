/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoestructuradatos;

/**
 *
 * @author Usuario
 */
class Nodo {
    Tareas tarea;
    Nodo siguiente;

    public Nodo(Tareas tarea) {
        this.tarea = tarea;
        this.siguiente = null;
    }
}

public class ColaTareas {
    private Nodo frente;
    private Nodo fin;
    
   public ColaTareas() {
        this.frente = null;
        this.fin = null;
    }

    public boolean isEmpty() {
        return (frente == null);
    }

    public void insertar(Tareas tarea) {
        Nodo nuevoNodo = new Nodo(tarea);
        if (isEmpty()) {
            frente = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.siguiente = nuevoNodo;
            fin = nuevoNodo;
        }
    }

    public Object eliminar() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        Object datoEliminado = frente.tarea;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null;
        }
        return datoEliminado;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return frente.tarea;
    }

    public void mostrarElementos() {
        if (isEmpty()) {
            System.out.println("La cola está vacía");
            return;
        }

        System.out.print("Elementos de la cola: ");
        Nodo actual = frente;
        while (actual != null) {
            System.out.print(actual.tarea.getNombre() + " \n");
            actual = actual.siguiente;
        }
        System.out.println();
    }
    
    public int size() {
        int count = 0;
        Nodo actual = frente;
        while (actual != null) {
            count++;
            actual = actual.siguiente;
        }
        return count;
    }
}
