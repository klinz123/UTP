/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_07;
/*
crear un programa en Java que permita ingresar la edad,
seco de las personas y preguntar al usuario si desea
continuar o finalizar con el proceso de registro de datos.
Visualizar la cantidad de alumnos y el promedio de edad,
la cantidad de alumnos de sexo masculino y femenino.
*/

import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String args[]) {
        // Declarar variables
        int edad, cp = 0, cpsm = 0, cpsf = 0;
        String sexo = "", rpta = "";
        double pe = 0.0, se = 0.0;

        Scanner lectura = new Scanner(System.in);

        // Proceso
        do {
            System.out.print("Ingrese su Edad: ");
            edad = lectura.nextInt();
            se += edad; // Acumular la edad
            System.out.print("Ingresar Sexo (m/f): ");
            sexo = lectura.next();
            cp++; // Contador

            // Contar el sexo
            if (sexo.equals("m")) {
                cpsm++;
            } else if (sexo.equals("f")) {
                cpsf++;
            }

            // Preguntar si desea continuar
            do {
                System.out.print("¿Desea continuar (si/no)? ");
                rpta = lectura.next();

                if (rpta.equals("si") || rpta.equals("no")) {
                    break; // Salir del bucle si la respuesta es válida
                } else {
                    System.out.println("Solo se debe ingresar 'si' o 'no'");
                }
            } while (true);

        } while (rpta.equals("si"));

        // Calcular el promedio
        if (cp > 0) {
            pe = se / cp; // Promedio de edades
        }

        // Salidas de datos
        System.out.println("-----------------------------------");
        System.out.println("Cantidad de personas de sexo m: " + cpsm);
        System.out.println("Cantidad de personas de sexo f: " + cpsf);
        System.out.println("Promedio de edades: " + pe);
        System.out.println("-----------------------------------");
    }
}
