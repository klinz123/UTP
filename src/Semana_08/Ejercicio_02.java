/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_08;

/**
 *
 * @author Klinz
 */
import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaración de variables
        double venta, totalVentas = 0, promedioVentas, ventaMayor = 0;
        String mesMayor = "";
        String mesActual = "";
        for (int i = 1; i <= 6; i++) {
            switch (i) {
                case 1: mesActual = "Enero"; break;
                case 2: mesActual = "Febrero"; break;
                case 3: mesActual = "Marzo"; break;
                case 4: mesActual = "Abril"; break;
                case 5: mesActual = "Mayo"; break;
                case 6: mesActual = "Junio"; break;
            }
            System.out.print("Ingrese las ventas de " + mesActual + ": ");
            venta = sc.nextDouble();
            // Acumular el total de ventas
            totalVentas += venta;
            // Determinar la venta mayor
            if (venta > ventaMayor) {
                ventaMayor = venta;
                mesMayor = mesActual;
            }
        }
        // Cálculo del promedio
        promedioVentas = totalVentas / 6;
        // Mostrar los resultados
        System.out.println("Total de ventas: " + totalVentas);
        System.out.println("Promedio de ventas: " + promedioVentas);
        System.out.println("Mes con mayor venta: " + mesMayor + " con " + ventaMayor);
    }
}
