package control.de.acceso.a.una.tienda;

import java.util.Scanner;

public class Menu {
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- MENU DEL SISTEMA ---");
            System.out.println("1. Intentar acceder a la tienda");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1 -> {
                    Ejecutar ejecutar = new Ejecutar();
                    ejecutar.simularAcceso();
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
