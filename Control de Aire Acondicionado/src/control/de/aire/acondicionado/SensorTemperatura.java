package control.de.aire.acondicionado;

import java.util.Random;

public class SensorTemperatura {
    private final int temperatura;
    
    public SensorTemperatura() {
        this.temperatura = generarTemperatura();
    }
    
    private int generarTemperatura() {
        Random random = new Random();
        return 25 + random.nextInt(10); 
    }
    
    public int getTemperatura() {
        return temperatura;
    }
}