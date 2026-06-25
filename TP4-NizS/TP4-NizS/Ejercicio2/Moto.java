package resol.NizS.ejercicio2;

public class Moto extends Vehiculo implements Mantenimiento {

    private int cilindrada;

    public Moto(int kilometraje, int cilindrada) {
        super(kilometraje);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public int proximoServicio() {
        return 3000;
    }

    @Override
    public void realizarRevision() {
        System.out.println("Service de los 3k: Ajuste de cadena y revisión de frenos.");
    }
}