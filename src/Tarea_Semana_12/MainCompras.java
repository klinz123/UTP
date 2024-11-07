package Tarea_Semana_12;

import java.util.Scanner;

public class MainCompras {
    public static void main(String[] args) {
        // Ingresar los valores de las compras
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de la compra 1: ");
        double compra1 = scanner.nextDouble();
        System.out.print("Ingrese el valor de la compra 2: ");
        double compra2 = scanner.nextDouble();
        System.out.print("Ingrese el valor de la compra 3: ");
        double compra3 = scanner.nextDouble();
        System.out.print("Ingrese el valor de la compra 4: ");
        double compra4 = scanner.nextDouble();

        Compras compras = new Compras(compra1, compra2, compra3, compra4);

        // Mostrar los resultados
        System.out.println("Total de las compras: " + compras.calcularTotal());
        System.out.println("Promedio de las compras: " + compras.calcularPromedio());
        System.out.println("Compra mayor: " + compras.encontrarMayor());
        System.out.println("Compra menor: " + compras.encontrarMenor());

        // Cerrar el Scanner
        scanner.close();
    }
}