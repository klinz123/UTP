package Tarea_Semana_4;

import java.util.Scanner;
public class Periodo_Anual {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        //ingreso de datos
        System.out.print("Ingresa un número (1, 2, 3, 4, 6, 12): ");
        int numero = lectura.nextInt();
        
        // Determinar el nombre del periodo anual 
        switch (numero) {
            case 1 -> System.out.println("Mensual");
            case 2 -> System.out.println("Bimestral");
            case 3 -> System.out.println("Trimestral");
            case 4 -> System.out.println("Cuatrimestral");
            case 6 -> System.out.println("Semestral");
            case 12 -> System.out.println("Anual");
            default -> System.out.println("Número no válido. Ingresa un número entre 1, 2, 3, 4, 6 o 12.");
        }
    }
}
