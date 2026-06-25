package resol.NizS.ejercicio3;

public class CajaAhorro extends Cuenta implements Auditable {

    public CajaAhorro(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void depositar(double monto) {
        super.depositar(monto);
        registrarLog("Depósito de $" + monto);
    }

    @Override
    public boolean retirar(double monto) {
        boolean exito = super.retirar(monto);
        if (exito) {
            registrarLog("Retiro de $" + monto);
        }
        return exito;
    }

    @Override
    public void registrarLog(String mensaje) {
        System.out.println("[LOG] " + mensaje + " | Saldo actual: $" + saldo);
    }
}