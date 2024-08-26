package Tarea_Semana_2;

import java.util.Scanner;

public class PrecioConDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio original del producto: ");
        double precioOriginal = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de descuento en decimal: ");
        double descuento = scanner.nextDouble();

        double precioConDescuento = precioOriginal * (1 - descuento);
        double precioRedondeado = Math.round(precioConDescuento * 100.0) / 100.0;

        System.out.println("El precio con descuento es: S/" + precioRedondeado);
    }
}
