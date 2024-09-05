/*
Crea un Programa que pueda indicar el IMC de una persona teniendo en cuenta su peso y altura
(Bajo peso: IMC menor a 18.5, Peso normal: IMC entre 18.5 y 24.9, 
Sobrepeso: IMC entre 25.0 y 29.9, Obesidad: IMC de 30.0 o superior)
*/

package Tarea_Semana_3;
import java.util.Scanner;
public class ClasificacionIMC {
public static void main(String[] args) {
        Scanner status = new Scanner(System.in);

        // Ingreso de datos del usuario
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = status.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = status.nextDouble();

        // Cálculo del IMC
        double imc = peso / (altura * altura);
        System.out.printf("Su IMC es: %.2f%n", imc);

        // Clasificación del IMC
        if (imc < 18.5) {
            System.out.println("Clasificación: Bajo peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Clasificación: Peso normal");
        } else if (imc >= 25.0 && imc < 29.9) {
            System.out.println("Clasificación: Sobrepeso");
        } else {
            System.out.println("Clasificación: Obesidad");
        }
    }
}