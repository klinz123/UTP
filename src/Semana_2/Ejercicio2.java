package Semana_2;

import java.util.Scanner;
public class Ejercicio2 {
public static void main(String[] args) {
        //declarar variables
        double radio, acirculo;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar radio:");
        radio=lectura.nextDouble();
        //proceso de datos
        acirculo=Math.PI * Math.pow(radio, radio);
        //salida de datos
        System.out.println("El Resultado es: ");
        System.out.println("El area del circulo es: " +acirculo);

       }
}