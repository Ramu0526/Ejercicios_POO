package detección.de.intrusos.con.sensores.de.movimiento;

import java.util.Scanner;

public class Menu {
    private boolean alarmaActiva;
    private boolean esDeNoche;

    public Menu() {
        this.alarmaActiva = false;
        this.esDeNoche = false;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- MENU DEL SISTEMA ---");
            System.out.println("1. Activar alarma");
            System.out.println("2. Desactivar alarma");
            System.out.println("3. Definir si es de dia o de noche");
            System.out.println("4. Iniciar monitoreo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    alarmaActiva = true;
                    System.out.println("Alarma ACTIVADA.");
                    break;
                case 2:
                    alarmaActiva = false;
                    System.out.println("Alarma DESACTIVADA.");
                    break;
                case 3:
                    definirDiaNoche(scanner);
                    break;
                case 4:
                    if (alarmaActiva) {
                        Resultado resultado = new Resultado();
                        resultado.iniciarMonitoreo(esDeNoche, 5);
                    } else {
                        System.out.println("La alarma está desactivada. Actívela primero.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción invalida. Intente de nuevo.");
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
