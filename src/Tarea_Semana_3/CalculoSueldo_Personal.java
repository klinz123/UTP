/*
Elabore un programa que permita calcular el sueldo de dos tipos de trabajadores en una empresa.
tipo de personal(Locadores y CAS) Teniendo en cuenta que se calculara cuanto se pagara por hora al trabajador
dependiendo de su sueldo base que se da por 160 horas mensuales. la diferencia de horas
se consideran horas extras y se pagaran 50% mas que las horas regulares esto solo aplicara solo
para los trabajadores que se encuenten como locadores.
Datos a Mostar la cantidad de horas extras y el sueldo total
*/

package Tarea_Semana_3;

import java.util.Scanner;

public class CalculoSueldo_Personal {
    public static void main(String[] args) {
        Scanner Hora_B = new Scanner(System.in);

        // Ingreso de datos del personal
        System.out.print("Ingrese el tipo de personal (Locador o CAS): ");
        String tipoPersonal = Hora_B.nextLine().trim();

        System.out.print("Ingrese el sueldo base mensual: ");
        double sueldoBase = Hora_B.nextDouble();

        System.out.print("Ingrese el número de horas trabajadas en el mes: ");
        int horasTrabajadas = Hora_B.nextInt();

        // Constante para horas regulares por mes
        final int HORAS_REGULARES = 160;

        // Cálculo de la tarifa por hora
        double tarifaHora = sueldoBase / HORAS_REGULARES;

        double sueldoTotal;
        if (horasTrabajadas > HORAS_REGULARES) {
            int horasExtra = horasTrabajadas - HORAS_REGULARES;
            if (tipoPersonal.equalsIgnoreCase("Locador")) {
                // Calculo de horas extra para Locador
                sueldoTotal = (HORAS_REGULARES * tarifaHora) + (horasExtra * tarifaHora * 1.5);
                System.out.println("El Trabajador tiene " + horasExtra + " horas extra. El sueldo total del personal es: " + sueldoTotal);
            } else {
                // Calculo sin horas extra para CAS
                sueldoTotal = (HORAS_REGULARES * tarifaHora) + (horasExtra * tarifaHora);
                System.out.println("No se consideran horas extra para el personal CAS. El sueldo total del personal es: " + sueldoTotal);
            }
        } else {
            // Cálculo sin horas extra
            sueldoTotal = horasTrabajadas * tarifaHora;
            System.out.println("No se trabajaron horas extra. El sueldo total del personal es: " + sueldoTotal);
        }

    }
}
