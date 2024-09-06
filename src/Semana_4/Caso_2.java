package Semana_4;

import java.util.Scanner;

    public class Caso_2 {
    public static void main(String[] args) {
    //declarar variables
    int n;
    String diasem;
    Scanner lectura=new Scanner(System.in);
    //entrada de datos
    System.out.print("Ingresar un número [1-7]:");
    n=lectura.nextInt();
    //proceso de datos
        switch (n) {
            case 1:
                diasem="Lunes";
                break;
            case 2:
                diasem="Martes";
                break;
            case 3:
                diasem="Miercoles";
                break;
            case 4:
                diasem="Jueves";
                break;
            case 5:
                diasem="Viernes";
                break;
            case 6:
                diasem="Sabado";
                break;
            case 7:
                diasem="Domingo";
                break;
            default:
                diasem="Solo numero del 1-7";
                break;    
        }
        //salida de datos
        System.out.println("El dia de la semana es:" +diasem);
    }     
}
