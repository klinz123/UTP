package Semana_2;

import java.util.Scanner;

//import java.lang.System;

public class Ejercicio1 {
public static void main(String[] args) {
        //declarar variables
        int num1, num2, maximo, minimo;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar numero 1:");
        num1=lectura.nextInt();
         System.out.print("Ingresar numero 2:");
        num2=lectura.nextInt();
        //proceso de datos
        maximo=Math.max(num1, num2);
        minimo=Math.min(num1, num2);
        //salida de datos
        System.out.println("Los Resultados Son: ");
        System.out.println("El numero maximo es: " +maximo);
        System.out.println("El numero minimo es: " +minimo);
    }
    
}
