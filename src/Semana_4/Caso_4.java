package Semana_4;

import java.util.Scanner;

public class Caso_4 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        //ingreso de datos
        System.out.print("Ingresa un número de mes (1-12): ");
        int mes = lectura.nextInt();
        // Determinar la estación
        switch (mes) {
            case 12, 1, 2 -> System.out.println("Verano");
            case 3, 4, 5 -> System.out.println("Otoño");
            case 6, 7, 8 -> System.out.println("Invierno");
            case 9, 10, 11 -> System.out.println("Primavera");
            default -> System.out.println("Número de mes no válido. Ingresa un número entre 1 y 12.");
        }
    }
}
