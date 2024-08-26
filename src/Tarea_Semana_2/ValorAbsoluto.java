package Tarea_Semana_2;

import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de perdida o ganancia: ");
        double cantidad = scanner.nextDouble();

        double valorAbsoluto = Math.abs(cantidad);
        System.out.println("El valor absoluto de la cantidad es: S/" + valorAbsoluto);
    }
}
