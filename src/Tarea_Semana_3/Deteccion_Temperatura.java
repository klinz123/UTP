/* 
Elavora un programa  con condicional simple para la medicion de la temperatura 
de los pacientes en un hospital en grados centigrados, recalcando que lo maximo que soporta una 
persona es de 43 °C 
mensajes a mostrar: en caso que exceda de 42 °C : Alerta! Temperatura peligrosa detectada
De tener una temperatura normal mostrar: Temperatura dentro de los limites seguros
*/
package Tarea_Semana_3;

import java.util.Scanner;

public class Deteccion_Temperatura {
    public static void main(String[] args) {
        Scanner Temp= new Scanner(System.in);

        System.out.print("Ingrese la temperatura actual del paciente en grados Centigrados: ");
        int temperatura = Temp.nextInt();

        if (temperatura > 42) {
            System.out.println("Alerta! Temperatura peligrosa detectada.");
        } else {
            System.out.println("Temperatura dentro de los limites seguros.");
        }

    }
}
