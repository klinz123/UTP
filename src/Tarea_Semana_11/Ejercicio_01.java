package Tarea_Semana_11;

import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
        // Declarar variables
        int[][] ventas = new int[4][4];
        int f, c, totalVentas = 0;
        int contadorVenta = 1; 
        Scanner lectura = new Scanner(System.in);

        // Entrada de datos
        for (f = 0; f < ventas.length; f++) {
            for (c = 0; c < ventas[0].length; c++) {
                System.out.print("Ingrese el monto de la Venta " + contadorVenta + ": ");
                ventas[f][c] = lectura.nextInt();
                contadorVenta++;
            }
        }

        // Calcular el total de las ventas
        for (f = 0; f < ventas.length; f++) {
            for (c = 0; c < ventas[0].length; c++) {
                totalVentas += ventas[f][c];
            }
        }

        // Salida de datos
        System.out.println("El total de las ventas es: " + totalVentas);
    }
}
