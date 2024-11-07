package Tarea_Semana_12;

import java.util.Scanner;

public class MainUsuario {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ingreso mensual: ");
        double ingresoMensual = scanner.nextDouble();
        System.out.print("Ingrese otros ingresos: ");
        double otrosIngresos = scanner.nextDouble();
        System.out.print("Ingrese los gastos mensuales: ");
        double gastosMensuales = scanner.nextDouble();

        Usuario usuario = new Usuario(ingresoMensual, otrosIngresos, gastosMensuales);

        // Mostrar los resultados
        System.out.println("Ahorro mensual: " + usuario.calcularAhorroMensual());
        System.out.println("Ahorro semestral: " + usuario.calcularAhorroSemestral());
        System.out.println("Ahorro anual: " + usuario.calcularAhorroAnual());
    }
}