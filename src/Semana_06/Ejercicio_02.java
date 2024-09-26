package Semana_06;

/*
Crear un programa que permita ingresar un cantidad. Visualizar la cantidad invertida.
Por ejemplo:
cantidad=123
caninv=321
*/
    import java.util.Scanner;
    public class Ejercicio_02 {
    public static void main(String[] args){
    //declarar variables
    int cantidad, caninv, dig;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar una cantidad:");
        cantidad=lectura.nextInt();
        //proceso de datos
        caninv=0;
        dig=0;
        while(cantidad>0){
        dig=cantidad%10;
        caninv=(caninv*10)+dig;
        cantidad=cantidad/10;
        }
        //salida de datos
        System.out.println("La cantidad invertida es: "+caninv);
    }

}