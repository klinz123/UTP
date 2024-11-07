package Tarea_Semana_12;
public class Compras {
    private double compra1;
    private double compra2;
    private double compra3;
    private double compra4;
    // Constructor
    public Compras(double compra1, double compra2, double compra3, double compra4) {
        this.compra1 = compra1;
        this.compra2 = compra2;
        this.compra3 = compra3;
        this.compra4 = compra4;
    }
    
    public double getCompra1() {
        return compra1;
    }
    public double getCompra2() {
        return compra2;
    }
    public double getCompra3() {
        return compra3;
    }
    public double getCompra4() {
        return compra4;
    }
    
    public double calcularTotal() {
        return compra1 + compra2 + compra3 + compra4;
    }
    
    public double calcularPromedio() {
        return calcularTotal() / 4;
    }
   
    public double encontrarMayor() {
        double mayor = compra1;
        if (compra2 > mayor) {
            mayor = compra2;
        }
        if (compra3 > mayor) {
            mayor = compra3;
        }
        if (compra4 > mayor) {
            mayor = compra4;
        }
        return mayor;
    }
   
    public double encontrarMenor() {
        double menor = compra1;
        if (compra2 < menor) {
            menor = compra2;
        }
        if (compra3 < menor) {
            menor = compra3;
        }
        if (compra4 < menor) {
            menor = compra4;
        }
        return menor;
    }
}