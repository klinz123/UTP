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
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas: ");
        int n = scanner.nextInt();
     
        double[] compras = new double[n];
        double sumaCompras = 0;
        double compraMayor = Double.MIN_VALUE;
        double compraMenor = Double.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el monto de la compra de la persona " + (i + 1) + ": ");
            compras[i] = scanner.nextDouble();
            sumaCompras += compras[i]; 

            if (compras[i] > compraMayor) {
                compraMayor = compras[i];
            }
            
            if (compras[i] < compraMenor) {
                compraMenor = compras[i];
            }
        }
        double promedioCompras = sumaCompras / n;
        System.out.println("El total de las compras es: " + sumaCompras);
        System.out.println("El promedio de las compras es: " + promedioCompras);
        System.out.println("La compra mayor es: " + compraMayor);
        System.out.println("La compra menor es: " + compraMenor);
    }
}

