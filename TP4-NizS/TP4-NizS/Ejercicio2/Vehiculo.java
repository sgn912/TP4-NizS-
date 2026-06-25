package resol.NizS.ejercicio2;

public abstract class Vehiculo {

    private int kilometraje;

    public Vehiculo(int kilometraje) {
        setKilometraje(kilometraje);
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        if (kilometraje >= 0) {
            this.kilometraje = kilometraje;
        } else {
            this.kilometraje = 0;
        }
    }

    public abstract int proximoServicio();
}