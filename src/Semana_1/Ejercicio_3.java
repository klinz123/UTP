package Semana_1;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaración de variables
        String nombreVendedor;
        double sueldoMensual, venta1, venta2, venta3, comision, pagoTotal;
        
        // Entrada de datos
        System.out.print("Ingrese el nombre del vendedor: ");
        nombreVendedor = scanner.nextLine();
        
        System.out.print("Ingrese el sueldo mensual: ");
        sueldoMensual = scanner.nextDouble();
        
        System.out.print("Ingrese el monto de la venta 1: ");
        venta1 = scanner.nextDouble();
        
        System.out.print("Ingrese el monto de la venta 2: ");
        venta2 = scanner.nextDouble();
        
        System.out.print("Ingrese el monto de la venta 3: ");
        venta3 = scanner.nextDouble();
        
        // Cálculos
        comision = (venta1 + venta2 + venta3) * 0.10;
        pagoTotal = sueldoMensual + comision;
        
        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Nombre del Vendedor: " + nombreVendedor);
        System.out.println("La comisión de las ventas es: " + comision);
        System.out.println("El sueldo neto del vendedor es: " + pagoTotal);
    }
}
