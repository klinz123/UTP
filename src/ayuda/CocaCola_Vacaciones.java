package ayuda;

import java.util.Scanner;

public class CocaCola_Vacaciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaración de variables
        int claveDepartamento, añosServicio, diasVacaciones = 0;

        // Ingreso de datos
        System.out.println("Ingrese la clave del departamento: ");
        System.out.println("1. Atención al cliente");
        System.out.println("2. Logística");
        System.out.println("3. Gerencia");
        claveDepartamento = sc.nextInt();

        System.out.println("Ingrese los años de servicio del trabajador: ");
        añosServicio = sc.nextInt();

        // Cálculo de días de vacaciones según el departamento y años de servicio
        switch (claveDepartamento) {
            case 1: // Atención al cliente
                if (añosServicio == 1) {
                    diasVacaciones = 6;
                } else if (añosServicio >= 2 && añosServicio <= 6) {
                    diasVacaciones = 14;
                } else if (añosServicio >= 7) {
                    diasVacaciones = 20;
                }
                break;

            case 2: // Logística
                if (añosServicio == 1) {
                    diasVacaciones = 7;
                } else if (añosServicio >= 2 && añosServicio <= 6) {
                    diasVacaciones = 15;
                } else if (añosServicio >= 7) {
                    diasVacaciones = 22;
                }
                break;

            case 3: // Gerencia
                if (añosServicio == 1) {
                    diasVacaciones = 10;
                } else if (añosServicio >= 2 && añosServicio <= 6) {
                    diasVacaciones = 20;
                } else if (añosServicio >= 7) {
                    diasVacaciones = 30;
                }
                break;

            default:
                System.out.println("Clave de departamento inválida.");
                return;
        }

        // Resultado
        System.out.println("El trabajador tiene derecho a " + diasVacaciones + " días de vacaciones.");
    }
}
