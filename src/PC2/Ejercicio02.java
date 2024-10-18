/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PC2;

/**
 *
 * @author Klinz
 */
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String vendedorMenor = "";
        int totalMenor = Integer.MAX_VALUE;
        String opcion;
        
        do {
            System.out.print("Ingrese el nombre del vendedor: ");
            String nombreVendedor = scanner.nextLine();
           
            System.out.print("Ingrese la primera venta: ");
            int venta1 = scanner.nextInt();
            
            System.out.print("Ingrese la segunda venta: ");
            int venta2 = scanner.nextInt();
            
            System.out.print("Ingrese la tercera venta: ");
            int venta3 = scanner.nextInt();
        
            int totalVentas = venta1 + venta2 + venta3;
            System.out.println("Total de ventas para " + nombreVendedor + ": " + totalVentas);
            
            if (totalVentas < totalMenor) {
                totalMenor = totalVentas;
                vendedorMenor = nombreVendedor;
            }
           
            scanner.nextLine();
         
            System.out.print("¿Desea continuar registrando datos? (si/no): ");
            opcion = scanner.nextLine();
            
        } while (opcion.equalsIgnoreCase("si"));

        System.out.println("El vendedor con el menor total de ventas es: " + vendedorMenor + 
                                                " con un total de " + totalMenor + " ventas.");
    
    }
}

