package Testeando;

import java.util.Scanner;

public class Test8 {
    // Definiendo Códigos de colores ANSI segun tipo de texto
    public static final String BLUE = "\033[0;34m";  // Color azul
    public static final String BLACK = "\033[0;30m"; // Color negro
    public static final String GREEN = "\033[0;32m"; // Color verde
    public static final String RED = "\033[0;31m";   // Color rojo
    public static final String RESET = "\033[0m";    // Restablecer el color a predeterminado

    public static void main(String[] args) {
        Scanner Sumi = new Scanner(System.in);

        // Mostrar mensaje inicial del proceso de cobro y facturación
        System.out.println(BLUE + "Proceso de cobro y facturación de Electro Oriente" + RESET);

        // Definir el número de suministro (medidor)
        String meterNumber;
        do {
            // Solicitar al usuario que ingrese el número de suministro de 9 dígitos
            System.out.println(BLACK + "Ingrese el número de suministro (medidor) de 9 dígitos:" + RESET);
            System.out.print(GREEN); // Cambiar color a verde para la entrada de datos
            meterNumber = Sumi.next(); // Leer el número de suministro
            System.out.print(RESET); // Restablecer color a predeterminado

            // Verificar si el número de suministro tiene 9 dígitos
            if (meterNumber.length() != 9) {
                // Mostrar alerta si el número es incorrecto
                System.out.println(RED + "Número de suministro incorrecto. Ingrese un número de suministro de 9 dígitos." + RESET);
            }
        } while (meterNumber.length() != 9); // Repetir hasta que se ingrese un número válido

        // Variables para gestionar la deuda, acumulación de meses y estado del servicio
        double totalDebt = 0.0;
        int monthsAccumulated = 0;
        final double maintenanceFee = 5.0;  // Tarifa de mantenimiento
        final double reconnectionFee = 20.0; // Tarifa de reconexión
        boolean isDisconnected = false;     // Estado del servicio (conectado/desconectado)
        boolean meterRemoved = false;       // Estado del medidor (instalado/retirado)

        // Mostrar el número de suministro ingresado
        System.out.println("Número de suministro (medidor): " + meterNumber);

        // Bucle principal para procesar los datos de facturación por períodos
        while (!meterRemoved) {
            // Solicitar y leer el precio por kWh
            System.out.println(BLACK + "Ingrese el precio por kWh:" + RESET);
            System.out.print(GREEN);
            double pricePerKWh = Sumi.nextDouble();
            System.out.print(RESET);

            // Solicitar y leer el período (mes)
            System.out.println(BLACK + "Ingrese el período (mes) al que pertenece:" + RESET);
            System.out.print(GREEN);
            String period = Sumi.next();
            System.out.print(RESET);

            // Solicitar y leer la cantidad de kWh consumidos
            System.out.println(BLACK + "Ingrese la cantidad de kWh consumidos:" + RESET);
            System.out.print(GREEN);
            double kWhConsumed = Sumi.nextDouble();
            System.out.print(RESET);

            // Verificar si el servicio está desconectado pero se ha detectado consumo
            if (isDisconnected && kWhConsumed > 0) {
                // Mostrar alerta si hay consumo a pesar de estar desconectado
                System.out.println(RED + "ALERTA: Consumo detectado a pesar de que el servicio está cortado. Verifique el medidor." + RESET);
            }

            // Calcular el monto a pagar según el consumo y el precio por kWh
            double amountToPay = calculateAmount(kWhConsumed, pricePerKWh);
            System.out.printf("Monto a pagar por %,.2f kWh en el mes de %s: %.2f soles%n", kWhConsumed, period, amountToPay);

            // Preguntar al usuario si desea cancelar la deuda actual
            System.out.println(BLACK + "¿Desea cancelar la deuda? (si/no)" + RESET);
            System.out.print(GREEN);
            String cancelDebt = Sumi.next();
            System.out.print(RESET);

            // Si el usuario elige cancelar la deuda
            if (cancelDebt.equalsIgnoreCase("si")) {
                totalDebt = amountToPay; // Actualizar la deuda total con el monto actual
                monthsAccumulated = 0; // Reiniciar el contador de meses acumulados
                isDisconnected = false; // Reconectar el servicio
                System.out.printf("Monto total a pagar: %.2f soles%n", totalDebt);
                totalDebt = 0.0; // Restablecer la deuda total a 0 después del pago
            } else {
                // Si el usuario no paga la deuda, se acumula para el siguiente período
                monthsAccumulated++; // Incrementar los meses acumulados
                totalDebt += amountToPay; // Acumular la deuda
                System.out.printf("Deuda acumulada: %.2f soles%n", totalDebt);

                // Desconectar el servicio si se acumulan 3 meses de deuda
                if (monthsAccumulated == 3 && !isDisconnected) {
                    System.out.println(RED + "Ha acumulado 3 meses sin pagar. Su servicio será desconectado." + RESET);
                    totalDebt += reconnectionFee; // Agregar tarifa de reconexión a la deuda
                    System.out.printf(RED + "Se le cobrará una tarifa de corte y reconexión de %.2f soles. Deuda total: %.2f soles%n" + RESET, reconnectionFee, totalDebt);
                    isDisconnected = true; // Desconectar el servicio
                }

                // Cobrar tarifa de mantenimiento si el servicio está desconectado y han pasado más de 3 meses
                if (isDisconnected && monthsAccumulated > 3) {
                    totalDebt += maintenanceFee; // Agregar tarifa de mantenimiento a la deuda
                    System.out.printf(RED + "Servicio desconectado. Se le cobrará una tarifa de mantenimiento de %.2f soles. Deuda total: %.2f soles%n" + RESET, maintenanceFee, totalDebt);
                }

                // Retirar el medidor si se acumulan 8 meses de deuda sin pagar
                if (monthsAccumulated >= 8) {
                    System.out.println(RED + "Ha acumulado 8 meses sin pagar. Su medidor será retirado." + RESET);
                    meterRemoved = true; // Marcar el medidor como retirado
                }
            }

            // Si el medidor fue retirado, finalizar el proceso
            if (meterRemoved) {
                System.out.printf("Su medidor ha sido retirado. Deuda final: %.2f soles%n", totalDebt);
                break; // Salir del bucle principal
            }

            // Preguntar si desea ingresar datos para el siguiente período
            System.out.println(BLACK + "¿Desea ingresar datos para el siguiente periodo? (si/no)" + RESET);
            System.out.print(GREEN);
            String continueInput = Sumi.next();
            System.out.print(RESET);

            // Finalizar si el usuario no desea continuar
            if (continueInput.equalsIgnoreCase("no")) {
                break;
            }
        }

        Sumi.close(); // Cerrar el escáner al finalizar
    }

    // Método para calcular el monto a pagar según el consumo y el precio por kWh
    public static double calculateAmount(double kWh, double pricePerKWh) {
        double amount = kWh * pricePerKWh; // Calcular el costo base

        // Aplicar descuentos según la cantidad de kWh consumidos
        if (kWh < 30) {
            amount *= 0.70; // Descuento del 30% si el consumo es menor a 30 kWh
        } else if (kWh < 60) {
            amount *= 0.85; // Descuento del 15% si el consumo es menor a 60 kWh
        }

        return amount; // Devolver el monto final a pagar
    }
}
