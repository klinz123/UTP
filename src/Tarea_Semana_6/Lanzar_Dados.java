package Tarea_Semana_6;
/*
crea un programa que permita lanzar dados de forma aleatoria y que se 
detenga cuando sale el numero 6
*/
import java.util.Random;

public class Lanzar_Dados {
    public static void main(String[] args) {
        Random random = new Random();
        int dado = 0; // Inicializamos la variable dado con 0 para que entre en el ciclo

        // Ciclo que se ejecuta hasta que salga un 6
        while (dado != 6) {
            dado = random.nextInt(6) + 1; // Genera un número entre 1 y 6
            System.out.println("Lanzaste un: " + dado);
        }

        System.out.println("¡Obtuviste un 6!");
    }
}
