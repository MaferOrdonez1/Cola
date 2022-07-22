/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colamenu;

import java.util.Scanner;

/**
 *
 * @author mafer
 */
public class ColaMenu {

    /* Crear un objeto en donde el usuario ingrese el numero de 
    opcion en el menu */
    Scanner in = new Scanner(System.in);
    
    //Crear una nueva cola
    Cola cola = new Cola();
    
    public static void main(String[] args) {
       //Crear un objeto y mandar a llamar al menu
        ColaMenu mostrarCola = new ColaMenu();
        mostrarCola.menu();
    }
    public void menu() 
    {
        boolean salir = false;
        int opcion;
        
        //Mientras que salir sea verdadero
        while (!salir) {
            
            //Mostrar opciones
            System.out.println("1. Agregar ");
            System.out.println("2. Mostrar ");
            System.out.println("3. Esta vacía? ");
            System.out.println("4. Quien esta al final");
            System.out.println("5. Tamaño ");
            System.out.println("6. exit ");
            System.out.println("Escribe una de las opciones:");
            // Seleccioner el numero de opcion
            opcion = in.nextInt();

            /* Si el usuario selecciona una de las opciones
            muestra el metodo en diferentes casos*/
            switch (opcion) 
            {
                case 1:
                    //Agregar datos en la cola
                    cola.push(0);
                    break;

                case 2:
                    //Mostrar los datos en la cola
                    System.out.println("Cola \n");
                    cola.pop();
                    break;
                    
                case 3:
                    //Preguntar si la cola esta vacia
                    System.out.println(" Esta vacía la ? " + cola.isEmpty());
                    break;
                    
                case 4:
                    //Mostrar el dato final
                    if (!cola.isEmpty()) {
                        System.out.println("El dato al final");
                        System.out.println(cola.inicio());
                    } else{
                        System.out.println("Esta vacía");
                    }
                    break;
                
                case 5:
                    //Indicar el tamaño de la cola
                    System.out.println(" El tamaño es: " + cola.size());
                    break;
                    
                case 6:
                    //Finalizar programa
                    salir = true;
                    System.out.println("Programa terminado");
                    break;
                 
                // Por defecto tiene que ser un numero entre 1-6
                default:
                    System.out.println("Solo números entre 1 y 6");
            }
        }
    }
}
