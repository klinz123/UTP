package Tarea_Semana_4;
import java.util.Scanner;
public class Romano {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        //ingreso de datos
        System.out.print("Ingresa un número entero (1-10): ");
        int numero = lectura.nextInt();
        // Determinar el número en romano
        switch (numero) {
            case 1 -> System.out.println("I");
            case 2 -> System.out.println("II");
            case 3 -> System.out.println("III");
            case 4 -> System.out.println("IV");
            case 5 -> System.out.println("V");
            case 6 -> System.out.println("VI");
            case 7 -> System.out.println("VII");
            case 8 -> System.out.println("VIII");
            case 9 -> System.out.println("IX");
            case 10 -> System.out.println("X");
            default -> System.out.println("Número fuera de rango. Ingresa un número entre 1 y 10.");
        }
    }
}
