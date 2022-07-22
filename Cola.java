/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colamenu;

import java.util.Scanner;

/**
 *
 * @author mafer
 */
public class Cola {
    // Se crean dos nodos en donde apunten al inicio y al final
    Nodo inicio, fin;

    // Se crea una variable para determinar el tamaño de la cola
    int tamaño;

    // Se crea un objeto para ingresar datos
    Scanner in = new Scanner(System.in);

    //Constructor predeterminado
    public Cola() 
    {
        // Ambos nodos apuntan a nulo
        inicio = fin = null;
        
        // El tamaño de la cola empieza en 0 
        tamaño = 0;
    }

    // Verificar si la cola esta vacia
    public boolean isEmpty() 
    {   
        // Retornar si el nodo es nulo 
        return inicio == null;
    }

    // Ingresar datos a la cola
    public void push(int valor) // iniciar con un valor booleano y uno entero
    {
        // Crear un nodo nuevo en donde almacene un dato nuevo
        Nodo nuevo = new Nodo();
        System.out.println("Ingrese dato:");
        valor = in.nextInt();
        // Almacena un nuevo dato en valor
        nuevo.dato = valor;
        
        //Si la cola esta vacia almacena el nuevo dato al "inicio" 
        if (isEmpty()) {
            inicio = nuevo;  
        } 
        //Si no esta vacia el final apunta a nulo 
        else 
        {
            fin.siguiente = nuevo;
        }
        //Si la cola esta vacia "fin" almacena el nuevo dato e incrementa el tamaño de la cola
        fin = nuevo;
        tamaño++;
    }
    

    public void pop() 
    {
        // Se crea un nodo actual en donde almacenará el dato
        Nodo actual = new Nodo();
        // El dato se posiciona al inicio
        actual = inicio;
        
        // Crear un ciclo en donde MIENTRAS que el dato actual sea diferente a nulo 
        while (actual != null) {
            // Se muestra el dato actual
            System.out.println(" [" + actual.dato + "]");
            // Pasa al siguiente dato actual y lo almacena
            actual = actual.siguiente;
        }
        //Se repite el ciclo
    }

    public int inicio() 
    {
        //Retornar al dato inicial
        return inicio.dato;
    }

    public int size() 
    {
        //Devolver un dato entero en donde indique el tamaño
        return tamaño;
    }
}
