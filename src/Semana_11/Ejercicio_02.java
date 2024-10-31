/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_11;

/**
 *
 * @author Klinz
 */
import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {
        // Declarar variables
        int[][] mnumeros = new int[3][3];
        int f, c, suma = 0, totalNumeros = 0;
        double promedio;
        Scanner lectura = new Scanner(System.in);

        // Entrada de datos
        for (f = 0; f < mnumeros.length; f++) {
            for (c = 0; c < mnumeros[0].length; c++) {
                System.out.print("Ingresar numero: ");
                mnumeros[f][c] = lectura.nextInt();
            }
        }

        // Proceso de datos: calcular la suma de los números
        for (f = 0; f < mnumeros.length; f++) {
            for (c = 0; c < mnumeros[0].length; c++) {
                suma += mnumeros[f][c]; // Sumar cada elemento
                totalNumeros++; // Contar el total de números
            }
        }

        // Calcular el promedio
        promedio = (double) suma / totalNumeros;

        // Salida de datos
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("El promedio de los numeros es: " + promedio);
    }
}
