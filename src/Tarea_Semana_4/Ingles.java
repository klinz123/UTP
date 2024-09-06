package Tarea_Semana_4;
import java.util.Scanner;
public class Ingles {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        //ingreso de datos
        System.out.print("Ingresa un número entero (1-6): ");
        int numero = lectura.nextInt();
        // Determinar el número en inglés usando switch-case
        switch (numero) {
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            default -> System.out.println("Número fuera de rango. Ingresa un número entre 1 y 6.");
        }
    }
}
