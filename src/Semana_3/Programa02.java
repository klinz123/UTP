package Semana_3;

        import java.util.Scanner;
        public class Programa02 {
           public static void main(String[] args) {
            //declarar variables
            double nt1, nt2, nt3, promedio;
            String alumno, condicion;
            Scanner lectura=new Scanner(System.in);
            //entrada de datos
            System.out.print("Ingresar nombre del alumno:");
            alumno=lectura.next();
            System.out.print("Ingresar nota 1:");
            nt1=lectura.nextInt();
            System.out.print("Ingresar nota 2:");
            nt2=lectura.nextInt();
            System.out.print("Ingresar nota 3:");
            nt3=lectura.nextInt();
            //proceso de datos 
            promedio=(nt1+nt2+nt3)/3;
            if (promedio>=12) {
            condicion="Aprobado";
            }else{
            condicion="Desaprobado";
            }
            //salida de datos
            System.out.println("El promedio es: "+promedio);
            System.out.println("La condición es: "+condicion);
    }
}