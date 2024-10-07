package Tarea_Semana_8;

import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Numero para la tabla de multiplicar
        System.out.print("Ingrese un numero para la tabla de multiplicar: ");
        int numero = sc.nextInt();

        // Generar la tabla de multiplicar
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 12; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        sc.close();
    }
}
