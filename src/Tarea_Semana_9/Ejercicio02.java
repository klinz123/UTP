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

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de personas: ");
        int n = scanner.nextInt();
       
        double[] ingresos = new double[n];
        double sumaIngresos = 0;
        double ingresoMayor = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el ingreso economico de la persona " + (i + 1) + ": ");
            ingresos[i] = scanner.nextDouble();
            sumaIngresos += ingresos[i]; 

            if (ingresos[i] > ingresoMayor) {
                ingresoMayor = ingresos[i];
            }
        }

        double promedioIngreso = sumaIngresos / n;

        System.out.println("El ingreso promedio es: " + promedioIngreso);
        System.out.println("El ingreso mayor es: " + ingresoMayor);
     
    }
}
