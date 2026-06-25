package resol.NizS.ejercicio4;

public class Produccion extends Empleado {

    private String turno;

    public Produccion(String nombre,
                      double sueldoBase,
                      int antiguedad,
                      String turno) {

        super(nombre, sueldoBase, antiguedad);
        this.turno = turno;
    }

    @Override
    public double calcularSalario() {

        double neto;

        if (turno.equalsIgnoreCase("diurno"))
            neto = getSueldoBase() * 0.92;
        else
            neto = getSueldoBase() * 0.94;

        return aplicarBonificacion(neto);
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("PRODUCCION");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Turno: " + turno);
        System.out.println("Salario Neto: $" + calcularSalario());
    }
}