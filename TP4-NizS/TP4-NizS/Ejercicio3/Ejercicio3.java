package resol.NizS.ejercicio3;

public class Ejercicio3 {

    public static void ejecutar() {

        CajaAhorro cuenta = new CajaAhorro(10000);

        cuenta.depositar(2000);
        cuenta.retirar(3000);
        cuenta.retirar(15000); // no se ejecuta
    }
}