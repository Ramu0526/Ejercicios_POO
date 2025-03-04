package detección.de.intrusos.con.sensores.de.movimiento;

import java.util.Random;

public class Sensor {
    private final boolean detectaMovimiento;

    public Sensor() {
        this.detectaMovimiento = generarLectura();
    }

    private boolean generarLectura() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public boolean isDetectaMovimiento() {
        return detectaMovimiento;
    }
}
