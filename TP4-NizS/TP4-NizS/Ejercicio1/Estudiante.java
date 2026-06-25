package resol.NizS.ejercicio1;

public class Estudiante extends Persona implements Informable {

    private double notaFinal;

    public Estudiante(String nombre, int edad, double notaFinal) {
        super(nombre, edad);
        setNotaFinal(notaFinal);
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        if (notaFinal >= 0 && notaFinal <= 10) {
            this.notaFinal = notaFinal;
        } else {
            this.notaFinal = 0;
        }
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol: Alumno");
    }

    @Override
    public void generarReporte() {
        mostrarRol();
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nota final: " + notaFinal);

        if (notaFinal >= 6) {
            System.out.println("Condición: PROMOCIONA");
        } else {
            System.out.println("Condición: NO PROMOCIONA");
        }

        System.out.println("-------------------------");
    }
}