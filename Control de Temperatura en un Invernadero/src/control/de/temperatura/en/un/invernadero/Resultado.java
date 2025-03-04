package control.de.temperatura.en.un.invernadero;

import java.util.concurrent.TimeUnit;

public class Resultado {
    public void iniciarMonitoreo(int ciclos) {
        for (int i = 0; i < ciclos; i++) {
            Medidor medidor = new Medidor();
            double temperatura = medidor.getTemperatura();
            String estado = Validar.verificarEstado(temperatura);

            System.out.println("Temperatura actual: " + String.format("%.2f", temperatura) + "C - " + estado);

            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("Error en la simulación.");
            }
        }
    }
}
