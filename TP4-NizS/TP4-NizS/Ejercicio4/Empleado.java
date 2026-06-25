package resol.NizS.ejercicio4;

public abstract class Empleado implements Calculable {

    private String nombre;
    private double sueldoBase;
    private int antiguedad;

    private static int totalEmpleados = 0;

    public Empleado(String nombre, double sueldoBase, int antiguedad) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.antiguedad = antiguedad;
        totalEmpleados++;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    protected double aplicarBonificacion(double salario) {

        if (antiguedad > 15)
            salario += salario * 0.20;
        else if (antiguedad > 10)
            salario += salario * 0.15;
        else if (antiguedad > 5)
            salario += salario * 0.10;

        return salario;
    }

    public abstract void mostrarInformacion();
}