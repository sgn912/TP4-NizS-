package resol.NizS.ejercicio2;

public class Auto extends Vehiculo implements Mantenimiento {

    private int cantidadPuertas;

    public Auto(int kilometraje, int cantidadPuertas) {
        super(kilometraje);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public int proximoServicio() {
        return 10000;
    }

    @Override
    public void realizarRevision() {
        System.out.println("Service de los 10k: Cambio de aceite, filtro y revisión de 4 neumáticos.");
    }
}