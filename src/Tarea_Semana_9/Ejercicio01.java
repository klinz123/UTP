/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea_Semana_9;

/**
 *
 * @author Klinz
 */
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas: ");
        int n = scanner.nextInt();
        
        double[] pesos = new double[n];
        double sumaPesos = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el peso de la persona " + (i + 1) + ": ");
            pesos[i] = scanner.nextDouble();
            sumaPesos += pesos[i];
        }

        double promedioPeso = sumaPesos / n;

        System.out.println("El peso promedio es: " + promedioPeso + " kg");
        
    }
}
