package resol.NizS.ejercicio2;

public class Ejercicio2 {

    public static void ejecutar() {

        Auto auto = new Auto(8000, 4);
        Moto moto = new Moto(2500, 150);

        verificarServicio(auto);
        verificarServicio(moto);
    }

    private static void verificarServicio(Vehiculo v) {

        int faltante = v.proximoServicio() - v.getKilometraje();
        System.out.println("Faltan " + faltante + " km para el próximo service.");

        // Simulación: recorre los km restantes
        v.setKilometraje(v.proximoServicio());

        if (v.getKilometraje() >= v.proximoServicio()) {
            ((Mantenimiento) v).realizarRevision();
        }

        System.out.println("-------------------------");
    }
}