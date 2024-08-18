package Semana_1;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaración de variables
        String nombreEmpleado;
        double horasTrabajadas, tarifaPorHora, sueldoBruto, descuento, sueldoNeto;
        
        // Entrada de datos
        System.out.print("Ingrese el nombre del empleado: ");
        nombreEmpleado = scanner.nextLine();
        
        System.out.print("Ingrese las horas trabajadas: ");
        horasTrabajadas = scanner.nextDouble();
        
        System.out.print("Ingrese la tarifa por hora: ");
        tarifaPorHora = scanner.nextDouble();
        
        // Cálculos
        sueldoBruto = horasTrabajadas * tarifaPorHora;
        descuento = sueldoBruto * 0.13;
        sueldoNeto = sueldoBruto - descuento;
        
        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Nombre del Empleado: " + nombreEmpleado);
        System.out.println("Sueldo Bruto: " + sueldoBruto);
        System.out.println("Descuento (ONP): " + descuento);
        System.out.println("Sueldo Neto: " + sueldoNeto);
    }
}
