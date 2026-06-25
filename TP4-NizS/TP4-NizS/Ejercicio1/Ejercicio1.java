package resol.NizS.ejercicio1;

public class Ejercicio1 {

    public static void ejecutar() {

        Estudiante e1 = new Estudiante("Ana", 20, 8);
        Estudiante e2 = new Estudiante("Luis", 22, 5);
        Estudiante e3 = new Estudiante("Sofía", 19, 9);

        e1.generarReporte();
        e2.generarReporte();
        e3.generarReporte();
    }
}