package resol.NizS.ejercicio4;

public class Administrativo extends Empleado {

    private boolean remoto;

    public Administrativo(String nombre,
                          double sueldoBase,
                          int antiguedad,
                          boolean remoto) {

        super(nombre, sueldoBase, antiguedad);
        this.remoto = remoto;
    }

    @Override
    public double calcularSalario() {

        double neto;

        if (remoto)
            neto = getSueldoBase() * 0.88;
        else
            neto = getSueldoBase() * 0.92;

        return aplicarBonificacion(neto);
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("ADMINISTRATIVO");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Modalidad: "
                + (remoto ? "Remoto" : "Presencial"));
        System.out.println("Salario Neto: $" + calcularSalario());
    }
}