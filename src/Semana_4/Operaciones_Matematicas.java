/*
Crear un programa en Java que permita ingresar dos números enteros y una opción
del (1,2,3,4), realizar una operación aritmética de suma, resta, multiplicación y división.
Visualizar el resultado de dicha operación.
*/
package Semana_4;

import java.util.Scanner;

public class Operaciones_Matematicas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ingresar dos números enteros
        System.out.print("Ingresa el primer número: ");
        int num1 = input.nextInt();
        
        System.out.print("Ingresa el segundo número: ");
        int num2 = input.nextInt();
        
        // Mostrar opciones de operaciones
        System.out.println("Selecciona una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        
        // Leer la opción
        System.out.print("Elige una opción (1-4): ");
        int opcion = input.nextInt();
        
        // Realizar la operación seleccionada usando switch-case
        switch(opcion) {
            case 1:
                // Suma
                int suma = num1 + num2;
                System.out.println("Resultado de la suma: " + suma);
                break;
                
            case 2:
                // Resta
                int resta = num1 - num2;
                System.out.println("Resultado de la resta: " + resta);
                break;
                
            case 3:
                // Multiplicación
                int multiplicacion = num1 * num2;
                System.out.println("Resultado de la multiplicación: " + multiplicacion);
                break;
                
            case 4:
                // División (verificando que el divisor no sea 0)
                if (num2 != 0) {
                    double division = (double) num1 / num2;
                    System.out.println("Resultado de la división: " + division);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
                
            default:
                // Opción inválida
                System.out.println("Opción no válida. Por favor, selecciona entre 1 y 4.");
        }
        
        // Cerrar el escáner
        input.close();
    }
}
