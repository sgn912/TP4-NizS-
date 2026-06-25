package resol.NizS.ejercicio5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Cliente
        implements PrestamoCalculable {

    private String nombre;
    private String dni;
    private LocalDate fechaPrestamo;
    private double monto;
    private LocalDate fechaPactada;

    public Cliente(String nombre,
                   String dni,
                   LocalDate fechaPrestamo,
                   double monto,
                   LocalDate fechaPactada) {

        this.nombre = nombre;
        this.dni = dni;
        this.fechaPrestamo = fechaPrestamo;
        this.monto = monto;
        this.fechaPactada = fechaPactada;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getMonto() {
        return monto;
    }

    public LocalDate getFechaPactada() {
        return fechaPactada;
    }

    public long diasAtraso(LocalDate fechaPago) {

        if (fechaPago.isAfter(fechaPactada)) {
            return ChronoUnit.DAYS.between(
                    fechaPactada,
                    fechaPago);
        }

        return 0;
    }

    public double calcularPenalidad(LocalDate fechaPago) {

        long dias = diasAtraso(fechaPago);

        return dias * (monto * 0.02);
    }

    public abstract String getTipo();
}