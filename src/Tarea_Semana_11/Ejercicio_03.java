package Tarea_Semana_11;
import java.util.Random;
public class Ejercicio_03 {
    public static void main(String[] args) {
        // Declarar variables
        int[][] ventas = new int[4][4];
        Random random = new Random();
        int ventaMayor = Integer.MIN_VALUE;
        int ventaMenor = Integer.MAX_VALUE;
        int f, c;
        int contador = 1;
        // Generar ventas aleatorias
        System.out.println("Ventas generadas Aleatorias:");
        for (f = 0; f < ventas.length; f++) {
            for (c = 0; c < ventas[0].length; c++) {
                ventas[f][c] = random.nextInt(4991) + 10;
                System.out.println("Venta " + contador + " = " + ventas[f][c]);
                contador++; 
                // Verificar si es la venta mayor o menor
                if (ventas[f][c] > ventaMayor) {
                    ventaMayor = ventas[f][c];
                }
                if (ventas[f][c] < ventaMenor) {
                    ventaMenor = ventas[f][c];
                }
            }
        }
        // Salida de datos para la venta mayor y menor
        System.out.println("\nLa venta mayor es: " + ventaMayor);
        System.out.println("La venta menor es: " + ventaMenor);
    }
}
