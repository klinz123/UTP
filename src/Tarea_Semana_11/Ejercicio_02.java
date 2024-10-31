package Tarea_Semana_11;
import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {
        // Declarar variables
        int[][] compras = new int[4][4];
        int f, c;
        double totalCompras = 0;
        double promedioCompras;
        int cantidadCompras = 0;
        int contadorCompra = 1; 
        Scanner lectura = new Scanner(System.in);

        // Entrada de datos
        for (f = 0; f < compras.length; f++) {
            for (c = 0; c < compras[0].length; c++) {
                System.out.print("Ingrese el monto de la Compra " + contadorCompra + ": ");
                compras[f][c] = lectura.nextInt();
                totalCompras += compras[f][c];
                cantidadCompras++;
                contadorCompra++; 
            }
        }

        // Calcular el promedio de las compras
        promedioCompras = totalCompras / cantidadCompras;

        // Salida de datos
        System.out.println("El total de las compras es: " + totalCompras);
        System.out.println("El promedio de las compras es: " + promedioCompras);
    }
}


