package control.de.luces.automatico;

import java.util.Scanner;

public class Menu {
    private boolean esDeNoche;

    public Menu() {
        this.esDeNoche = false;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- MENU DEL SISTEMA ---");
            System.out.println("1. Definir si es de dia o de noche");
            System.out.println("2. Iniciar simulacion");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> definirDiaNoche(scanner);
                case 2 -> {
                    Ejecutar ejecutar = new Ejecutar();
                    ejecutar.iniciarSimulacion(esDeNoche, 5);
                }
                case 3 -> {
                    System.out.println("Saliendo...");
                    return;
                }
                default -> System.out.println("Opcion inválida. Intente de nuevo.");
            }
        }
    }

    private void definirDiaNoche(Scanner scanner) {
        System.out.print("Ingrese 'noche' o 'dia': ");
        String tiempo = scanner.next().toLowerCase();
        esDeNoche = tiempo.equals("noche");
        System.out.println("Configurado: " + (esDeNoche ? "Noche" : "Dia"));
    }
}
