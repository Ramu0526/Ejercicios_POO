package control.de.temperatura.en.un.invernadero;

import java.util.Random;

public class Medidor {
    private final double temperatura;

    public Medidor() {
        this.temperatura = generarTemperatura();
    }

    private double generarTemperatura() {
        Random random = new Random();
        return 5 + (random.nextDouble() * 30);
    }

    public double getTemperatura() {
        return temperatura;
    }
}
