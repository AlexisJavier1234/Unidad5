/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pactica2.u4.u5metodos;

/**
 *
 * @author Alexis Javier
 */
public class Pactica2U4U5Metodos {
 public static int suma(int a, int b) {

        return a + b;

    }

    public static int resta(int a, int b) {

        return a - b;

    }

    public static int multiplicacion(int a, int b) {

        return a * b;

    }

    public static int division(int a, int b) {

        return a / b;

    }

    public static void main(String[] args) {
        int resultado = Pactica2U4U5Metodos.suma(10, 20);
        System.out.println("El resultado de la suma es: " + resultado);
        System.out.println("*************************************");
        int segundo = Pactica2U4U5Metodos.resta(12, 4);
        System.out.println("El resultado de la resta es: " + segundo);
        System.out.println("*************************************");
        int tercero = Pactica2U4U5Metodos.multiplicacion(14, 13);
        System.out.println("El resultado de la multiplicacion es: " + tercero);
        System.out.println("*************************************");
        int cuarto = Pactica2U4U5Metodos.division(24, 20);
        System.out.println("El resultado de la division es: " + cuarto);

    }
}