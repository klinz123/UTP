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

public class Ejercicio_03 {
    public static void main(String[] args) {
        // Declarar variables
        int[][] matriz = new int[3][3];
        int mayor, menor;
        Scanner lectura = new Scanner(System.in);

        // Entrada de datos y determinar el mayor y menor
        System.out.print("Ingresar número: ");
        matriz[0][0] = lectura.nextInt();
        mayor = menor = matriz[0][0]; // Inicializar con el primer valor ingresado

        for (int f = 0; f < 3; f++) {
            for (int c = (f == 0 ? 1 : 0); c < 3; c++) { // Comenzar desde el segundo elemento si f=0
                System.out.print("Ingresar número: ");
                matriz[f][c] = lectura.nextInt();

                // Comparar para encontrar el mayor y menor
                if (matriz[f][c] > mayor) {
                    mayor = matriz[f][c];
                }
                if (matriz[f][c] < menor) {
                    menor = matriz[f][c];
                }
            }
        }

        // Mostrar resultados
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}

