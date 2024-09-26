package Tarea_Semana_6;
/*
crea un programa para el proceso de  facturación que permita calcular la deuda mensual del usuario
el cual ira incrementando de  no realiza el pago correspondiente y que te permita generar las facturas
mensuales hasta que cancele o la empresa decida deterner el servicio de facturacion
*/
import java.util.Scanner;
public class Facturacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalDeuda = 0;
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese el monto de la factura mensual: ");
            double facturaMensual = scanner.nextDouble();
            totalDeuda += facturaMensual;
            System.out.println("Total de deuda acumulada: " + totalDeuda);
            System.out.println("Desea pagar la deuda del servicio? (si/no): ");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("si")) {
                System.out.println("Ingrese el monto a pagar: ");
                double pago = scanner.nextDouble();
                totalDeuda -= pago;
                if (totalDeuda < 0) {
                    totalDeuda = 0; // Evitar deuda negativa
                }
                System.out.println("Deuda restante: " + totalDeuda);
            }
            System.out.println("Desea continuar calculando mas facturas? (si/no): ");
            String continuarRespuesta = scanner.next();
            continuar = continuarRespuesta.equalsIgnoreCase("si");
        }
        System.out.println("Programa finalizado. Deuda total: " + totalDeuda);
        scanner.close();
    }
}
