package Tarea_Semana_1;
import java.util.Scanner;
public class Factura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declarar las variables
        String nombreCliente, producto;
        double precio, subtotal, igv, totalPagar;
        int cantidad;
        final double TASA_IGV = 0.18;  // Tasa de IGV del 18%
        
        // Ingresar los datos
        System.out.print("Ingrese el nombre del cliente: ");
        nombreCliente = scanner.nextLine();
        
        System.out.print("Ingrese el nombre del producto: ");
        producto = scanner.nextLine();
        
        System.out.print("Ingrese el precio del producto: ");
        precio = scanner.nextDouble();
        
        System.out.print("Ingrese la cantidad: ");
        cantidad = scanner.nextInt();
        
        // Calcular el subtotal
        subtotal = precio * cantidad;
        
        // Calcular el IGV
        igv = subtotal * TASA_IGV;
        
        // Calcular el total a pagar
        totalPagar = subtotal + igv;
        
        // Mostrar los resultados
        System.out.println("\nFactura:");
        System.out.println("Nombre del Cliente: " + nombreCliente);
        System.out.println("Producto: " + producto);
        System.out.println("Precio Unitario: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IGV (18%): " + igv);
        System.out.println("Total a Pagar: " + totalPagar);
    }
}
