/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_06;

/**
 Crear un programa en java que permita ingresar una cantidad.
Visualizar el número de digitos de la cantidad ingresada
Por ejemplo:
cantidad=1234
Resultado:
candig=4
 * @author Klinz
*/
import java.util.Scanner;
public class Ejercicio_01 {
    public static void main(String[] args) {
        // Declaración de variables
        int cantidad, candig;
        Scanner scanner;
        // Inicialización de variables
        candig = 0;
        scanner = new Scanner(System.in);
        // Solicitar la cantidad al usuario
        System.out.print("Ingresa una cantidad: ");
        cantidad = scanner.nextInt();
        // Contar los dígitos 
        int temp = cantidad; // Usamos una copia de la cantidad
        while (temp != 0) {
            temp /= 10;
            candig++;
        }
        // Si el número es 0, tiene 1 dígito
        if (cantidad == 0) {
            candig = 1;
        }
        // Mostrar el resultado
        System.out.println("El número de dígitos de la cantidad ingresada es: " + candig);
    }
}

    

