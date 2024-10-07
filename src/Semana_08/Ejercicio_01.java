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

public class Ejercicio_01 {
    public static void main(String[] args) {
        // Declaración de variables
        int Ns;
        double sueldo, Ts = 0.0, Ps;
        Scanner sc = new Scanner(System.in);
        // Solicitar el número de sueldos
        System.out.print("Ingrese la cantidad de sueldos a calcular: ");
        Ns = sc.nextInt();
        // Ciclo para ingresar cada sueldo
        for (int i = 1; i <= Ns; i++) {
            System.out.print("Ingrese el sueldo " + i + ": ");
            sueldo = sc.nextDouble();
            Ts += sueldo;
        }
        // Cálculo del promedio
        Ps = Ts / Ns;
        // Mostrar resultados
        System.out.println("Total de sueldos: " + Ts);
        System.out.println("Promedio de sueldos: " + Ps);
    }
}
