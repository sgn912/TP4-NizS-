package resol.NizS.ejercicio5;

import java.time.LocalDate;

public class Ejercicio5 {

    public static void ejecutar() {

        Cliente cliente =
                new Jubilado(
                        "Santiago",
                        "12345678",
                        LocalDate.of(2024, 1, 10),
                        100000,
                        LocalDate.of(2024, 7, 10));

        int meses = 6;

        double interes =
                cliente.calcularInteres(
                        cliente.getMonto(),
                        meses);

        LocalDate fechaPago =
                LocalDate.of(2024, 7, 15);

        long atraso =
                cliente.diasAtraso(fechaPago);

        double penalidad =
                cliente.calcularPenalidad(fechaPago);

        double total =
                cliente.getMonto()
                + interes
                + penalidad;

        System.out.println("\n===== EJERCICIO 5 =====\n");

        System.out.println("Cliente: "
                + cliente.getNombre());

        System.out.println("Tipo: "
                + cliente.getTipo());

        System.out.println("Monto: $"
                + cliente.getMonto());

        System.out.println("Interes: $"
                + interes);

        System.out.println("Dias atraso: "
                + atraso);

        System.out.println("Penalidad: $"
                + penalidad);

        System.out.println("TOTAL A PAGAR: $"
                + total);
    }
}