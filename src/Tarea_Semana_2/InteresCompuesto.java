package Tarea_Semana_2;

import java.util.Scanner;

public class InteresCompuesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el capital inicial (P): ");
        double capital = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interes anual (r) en decimal: ");
        double tasaInteres = scanner.nextDouble();

        System.out.print("Ingrese el numero de años (t): ");
        int años = scanner.nextInt();

        double montoFinal = capital * Math.pow((1 + tasaInteres), años);
        System.out.println("El monto final despues de " + años + " años es: S/" + montoFinal);
    }
}
