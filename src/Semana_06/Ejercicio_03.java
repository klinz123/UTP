
package Semana_06;

/**
Crear un programa en java que permitar ingresar un cantidad. Visualizar el digito mayor, la cantidad de digitos impares y la suma digitos pares
Por ejemplo:
cantidad=78952
Resultados:
dmay=9
cdimp=3
sdpares=10
 */
     import java.util.Scanner;
        public class Ejercicio_03 {
        public static void main(String[] args) {
        //declarar variables
        int cantidad, dmay, cdimp, sdpares, dig, r;
            Scanner lectura=new Scanner(System.in);
            //entrada de datos
        System.out.print("Ingresar una cantidad:");
        cantidad=lectura.nextInt();
        //proceso de datos
        cdimp=0;
        sdpares=0;
        dmay=0;
        while (cantidad>0){
            dig=cantidad%10;
            if (dig>dmay) {
                    dmay=dig;
                }
            r=dig%2;
            if(r==0){
            sdpares+=dig;
            }else{
            cdimp++;
        }
            cantidad=cantidad/10;
            
        }
       //salida de datos
        System.out.println("El digito mayor es: "+dmay);
        System.out.println("La cant de digitos imp es: "+cdimp);
        System.out.println("La suma de digitos pares es: "+sdpares); 
    }
}
