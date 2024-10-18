/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PC2;

/**
 *
 * @author Klinz
 */
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] compras = new int[12];
        int totalCompras = 0;
        int menorCompra = Integer.MAX_VALUE;

        for (int i = 0; i < 12; i++) {
            System.out.print("Ingrese la compra del mes " + (i + 1) + ": ");
            compras[i] = scanner.nextInt();
            totalCompras += compras[i];

            // Encontrar la compra menor
            if (compras[i] < menorCompra) {
                menorCompra = compras[i];
            }
        }

        double promedioCompras = totalCompras / 12.0;

        System.out.println("Total de compras: " + totalCompras);
        System.out.println("Promedio de compras: " + promedioCompras);
        System.out.println("La compra menor es: " + menorCompra);

    }
}


