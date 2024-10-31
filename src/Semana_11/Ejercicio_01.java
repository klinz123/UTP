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

public class Ejercicio_01 {
    public static void main(String[] args) {
        // Declarar variables
        int sp = 0, ci = 0, r, numero, c, f;
        int[][] mnumeros = new int[3][3];
        Scanner lectura = new Scanner(System.in);

        // Entrada de datos
        for (f = 0; f < mnumeros.length; f++) {
            for (c = 0; c < mnumeros[0].length; c++) {
                System.out.print("Ingresar numero: ");
                numero = lectura.nextInt();
                mnumeros[f][c] = numero;
            }
        }

        // Proceso de datos
        for (f = 0; f < mnumeros.length; f++) {
            for (c = 0; c < mnumeros[0].length; c++) {
                r = mnumeros[f][c] % 2;
                if (r == 0) {
                    sp += mnumeros[f][c];  // Sumar números pares
                } else {
                    ci++;  // Contar números impares
                }
            }
        }

        // Salida de datos
        System.out.println("La suma de los digitos pares es: " + sp);
        System.out.println("La cantidad de los digitos impares es: " + ci);
    }
}

