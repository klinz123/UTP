package Tarea_Semana_8;

import java.util.Scanner;

public class Ejercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar los dos números
        System.out.print("Ingrese el primer numero: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int b = sc.nextInt();

        // Algoritmo de Euclides 
        for (int temp; b != 0;) {
            temp = b;
            b = a % b;
            a = temp;
        }

        // Resultado
        System.out.println("El MCD es: " + a);

        sc.close();
    }
}
