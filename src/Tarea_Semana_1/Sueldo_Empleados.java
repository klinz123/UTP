package Tarea_Semana_1;
import java.util.Scanner;

public class Sueldo_Empleados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] sueldos = new double[5];
        double totalSueldos = 0;
        double promedioSueldos;

        // Registrar los cinco sueldos
        for (int i = 0; i < sueldos.length; i++) {
            System.out.print("Ingrese el sueldo " + (i + 1) + ": ");
            sueldos[i] = scanner.nextDouble();
            totalSueldos += sueldos[i];  // Sumar al total de sueldos
        }

        // Calcular el promedio
        promedioSueldos = totalSueldos / sueldos.length;

        // Mostrar resultados
        System.out.println("\nTotal de Sueldos: " + totalSueldos);
        System.out.println("Promedio de Sueldos: " + promedioSueldos);
    }
}
