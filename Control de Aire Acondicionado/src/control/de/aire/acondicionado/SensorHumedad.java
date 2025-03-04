package control.de.aire.acondicionado;

import java.util.Random;

public class SensorHumedad {
    private int humedad;
    
    public SensorHumedad() {
        this.humedad = generarHumedad();
    }
    
    private int generarHumedad() {
        Random random = new Random();
        return 50 + random.nextInt(51); // Genera una humedad entre 50% y 100%
    }
    
    public int getHumedad() {
        return humedad;
    }
}