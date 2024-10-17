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

public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Ingrese 5 numeros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nLos numeros ingresados son:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Numero " + (i + 1) + ": " + numeros[i]);
        }

    }
}
