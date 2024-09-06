package Tarea_Semana_4;

import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        //ingreso de datos
        System.out.print("Ingresa un número entero (1-5): ");
        int numero = lectura.nextInt();
        
        // Determinar el número
        switch (numero) {
            case 1 -> System.out.println("Uno");
            case 2 -> System.out.println("Dos");
            case 3 -> System.out.println("Tres");
            case 4 -> System.out.println("Cuatro");
            case 5 -> System.out.println("Cinco");
            default -> System.out.println("Número fuera de rango. Ingresa un número entre 1 y 5.");
        }
    }
}
