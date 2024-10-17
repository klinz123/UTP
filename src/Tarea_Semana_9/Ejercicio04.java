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

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[5]; 
        System.out.println("Ingrese 5 nombres de personas:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }
        System.out.print("\nIngrese el nombre a buscar: ");
        String nombreBuscado = scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                System.out.println("La persona " + nombreBuscado + " existe en la posicion " + i + " del arreglo.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("La persona " + nombreBuscado + " no existe en el arreglo.");
        }
    }
}
