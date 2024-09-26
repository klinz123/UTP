package Tarea_Semana_6;
/*
Creame un programa de Procesar solicitudes en cola: Mientras haya solicitudes en una cola 
en este caso un total de (10)
*/
import java.util.LinkedList;
import java.util.Queue;
public class Solicitudes {
    public static void main(String[] args) {
        // Crear una cola de solicitudes
        Queue<String> colaSolicitudes = new LinkedList<>();
        // Agregar algunas solicitudes a la cola
        colaSolicitudes.add("Solicitud 1");
        colaSolicitudes.add("Solicitud 2");
        colaSolicitudes.add("Solicitud 3");
        colaSolicitudes.add("Solicitud 4");
        colaSolicitudes.add("Solicitud 5");
        colaSolicitudes.add("Solicitud 6");
        colaSolicitudes.add("Solicitud 7");
        colaSolicitudes.add("Solicitud 8");
        colaSolicitudes.add("Solicitud 9");
        colaSolicitudes.add("Solicitud 10");
        // Procesar solicitudes mientras haya solicitudes en la cola
        while (!colaSolicitudes.isEmpty()) {
            // Obtener y procesar la solicitud en la parte frontal de la cola
            String solicitud = colaSolicitudes.poll(); // Retorna y elimina la cabeza de la cola
            System.out.println("Procesando: " + solicitud);
            // Simular procesamiento de la solicitud
            try {
                Thread.sleep(1000); // Simula el tiempo de procesamiento
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Todas las solicitudes han sido procesadas.");
    }
}
