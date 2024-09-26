package ayuda;

import java.util.Scanner;

public class romano1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaración de variables
        int numero;
        String romano = "";
        String opcion;

        // Ingreso del número entero
        System.out.println("Ingrese un número entero entre 1 y 50: ");
        numero = sc.nextInt();

        // Validación del rango
        if (numero < 1 || numero > 50) {
            System.out.println("Número fuera de rango. Debe estar entre 1 y 50.");
            return;
        }

        // Conversión a número romano
        if (numero == 50) romano = "L";
        else if (numero >= 40) romano = "XL" + convertirARomano(numero - 40);
        else if (numero >= 10) romano = "X".repeat(numero / 10) + convertirARomano(numero % 10);
        else romano = convertirARomano(numero);

        // Elección de mayúsculas o minúsculas
        System.out.println("¿Desea mostrar el número romano en mayúsculas o minúsculas? (M/m para mayúsculas, cualquier otra tecla para minúsculas): ");
        opcion = sc.next();

        if (opcion.equalsIgnoreCase("M")) {
            romano = romano.toUpperCase();
        } else {
            romano = romano.toLowerCase();
        }

        // Resultado
        System.out.println("El número " + numero + " en números romanos es: " + romano);
    }

    // Método auxiliar para convertir números menores de 10 a romanos
    public static String convertirARomano(int numero) {
        String[] unidades = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return unidades[numero];
    }
}
