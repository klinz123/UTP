/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_11;

/**
 *
 * @author Klinz
 */
import java.util.Random;

public class Ejercicio_04 {
    public static void main(String[] args) {
        // Declarar variables
        int[][] sueldos = new int[5][5];
        int f, c, sumaSueldos = 0, totalSueldos = 0;
        double promedioSueldos;
        Random generador = new Random();

        // Generar y asignar sueldos aleatorios a la matriz
        for (f = 0; f < sueldos.length; f++) {
            for (c = 0; c < sueldos[0].length; c++) {
                sueldos[f][c] = generador.nextInt(10000 - 1025 + 1) + 1025; // Rango 1025-10000
            }
        }

        // Calcular la suma de los sueldos
        for (f = 0; f < sueldos.length; f++) {
            for (c = 0; c < sueldos[0].length; c++) {
                sumaSueldos += sueldos[f][c]; // Sumar cada sueldo
                totalSueldos++; // Contar el total de sueldos
            }
        }

        // Calcular el promedio de sueldos
        promedioSueldos = (double) sumaSueldos / totalSueldos;

        // Salida de datos
        System.out.println("La suma de los sueldos es: " + sumaSueldos);
        System.out.println("El promedio de los sueldos es: " + promedioSueldos);
    }
}

