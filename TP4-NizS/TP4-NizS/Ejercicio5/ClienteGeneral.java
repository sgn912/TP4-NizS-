package resol.NizS.ejercicio5;

import java.time.LocalDate;

public class ClienteGeneral extends Cliente {

    public ClienteGeneral(String nombre,
                          String dni,
                          LocalDate fechaPrestamo,
                          double monto,
                          LocalDate fechaPactada) {

        super(nombre, dni,
                fechaPrestamo,
                monto,
                fechaPactada);
    }

    @Override
    public double calcularInteres(double monto, int meses) {
        return monto * 0.15 * meses;
    }

    @Override
    public String getTipo() {
        return "Cliente General";
    }
}