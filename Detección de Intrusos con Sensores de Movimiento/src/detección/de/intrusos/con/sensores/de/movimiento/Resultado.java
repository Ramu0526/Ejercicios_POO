package detección.de.intrusos.con.sensores.de.movimiento;

import java.util.concurrent.TimeUnit;

public class Resultado {
    public void iniciarMonitoreo(boolean noche, int ciclos) {
        for (int i = 0; i < ciclos; i++) {
            Sensor s1 = new Sensor();
            Sensor s2 = new Sensor();
            Sensor s3 = new Sensor();

            boolean alarma = Validar.verificarAlarma(noche, s1.isDetectaMovimiento(), s2.isDetectaMovimiento(), s3.isDetectaMovimiento());

            System.out.println("\nSensor 1: " + (s1.isDetectaMovimiento() ? "Detecta" : "No detecta") +
                    " | Sensor 2: " + (s2.isDetectaMovimiento() ? "Detecta" : "No detecta") +
                    " | Sensor 3: " + (s3.isDetectaMovimiento() ? "Detecta" : "No detecta") +
                    " || Alarma: " + (alarma ? "ACTIVADA" : "Desactivada"));

            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                System.out.println("Error en la simulación.");
            }
        }
    }
}
