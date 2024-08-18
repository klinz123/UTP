package Semana_1;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaración de variables
        String nombreEmpleado, cargoEmpleado;
        double ingresoMensual, gastoMensual, ahorroMensual, ahorroAnual;
        
        // Entrada de datos
        System.out.print("Ingrese el nombre del empleado: ");
        nombreEmpleado = scanner.nextLine();
        
        System.out.print("Ingrese el cargo del empleado: ");
        cargoEmpleado = scanner.nextLine();
        
        System.out.print("Ingrese los ingresos mensuales del empleado: ");
        ingresoMensual = scanner.nextDouble();
        
        System.out.print("Ingrese los gastos mensuales del empleado: ");
        gastoMensual = scanner.nextDouble();
        
        // Cálculo del ahorro
        ahorroMensual = ingresoMensual - gastoMensual;
        ahorroAnual = ahorroMensual * 12;
        
        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Nombre del Empleado: " + nombreEmpleado);
        System.out.println("Cargo: " + cargoEmpleado);
        System.out.println("Ahorro Mensual: " + ahorroMensual);
        System.out.println("Ahorro Anual Proyectado: " + ahorroAnual);
    }
}
