package resol.NizS.ejercicio4;

public class Ejercicio4 {

    public static void ejecutar() {

        Empleado e1 =
                new Administrativo(
                        "German",
                        100000,
                        12,
                        true);

        Empleado e2 =
                new Produccion(
                        "Santino",
                        120000,
                        8,
                        "nocturno");

        System.out.println("\n===== EJERCICIO 4 =====\n");

        e1.mostrarInformacion();

        System.out.println();

        e2.mostrarInformacion();

        System.out.println();
        System.out.println("Total empleados: "
                + Empleado.getTotalEmpleados());
    }
}