package Tarea_Semana_12;
public class Usuario {
    private double ingresoMensual;
    private double otrosIngresos;
    private double gastosMensuales;
    // Constructor
    public Usuario(double ingresoMensual, double otrosIngresos, double gastosMensuales) {
        this.ingresoMensual = ingresoMensual;
        this.otrosIngresos = otrosIngresos;
        this.gastosMensuales = gastosMensuales;
    }

    public double getIngresoMensual() {
        return ingresoMensual;
    }
    public double getOtrosIngresos() {
        return otrosIngresos;
    }
    public double getGastosMensuales() {
        return gastosMensuales;
    }
    public double calcularAhorroMensual() {
        return (ingresoMensual + otrosIngresos) - gastosMensuales;
    }
    public double calcularAhorroSemestral() {
        return calcularAhorroMensual() * 6;
    }
    public double calcularAhorroAnual() {
        return calcularAhorroMensual() * 12;
    }
}
