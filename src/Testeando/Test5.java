package Testeando;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir el número de suministro (medidor)
        String meterNumber;
        do {
            System.out.println("Ingrese el número de suministro:");
            meterNumber = scanner.next();
            if (meterNumber.length() != 9) {
                System.out.println("Número de suministro incorrecto. ");
            }
        } while (meterNumber.length() != 9);

        double totalDebt = 0.0;
        int monthsAccumulated = 0;
        final double maintenanceFee = 5.0;
        final double reconnectionFee = 20.0;
        boolean isDisconnected = false;
        boolean meterRemoved = false;

        System.out.println("Número de suministro (medidor): " + meterNumber);

        while (!meterRemoved) {
            System.out.println("Ingrese el precio por kWh:");
            double pricePerKWh = scanner.nextDouble();

            System.out.println("Ingrese el período (mes) al que pertenece:");
            String period = scanner.next();

            System.out.println("Ingrese la cantidad de kWh consumidos:");
            double kWhConsumed = scanner.nextDouble();

            double amountToPay = calculateAmount(kWhConsumed, pricePerKWh);
            System.out.printf("Monto a pagar por %,.2f kWh en el mes de %s: %.2f soles%n", kWhConsumed, period, amountToPay);

            System.out.println("¿Desea cancelar la deuda? (si/no)");
            String cancelDebt = scanner.next();

            if (cancelDebt.equalsIgnoreCase("si")) {
                totalDebt = amountToPay;
                monthsAccumulated = 0;
                isDisconnected = false;
                System.out.printf("Monto total a pagar: %.2f soles%n", totalDebt);
                totalDebt = 0.0;
            } else {
                monthsAccumulated++;
                totalDebt += amountToPay;
                System.out.printf("Deuda acumulada: %.2f soles%n", totalDebt);

                if (monthsAccumulated == 3 && !isDisconnected) {
                    System.out.println("Ha acumulado 3 meses sin pagar. Su servicio será desconectado.");
                    totalDebt += reconnectionFee;
                    System.out.printf("Se le cobrará una tarifa de corte y reconexión de %.2f soles. Deuda total: %.2f soles%n", reconnectionFee, totalDebt);
                    isDisconnected = true;
                }

                if (isDisconnected && monthsAccumulated > 3) {
                    totalDebt += maintenanceFee;
                    System.out.printf("Servicio desconectado. Se le cobrará una tarifa de mantenimiento de %.2f soles. Deuda total: %.2f soles%n", maintenanceFee, totalDebt);
                }

                if (monthsAccumulated >= 8) {
                    System.out.println("Ha acumulado 8 meses sin pagar. Su medidor será retirado.");
                    meterRemoved = true;
                }
            }

            if (meterRemoved) {
                System.out.printf("Su medidor ha sido retirado. Deuda final: %.2f soles%n", totalDebt);
                break;
            }

            System.out.println("¿Desea ingresar datos para el siguiente periodo? (si/no)");
            String continueInput = scanner.next();
            if (continueInput.equalsIgnoreCase("no")) {
                break;
            }
        }

        scanner.close();
    }

    public static double calculateAmount(double kWh, double pricePerKWh) {
        double amount = kWh * pricePerKWh;

        if (kWh < 30) {
            amount *= 0.70; // Descuento del 30%
        } else if (kWh < 60) {
            amount *= 0.85; // Descuento del 15%
        }

        return amount;
    }
}
