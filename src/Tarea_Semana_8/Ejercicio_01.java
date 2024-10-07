package Tarea_Semana_8;
import java.util.Scanner;
public class Ejercicio_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de elementos: ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];
                // Ingreso de números
        System.out.println("Ingrese los numeros:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }
        int moda = numeros[0];
        int maxCount = 0;
        // Cálculo de la moda
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (numeros[j] == numeros[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                moda = numeros[i];
            }
        }
        System.out.println("La moda es: " + moda);
    }
}

