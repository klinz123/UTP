package Testeando;

import java.util.Scanner;

public class Posible_Proyecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tarifa = 0.20; // Tarifa por kWh en soles
        double descuento = 0;
        @SuppressWarnings("UnusedAssignment")
        double totalAPagar;
        totalAPagar = 0;
        double acumulado = 0;
        int mesesNoPagados = 0;
        boolean corteRealizado = false;

        while (true) {
            System.out.print("Ingrese la cantidad de kWh consumidos: ");
            double kWh = scanner.nextDouble();

            if (kWh < 30) {
                descuento = 0.04; // 4% de descuento
            } else if (kWh <= 60) {
                descuento = 0.02; // 2% de descuento
            } else {
                descuento = 0; // No hay descuento
            }

            double costoSinDescuento = kWh * tarifa;
            double montoDescuento = costoSinDescuento * descuento;
            double montoAPagar = costoSinDescuento - montoDescuento;

            System.out.println("Monto a pagar este mes: " + montoAPagar + " soles");

            System.out.print("¿Desea pagar este mes? (S/N): ");
            char decision = scanner.next().charAt(0);

            if (decision == 'S' || decision == 's') {
                totalAPagar = montoAPagar;
                if (corteRealizado) {
                    totalAPagar += 20; // Suma el costo de reconexión
                    corteRealizado = false; // Resetear el estado de corte
                }
                System.out.println("Total a pagar: " + totalAPagar + " soles");
                acumulado = 0;
                mesesNoPagados = 0;
            } else {
                acumulado += montoAPagar;
                mesesNoPagados++;
                if (mesesNoPagados >= 3) {
                    System.out.println("Se ha realizado un corte de luz. Deberá pagar un valor de corte y reconexión de 20 soles.");
                    corteRealizado = true;
                }
            }

            System.out.print("¿Desea continuar con otro mes? (S/N): ");
            char continuar = scanner.next().charAt(0);
            if (continuar != 'S' && continuar != 's') {
                break;
            }
        }

        if (acumulado > 0) {
            totalAPagar = acumulado;
            if (corteRealizado) {
                totalAPagar += 20; // Suma el costo de reconexión
            }
            System.out.println("Total acumulado a pagar: " + totalAPagar + " soles");
        }

        System.out.println("Gracias por utilizar el servicio.");
    }
}

