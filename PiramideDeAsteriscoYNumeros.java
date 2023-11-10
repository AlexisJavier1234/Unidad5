/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piramide.de.asterisco.y.numeros;

import java.util.Scanner;

/**
 *
 * @author Alexis Javier
 */
public class PiramideDeAsteriscoYNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lecturaDatos = new Scanner(System.in);
        System.out.println("Eliga una de las siguientes opciones");
        System.out.println("1 Piramide de Asteriscos");
        System.out.println("2 Piramide de Numeros");
        int opcion = lecturaDatos.nextInt();

        switch (opcion) {
            case 1:

                Scanner sc = new Scanner(System.in);
                System.out.print("Introduzca numero de filas: ");
                int numFilas = sc.nextInt();
                sc.close();

                System.out.println();

                for (int numBlancos = numFilas - 1, numAsteriscos = 1; numBlancos >= 0; numBlancos--, numAsteriscos += 2) {
                    //Espacios en blanco
                    for (int i = 1; i <= numBlancos; i++) {
                        System.out.print(" ");
                    }

                    //Asteriscos
                    for (int j = 1; j <= numAsteriscos; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
             
                }
                       break;
            case 2:
 Scanner scanner = new Scanner(System.in);
    
    System.out.println("Introduce el número de niveles que tendrá la pirámide: ");
    int numeroNiveles = scanner.nextInt();
    
    int numeroPosiciones = numeroNiveles * 2 -1;
    int posInicial = numeroNiveles;
    int posFinal = numeroNiveles;
    
    
    for (int i = 0; i < numeroNiveles; i++) {
      int contador = 1;
      String resultado = "";
      
      for (int j=0; j <= numeroPosiciones; j++) {
        if ((j < posInicial) || (j > posFinal)) {
          resultado += " ";
        } else {
          if (j < numeroNiveles) {
            resultado += contador;
            contador++;
          } else {
            resultado += contador;
            contador--;
          }
        }    
      }
      System.out.println(resultado);
      posFinal++;
      posInicial--;
    }
        }
   
 }
 }


