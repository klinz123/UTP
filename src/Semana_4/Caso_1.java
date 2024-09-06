/*
Crear un programa en Java que permita ingresar dos números enteros y una opción 
del (1,2,3,4), realizar una operación aritmética de suma, resta, multiplicación y división.
Visualizar el resultado de dicha operación
 */
package Semana_4;

import java.util.Scanner;
public class Caso_1 {
    public static void main(String[] args){
        //declarar variables
        int n1,n2,opc,r;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar número 1:");
        n1=lectura.nextInt();
        System.out.print("Ingresar número 2:");
        n2=lectura.nextInt();        
        System.out.print("Ingresar la opción(1=suma,2=resta,3=mult,4=división):");
        opc=lectura.nextInt();
        r= 0;
        //proceso de datos
        switch (opc) {
            case 1:r=n1+n2;break;
            case 2:r=n1-n2;break;
            case 3:r=n1*n2;break;
            case 4:r=n1/n2;break;
        }
    }
}
