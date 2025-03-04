
package sistema.de.reservas;

import java.util.Scanner;

public class SistemaDeReservas {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Sala sala = new Sala(10);
            
            while (true) {
                sala.mostrarSillas();
                System.out.println("¿Desea reservar una silla? (s/n)");
                String opcion = scanner.nextLine();
                
                if (opcion.equalsIgnoreCase("s")) {
                    System.out.print("Ingrese su nombre: ");
                    String nombre = scanner.nextLine();
                    Usuario usuario = new Usuario(nombre);
                    
                    if (sala.reservarSilla(usuario)) {
                        System.out.println("¡Reserva exitosa para " + nombre + "!");
                    } else {
                        System.out.println("No hay sillas disponibles.");
                        break;
                    }
                } else {
                    break;
                }
            }
            
            System.out.println("Fin del sistema.");
        } // Sala con 10 sillas
    }
}
