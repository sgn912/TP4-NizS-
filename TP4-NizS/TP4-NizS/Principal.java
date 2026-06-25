package resol.NizS;

import resol.NizS.ejercicio1.Ejercicio1;
import resol.NizS.ejercicio2.Ejercicio2;
import resol.NizS.ejercicio3.Ejercicio3;
import resol.NizS.ejercicio4.Ejercicio4;
import resol.NizS.ejercicio5.Ejercicio5;

public class Principal {

    public static void main(String[] args) {

        int opcion = 1;

        switch (opcion) {
            case 1:
                Ejercicio1.ejecutar();
                break;
            case 2:
                Ejercicio2.ejecutar();
                break;
            case 3:
                Ejercicio3.ejecutar();
                break;
            case 4:
                Ejercicio4.ejecutar();
                break;
            case 5:
                Ejercicio5.ejecutar();
                break;
            default:
                System.out.println("Ejercicio no válido");
        }
    }
}