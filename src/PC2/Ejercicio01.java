/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PC2;

/**
 *
 * @author Klinz
 */
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una cantidad: ");
        int cantidad = scanner.nextInt();
        
        int dmy = 0;
        
        while (cantidad > 0) {
            int digito = cantidad % 10; 
            if (digito > dmy) {
                dmy = digito;
            }
            cantidad /= 10; 
        }
        
        System.out.println("El digito mayor es: " + dmy);
  
    }
}
