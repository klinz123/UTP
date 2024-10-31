package Tarea_Semana_11;
import java.util.Random;
public class Ejercicio_04 {
    public static void main(String[] args) {
        // Declarar todas las variables al inicio
        int[][] ventas = new int[3][3];
        Random random = new Random();
        int totalVentas = 0;
        int f, c;
        double promedioVentas;
        int contadorVentas = 1; 
        // Generar ventas
        System.out.println("Ventas generadas Aleatoriamente:");
        for (f = 0; f < ventas.length; f++) {
            for (c = 0; c < ventas[0].length; c++) {
                ventas[f][c] = random.nextInt(9001) + 1000; 
                System.out.println("Venta " + contadorVentas + " = " + ventas[f][c]);
                totalVentas += ventas[f][c]; 
                contadorVentas++; 
            }
        }
        // Calcular el promedio de las ventas
        promedioVentas = totalVentas / 9.0;
        // Salida de datos Mostrar el total y el promedio de las ventas con dos decimales
        System.out.println("\nEl total de las ventas es: " + totalVentas);
        System.out.printf("El promedio de las ventas es: %.2f\n", promedioVentas);
    }
}
