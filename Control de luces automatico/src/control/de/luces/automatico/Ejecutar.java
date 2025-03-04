package control.de.luces.automatico;

import java.util.concurrent.TimeUnit;

public class Ejecutar {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mostrarMenu();
        System.out.println("Simulación finalizada.");
    }

    public void iniciarSimulacion(boolean noche, int ciclos) {
        Luces luces = new Luces();

        for (int i = 0; i < ciclos; i++) {
            Movimiento movimiento = new Movimiento();
            boolean lucesEncendidas = Validar.verificarLuces(noche, movimiento.isHayMovimiento());
            
            System.out.println("\nMovimiento detectado: " + (movimiento.isHayMovimiento() ? "Sí" : "No"));
            luces.mostrarEstado(lucesEncendidas);
            
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Error en la simulación.");
            }
        }
    }
}