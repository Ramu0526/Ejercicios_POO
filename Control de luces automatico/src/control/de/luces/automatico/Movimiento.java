package control.de.luces.automatico;

import java.util.Random;

public class Movimiento {
    private final boolean hayMovimiento;

    public Movimiento() {
        this.hayMovimiento = generarMovimiento();
    }

    private boolean generarMovimiento() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public boolean isHayMovimiento() {
        return hayMovimiento;
    }
}