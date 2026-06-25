package resol.NizS;

import resol.NizS.ejercicio1.Ejercicio1;
import resol.NizS.ejercicio2.Ejercicio2;
import resol.NizS.ejercicio3.Ejercicio3;
import resol.NizS.ejercicio4.Ejercicio4;
import resol.NizS.ejercicio5.Ejercicio5;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ TP4 ---");
            System.out.println("1. Ejecutar Ejercicio 1 - Tienda de Ropa");
            System.out.println("2. Ejecutar Ejercicio 2 - Agenda Telefónica");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

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
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
