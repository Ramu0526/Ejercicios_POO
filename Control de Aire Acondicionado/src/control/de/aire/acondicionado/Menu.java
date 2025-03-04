package control.de.aire.acondicionado;

import java.util.Scanner;

public class Menu {
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- MENÚ DEL SISTEMA ---");
            System.out.println("1. Iniciar simulación");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1 -> {
                    Ejecutar ejecutar = new Ejecutar();
                    ejecutar.iniciarSimulacion(5);
                }
                case 2 -> {
                    System.out.println("Saliendo...");
                    return;
                }
                default -> System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }
}
